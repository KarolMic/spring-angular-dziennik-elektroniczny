package pl.karolmic.controller.converter;

import pl.karolmic.controller.response.LessonResponse;
import pl.karolmic.controller.response.LessonVO;
import pl.karolmic.model.DayOfWeek;
import pl.karolmic.model.HourLesson;
import pl.karolmic.model.Lesson;

import java.util.ArrayList;
import java.util.List;

public class LessonConverter {

    public static LessonResponse toResponse(List<DayOfWeek> daysOfWeek, List<HourLesson> hourLessons, List<Lesson> lessons) {
        List<LessonVO> vos = new ArrayList<>();

        daysOfWeek.forEach(day -> {
            hourLessons.forEach(hour -> {
                LessonVO vo = new LessonVO();
                vo.setDayOfWeek(day.getName());
                vo.setSubject("-");
                vo.setHour(hour.getHour());
                lessons.forEach(lesson -> {
                    if (lesson.getDayOfWeek().getId().equals(day.getId()) && lesson.getHourLesson().getId().equals(hour.getId())) {
                        vo.setSubject(lesson.getSubject().getName());
                    }
                });
                vos.add(vo);
            });
        });

//        lessons.forEach(lesson -> {
//            LessonVO vo = new LessonVO();
//            vo.setDayOfWeek(lesson.getDayOfWeek().getName());
//            vo.setHour(lesson.getHourLesson().getHour());
//            vo.setSubject(lesson.getSubject().getName());
//            vos.add(vo);
//        });
        return new LessonResponse(vos);
    }

}
