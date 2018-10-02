import { Component, OnInit, ViewEncapsulation, ViewChild, AfterViewInit } from '@angular/core';
import { Router } from '@angular/router';
import { FormBuilder, FormGroup, FormControl, Validators, FormArray } from '@angular/forms';
import * as _ from 'underscore';
import { Observable } from 'rxjs/Observable';
import { HttpService } from '../../../../common/services/http.service';
import { CommonService } from '../../../../common/services/common.service';
import { CommonDataService } from '../../../../common/services/common.data.service';
import { SubmissionDataService } from '../../services/submission-data.service';
import { CoverageTermComponent } from '../../../../common/components/coverage-term/coverage-term.component';
import { BackConfirmationModalComponent } from '../../../../common/components/back-confirmation-modal/back-confirmation-modal.component';
import { ModalComponent } from '../../../../common/components/modal-popup/modal-popup.component';
import { BOPLobDataService } from '../../services/bop-lob-data.service';
import { Building } from '../../interface/bop-lob-data';
import { ClassCode } from '../../../../common/interface/submission';

@Component({
  selector: 'app-buildings',
  templateUrl: './buildings.component.html',
  styleUrls: ['./buildings.component.scss'],
  encapsulation: ViewEncapsulation.Emulated
})
export class BuildingsComponent implements OnInit {
  @ViewChild(BackConfirmationModalComponent) backConfirmationModalComponent: BackConfirmationModalComponent;
  @ViewChild('deleteConfirmationModal') deleteConfirmationModal: ModalComponent;
  @ViewChild('deleteConfirmationModalClass') deleteConfirmationModalClass: ModalComponent;
  currentLocation: any;
  deleteLocationIndex: any = 0;
  deleteClassificationLocationIndex: any = 0;
  buildingsPageForm: FormGroup;
  show: Boolean = true;
  isSquareFootage = false ;
  isValidYear: Boolean = true;
  isOnlyBuilding: Boolean = false;
  isOnlyClassification: Boolean = false;
  isExposureVisible: Boolean = false;
  radio: Boolean = false;
  conTypeOption = [];
  classDescOption = [];
  roofShapeOption = [];
  roofTypeOption = [];
  roofSlopeOption = [];
  percentageOwnerOccupied = [];
  dependentBuildingList = [
    'yearBuilt', 'numberOfStories', 'totalAreaExcludingBasement', 'buildingObject', 'roofSlope', 'roofShape',
    'roofType', 'yearOfLastRoofReplacement', 'yearHeatingUpdated', 'yearWiringUpdated', 'yearPlumbingUpdated'
  ];
  classCodes = ['63641', '63621', '63661', '63711', '63771', '63791', '63821', '63841', '63861', '63881', '63931',
   '63991', '64021', '64071', '64151', '64131', '64171', '64191', '65161', '09621'];

  get buildings(): FormArray {
    return <FormArray>this.buildingsPageForm.get('buildings');
  }


  constructor(
    private router: Router,
    private httpService: HttpService,
    private formBuilder: FormBuilder,
    private commonService: CommonService,
    private commonDataService: CommonDataService,
    private submissionDataService: SubmissionDataService,
    private bopLobDataService: BOPLobDataService,
  ) { }


  filterOptions() {
    this.commonService.getOptions().subscribe((response) => {
      this.conTypeOption = response.Construction;
      this.roofShapeOption = response.RoofShape;
      this.roofTypeOption = response.RoofType;
      this.roofSlopeOption = response.RoofSlope;
      this.percentageOwnerOccupied = response.PercentageOwnerOccupied;
    });

    _.forEach(this.classDescOption, (item: ClassCode) => {
     if (this.classCodes.indexOf(item.code) > -1) {
       this.isSquareFootage = true;
     }
    });
  }

  ngOnInit() {
    if (undefined === this.commonDataService.activeLocation) {
     // this.router.navigate(['/policyHome']);
      this.router.navigate(['/policyInfo']);
    } else {
      this.buildFormControl();
      const showExpo = this.bopLobDataService.finalSubmission.baseData.account.subNiche;
      this.classDescOption =  this.bopLobDataService.lobData.bP7BusinessOwners.classificationCodes;
      console.log('Classification Description', this.classDescOption);
      if (showExpo === 'Contractor' || showExpo === 'Restaurant') {
        this.isExposureVisible = true;
      }
      this.currentLocation =
        this.bopLobDataService.lobData.bP7BusinessOwners.coverables.locations[this.commonDataService.activeLocation - 1];
      if (this.currentLocation.buildings.length > 0) {
        this.setBuildingsInfo();
      } else {
        this.addBuilding();
      }
      this.onChanges();
      this.filterOptions();
    }
    console.log('params', sessionStorage.getItem('submission'), this.currentLocation);
    console.log('sessionID', this.submissionDataService.sessionID);
    console.log('', this.buildingsPageForm);
  }
 
  setBuildingsInfo() {
    this.currentLocation.buildings = _.sortBy(this.currentLocation.buildings, 'publicID');
    _.forEach(this.currentLocation.buildings, (building: Building, key) => {
      this.buildings.push(this.buildBuildings());
      const index = this.buildings.length - 1;
      const control = this.buildings.controls[index];
      const isBuildingPersonalProperty = building.yearBuilt ? building.yearBuilt > 0 ? true : false : false;
      control.get('constructionType').setValue(building.constructionType);
      control.get('automaticControlSystem').setValue(building.automaticSprinklerSystem.toString());
      control.get('PercentageOwnerOccupied').setValue(building.percentageOwnerOccupied.toString());
      control.get('bulidingPersonalProperty').setValue(isBuildingPersonalProperty);
      control.get('isSaved').setValue(true);
      control.get('exposure').setValue(this.isExposureVisible ? building.exposure : null);
      if (isBuildingPersonalProperty) {
        control.get('yearBuilt').setValue(building.yearBuilt);
        control.get('numberOfStories').setValue(building.numberOfStories);
        control.get('totalBuildingArea').setValue(building.totalAreaExcludingBasement);
        control.get('roofType').setValue(building.roofType);
        control.get('RoofReplacementYear').setValue(building.yearOfLastRoofReplacement);
        control.get('roofArea').setValue(building.roofArea);
        control.get('roofSlope').setValue(building.roofSlope);
        control.get('roofShape').setValue(building.roofShape);
        if ( building.yearWiringUpdated ) {
          control.get('YearWiringUpdated').setValue(building.yearWiringUpdated);
        } else if ( building.yearBuilt ) {
          control.get('YearWiringUpdated').setValue(building.yearBuilt);
        } else {
          control.get('YearWiringUpdated').setValue(building.yearWiringUpdated);
        }

        if ( building.yearPlumbingUpdated ) {
          control.get('YearPlumbingUpdated').setValue(building.yearPlumbingUpdated);
        } else if ( building.yearBuilt ) {
          control.get('YearPlumbingUpdated').setValue(building.yearBuilt);
        } else {
          control.get('YearPlumbingUpdated').setValue(building.yearPlumbingUpdated);
        }

        if ( building.yearHeatingUpdated ) {
          control.get('YearHeatingUpdate').setValue(building.yearHeatingUpdated);
        } else if ( building.yearBuilt ) {
          control.get('YearHeatingUpdate').setValue(building.yearBuilt);
        } else {
          control.get('YearHeatingUpdate').setValue(building.yearHeatingUpdated);
        }
      }
      this.defaultBuildings(index, true);
    });
  }

  deleteBuilding(index) {
    this.isOnlyBuilding = false;
    if (this.buildings.controls.length === 1) {
      this.isOnlyBuilding = true;
    }
    this.deleteLocationIndex = index;
    this.deleteConfirmationModal.show();
  }

  deleteClassification (classificationIndex, buildingIndex) {
    this.isOnlyClassification = false;
    const control = <FormArray>this.buildings.controls[buildingIndex].get('classificationsPageForm');
    if (control.length === 1) {
      this.isOnlyClassification = true;
    }
    this.deleteLocationIndex = buildingIndex;
    this.deleteClassificationLocationIndex = classificationIndex;
    this.deleteConfirmationModalClass.show();
  }

  confirmClassDelete() {
    this.deleteConfirmationModalClass.hide();
    const control = <FormArray>this.buildings.controls[this.deleteLocationIndex].get('classificationsPageForm');
    // if (control.get('isSaved').value === true) {
    //   const building = this.currentLocation.buildings[this.deleteLocationIndex];
    //   this.currentLocation.buildings = _.without(this.currentLocation.buildings, building);
    //   this.bopLobDataService.lobData.bP7BusinessOwners.coverables.locations[this.commonDataService.activeLocation - 1] =
    //     this.currentLocation;
    // }
    control.removeAt(this.deleteClassificationLocationIndex);
  }


  addClassifications(buildingIndex) {
   const control = <FormArray>this.buildings.controls[buildingIndex].get('classificationsPageForm');
   control.push(this.buildClasifications());
  }

  confirmDelete() {
    this.deleteConfirmationModal.hide();
    const control = <FormArray>this.buildingsPageForm.controls['buildings'];
    const formControl = <FormArray>control.controls[this.deleteLocationIndex];
    if (formControl.get('isSaved').value === true) {
      const building = this.currentLocation.buildings[this.deleteLocationIndex];
      this.currentLocation.buildings = _.without(this.currentLocation.buildings, building);
      this.bopLobDataService.lobData.bP7BusinessOwners.coverables.locations[this.commonDataService.activeLocation - 1] =
        this.currentLocation;
    }
    control.removeAt(this.deleteLocationIndex);
  }



  buildFormControl() {
    this.buildingsPageForm = this.formBuilder.group({
      buildings: this.formBuilder.array([])
    });

  }

 

  isDisabled(index) {
    const control = <FormArray>this.buildingsPageForm.controls['buildings'];
    const formControl = <FormArray>control.controls[index];
    return formControl ? formControl.valid : false;
  }

  

  saveClassFields(buildingIndex, classificationIndex) {
    const building = this.buildings.controls[buildingIndex];
    const classificationspageForm = building.get('classificationsPageForm').value;
    const individualClassification = classificationspageForm.controls[classificationIndex];
    let classNumber = classificationIndex + 1;
    let classificationNumber = classNumber.toString();
    let classCode = individualClassification.get('classcode').value;
    const classDetails = getclassificationDetail(classCode);
    const buildingClassificationObject = {
      classPropertyType: classDetails.classification,
      classDescription: classDetails.classCodeBasisCode,
      classCode: individualClassification.get('classcode').value,
      classSquareFootage: individualClassification.get('squareFootage').value,
      classificationNumber: classificationNumber,
      rABOPWanted: false
    };

    function getclassificationDetail(classCode){
        return this.classDescOption.find(x => x.code === classCode )

    }

    const body = [
      sessionStorage.getItem('submission'),
      this.currentLocation.buildings[buildingIndex].publicID,
      this.commonService.clean(buildingClassificationObject),
      this.submissionDataService.sessionID
    ];

    this.commonService.saveBuildingsClass(body).subscribe((response) => {
      console.log('classification Response',response);
         });
  }




  updateClassBuildingInfo(index, response, isSaved) {
    if (isSaved) {
      delete response.result.coverages;
      this.currentLocation.buildings[index] = response.result;
    } else {
      this.currentLocation.buildings.push(response.result);
    }
    this.buildings.controls[index].get('isSaved').setValue(true);
    this.disableFinalSave();
  }

  isClassDisabled(buildingIndex, classificationIndex) {

  }

  disableFinalSave() {
    let isCoveragesAvailable: Boolean = true;
    const control = <FormArray>this.buildingsPageForm.controls['buildings'];
    _.forEach(control.controls, (item: any) => {
      if (!item.controls['isSaved'].value) {
        isCoveragesAvailable = false;
      }
    });
    return this.buildings.controls.length > 0 ? this.buildingsPageForm.valid ? isCoveragesAvailable ? true : false : false : false;
  }

  addBuilding(): void {
    this.buildings.push(this.buildBuildings());
    const index = this.buildings.length - 1;
    const building = this.buildings.controls[index];
    building.get('bulidingPersonalProperty').setValue(false);
    building.get('automaticControlSystem').setValue('false');
    building.get('roofShape').setValue('unknown');
    building.get('roofType').setValue('Unknown');
    building.get('roofSlope').setValue('unknown');
    building.get('PercentageOwnerOccupied').setValue('NotApplicable');
    building.get('isSaved').setValue(false);
    building.get('exposure').setValidators(this.isExposureVisible ? [Validators.required] : null);
  }

  checkYearRange(event, control, index) {
    this.buildings.controls[index].get(control).setErrors(!event ? { 'incorrect': true } : null);
  }

  

  buildBuildings(): FormGroup {
    return this.formBuilder.group({
      'constructionType': new FormControl('', [Validators.required]),
      'automaticControlSystem': new FormControl('', [Validators.required]),
      'PercentageOwnerOccupied': new FormControl(),
      'yearBuilt': new FormControl(''),
      'numberOfStories': new FormControl(''),
      'totalBuildingArea': new FormControl(''),
      'roofType': new FormControl(''),
      'RoofReplacementYear': new FormControl(''),
      'roofArea': new FormControl(''),
      'roofSlope': new FormControl(''),
      'roofShape': new FormControl(''),
      'YearWiringUpdated': new FormControl(''),
      'YearPlumbingUpdated': new FormControl(''),
      'YearHeatingUpdate': new FormControl(''),
      'bulidingPersonalProperty': new FormControl(''),
      'exposure': new FormControl(''),
      isSaved: new FormControl(''),
      'classificationsPageForm':  this.formBuilder.array([this.buildClasifications()])
    });
  }

  getclassificationsPageForm(building) {
    return building.controls.classificationsPageForm.controls;
  }

// buildFormGroup() {
//         const formGroup = this.validationUtil.getFormGroup({});
//         this.initCoverageCategoryValidators(this.categories, formGroup);
//         this.form.addControl('coverages', formGroup);
//     }


buildclassificationGroup() {
 return this.formBuilder.group({
   classifications: this.formBuilder.array([this.buildClasifications()])
 });
}

  buildClasifications(): FormGroup {
    return this.formBuilder.group({
      'squareFootage': new FormControl(''),
      'leasedTenants': new FormControl(''),
      'classcode': new FormControl('')
      
    });
  }

  defaultBuildings(index, isLoading = false) {
    const isChecked = this.buildings.controls[index].get('bulidingPersonalProperty').value;
    const building = this.buildings.controls[index];
    const dependentList = [
      { field: 'yearBuilt', validations: [Validators.required, Validators.minLength(4)], value: '' },
      { field: 'numberOfStories', validations: [Validators.required], value: '' },
      { field: 'totalBuildingArea', validations: [Validators.required], value: '' },
      { field: 'roofType', validations: [Validators.required], value: '' },
      { field: 'RoofReplacementYear', validations: [Validators.required, Validators.minLength(4)], value: '' },
      { field: 'YearWiringUpdated', validations: [Validators.minLength(4)], value: '' },
      { field: 'YearPlumbingUpdated', validations: [Validators.minLength(4)], value: '' },
      { field: 'YearHeatingUpdate', validations: [Validators.minLength(4)], value: '' },
      { field: 'PercentageOwnerOccupied', validations: [Validators.required], value: isChecked ? '' : 'NotApplicable' }
    ];
    _.forEach(dependentList, (item: any) => {
      building.get(item.field).setValidators(isChecked ? item.validations : null);
      building.get(item.field).setValue(isLoading ? building.get(item.field).value : item.value);
      building.get(item.field).updateValueAndValidity();
    });
  }

  defaultBuiltYear(buildingIndex) {
    const building = this.buildings.controls[buildingIndex];
    if ( building.get('yearBuilt').value ) {
    if ( building.get('YearHeatingUpdate').value ) {
      building.get('YearHeatingUpdate').setValue(building.get('yearBuilt').value);
    }
    if ( building.get('YearWiringUpdated').value ) {
      building.get('YearWiringUpdated').setValue(building.get('yearBuilt').value);
    }
    if ( building.get('YearPlumbingUpdated').value ) {
      building.get('YearPlumbingUpdated').setValue(building.get('yearBuilt').value);
    }
  }
}

  saveFields(index) {
    const building = this.buildings.controls[index];
    const automaticSprinklerSystem = building.get('automaticControlSystem').value;
    const buildingObject = {
      publicID: building.get('isSaved').value ? this.currentLocation.buildings[index].publicID : '',
      constructionType: building.get('constructionType').value,
      percentageOwnerOccupied: building.get('PercentageOwnerOccupied').value,
      automaticSprinklerSystem: (automaticSprinklerSystem === 'true'),
      yearBuilt: building.get('yearBuilt').value,
      roofArea: building.get('roofArea').value,
      roofSlope: building.get('roofSlope').value,
      roofShape: building.get('roofShape').value,
      roofType: building.get('roofType').value,
      yearOfLastRoofReplacement: building.get('RoofReplacementYear').value,
      yearHeatingUpdated: building.get('YearHeatingUpdate').value,
      yearWiringUpdated: building.get('YearWiringUpdated').value,
      yearPlumbingUpdated: building.get('YearPlumbingUpdated').value,
      numberOfStories: building.get('numberOfStories').value,
      totalAreaExcludingBasement: building.get('totalBuildingArea').value,
      exposure: building.get('exposure').value
    };
    if (!building.get('bulidingPersonalProperty').value) {
      _.forEach(this.dependentBuildingList, (item) => {
        delete buildingObject[item];
      });
    }
    if (!this.isExposureVisible) {
      delete buildingObject.exposure;
    }
    const body = [
      sessionStorage.getItem('submission'),
      this.currentLocation.publicID,
      this.commonService.clean(buildingObject),
      this.submissionDataService.sessionID
    ];
    if (building.get('isSaved').value) {
      this.commonService.updateBuildings(body).subscribe((response) => {
        this.updateBuildingInfo(index, response, true);
      });
    } else {
      this.commonService.saveBuildings(body).subscribe((response) => {
        this.updateBuildingInfo(index, response, false);
      });
    }
  }

  updateBuildingInfo(index, response, isSaved) {
    console.log('response', response.result);
    if (isSaved) {
      delete response.result.coverages;
      this.currentLocation.buildings[index] = response.result;
    } else {
      this.currentLocation.buildings.push(response.result);  
    }
    this.buildings.controls[index].get('isSaved').setValue(true);
    this.disableFinalSave();
  }

  goBack() {
    this.router.navigate(['bop/submission/locations']);
  }

  onChanges(): void {
    this.buildingsPageForm.valueChanges.subscribe(val => {
      if (this.buildingsPageForm.dirty) {
        this.submissionDataService.formControlChangeStatus = true;
      }
    });
  }

  backConfirmationModal() {
    if (this.buildingsPageForm.dirty) {
      this.backConfirmationModalComponent.showConfirmationModal();
    } else {
      this.goBack();
    }
  }

  proceedToNext() {
    if ((this.commonDataService.activeLocation) < this.submissionDataService.locations.length) {
      this.commonDataService.activeLocation++;
      this.router.navigate(['bop/submission/locations']);
    } else {
      this.router.navigate(['bop/submission/blankets']);
    }
  }
}
