package pl.karolmic.controller.response;

import java.util.List;

public class LessonResponse {

    List<LessonVO> lessonVOs;

    public LessonResponse(List<LessonVO> lessonVOs) {
        this.lessonVOs = lessonVOs;
    }

    public List<LessonVO> getLessonVOs() {
        return lessonVOs;
    }

    public void setLessonVOs(List<LessonVO> lessonVOs) {
        this.lessonVOs = lessonVOs;
    }
}
