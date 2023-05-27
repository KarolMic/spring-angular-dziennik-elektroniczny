import {Component, Input, OnChanges, OnInit} from '@angular/core';
import {Student} from '../../model/student';
import {Class} from '../../model/class';
import {Subject} from '../../model/subject';
import {LessonResponse} from '../../model/lessonResponse';
import {DayOfWeek} from '../../model/day-of-week';
import {HourLesson} from '../../model/hour-lesson';
import {HttpRequestsService} from '../../services/http-requests.service';

@Component({
  selector: 'app-lesson-schedule-table',
  templateUrl: './lesson-schedule-table.component.html',
  styleUrls: ['./lesson-schedule-table.component.css']
})
export class LessonScheduleTableComponent implements OnInit, OnChanges {

  @Input()
  selectedClass = '';

  students: Student[];
  subjects: Subject[];
  lessonResponse: LessonResponse;
  daysOfWeek: DayOfWeek[];
  hourLessons: HourLesson[];
  dayHourLessonMap = new Map();

  constructor(private service: HttpRequestsService) { }

  ngOnInit(): void {
    this.updateTable();
  }

  ngOnChanges() {
    this.updateTable();
  }

  updateTable(): void {
    this.daysOfWeek = [];
    this.lessonResponse = null;
    this.hourLessons = [];
    this.dayHourLessonMap = new Map();
    this.service.findDaysOfWeek().subscribe(daysOfWeek => {
      this.service.findHourLessons().subscribe(hourLessons => {
        this.service.findLesson(this.selectedClass)
          .subscribe(lessonResponse => {
            this.daysOfWeek = daysOfWeek;
            this.lessonResponse = lessonResponse;
            this.hourLessons = hourLessons;
          } );
      });
    });
  }
}
