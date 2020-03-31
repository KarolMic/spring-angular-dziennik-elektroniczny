import {Subject} from './subject';
import {HourLesson} from './hour-lesson';
import {Class} from './class';
import {Teacher} from './teacher';

export class DayOfWeek {

  dayOfWeekId: string;
  name: string;

  constructor(_name: string, _id?: string) {
    this.dayOfWeekId = _id;
    this.name = _name;
  }

}
