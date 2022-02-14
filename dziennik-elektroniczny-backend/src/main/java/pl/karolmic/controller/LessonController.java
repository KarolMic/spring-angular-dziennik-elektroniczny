package pl.karolmic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.karolmic.model.Class;
import pl.karolmic.model.Lesson;
import pl.karolmic.repository.*;

import java.util.List;

@RestController
@CrossOrigin
public class LessonController {

    @Autowired
    SimpleLessonRepository simpleLessonRepository;

    @Autowired
    SimpleClassRepository simpleClassRepository;

    @RequestMapping("/lesson")
    public List<Lesson> showAll(@RequestParam String className) {
        Class clazz = simpleClassRepository.findByName(className);

        return simpleLessonRepository.findLessonByClazz(clazz);
    }
}
