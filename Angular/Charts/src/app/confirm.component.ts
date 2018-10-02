import { Component, Output, EventEmitter,Input } from '@angular/core';
import { DialogComponent, DialogService } from "ng2-bootstrap-modal";
import {OnInit} from '@angular/core';
import { TableService } from './fetch.service';
import {Subscription} from 'rxjs';
export interface ConfirmModel {
  title:string;
  message:string;
}
@Component({  
    selector: 'confirm',
    template: `<div [ngBusy]="busy">
    <head>
<style>


/* Style the label */

label {
    color: #6a98e2;
    font-size:15px;
}

button
{
    color: #6a98e2;
    font-size:15px;
}


</style>
</head>
     
    
    
    <div [hidden]="hidden" class="modal-dialog" style="position: absolute; top: 14%;margin-left:150px">
      <div class="modal-content">

        <div class="modal-header" style="color:#f7f8f9;background-color:#6a98e2;">
                     <button type="button" class="close" (click)="closePopup()" >&times;</button>
                     <h4 class="modal-title">Report Settings</h4>
                   </div>



                <div  [ngBusy]="busy1" class="modal-body">
  <label>Project Name</label>&nbsp;&nbsp;&nbsp;&nbsp;
  <select [(ngModel)]="PlanNameValue" style="width:300px;">
  <option *ngFor="let restableDataind of tableData"  ngDefaultControl value= {{restableDataind.planName}}>
    {{restableDataind.planName}}
  </option>
</select>
  </div>

    <div class="modal-body"   [ngBusy]="busy2">
           <label>Entity </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <select  name="Entity" style="width:300px;" [(ngModel)]="EntityValue" ngDefaultControl (change)="saverange()" >
            <option  [value]="1" [selected]="tableData.Entity ==1">Defects</option>
            <option  [value]="0" [selected]="tableData.Entity ==0">Test Execution</option>
          </select>
    </div>

        <div [ngBusy]="busy3" class="modal-body" >
   <label>Category </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <select [(ngModel)]="CategoryValue" style="width:300px;">
 <option *ngFor="let restableDatain of category"  ngDefaultControl value= {{restableDatain.category}}>
    {{restableDatain.category}} 
  </option> 
</select>
  </div>

  <div [ngBusy]="busy4"  class="modal-footer"   style="color:#f7f8f9;background-color:#6a98e2;"   >
  <button (click)="drawChart()">Draw Chart</button>
  </div></div>
              </div></div>`,
 providers: [TableService]
})
export class ConfirmComponent extends DialogComponent<ConfirmModel, boolean> implements ConfirmModel,OnInit {
  title: string;
  message: string;
 
  busy1: Subscription;
   busy2: Subscription;
    busy3: Subscription;
     busy4: Subscription;

  @Input() hidden = true;
  constructor(dialogService: DialogService,private _tableService:TableService) {
    super(dialogService);
     this.EntityValue = 1;
  }

   tableData = [];
    category = [];
    chartData=[];
    EntityValue ;
    PlanNameValue ;
    CategoryValue ;

    @Output() onConfirm = new EventEmitter<any>();

    ngOnInit(){
      console.log('Confirm component ngonit')

       
       this.busy1 =  this._tableService.getTables() 
        .subscribe(restableData => this.tableData = restableData);
       this.busy2 =   this._tableService.getCategory(this.EntityValue) 
        .subscribe(restableData => this.category = restableData);
    }
    saverange(){
      this.busy3 = this._tableService.getCategory(this.EntityValue) 
        .subscribe(restableData => this.category = restableData);
    }
    drawChart(){
      console.log(this.PlanNameValue);
       console.log(this.CategoryValue);
       console.log("confirm component-draw chart ");
       this.busy4 = this._tableService.drawChart(this.PlanNameValue, this.EntityValue, this.CategoryValue) 
        .subscribe(restableData => {
         
          this.onConfirm.emit(restableData);
        });
     
   this.hidden=true;
    }
   closePopup(){
     console.log("close popup");
    this.hidden=true;
   }
  confirm() {
    
    this.result = true;
   this.hidden=true;
  }
}