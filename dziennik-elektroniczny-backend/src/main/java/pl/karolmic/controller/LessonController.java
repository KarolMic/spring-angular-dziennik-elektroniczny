package pl.karolmic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.karolmic.model.Class;
import pl.karolmic.model.DayOfWeek;
import pl.karolmic.model.Lesson;
import pl.karolmic.repository.SimpleClassRepository;
import pl.karolmic.repository.SimpleDayOfWeekRepository;
import pl.karolmic.repository.SimpleLessonRepository;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class LessonController {

    @Autowired
    SimpleLessonRepository simpleLessonRepository;
    @Autowired
    SimpleClassRepository simpleClassRepository;
    @Autowired
    SimpleDayOfWeekRepository simpleDayOfWeekRepository;

    @RequestMapping("/lesson")
    public List<Lesson> showAll(@RequestParam Map<String,String> requestParams) {
        String className = requestParams.get("className");
        String dayOfWeek = requestParams.get("dayOfWeek");
        Class clazz = simpleClassRepository.findByName(className);
        DayOfWeek day = simpleDayOfWeekRepository.findByName(dayOfWeek);

        return simpleLessonRepository.findLessonByClazzAndDayOfWeekId(clazz, day);
    }

}
