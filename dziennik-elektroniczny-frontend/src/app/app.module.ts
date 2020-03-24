import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { StudentsTableComponent } from './students-table/students-table.component';
import {HttpClientModule} from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    StudentsTableComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
