import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import {ChartsModule} from 'ng2-charts/ng2-charts';
import {PieChartDemoComponent} from './piechartdemo.component';
import {BarChartDemoComponent} from './barchart.component';
import { HttpModule } from '@angular/http';
import { CommonModule } from '@angular/common'; 

import { DemoComponent } from "./demo.component";
import { Ng2DragDropModule } from  'ng2-drag-drop';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
 import { FormsModule } from "@angular/forms";
import {BusyModule} from 'angular2-busy';
import { BootstrapModalModule } from 'ng2-bootstrap-modal';
import {ConfirmComponent} from './confirm.component';
import { TableService } from './fetch.service';
@NgModule({
  declarations: [
    AppComponent,PieChartDemoComponent,BarChartDemoComponent,DemoComponent,ConfirmComponent
  ],
  imports: [
    BrowserModule,
    ChartsModule,
    HttpModule,
    FormsModule,
    Ng2DragDropModule.forRoot(),  
   
    BootstrapModalModule,
     BrowserAnimationsModule,
    BusyModule//,
   // PopupModule.forRoot()
  ],
  //  entryComponents: [
  //       ConfirmComponent
  //     ],
  providers: [TableService],
  bootstrap: [AppComponent]
})
export class AppModule { }
