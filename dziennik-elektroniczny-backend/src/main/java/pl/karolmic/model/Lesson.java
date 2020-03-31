package pl.karolmic.model;

import javax.persistence.*;

@Entity
public class Lesson {

    @Id
    private String lesson_id;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject_id;

    @ManyToOne
    @JoinColumn(name = "dayOfWeekId")
    private DayOfWeek dayOfWeekId;

    @ManyToOne
    @JoinColumn(name = "hour_lesson_id")
    private HourLesson hour_lesson_id;

    @ManyToOne
    @JoinColumn(name = "clazz")
    private Class clazz;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher_id;

    public String getLesson_id() {
        return lesson_id;
    }

    public void setLesson_id(String lesson_id) {
        this.lesson_id = lesson_id;
    }

    public Subject getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(Subject subject_id) {
        this.subject_id = subject_id;
    }

    public DayOfWeek getDayOfWeekId() {
        return dayOfWeekId;
    }

    public void setDayOfWeekId(DayOfWeek dayOfWeek) {
        this.dayOfWeekId = dayOfWeek;
    }

    public HourLesson getHour_lesson_id() {
        return hour_lesson_id;
    }

    public void setHour_lesson_id(HourLesson hour_lesson_id) {
        this.hour_lesson_id = hour_lesson_id;
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    public Teacher getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(Teacher teacher_id) {
        this.teacher_id = teacher_id;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lesson_id='" + lesson_id + '\'' +
                ", subject_id=" + subject_id +
                ", dayOfWeek='" + dayOfWeekId + '\'' +
                ", hour_lesson_id=" + hour_lesson_id +
                ", clazz=" + clazz +
                ", teacher_id=" + teacher_id +
                '}';
    }
}
