package pl.karolmic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import pl.karolmic.controller.handlers.GlobalControllerExceptionHandler;
import pl.karolmic.model.Student;
import pl.karolmic.repository.SimpleStudentRepository;
import pl.karolmic.repository.jpql.JPQLStudentRepository;

import java.security.InvalidParameterException;
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
        /** If passed name parameter is empty, handler from GlobalControllerExceptionHandler will be called. **/
        if (StringUtils.isEmpty(name)) {
            throw new InvalidParameterException();
        }
        return jpqlStudentRepository.getStudentByName(name);
    }

}
