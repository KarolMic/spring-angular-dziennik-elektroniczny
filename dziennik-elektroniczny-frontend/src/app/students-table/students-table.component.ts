import {Component, Input, OnInit} from '@angular/core';
import {HttpRequestsService} from '../services/http-requests.service';
import {Student} from '../model/student';
import {Class} from '../model/class';
import {Teacher} from '../model/teacher';
import {Subject} from '../model/subject';
import {Lesson} from '../model/lesson';
import {DayOfWeek} from '../model/day-of-week';

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
    this.service.findLesson("1A", "Monday").subscribe(value => this.lessons = value);
  }

}
