//
//package pl.karolmic.model;
//
//import javax.persistence.*;
//import javax.validation.constraints.Email;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.Size;
//
//@Entity
//public class User {
//
//  @Id
//  private String user_id;
//
//  @Column(unique = true)
//  @NotBlank
//  @Size(max = 20)
//  private String userName;
//
//  @NotBlank
//  @Size(max = 50)
//  @Email
//  private String email;
//
//  @NotBlank
//  @Size(max = 120)
//  private String password;
//
//  @OneToOne
//  @JoinColumn(name = "student_id")
//  private Student student_id;
//
//  @OneToOne
//  @JoinColumn(name = "teacher_id")
//  private Teacher teacher_id;
//
//  public User(String user_id, @NotBlank @Size(max = 20) String username, @NotBlank @Size(max = 50) @Email String email, @NotBlank @Size(max = 120) String password) {
//    this.user_id = user_id;
//    this.userName = username;
//    this.email = email;
//    this.password = password;
//  }
//
//  public User() {
//    this(null);
//  }
//
//  public User(String user_id) {
//    this.user_id = user_id;
//  }
//
//  public String getUser_id() {
//    return user_id;
//  }
//
//  public void setUser_id(String user_id) {
//    this.user_id = user_id;
//  }
//
//  public String getUserName() {
//    return userName;
//  }
//
//  public String getPassword() {
//    return password;
//  }
//
//
//  public void setUserName(String username) {
//    this.userName = username;
//  }
//
//  public void setPassword(String password) {
//    this.password = password;
//  }
//
//  public String getEmail() {
//    return email;
//  }
//
//  public void setEmail(String email) {
//    this.email = email;
//  }
//
//  public Student getStudent_id() {
//    return student_id;
//  }
//
//  public void setStudent_id(Student student_id) {
//    this.student_id = student_id;
//  }
//
//  public Teacher getTeacher_id() {
//    return teacher_id;
//  }
//
//  public void setTeacher_id(Teacher teacher_id) {
//    this.teacher_id = teacher_id;
//  }
//
//  @Override
//  public String toString() {
//    return "User{" +
//            "user_id='" + user_id + '\'' +
//            ", username='" + userName + '\'' +
//            ", password='" + password + '\'' +
//            '}';
//  }
//}
