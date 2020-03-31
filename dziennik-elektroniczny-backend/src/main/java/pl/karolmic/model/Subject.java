package pl.karolmic.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Subject {

    @Id
    private String subject_id;

    private String name;

    @OneToMany
    private List<Lesson> lessons;

    public String getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(String subject_id) {
        this.subject_id = subject_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subject_id='" + subject_id + '\'' +
                ", name='" + name + '\'' +
                ", lessons=" + lessons +
                '}';
    }
}
