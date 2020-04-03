
package pl.karolmic.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

  @Id
  private String user_id;

  @Column(unique = true)
  private String username;

  private String password;

  @OneToOne
  @JoinColumn(name = "student_id")
  private Student student_id;

  @OneToOne
  @JoinColumn(name = "teacher_id")
  private Teacher teacher_id;

  public User() {
    this(null);
  }

  public User(String user_id) {
    this.user_id = user_id;
  }

  public String getUser_id() {
    return user_id;
  }

  public void setUser_id(String user_id) {
    this.user_id = user_id;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }


  public void setUsername(String username) {
    this.username = username;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public String toString() {
    return "User{" +
            "user_id='" + user_id + '\'' +
            ", username='" + username + '\'' +
            ", password='" + password + '\'' +
            '}';
  }
}
