package pl.karolmic.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student {

    @Id
    private String student_id;

    private String name;

    private String surName;

    @ManyToOne
    @JoinColumn(name="clazz")
    private Class clazz;

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String sureName) {
        this.surName = sureName;
    }

    public String getClazz() {
        return clazz.getClazz();
    }

    public void setClazz(String clazz) {
        this.clazz.setClazz(clazz);
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id='" + student_id + '\'' +
                ", name='" + name + '\'' +
                ", sureName='" + surName + '\'' +
                ", clazz=" + clazz +
                '}';
    }
}
