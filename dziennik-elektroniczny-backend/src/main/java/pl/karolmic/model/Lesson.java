package pl.karolmic.model;

import javax.persistence.*;

@Entity
public class Lesson {

    @Id
    @Column(name = "lesson_id")
    private Integer lessonId;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "day_of_week_id")
    private DayOfWeek dayOfWeek;

    @ManyToOne
    @JoinColumn(name = "hour_lesson_id")
    private HourLesson hourLesson;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private Class clazz;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    public Integer getLessonId() {
        return lessonId;
    }

    public void setLessonId(Integer id) {
        this.lessonId = id;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject_id) {
        this.subject = subject_id;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public HourLesson getHourLesson() {
        return hourLesson;
    }

    public void setHourLesson(HourLesson hour_lesson_id) {
        this.hourLesson = hour_lesson_id;
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher_id) {
        this.teacher = teacher_id;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lesson_id='" + lessonId + '\'' +
                ", subject_id=" + subject +
                ", dayOfWeek='" + dayOfWeek + '\'' +
                ", hour_lesson_id=" + hourLesson +
                ", clazz=" + clazz +
                ", teacher_id=" + teacher +
                '}';
    }
}
