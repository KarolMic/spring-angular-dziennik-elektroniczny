package pl.karolmic.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//@NamedQuery(name = "Student.findById", query = "from Student s where s.id = ?1")
public class Student {

    @Id
    private String id;

    private String name;

    private String sureName;

    public Student(String id, String name, String sureName) {
        this.id = id;
        this.name = name;
        this.sureName = sureName;
    }

    public Student() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }
}
