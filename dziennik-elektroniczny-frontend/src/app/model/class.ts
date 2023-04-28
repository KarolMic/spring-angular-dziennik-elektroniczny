import {Student} from './student';

export class Class {

  id: number;
  name: string;
  year: number;
  students: Student[];


  constructor(id: number, name: string, year: number, students: Student[]) {
    this.id = id;
    this.name = name;
    this.year = year;
    this.students = students;
  }
}
