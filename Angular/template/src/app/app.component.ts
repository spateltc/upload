import { Component,Input } from '@angular/core';
import { TableService } from './fetch.service';
import { headerComponent } from './header.component';
declare var google: any;
@Component({
  selector: 'app-root',
  template: `
  <router-outlet></router-outlet>`
})
export class AppComponent {

@Input() isCredentials:boolean;



 userIsLogged() {
    return this.isCredentials;
}

}
