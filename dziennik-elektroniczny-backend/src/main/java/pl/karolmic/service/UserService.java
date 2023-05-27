package pl.karolmic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.karolmic.security.entity.User;
import pl.karolmic.security.repository.UserRepository;
import pl.karolmic.service.item.UserDetailsItem;
import pl.karolmic.service.item.UserType;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserDetailsItem getUserDetails(String userName) {
        User user = userRepository.findByUserName(userName);

        UserDetailsItem item = new UserDetailsItem();
        item.setUserName(user.getUserName());
        item.setEmail(user.getEmail());
        if (user.getStudent() != null) {
            item.setType(UserType.STUDENT);
            item.setName(user.getStudent().getName());
            item.setSurName(user.getStudent().getSurName());
            if (user.getStudent().getClazz() != null) {
                item.setClazz(user.getStudent().getClazz().getName());
            }
        } else if (user.getTeacher() != null) {
            item.setType(UserType.TEACHER);
            item.setName(user.getTeacher().getName());
            item.setSurName(user.getTeacher().getSurName());
        }

        return item;
    }
}
