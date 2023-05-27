import { Component, OnInit } from '@angular/core';
import {HttpRequestsService} from '../../services/http-requests.service';
import {ActivatedRoute} from '@angular/router';
import {UserDetailsItem} from '../../model/UserDetailsItem';
import {UserType} from '../../model/UserType';

@Component({
  selector: 'app-user-details',
  templateUrl: './user-details.component.html',
  styleUrls: ['./user-details.component.css']
})
export class UserDetailsComponent implements OnInit {

  item: UserDetailsItem;

  constructor(private route: ActivatedRoute, private service: HttpRequestsService) { }

  ngOnInit(): void {
    this.route.paramMap.subscribe(params => {
      this.service.getUserDetails(params.get('userName')).subscribe(userDetailsItem => {
        this.item = new UserDetailsItem(userDetailsItem.type, userDetailsItem.userName, userDetailsItem.email, userDetailsItem.name,
          userDetailsItem.surName, userDetailsItem.clazz)
      });
    })
  }

  public get UserType() {
    return UserType;
  }

}
