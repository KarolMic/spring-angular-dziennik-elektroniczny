
export class HourLesson {

  hour_lesson_id: string;
  name: string;
  hour: string;

  constructor(_name: string, _hour: string, _id?: string) {
    this.name = _name;
    this.hour = _hour;
    this.hour_lesson_id = _id;
  }

}
