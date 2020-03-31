package pl.karolmic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import pl.karolmic.model.Student;
import pl.karolmic.model.Teacher;

import java.util.List;

public interface SimpleTeacherRepository extends CrudRepository<Teacher, Long>, QueryByExampleExecutor<Teacher> {

    List<Teacher> findAll();
}
