package pl.karolmic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.karolmic.model.DayOfWeek;
import pl.karolmic.model.Student;
import pl.karolmic.repository.SimpleDayOfWeekRepository;

import java.util.List;

@RestController
@CrossOrigin
public class DayOfWeekController {

    @Autowired
    SimpleDayOfWeekRepository simpleDayOfWeekRepository;

    @GetMapping("/daysOfWeek")
    public List<DayOfWeek> showAll() {

        return simpleDayOfWeekRepository.findAll();
    }
}
