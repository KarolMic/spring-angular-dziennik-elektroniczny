import {Class} from './class';
import {Subject} from './subject';
import {Teacher} from './teacher';
import {HourLesson} from './hour-lesson';
import {DayOfWeek} from './day-of-week';

export class Lesson {

  id: number;
  subject: Subject;
  dayOfWeek: DayOfWeek;
  hourLesson: HourLesson;
  clazz: Class;
  teacher: Teacher;


  constructor(id: number, subject: Subject, dayOfWeek: DayOfWeek, hourLesson: HourLesson, clazz: Class, teacher: Teacher) {
    this.id = id;
    this.subject = subject;
    this.dayOfWeek = dayOfWeek;
    this.hourLesson = hourLesson;
    this.clazz = clazz;
    this.teacher = teacher;
  }
}
