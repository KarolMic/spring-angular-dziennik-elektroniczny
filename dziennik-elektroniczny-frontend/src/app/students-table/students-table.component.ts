import {Component, Input, OnInit} from '@angular/core';
import {HttpRequestsService} from '../services/http-requests.service';
import {Student} from '../model/student';
import {Class} from '../model/class';
import {Teacher} from '../model/teacher';
import {Subject} from '../model/subject';
import {Lesson} from '../model/lesson';
import {DayOfWeek} from '../model/day-of-week';
import {HourLesson} from '../model/hour-lesson';

@Component({
  selector: 'app-students-table',
  templateUrl: './students-table.component.html',
  styleUrls: ['./students-table.component.css']
})
export class StudentsTableComponent implements OnInit {

  students: Student[];
  classes: Class[];
  teachers: Teacher[];
  subjects: Subject[];
  lessons: Lesson[];
  daysOfWeek: DayOfWeek[];
  hourLessons: HourLesson[];
  dayHourLessonMap = new Map();

  constructor(private service: HttpRequestsService) { }

  ngOnInit(): void {
    this.updateTable();
  }

  public updateTable(): void {
    this.service.findStudents().subscribe(value => this.students = value);
    this.service.findClasses().subscribe(value => this.classes = value);
    this.service.findTeachers().subscribe(value => this.teachers = value);
    this.service.findSubjects().subscribe(value => this.subjects = value);
    this.service.findDaysOfWeek().subscribe(value => this.daysOfWeek = value);
    this.service.findHourLessons().subscribe(value => {
      this.service.findLesson('1A').subscribe(lessons => {
        this.lessons = lessons;
        this.hourLessons = value;
        this.prepareHourLessons();
      } );
    });
  }

  private prepareHourLessons(): void {
    for (const hourLesson of this.hourLessons) {
      for (const day of this.daysOfWeek) {
        for (const lesson of this.lessons) {
          if (lesson.hourLesson.name === hourLesson.name && lesson.dayOfWeek.name === day.name) {
            this.dayHourLessonMap.set((day.name + hourLesson.name), lesson.subject.name);
          } else if (lesson.hourLesson.name !== hourLesson.name && lesson.dayOfWeek.name !== day.name && this.dayHourLessonMap.has((day.name + hourLesson.name)) === false) {
            this.dayHourLessonMap.set((day.name + hourLesson.name), false);
          }
        }
      }
    }
  }

}
