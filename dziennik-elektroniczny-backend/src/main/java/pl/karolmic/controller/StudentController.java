package pl.karolmic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.karolmic.model.Student;
import pl.karolmic.repository.SimpleStudentRepository;
import pl.karolmic.repository.JPQLStudentRepository;

import java.util.List;

@RestController
@CrossOrigin
public class StudentController {

    @Autowired
    SimpleStudentRepository simpleStudentRepository;

    @Autowired
    JPQLStudentRepository jpqlStudentRepository;

    @GetMapping("/students")
    public List<Student> showAll() {

        return simpleStudentRepository.findAll();
    }

    @GetMapping("/studentByName")
    public Student getLessonByTeacherId(@RequestParam String name) {
        return jpqlStudentRepository.getStudentByName(name);
    }

}
