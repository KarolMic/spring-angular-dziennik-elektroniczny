package pl.karolmic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.karolmic.controller.converter.LessonConverter;
import pl.karolmic.controller.response.LessonResponse;
import pl.karolmic.model.Class;
import pl.karolmic.model.DayOfWeek;
import pl.karolmic.model.HourLesson;
import pl.karolmic.model.Lesson;
import pl.karolmic.repository.*;

import java.util.List;

@RestController
@CrossOrigin
public class LessonController {

    @Autowired
    private SimpleLessonRepository simpleLessonRepository;

    @Autowired
    private SimpleClassRepository simpleClassRepository;

    @Autowired
    private SimpleDayOfWeekRepository simpleDayOfWeekRepository;

    @Autowired
    private SimpleHourLessonRepostitory simpleHourLessonRepostitory;

    @RequestMapping("/lesson")
    public LessonResponse showAll(@RequestParam String className) {
        Class clazz = simpleClassRepository.findByName(className);

        List<DayOfWeek> daysOfWeek = simpleDayOfWeekRepository.findAll();
        List<HourLesson> hourLessons = simpleHourLessonRepostitory.findAll();
        List<Lesson> lessons = simpleLessonRepository.findLessonByClazz(clazz);

        return LessonConverter.toResponse(daysOfWeek, hourLessons, lessons);
    }
}
