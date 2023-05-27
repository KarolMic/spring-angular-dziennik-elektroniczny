package pl.karolmic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import pl.karolmic.security.entity.User;
import pl.karolmic.security.repository.UserRepository;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class App {

//    @Autowired
//    private UserRepository repository;
//
//    @PostConstruct
//    public void initUsers() {
//        List<User> users = Stream.of(
//                new User(101, "javatechie", "password", "javatechie@gmail.com"),
//                new User(102, "user1", "pwd1", "user1@gmail.com"),
//                new User(103, "user2", "pwd2", "user2@gmail.com"),
//                new User(104, "user3", "pwd3", "user3@gmail.com")
//        ).collect(Collectors.toList());
//        repository.saveAll(users);
//    }

//    @Bean
//    public WebMvcConfigurer corsConfigurer() {
//        return new WebMvcConfigurer() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping("/*").allowedHeaders("*").allowedOrigins("*").allowedMethods("*").allowCredentials(true);
////                registry.addMapping("/**").allowedMethods("*");
//            }
//        };
//    }

    public static void main(String[] args){

        SpringApplication.run(App.class, args);
    }
}
