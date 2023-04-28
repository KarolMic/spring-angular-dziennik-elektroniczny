package pl.karolmic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.karolmic.model.Student;
import pl.karolmic.repository.SimpleStudentRepository;

import java.util.List;

@RestController
@CrossOrigin
public class StudentController {

    @Autowired
    SimpleStudentRepository simpleStudentRepository;

    @GetMapping("/students")
    public List<Student> showAll() {

        return simpleStudentRepository.findAll();
    }
}
