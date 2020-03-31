package pl.karolmic.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class HourLesson {

    @Id
    private String hour_lesson_id;

    private String name;

    private String hour;

    @OneToMany
    private List<Lesson> lessons;

    public String getHour_lesson_id() {
        return hour_lesson_id;
    }

    public void setHour_lesson_id(String hour_lesson_id) {
        this.hour_lesson_id = hour_lesson_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "HourLesson{" +
                "hour_lesson_id='" + hour_lesson_id + '\'' +
                ", name='" + name + '\'' +
                ", hour='" + hour + '\'' +
                ", lessons=" + lessons +
                '}';
    }
}
