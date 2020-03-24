import {Component, Input, OnInit} from '@angular/core';
import {HttpRequestsService} from '../services/http-requests.service';
import {Student} from '../model/student';

@Component({
  selector: 'app-students-table',
  templateUrl: './students-table.component.html',
  styleUrls: ['./students-table.component.css']
})
export class StudentsTableComponent implements OnInit {

  students: Student[];

  constructor(private service: HttpRequestsService) { }

  ngOnInit(): void {
    this.updateTable();
  }

  public updateTable(): void {
    this.service.findStudents().subscribe(value => this.students = value);
  }

}
