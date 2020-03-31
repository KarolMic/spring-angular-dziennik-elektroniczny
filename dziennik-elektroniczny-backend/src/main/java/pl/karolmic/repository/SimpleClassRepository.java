package pl.karolmic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.transaction.annotation.Transactional;
import pl.karolmic.model.Class;

import java.util.List;

@Transactional
public interface SimpleClassRepository extends CrudRepository<Class, Long>, QueryByExampleExecutor<Class> {

    List<Class> findAll();

    Class findByName(String name);

}
