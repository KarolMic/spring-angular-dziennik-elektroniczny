
package pl.karolmic.security.entity;

import pl.karolmic.model.Student;
import pl.karolmic.model.Teacher;

import javax.persistence.*;

@Entity
//@Table(name = "USER_TBL")
public class User {
    @Id
    private int id;
    private String userName;
    private String password;
    private String email;

    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student_id;

    @OneToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher_id;

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
        this.student_id = student_id;
        this.teacher_id = teacher_id;
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
}
