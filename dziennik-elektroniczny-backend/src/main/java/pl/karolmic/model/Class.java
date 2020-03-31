package pl.karolmic.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Class {

    @Id
    private String clazz;

    private String name;

    private int year;

    @OneToMany
    private List<Student> students;

    @OneToMany
    private List<Lesson> lessons;

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Class{" +
                "clazz='" + clazz + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
