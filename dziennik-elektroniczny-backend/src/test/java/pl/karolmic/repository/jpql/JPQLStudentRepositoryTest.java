package pl.karolmic.repository.jpql;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.TransactionSystemException;
import pl.karolmic.model.Student;
import pl.karolmic.repository.SimpleClassRepository;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JPQLStudentRepositoryTest {

    /**
     * TODO: Code which can be used, while using H2 database only with unit tests.
    @Autowired
    private JdbcTemplate jdbc;

    public static final String DATA_SQL = "/sql/data.sql";

    @Before
    public void before() throws ScriptException, SQLException {
        ScriptUtils.executeSqlScript(jdbc.getDataSource().getConnection(), new ClassPathResource(DATA_SQL));
    }**/

    @Autowired
    private JPQLStudentRepository jpqlStudentRepository;

    @Autowired
    private SimpleClassRepository classRepository;

    @Test
    public void shouldGetParticularStudentByName() {
        Student student = jpqlStudentRepository.getStudentByName("Karol");

        assertEquals("1", student.getId());
        assertEquals("Karol", student.getName());
        assertEquals("Przykładowy", student.getSurName());
        assertEquals("1", student.getClazz());
    }

    @Test
    public void shouldInsertNewStudentByNamedQuery_CheckIfSaved() {
        Student student = new Student();
        student.setId(4);
        student.setName("Andrzej");
        student.setSurName("Stolik");
        student.setClazz(classRepository.findAll().get(0));

        jpqlStudentRepository.save(student);

        Student result = jpqlStudentRepository.getStudentByName("Andrzej");

        assertEquals("Andrzej", result.getName());
    }

    @Test
    public void shouldPersistNewStudent_nameLengthEqualToLimit() {
        Student student = new Student();
        student.setId(5);
        student.setName("1234567890");
        student.setSurName("Średni");
        student.setClazz(classRepository.findAll().get(0));

        jpqlStudentRepository.persist(student);

        Student result = jpqlStudentRepository.getStudentByName("1234567890");

        assertEquals("1234567890", result.getName());
    }

    @Test(expected = TransactionSystemException.class)
    public void shouldNotPersistNewStudent_nameTooLong_validationViolation() {
        Student student = new Student();
        student.setId(6);
        student.setName("12345678900");
        student.setSurName("Długi");
        student.setClazz(classRepository.findAll().get(0));

        jpqlStudentRepository.persist(student);
    }

}
