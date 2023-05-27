package pl.karolmic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
public class Class {

    @Id
    @Column(name = "class_id")
    @NotBlank
    private Integer id;

    @Column(length = 2)
    private String name;

    @Min(value = 2000, message = "Year must exceed 2000.")
    private int year;

    @OneToMany
    private List<Student> students;

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Class{" +
                "clazz='" + id + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
