import { Component } from '@angular/core';
import { TableService } from './fetch.service';
import { DialogService } from "ng2-bootstrap-modal";
import { ConfirmComponent } from './confirm.component';
import {  Output, EventEmitter } from '@angular/core';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
   providers: [TableService]
})
export class AppComponent {
  title = 'app';
  data = [];
  data3 = [];
  data2 = [];
  data1 = [];
  showChart = true;
  showChart3 = true;
  showChart2 = true;
  showChart1 = true;
   //htmlStr="<div droppable (drop)=\"onDrop1($event)\" id=\"dropAreaText1\" class=\"half\" >  <confirm [hidden]=\"showChart1\" (onConfirm)='handleOnConfirm1($event)'></confirm>  <p id=\"dropText1\" >drop chart here </p> <pie-chart-demo [hidden]=\"showChart1\" id=\"pc1\" [data]=\"data1\"></pie-chart-demo>  </div>";
  private showPopup=false;
  //@Output() showPieChart = new EventEmitter();


  constructor(private dialogService:DialogService) {}
showConfirm() {
            let disposable = this.dialogService.addDialog(ConfirmComponent, {
                title:'Confirm title', 
                message:'Confirm message'})
                .subscribe((isConfirmed)=>{        
                    if(isConfirmed) {
                       // alert('accepted');
                    }
                    else {
                       // alert('declined');
                    }
                });
        }


  handleOnConfirm (data) {
      console.log('handleOnConfirm', data);
      this.data = data;
  }

  handleOnConfirm3 (data) {
      console.log('handleOnConfirm', data);
      this.data3 = data;
  }

  handleOnConfirm2 (data) {
      console.log('handleOnConfirm', data);
      this.data2 =data;
  }


  handleOnConfirm1 (data) {
      console.log('handleOnConfirm', data);
      this.data1 = data;
  }


onDrop(event:any) {
event.preventDefault();
event.stopPropagation();
console.log("on drop event fired");
document.getElementById("dropText").hidden=true;
document.getElementById("pc").hidden=false;
this.showPopup=true;
console.log(event);
this.showChart =  false;
//this.showPieChart.emit(false);
}
onDrop3(event:any) {
event.preventDefault();
event.stopPropagation();
console.log("on drop event fired");
document.getElementById("dropText3").hidden=true;
document.getElementById("pc3").hidden=false;
this.showPopup=true;
console.log(event);
this.showChart3 =  false;
//this.showPieChart.emit(false);
}
onDrop2(event:any) {
event.preventDefault();
event.stopPropagation();
console.log("on drop event fired");
document.getElementById("dropText2").hidden=true;
document.getElementById("pc2").hidden=false;
this.showPopup=true;
console.log(event);
this.showChart2 =  false;
//this.showPieChart.emit(false);
}
onDrop1(event:any) {
event.preventDefault();
event.stopPropagation();
console.log("on drop event fired");
document.getElementById("dropText1").hidden=true;
document.getElementById("pc1").hidden=false;
this.showPopup=true;
console.log(event);
this.showChart1 =  false;
//this.showPieChart.emit(false);
}


 // showPieChart1(event) {
   // this.showChart = event;
  //}
}
