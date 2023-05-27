import {LessonVO} from './lessonVO';

export class LessonResponse {

  lessonVOs: LessonVO[];

  constructor(lessonVOs: LessonVO[]) {
    this.lessonVOs = lessonVOs;
  }
}
