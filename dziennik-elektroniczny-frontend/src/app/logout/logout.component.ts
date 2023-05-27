import { Component, OnInit } from '@angular/core';
import {HttpRequestsService} from '../services/http-requests.service';

@Component({
  selector: 'app-logout',
  templateUrl: './logout.component.html',
  styleUrls: ['./logout.component.css']
})
export class LogoutComponent implements OnInit {

  constructor(private service: HttpRequestsService) { }

  ngOnInit(): void {
    this.service.logout().subscribe(data => { console.log(data)});
  }
}
