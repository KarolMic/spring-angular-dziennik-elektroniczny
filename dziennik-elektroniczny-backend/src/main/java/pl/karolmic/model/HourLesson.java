package pl.karolmic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class HourLesson {

    @Id
    @Column(name = "hour_lesson_id")
    private Integer id;

    private String name;

    private String hour;

    @OneToMany
    private List<Lesson> lessons;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
                "hour_lesson_id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", hour='" + hour + '\'' +
                ", lessons=" + lessons +
                '}';
    }
}
