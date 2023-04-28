package pl.karolmic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.karolmic.model.Subject;
import pl.karolmic.repository.SimpleLessonRepository;
import pl.karolmic.repository.SimpleSubjectRepository;

import java.util.List;

@RestController
@CrossOrigin
public class SubjectController {

    @Autowired
    SimpleSubjectRepository simpleSubjectRepository;
    @Autowired
    SimpleLessonRepository simpleLessonRepository;

    @GetMapping("/subjects")
    public List<Subject> showAll() {

        return simpleSubjectRepository.findAll();
    }
}
