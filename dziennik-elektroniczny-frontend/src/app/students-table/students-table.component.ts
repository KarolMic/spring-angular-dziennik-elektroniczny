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
    this.service.findDaysOfWeek().subscribe(value => {this.daysOfWeek = value});
    this.service.findLesson("1A").subscribe(value => {this.lessons = value; console.log(value)});
    this.service.findHourLessons().subscribe(value => {this.hourLessons = value; this.iterate()});
  }

  public updateBlankCells(dayOfWeek: DayOfWeek): void {
    this.dayHourLessonMap.set(dayOfWeek.name, true)
  }

  public setAllCellsFalse(): void {
    this.dayHourLessonMap.forEach((value: boolean, key: string) => {
      console.log(key);
      console.log(value);
    });
  }

  public iterate(): void {
    console.log("----------------------");
    for (let lesson of this.lessons) {
      console.log(lesson);
    }
    console.log("----------------------");

    for (let hour of this.hourLessons) {
      for (let day of this.daysOfWeek) {
        for (let lesson of this.lessons) {
          if (lesson.hour_lesson_id.name === hour.name && lesson.dayOfWeekId.name === day.name) {
            this.dayHourLessonMap.set((day.name + hour.name), lesson.subject_id.name);
          } else if (lesson.hour_lesson_id.name !== hour.name && lesson.dayOfWeekId.name !== day.name && this.dayHourLessonMap.has((day.name + hour.name)) == false) {
            this.dayHourLessonMap.set((day.name + hour.name), false);
            // console.log(day.name + " " + hour.name)
          }
        }
      }
    }
    this.dayHourLessonMap.forEach((value: boolean, key: string) => {
      console.log(key + " " + value);
    });
  }

  keepOrder = (a, b) => {
    return a;
  }

}
