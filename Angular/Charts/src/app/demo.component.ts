import { Component } from '@angular/core';
import { ViewChild } from '@angular/core';
import { ConfirmComponent } from './confirm.component';
import { DialogService } from "ng2-bootstrap-modal";

@Component({
  selector: 'drag-drop-demo',
  templateUrl: './demo.component.html'
})
export class DemoComponent {
 
public AdvancedFlag = true;
public BasicFlag = false;
public testhtml :string;
//private showPopup=false;



constructor(private dialogService:DialogService) {}

 // showConfirm() {
  //          let disposable = this.dialogService.addDialog(ConfirmComponent, {
   //             title:'Confirm title', 
   //             message:'Confirm message'})
   //             .subscribe((isConfirmed)=>{        
   //                 if(isConfirmed) {
                       // alert('accepted');
       //             }
        //            else {
       //                // alert('declined');
          ///          }
         ///       });
      //  }

        add(){
          alert("add");
      document.getElementById("main").innerHTML =document.getElementById("main").innerHTML
           +" "+     "<div droppable (drop)=\"onDrop5($event)\" id=\"dropAreaText5\" class=\"half\" >  <confirm [hidden]=\"showChart5\" (onConfirm)='handleOnConfirm5($event)'></confirm>  <p id=\"dropText5\" >drop chart here </p> <pie-chart-demo [hidden]=\"showChart5\" id=\"pc5\" [data]=\"data5\"></pie-chart-demo>  </div>";
        }

         remove(){
          alert("remove");
        }

//onDrop(event:any) {
//event.preventDefault();
//event.stopPropagation();
//console.log("on drop event fired");
//document.getElementById("dropAreaText").hidden=true;
//document.getElementById("pc").hidden=false;
//this.showPopup=true;
//console.log(event);
//this.showPieChart.emit(false);
//}



  setTab(param : any){
      if (param=='Advanced'){
        this.AdvancedFlag=true;
        this.BasicFlag=false;
      } 
      else if(param=='Basic'){
        this.BasicFlag=true;
        this.AdvancedFlag=false;
      }
    }

   
}