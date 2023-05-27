import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {StronaGlownaComponent} from './strona-glowna/strona-glowna.component';
import {LessonSchedule} from './lesson-schedule/lesson-schedule.component';
import {LoginFormComponent} from './login-form/login-form.component';
import {LogoutComponent} from './logout/logout.component';
import {UserDetailsComponent} from './user/user-details/user-details.component';

const routes: Routes = [
  { path: '', redirectTo: '/strona-glowna', pathMatch: 'full' },
  { path: 'strona-glowna', component: StronaGlownaComponent },
  { path: 'login', component: LoginFormComponent },
  { path: 'logout', component: LogoutComponent },
  { path: 'lessonSchedule', component: LessonSchedule },
  { path: 'user/:userName', component: UserDetailsComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }
