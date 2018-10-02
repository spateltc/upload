import { Component, Input, OnChanges } from '@angular/core';
 import {PieChartServiceData} from './piechart.service';
 import { TableService } from './fetch.service';
 import {OnInit} from '@angular/core';
 import { ActivatedRoute } from '@angular/router';
import { Observable }     from 'rxjs/Observable';
import { Subscription }   from 'rxjs/Subscription';
@Component({
  selector: 'pie-chart-demo',
  template: `

  <div [hidden]="hidden" style="width:60%;height:60%;position:relative;justify-content:center;">
  <canvas baseChart
          [data]="pieChartData"
          [labels]="pieChartLabels"
          [chartType]="pieChartType"
          [colors]="pieChartcolors"
          [options]="pieChartOptions"
          (chartHover)="chartHovered($event)"
          (chartClick)="chartClicked($event)"></canvas>
</div>


`,
providers:[PieChartServiceData]
})
export class PieChartDemoComponent implements OnInit, OnChanges {
  private subscriptions: Subscription[] = [];
  // Pie
       busy4: Subscription;

  public pieChartLabels:string[] = [];
  public pieChartData:number[] = [];
 public pieChartcolors:any[] = [
      { 
            backgroundColor:[] 
      //  backgroundColor:["#ef4d47", "#ecef34", "#3df75c", "#467bf4", " #00ffff"] 
      //  backgroundColor:["#ef4d47", "#ecef34"] 
      }];
  //  public pieChartcolors:any[] = [];
  public pieChartType:string = 'pie';
  public piechartdatastr:String; 
    
 
    public pieChartOptions: any = {
    responsive: true,
    tooltips: {
      enabled: true
    },
    animation: {
      onComplete: function () {
        var ctx = this.chart.ctx;
        ctx.textAlign = "center";
        ctx.textBaseline = "bottom";
        var chart = this;
        var datasets = this.config.data.datasets;

        datasets.forEach(function (dataset: Array<any>, i: number) {
          ctx.font = "13px Arial";
              
             

          ctx.fillStyle = "Black";
          chart.getDatasetMeta(i).data.forEach(function (p: any, j: any) {
             

            
            
            var  mid_radius =  p._model.innerRadius + ( p._model.outerRadius -  p._model.innerRadius)/2;
             
              var start_angle = p._model.startAngle;
              var  end_angle = p._model.endAngle;
              var mid_angle = start_angle + (end_angle - start_angle)/2;

                   var x = mid_radius * Math.cos(mid_angle);
             var y = mid_radius * Math.sin(mid_angle);


            ctx.fillText(datasets[i].data[j], p._model.x+x, p._model.y+y+15);
          });

        });
      }
    },
    legend: {
      display: true,
      labels: {
        
      }
    }
  }
 

 



 @Input() data = [];
 @Input() hidden = true;

 ngOnInit(){
   console.log("ngOnInit "+this._tableService.getChartData());

   this.initListeners();
     

    }

    ngOnChanges() {
      if (this.data.length > 0) {
      this.handleOnConfirm();
      
      }
    }
constructor(private _httpService:PieChartServiceData,private _tableService:TableService){
 console.log("pie chart component constructor");
 

 }

 initListeners () {
  this.subscriptions.push(this._tableService
                                .pieChartListener()
                                .subscribe(() => {
                                 console.log("pie chart manipulation");
                            }));


 }


  public chartClicked(e:any):void {
    console.log(e);
}
 
  public chartHovered(e:any):void {
    console.log(e);
  }
   handleOnConfirm () {

      
       
        
      console.log('handleOnConfirm', this.data);
      
      this.pieChartData = [];
      this.data.forEach((value) => {
      this.pieChartData.push(value.count);
      this.pieChartLabels.push(value.pieChartLabel);
      this.pieChartcolors[0].backgroundColor.push(value.color);
      
       
         console.log( value.pieChartLabel);
      });

      

     
      console.log("pie chart data"+this.pieChartData);
    }

    


    

}