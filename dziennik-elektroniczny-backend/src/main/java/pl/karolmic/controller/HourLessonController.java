package pl.karolmic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.karolmic.model.HourLesson;
import pl.karolmic.repository.SimpleHourLessonRepostitory;
import java.util.List;

@RestController
@CrossOrigin
public class HourLessonController {

    @Autowired
    SimpleHourLessonRepostitory simpleHourLessonRepository;

    @GetMapping("/hourLessons")
    public List<HourLesson> showAll() {

        return simpleHourLessonRepository.findAll();
    }
}
