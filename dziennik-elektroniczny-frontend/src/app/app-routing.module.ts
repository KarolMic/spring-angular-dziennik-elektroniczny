import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {StronaGlownaComponent} from './strona-glowna/strona-glowna.component';

const routes: Routes = [
  {path: '', redirectTo: '/strona-glowna', pathMatch: 'full'},
  {path: 'strona-glowna', component: StronaGlownaComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }
