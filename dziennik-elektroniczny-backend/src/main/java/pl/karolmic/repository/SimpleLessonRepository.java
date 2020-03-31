package pl.karolmic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import pl.karolmic.model.Class;
import pl.karolmic.model.DayOfWeek;
import pl.karolmic.model.Lesson;

import java.util.List;

public interface SimpleLessonRepository extends CrudRepository<Lesson, Long>, QueryByExampleExecutor<Lesson> {

    List<Lesson> findAll();

    List<Lesson> findLessonByClazzAndDayOfWeekId(Class clazz, DayOfWeek dayOfWeek);

}
