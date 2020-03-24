package pl.karolmic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.karolmic.model.Student;
import pl.karolmic.repository.SimpleStudentRepository;

import java.util.List;

@EnableWebSecurity
@RestController
@CrossOrigin
public class StudentController extends WebSecurityConfigurerAdapter {

    @Autowired
    SimpleStudentRepository simpleStudentRepository;

    @GetMapping("/students")
    public List<Student> showAll() {

        return simpleStudentRepository.findAll();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
    }

}
