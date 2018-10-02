import { Component,NgZone } from '@angular/core';
import { TableService } from './fetch.service';
import { Router } from '@angular/router';

declare var google: any;
@Component({
  selector: 'header',
  template: `<ul>
  <li style="float:left"><a routerLink="/" routerLinkActive="active"><img  src="spectrumLogo.png"   style="width:100px;height:25px;"></a></li>
  <li style="float:left"><p><font color="white" size="4.5">GhostRider</font></p></li>
  <li style="float:right">  <a routerLink="/" routerLinkActive="active" class="btn btn-info btn-lg">
          <span class="glyphicon glyphicon-log-out"></span> Log out
        </a></li>
</ul>
  `
})
export class headerComponent {

}
