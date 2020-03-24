export class Student {

  id: string;
  name: string;
  sureName: string;

  constructor(_name: string, _surename: string, _id?: string) {
    this.name = _name;
    this.sureName = _surename;
    this.id = _id;
  }
}
