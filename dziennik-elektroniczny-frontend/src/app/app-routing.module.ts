import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {StronaGlownaComponent} from './strona-glowna/strona-glowna.component';
import {StudentsTableComponent} from './students-table/students-table.component';

const routes: Routes = [
  {path: '', redirectTo: '/strona-glowna', pathMatch: 'full'},
  {path: 'strona-glowna', component: StronaGlownaComponent},
  {path: 'nauczyciel', component: StudentsTableComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }
