import { Component } from '@angular/core';
import {HttpRequestsService} from '../services/http-requests.service';
import {ActivatedRoute, Router} from '@angular/router';
import {AuthRequest} from './auth-request';
import {AuthResponse} from './auth-response';
import {HeadersInterceptorService} from '../services/interceptor/headers-interceptor.service';
import {AppComponent} from '../app.component';

@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css']
})
export class LoginFormComponent {

  userName: string;
  password: string;

  authRequest: AuthRequest;

  constructor(private service: HttpRequestsService, private router: Router, private route: ActivatedRoute) { }

  public getAccesToken(): void {
    this.authRequest = {
      userName: this.userName,
      password: this.password
    };
    const resp = this.service.generateToken(this.authRequest);
    resp.subscribe(data => {
      HttpRequestsService.loggedUserSubject.next(this.userName);
      localStorage.setItem('token', data.token);

      this.navigateToMainPage();
    });
  }

  public navigateToMainPage(): void {
    this.router.navigate(['/strona-glowna']);
  }
}
