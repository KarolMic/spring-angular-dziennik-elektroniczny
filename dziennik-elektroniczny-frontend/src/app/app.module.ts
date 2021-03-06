import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { StudentsTableComponent } from './students-table/students-table.component';
import {HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { StronaGlownaComponent } from './strona-glowna/strona-glowna.component';

@NgModule({
  declarations: [
    AppComponent,
    StudentsTableComponent,
    StronaGlownaComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule
],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
