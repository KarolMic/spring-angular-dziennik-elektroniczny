import {HttpEvent, HttpEventType, HttpHandler, HttpInterceptor, HttpRequest, HttpResponse} from '@angular/common/http';
import {Observable, throwError} from 'rxjs';
import {catchError, map, tap} from 'rxjs/operators';
import { Injectable} from '@angular/core';
import {Router} from '@angular/router';

@Injectable({
  providedIn: "root"
})
export class HeadersInterceptorService implements HttpInterceptor {

  constructor(private router: Router) {
  }

// This method executes while any request is called
  intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
    if (!req.url.toString().includes('authenticate')) {
      const modifiedRequest = req.clone(
        {
          headers: req.headers
            .append('Content-Type', 'application/json')
            .append('Authorization', 'Bearer ' + localStorage.getItem('token'))
        }
      );
      return next.handle(modifiedRequest).pipe(catchError(err => {
        if ([401, 403].includes(err.status) && localStorage.getItem('token')) {
          this.router.navigate(['/login']);
          return;
        }

        const error = err.error?.message || err.statusText;
        return throwError(() => error);
      }));
    }
    return next.handle(req);
  }
}
