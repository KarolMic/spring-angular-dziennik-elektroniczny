
package pl.karolmic.security.entity;

import pl.karolmic.model.Student;
import pl.karolmic.model.Teacher;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
//@Table(name = "USER_TBL")
public class User {

    @Id
    @Column(name = "user_id")
    private Integer id;

    private String userName;

    private String password;

    @Email
    private String email;

    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @OneToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    public User() {
    }

    public User(int id, String userName, String password, String email) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public User(int id, String userName, String password, String email, Student student_id, Teacher teacher_id) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.student = student_id;
        this.teacher = teacher_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student_id) {
        this.student = student_id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher_id) {
        this.teacher = teacher_id;
    }
}
