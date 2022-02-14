package pl.karolmic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.transaction.annotation.Transactional;
import pl.karolmic.model.Subject;

import java.util.List;

@Transactional
public interface SimpleSubjectRepository extends CrudRepository<Subject, Long>, QueryByExampleExecutor<Subject> {

    List<Subject> findAll();

}
