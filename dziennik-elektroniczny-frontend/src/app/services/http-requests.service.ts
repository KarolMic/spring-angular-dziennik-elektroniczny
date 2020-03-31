import { Injectable } from '@angular/core';
import {Observable} from 'rxjs';
import {Student} from '../model/student';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Class} from '../model/class';
import {Teacher} from '../model/teacher';
import {Subject} from '../model/subject';
import {Lesson} from '../model/lesson';
import {DayOfWeek} from '../model/day-of-week';

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

  findClasses(): Observable<Class[]> {
    return this.http.get<Class[]>('http://localhost:8080/classes', {
      headers: new HttpHeaders().set('Accept', 'application/json'),
    });
  }

  findTeachers(): Observable<Teacher[]> {
    return this.http.get<Teacher[]>('http://localhost:8080/teachers', {
      headers: new HttpHeaders().set('Accept', 'application/json'),
    });
  }

  findSubjects(): Observable<Subject[]> {
    return this.http.get<Subject[]>('http://localhost:8080/subjects', {
      headers: new HttpHeaders().set('Accept', 'application/json'),
    });
  }

  findLesson(className: string, dayOfWeek: string): Observable<Lesson[]> {
    return this.http.get<Lesson[]>('http://localhost:8080/lesson?className=' + className + '&dayOfWeek=' + dayOfWeek, {
      headers: new HttpHeaders().set('Accept', 'application/json'),
    });
  }

  findDaysOfWeek(): Observable<DayOfWeek[]> {
    return this.http.get<DayOfWeek[]>('http://localhost:8080/daysOfWeek', {
      headers: new HttpHeaders().set('Accept', 'application/json'),
    });
  }
}
