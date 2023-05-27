package pl.karolmic.model;

import pl.karolmic.security.entity.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;

@Entity
@NamedQuery(name = Student.GET_STUDENT_BY_NAME, query = "select s from Student s where s.name = ?1")
public class Student {

    public static final String GET_STUDENT_BY_NAME = "GetStudentByName";

    @Id
    @Column(name = "student_id")
    private Integer id;

    @Size(min = 1, max = 10)
    private String name;

    private String surName;

    @ManyToOne
    @JoinColumn(name="class_id")
    private Class clazz;

    @OneToOne
    private User user;

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

    public String getSurName() {
        return surName;
    }

    public void setSurName(String sureName) {
        this.surName = sureName;
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sureName='" + surName + '\'' +
                ", clazz=" + clazz +
                '}';
    }
}
