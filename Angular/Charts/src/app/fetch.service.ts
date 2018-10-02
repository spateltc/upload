import { Injectable } from "@angular/core";
import { Http,Response,Headers } from "@angular/http";
import 'rxjs/add/operator/map';
import {RequestOptions} from "@angular/http";
import { Observable } from 'rxjs/Observable';
import { Subject } from 'rxjs/Subject';
@Injectable()
export class TableService{
  private _url: string ="http://10.118.5.248:8081/TWB/ords/preprod/listtestplan/"
 // private _url: string ="http://localhost:8080/TWB/ords/preprod/listtestplan/"
    private _url2: string ="http://10.118.5.248:8081/TWB/ords/preprod/getEntityNames"

 //   private _url2: string ="http://localhost:8080/TWB/ords/preprod/getEntityNames"

    private _url3: string ="http://10.118.5.248:8081/TWB/ords/preprod/drawChart"

   //  private _url3: string ="http://localhost:8080/TWB/ords/preprod/drawChart"
    private subject = new Subject<any>();

    _chartData:any;
    responseTxt:any;
  
    constructor(private _http: Http){}
    getTables(){
        
        var header = new Headers();
        var options=new RequestOptions();
header.append('Content-Type', 'application/json');
header.append('Access-Control-Allow-Origin','*');
header.append('Access-Control-Allow-Headers','Content-Type');
header.append('Access-Control-Allow-Methods','GET, POST, PUT, DELETE, OPTIONS');
        return this._http.get(this._url,options)
        .map((response:Response) => response.json());
    }

     getCategory(param : String){
          var _url3=this._url2+"?"+"entity="+param;
        var header = new Headers();
        var options=new RequestOptions();
header.append('Content-Type', 'application/json');
header.append('Access-Control-Allow-Origin','*');
header.append('Access-Control-Allow-Headers','Content-Type');
header.append('Access-Control-Allow-Methods','GET, POST, PUT, DELETE, OPTIONS');
        
        return this._http.get(_url3,options)
        .map((response:Response) => response.json());
    }


    drawChart( planName : String, entity : string ,category : string ): Observable<any[]>{
        var _url4=this._url3+"?"+"planName="+planName+"&entity="+entity+"&category="+category;
        console.log("fetch service->"+_url4);
        var header = new Headers();
        var options=new RequestOptions();
    header.append('Content-Type', 'application/json');
    header.append('Access-Control-Allow-Origin','*');
    header.append('Access-Control-Allow-Headers','Content-Type');
    header.append('Access-Control-Allow-Methods','GET, POST, PUT, DELETE, OPTIONS');
    console.log("draw chart action "+_url4);
        return this._http.get(_url4,options)
        .map((response:Response) => response.json())
        .do((res) => {
            console.log(res);
        });

      
       
    }

    setChartData(chartData:any){
    console.log("fetch service setchartdata"+chartData);
    this._chartData=chartData;
    this.subject.next(true);
    }

    pieChartListener (): Observable<any> {
        console.log("fetch service-->pieChartListener");
        return this.subject.asObservable();
    }
getChartData(){
     console.log("fetch service getchartdata"+this._chartData);
    return this._chartData;
}
}
