package pl.karolmic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@NamedQuery(name = Student.GET_STUDENT_BY_NAME, query = "select s from Student s where s.name = ?1")
public class Student {

    public static final String GET_STUDENT_BY_NAME = "GetStudentByName";


    @Id
    @Column(name = "student_id")
    private Integer id;

    private String name;

    private String surName;

    @ManyToOne
    @JoinColumn(name="clazz")
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

    public Integer getClazz() {
        return clazz.getId();
    }

    public void setClazz(Integer id) {
        this.clazz.setId(id);
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
