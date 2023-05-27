package pl.karolmic.repository.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import pl.karolmic.model.Student;

import javax.persistence.EntityManager;

@Repository
public class StudentDao {

    public static final String INSERT_SQL = "INSERT INTO STUDENT (STUDENT_ID, NAME, SURNAME, CLASS_ID) VALUES (:id, :name, :surName, :clazz)";

    @Autowired
    private NamedParameterJdbcTemplate jdbc;

    @Autowired
    private EntityManager entityManager;

    public Student getStudentByName(String name) {
        return entityManager.createNamedQuery(Student.GET_STUDENT_BY_NAME, Student.class).setParameter(1, name).getResultList().get(0);
    }

    public int insert(Student student) {
        return jdbc.update(INSERT_SQL, new BeanPropertySqlParameterSource(student));
    }

    public void persist(Student student) {
        entityManager.persist(student);
    }

}
