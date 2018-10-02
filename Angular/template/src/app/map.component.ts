import { Component,NgZone } from '@angular/core';
import { TableService } from './fetch.service';
import { Router } from '@angular/router';
import { headerComponent } from './header.component';

declare var google: any;
@Component({
  selector: 'map',
  templateUrl: './mapcomponent.html',
  providers: [TableService]
})
export class mapComponent {
  title = 'app';
  public barChartData:any[];

    constructor(
        private _tableService:TableService,
        private router: Router,
        private ngZone:NgZone
    ) {}

  ngOnInit() {
    var infowindow = new google.maps.InfoWindow();
    var marker, i;
    var loca;
     this._tableService.getmapLocations()
        .subscribe(restableData =>{ this.barChartData = restableData;
          console.log('response data',restableData);
          console.log('response data',this.barChartData.length);
           var map = new google.maps.Map(document.getElementById('map'), {
      zoom: 4,
      center: new google.maps.LatLng(34.626871, -109.199527),
      mapTypeId: google.maps.MapTypeId.ROADMAP
    });


    var customMapType = new google.maps.StyledMapType([
      {
        elementType: 'labels',
        stylers: [{visibility: 'off'}]
      }
    ], {
      name: 'Custom Style'
  });


    

    for (i = 0; i < this.barChartData.length; i++) {  
      marker = new google.maps.Marker({  
        position: new google.maps.LatLng(this.barChartData[i].latitude, this.barChartData[i].longitude), 
		icon: 'http://maps.google.com/mapfiles/ms/icons/'+this.barChartData[i].color+'.png', 
        map: map 
      }); 

      
	 loca = this.barChartData;
  var loc=this.barChartData[i].locati;
      google.maps.event.addListener(marker, 'mouseover', (function(marker, i) {
        return function() {
         console.log('location',loc,i);
         console.log('location shashank',loca);
           infowindow.setContent(loca[i].location +" Last Executed: "+ loca[i].lastExecuted);
             infowindow.open(map, marker);
        }
      })(marker, i));

      google.maps.event.addListener(marker, 'click', ((marker, i) => {
        return ()=> {
       this.ngZone.run(() =>  this.router.navigate(['/table'], { queryParams: { locParam: loca[i].location,reportNa:'shashank' } }));
        }
      })(marker, i));
	  }
        });

 document.getElementById('map').style.display = 'block';
}

 hideDiv() {
    document.getElementById("map").style.display = "none";
}

}
