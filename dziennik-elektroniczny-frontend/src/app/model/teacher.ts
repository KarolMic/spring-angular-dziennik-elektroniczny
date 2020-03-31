import {Class} from './class';

export class Teacher {

  teacher_id: string;
  name: string;
  surName: string;

  constructor(_name: string, _surName: string, _id?: string) {
    this.name = _name;
    this.surName = _surName;
    this.teacher_id = _id;
  }

}
