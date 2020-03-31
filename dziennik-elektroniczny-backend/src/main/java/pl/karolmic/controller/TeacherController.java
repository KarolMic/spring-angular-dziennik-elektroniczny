package pl.karolmic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.karolmic.model.Student;
import pl.karolmic.model.Teacher;
import pl.karolmic.repository.SimpleStudentRepository;
import pl.karolmic.repository.SimpleTeacherRepository;

import java.util.List;

@RestController
@CrossOrigin
public class TeacherController {

    @Autowired
    SimpleTeacherRepository simpleTeacherRepository;

    @GetMapping("/teachers")
    public List<Teacher> showAll() {

        return simpleTeacherRepository.findAll();
    }

}
