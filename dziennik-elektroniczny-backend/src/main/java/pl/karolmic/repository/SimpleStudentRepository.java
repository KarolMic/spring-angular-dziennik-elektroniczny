package pl.karolmic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.transaction.annotation.Transactional;
import pl.karolmic.model.Student;

import java.util.List;

@Transactional
public interface SimpleStudentRepository extends CrudRepository<Student, Long>, QueryByExampleExecutor<Student> {

    List<Student> findAll();

}
