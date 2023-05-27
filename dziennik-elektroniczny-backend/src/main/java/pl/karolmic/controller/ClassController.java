package pl.karolmic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.karolmic.model.Class;
import pl.karolmic.repository.SimpleClassRepository;

import java.util.List;

//@EnableWebSecurity
@RestController
@CrossOrigin
public class ClassController {

    @Autowired
    SimpleClassRepository simpleClassRepository;

    @GetMapping("/classes")
    public List<Class> showAll() {

        return simpleClassRepository.findAll();
    }

}
