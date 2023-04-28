package pl.karolmic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class DayOfWeek {

    @Id
    @Column(name = "day_of_week_id")
    private Integer id;

    private String name;

    @OneToMany
    List<Lesson> lessons;

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

    @Override
    public String toString() {
        return "DayOfWeek{" +
                "DayOfWeekId='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
