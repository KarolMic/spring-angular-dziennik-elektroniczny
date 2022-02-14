import { Component, OnInit } from '@angular/core';
import {HttpRequestsService} from '../services/http-requests.service';
import {ActivatedRoute, Router} from '@angular/router';

@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css']
})
export class LoginFormComponent implements OnInit {

  userNamee: string;
  passworde: string;

  authRequest: any;

  constructor(private service: HttpRequestsService, private _router: Router, private _route: ActivatedRoute) { }

  ngOnInit(): void {
  }

  public getAccesToken(authRequest): void {
    this.authRequest = {
      userName: this.userNamee,
      password: this.passworde
    };
    const resp = this.service.generateToken(this.authRequest);
    resp.subscribe(data => {console.log(data); this.navigateToUserPage(data);});
  }

  public navigateToUserPage(userToken: object): void {
    this._router.navigate(['/nauczyciel'], {
      queryParams: {
        token: userToken
      }
    });
  }

}
