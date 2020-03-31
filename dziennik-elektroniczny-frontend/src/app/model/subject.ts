export class Subject {

  subject_id: string;
  name: string;

  constructor(_name: string, _id?: string) {
    this.name = _name;
    this.subject_id = _id;
  }

}
