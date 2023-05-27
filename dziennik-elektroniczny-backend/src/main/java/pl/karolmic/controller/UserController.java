package pl.karolmic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.karolmic.service.UserService;
import pl.karolmic.service.item.UserDetailsItem;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/details/{userName}")
    public UserDetailsItem getUserDetails(@PathVariable("userName") String userName) {

        return userService.getUserDetails(userName);
    }
}

