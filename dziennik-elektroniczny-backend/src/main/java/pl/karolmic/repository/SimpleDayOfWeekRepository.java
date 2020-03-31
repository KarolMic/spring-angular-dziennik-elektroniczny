package pl.karolmic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import pl.karolmic.model.DayOfWeek;

import java.util.List;

public interface SimpleDayOfWeekRepository extends CrudRepository<DayOfWeek, Long>, QueryByExampleExecutor<DayOfWeek> {

    List<DayOfWeek> findAll();

    DayOfWeek findByName(String name);

}
