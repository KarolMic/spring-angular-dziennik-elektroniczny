import {Class} from './class';
import {Subject} from './subject';
import {Teacher} from './teacher';
import {HourLesson} from './hour-lesson';

export class Lesson {

  lesson_id: string;
  subject_id: Subject;
  dayOfWeek: string;
  hour_lesson_id: HourLesson;
  class_id: Class;
  teacher_id: Teacher;

  constructor(_subject_id: Subject, _dayOfWeek: string, _hour_lesson_id: HourLesson, _class_id: Class, _teacher_id: Teacher, _id?: string) {
    this.subject_id = _subject_id;
    this.dayOfWeek = _dayOfWeek;
    this.hour_lesson_id = _hour_lesson_id;
    this.class_id = _class_id;
    this.teacher_id = _teacher_id;
    this.lesson_id = _id;
  }

}
