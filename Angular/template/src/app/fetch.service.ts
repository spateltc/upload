import { Injectable } from "@angular/core";
import { Http,Response,Headers } from "@angular/http";
import 'rxjs/add/operator/map';
import {RequestOptions} from "@angular/http";
import { Observable } from 'rxjs/Observable';
import { Subject } from 'rxjs/Subject';
import 'rxjs/add/operator/do';


@Injectable()
export class TableService{
   // IP: "http://10.118.5.248:8081/TWB"
     private _url: string ="http://USBLRSPATELTC1:8080/GhostRider/ords/preprod/MapReportTable"
    constructor(private _http: Http){}
    getTables(startDateValue:String,endDateValue:String,reportName:String,location:String){
        var header = new Headers();
        var options=new RequestOptions();
        var _url=this._url+"?"+"startDateValue="+startDateValue+"&endDateValue="+endDateValue+"&reportName="+reportName+"&location="+location;
        console.log('Network Call',_url);
        header.append('Content-Type', 'application/json');
        header.append('Access-Control-Allow-Origin','*');
        header.append('Access-Control-Allow-Headers','Content-Type');
        header.append('Access-Control-Allow-Methods','GET, POST, PUT, DELETE, OPTIONS');
        return this._http.get(_url,options)
        .map((response:Response) => response.json()).do((res) => {
            console.log('shashank',res);
        });
    }

    getmapLocations(){
        var header = new Headers();
        var options=new RequestOptions();
        var _url='http://USBLRSPATELTC1:8080/GhostRider/ords/preprod/MapLocation';
        console.log('Network Call',_url);
        header.append('Content-Type', 'application/json');
        header.append('Access-Control-Allow-Origin','*');
        header.append('Access-Control-Allow-Headers','Content-Type');
        header.append('Access-Control-Allow-Methods','GET, POST, PUT, DELETE, OPTIONS');
        return this._http.get(_url,options)
        .map((response:Response) => response.json()).do((res) => {
            console.log(res);
        });
    }
}
