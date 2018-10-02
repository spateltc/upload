import { Injectable } from '@angular/core';
import {Http} from '@angular/http';
import 'rxjs/add/operator/map';
@Injectable()
export class PieChartServiceData{
constructor(private _http:Http){

}

getCurrentTime()
{
return this._http.get('http://localhost:8080/TWB/ords/preprod/count/')
.map(res=>res.json());
}

postJSON(){

}
}