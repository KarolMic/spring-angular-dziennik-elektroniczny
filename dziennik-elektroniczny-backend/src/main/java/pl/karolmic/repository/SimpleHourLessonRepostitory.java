package pl.karolmic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import pl.karolmic.model.DayOfWeek;
import pl.karolmic.model.HourLesson;

import java.util.List;

public interface SimpleHourLessonRepostitory extends CrudRepository<HourLesson, Long>, QueryByExampleExecutor<HourLesson> {

    List<HourLesson> findAll();

}
