import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { LessonSchedule } from './lesson-schedule/lesson-schedule.component';
import {HTTP_INTERCEPTORS, HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { StronaGlownaComponent } from './strona-glowna/strona-glowna.component';
import { LoginFormComponent } from './login-form/login-form.component';
import {FormsModule} from '@angular/forms';
import {HeadersInterceptorService} from './services/interceptor/headers-interceptor.service';
import {RouterModule} from '@angular/router';
import { LogoutComponent } from './logout/logout.component';
import { UserDetailsComponent } from './user/user-details/user-details.component';
import { LessonScheduleTableComponent } from './lesson-schedule/lesson-schedule-table/lesson-schedule-table.component';

@NgModule({
  declarations: [
    AppComponent,
    LessonSchedule,
    StronaGlownaComponent,
    LoginFormComponent,
    LogoutComponent,
    UserDetailsComponent,
    LessonScheduleTableComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    RouterModule,
    FormsModule
  ],
  providers: [
    { provide: HTTP_INTERCEPTORS, useClass: HeadersInterceptorService, multi: true },
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
