import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule }   from '@angular/router';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { TableComponent } from './table.component';
import { mapComponent } from './map.component';
import { LoginComponent } from './login.component';
import { headerComponent } from './header.component';
import { TableService } from './fetch.service';
import { HttpModule } from '@angular/http';
import { BookDetailComponent } from './book-detail/book-detail.component';

@NgModule({
  declarations: [
    AppComponent,
    TableComponent,
    mapComponent,
    LoginComponent,
    headerComponent,
    BookDetailComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    RouterModule.forRoot([
     {
        path:'',
       component: LoginComponent
      },
      {
       path:'map',
       component: mapComponent
      },
       {
       path:'table',
       component: TableComponent
      }
      ]),
  ],
  providers: [TableService],
  bootstrap: [AppComponent]
})
export class AppModule { }
