package pl.karolmic.repository.jpql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.karolmic.model.Student;
import pl.karolmic.repository.dao.StudentDao;

@Service
@Transactional
public class JPQLStudentRepository {

    @Autowired
    private StudentDao studentDao;

    public Student getStudentByName(String name) {
        return studentDao.getStudentByName(name);
    }

    public void save(Student student) {
        studentDao.insert(student);
    }

    public void persist(Student student) {
        studentDao.persist(student);
    }

}
