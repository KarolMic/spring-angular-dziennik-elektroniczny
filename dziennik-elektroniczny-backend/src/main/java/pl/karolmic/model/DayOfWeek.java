package pl.karolmic.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class DayOfWeek {

    @Id
    private String DayOfWeekId;

    private String name;

    @OneToMany
    List<Lesson> lessons;

    public String getDayOfWeekId() {
        return DayOfWeekId;
    }

    public void setDayOfWeekId(String dayOfWeekId) {
        DayOfWeekId = dayOfWeekId;
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
                "DayOfWeekId='" + DayOfWeekId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
