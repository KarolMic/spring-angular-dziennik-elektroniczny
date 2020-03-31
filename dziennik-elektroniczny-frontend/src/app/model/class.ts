import {Student} from './student';

export class Class {

  clazz: string;
  name: string;
  year: number;
  students: Student[];

  constructor(_name: string, _year: number, _students: Student[], _clazz?: string) {
    this.name = _name;
    this.year = _year;
    this.students = _students;
    this.clazz = _clazz;
  }

}
