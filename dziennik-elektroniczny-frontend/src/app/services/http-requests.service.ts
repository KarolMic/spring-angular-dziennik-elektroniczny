import { Injectable } from '@angular/core';
import {Observable} from 'rxjs';
import {Student} from '../model/student';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Class} from '../model/class';
import {Subject} from '../model/subject';
import {Lesson} from '../model/lesson';
import {DayOfWeek} from '../model/day-of-week';
import {HourLesson} from '../model/hour-lesson';
import {Teacher} from '../model/teacher';
import {AuthRequest} from '../login-form/auth-request';
import {AuthResponse} from '../login-form/auth-response';
import {Subject as RxjsSubject} from 'rxjs';
import {LessonResponse} from '../model/lessonResponse';
import {UserDetailsItem} from '../model/UserDetailsItem';

@Injectable({
  providedIn: 'root'
})
export class HttpRequestsService {

  public static loggedUserSubject: RxjsSubject<string> = new RxjsSubject<string>();

  constructor(private http: HttpClient) { }

  findStudents(): Observable<Student[]> {
    return this.http.get<Student[]>('http://localhost:8080/students', {
      // headers: new HttpHeaders().set('Accept', 'application/json'),
    });
  }

  findClasses(): Observable<Class[]> {
    return this.http.get<Class[]>('http://localhost:8080/classes');
  }

  findTeachers(): Observable<Teacher[]> {
    return this.http.get<Teacher[]>('http://localhost:8080/teachers');
  }

  findSubjects(): Observable<Subject[]> {
    return this.http.get<Subject[]>('http://localhost:8080/subjects');
  }

  findLesson(className: string): Observable<LessonResponse> {
    return this.http.get<LessonResponse>('http://localhost:8080/lesson?className=' + className);
  }

  findDaysOfWeek(): Observable<DayOfWeek[]> {
    return this.http.get<DayOfWeek[]>('http://localhost:8080/daysOfWeek');
  }

  findHourLessons(): Observable<HourLesson[]> {
    return this.http.get<HourLesson[]>('http://localhost:8080/hourLessons');
  }

  generateToken(authRequest: AuthRequest): Observable<AuthResponse> {
    return this.http.post<AuthResponse>('http://localhost:8080/authenticate', authRequest);
  }

  logout(): Observable<any> {
    return this.http.get<any>('http://localhost:8080/logout');
  }

  getUserDetails(userName: string): Observable<UserDetailsItem> {
    return this.http.get<UserDetailsItem>('http://localhost:8080/user/details/' + userName)
  }
}
