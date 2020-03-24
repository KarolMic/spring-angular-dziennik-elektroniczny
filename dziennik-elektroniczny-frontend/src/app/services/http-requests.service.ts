import { Injectable } from '@angular/core';
import {Observable} from 'rxjs';
import {Student} from '../model/student';
import {HttpClient, HttpHeaders} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class HttpRequestsService {

  constructor(private http: HttpClient) { }

  findStudents(): Observable<Student[]> {
    return this.http.get<Student[]>('http://localhost:8080/students', {
      headers: new HttpHeaders().set('Accept', 'application/json'),
    });
  }
}
