import {Class} from './class';

export class Student {

  student_id: string;
  name: string;
  surName: string;
  class_id: Class;

  constructor(_name: string, _surName: string, _class_id: Class, _id?: string) {
    this.name = _name;
    this.surName = _surName;
    this.class_id = _class_id;
    this.student_id = _id;
  }
}
