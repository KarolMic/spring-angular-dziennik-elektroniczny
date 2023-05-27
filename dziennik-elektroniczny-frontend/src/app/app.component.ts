import {Component, OnInit} from '@angular/core';
import {HttpRequestsService} from './services/http-requests.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'dziennik-elektroniczny-frontend';

  loggedUser = '';

  ngOnInit(): void {
    HttpRequestsService.loggedUserSubject.subscribe( user => this.loggedUser = user );
  }

  updateLoggedUser() {
    HttpRequestsService.loggedUserSubject.next('');
  }
}
