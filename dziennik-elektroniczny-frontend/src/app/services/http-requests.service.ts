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

@Injectable({
  providedIn: 'root'
})
export class HttpRequestsService {

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

  findLesson(className: string): Observable<Lesson[]> {
    return this.http.get<Lesson[]>('http://localhost:8080/lesson?className=' + className);
  }

  findDaysOfWeek(): Observable<DayOfWeek[]> {
    return this.http.get<DayOfWeek[]>('http://localhost:8080/daysOfWeek');
  }

  findHourLessons(): Observable<HourLesson[]> {
    return this.http.get<HourLesson[]>('http://localhost:8080/hourLessons');
  }
}
