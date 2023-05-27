import {Component, OnInit} from '@angular/core';
import {HttpRequestsService} from '../services/http-requests.service';
import {Class} from '../model/class';

@Component({
  selector: 'app-students-table',
  templateUrl: './lesson-schedule.component.html',
  styleUrls: ['./lesson-schedule.component.css']
})
export class LessonSchedule implements OnInit {

  classes: Class[] = [];
  selectedClass = '';

  constructor(private service: HttpRequestsService) { }

  ngOnInit(): void {
    this.service.findClasses().subscribe(value => this.classes = value);
  }
}
