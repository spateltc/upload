import { Component,Input, OnChanges  } from '@angular/core';
import { DatePipe } from '@angular/common';
import { TableService } from './fetch.service';
import { Subscription }   from 'rxjs/Subscription';
import { SlicePipe } from '@angular/common';
import * as _ from 'lodash';
import { DecimalPipe } from '@angular/common';
import { ActivatedRoute, Router } from '@angular/router';
import { headerComponent } from './header.component';


declare var google: any;
@Component({
  selector: 'tabl',
  templateUrl: './tablecomponent.html',
  styleUrls: ['./tablecomponent.css'],
  providers: [TableService]
})
export class TableComponent {
  title = 'app';
  public startDat;
  public endDat;
  public sub;
  public locParam;
  public reportNa;
    
public barChartData:any[];

    constructor(private _tableService:TableService,
     private route: ActivatedRoute,
    private router: Router) {
    }

    
servicecall(startDateValue:String,endDateValue:String,reportName:String):void{
this._tableService.getTables(startDateValue,endDateValue,reportName,this.locParam)
        .subscribe(restableData =>{
           this.barChartData = restableData;
           console.log('response data ',restableData);
     this.barChartData.forEach((value) => {
     this.locParam=value.location;           
 });           
});
}

  dateBasedValueFetch(): void {
      var   startDateValue= ((document.getElementById("startDate") as HTMLInputElement).value);
      var   endDateValue= ((document.getElementById("endDate") as HTMLInputElement).value);
      this.barChartData=null;
      this.servicecall(startDateValue,endDateValue,"C3 Audit");
  }

   ngOnInit(): void {


    //  this.activatedRoute.params.subscribe((params: Params) => {
    //     let userId = params['userId'];
    //     console.log(userId);



      this.sub = this.route
      .queryParams
      .subscribe(queryParams => {
        this.locParam = queryParams['locParam'];
        console.log('sashank location',this.locParam);
      });


  var y = document.getElementById("mydate");
  var today = new Date();
	var dd = today.getDate();
	var mm = today.getMonth()+1; //January is 0!
	var yyyy = today.getFullYear();
  var day;
  var mon;

if(dd<10) {
    day = '0'+dd;
}else{
day=dd;
}

if(mm<10) {
    mon = '0'+mm;
} else{
  mon=mm;
}

     
var currentDate = yyyy + '-' + mon  + '-' + day;
console.log(currentDate);
    (<HTMLInputElement>document.getElementById("startDate")).value=currentDate;
    this.startDat=currentDate;

     (<HTMLInputElement>document.getElementById("endDate")).value=currentDate;

     this.endDat=currentDate;

     var   startDateValue= ((document.getElementById("startDate") as HTMLInputElement).value);
     var   endDateValue= ((document.getElementById("endDate") as HTMLInputElement).value);
     this.servicecall(startDateValue,endDateValue,"C3 Audit");
    }
}
