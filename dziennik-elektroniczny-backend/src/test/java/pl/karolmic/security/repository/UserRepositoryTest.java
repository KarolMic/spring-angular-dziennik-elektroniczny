package pl.karolmic.security.repository;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.TransactionSystemException;
import pl.karolmic.repository.SimpleStudentRepository;
import pl.karolmic.repository.SimpleTeacherRepository;
import pl.karolmic.security.entity.User;
import pl.karolmic.security.repository.nativequery.NativeQueryUserRepository;

import javax.validation.ConstraintViolationException;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private SimpleStudentRepository studentRepository;

    @Autowired
    private SimpleTeacherRepository teacherRepository;

    @Autowired
    private NativeQueryUserRepository jpqlUserRepository;


    private User user;

    private User user2;

    private User user3;

    @Before
    public void beforeTests() {
        user = new User(7,"testExampleUser","password","user@email.com",
                studentRepository.findAll().get(0), teacherRepository.findAll().get(0));

        user2 = new User(8,"testExampleUser2","password2","user2@email.com",
                studentRepository.findAll().get(0), teacherRepository.findAll().get(0));

        user3 = new User(9,"testExampleUser3","password3","user@email.com",
                studentRepository.findAll().get(3), teacherRepository.findAll().get(3));
    }

    @Test
    public void test1_shouldSaveNewUser() {
        userRepository.save(user);

        User result = userRepository.findByUserName("testExampleUser");

        assertEquals("testExampleUser", result.getUserName());
        assertEquals("user@email.com", result.getEmail());
    }

    @Test(expected = TransactionSystemException.class)
    public void test2_shouldNotSaveNewUser_wrongEmail() {
        user.setEmail("wrongEmail");

        userRepository.save(user);
    }

    @Test
    public void test3_shouldPersistNewUser() {
        jpqlUserRepository.persist(user2);

        User result = userRepository.findByUserName("testExampleUser2");

        assertEquals("testExampleUser2", result.getUserName());
        assertEquals("user2@email.com", result.getEmail());
    }

    @Test(expected = ConstraintViolationException.class)
    public void test4_shouldNotPersistNewUser_duplicatesEmail() {
        jpqlUserRepository.persist(user3);
    }

}
