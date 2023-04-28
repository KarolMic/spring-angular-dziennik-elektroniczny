import {Class} from './class';

export class Student {

  id: number;
  name: string;
  surName: string;
  clazz: Class;

  constructor(id: number, name: string, surName: string, clazz: Class) {
    this.id = id;
    this.name = name;
    this.surName = surName;
    this.clazz = clazz;
  }
}
