package com.example.demo.Beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "User")
@Table(name = "User")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_password")
    private String userPassword;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "user_points")
    private int userPoints;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public int getUserPoints() {
        return userPoints;
    }

    public void setUserPoints(int userPoints) {
        this.userPoints = userPoints;
    }

    public User(int userId, String userName, String userPassword, String userEmail, int userPoints){
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
        this.userPoints = userPoints;
    }

    public User(){

    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + userId +
                ", user_name='" + userName + '\'' +
                ", user_password='" + userPassword + '\'' +
                ", user_email='" + userEmail + '\'' +
                ", user_points=" + userPoints +
                '}';
    }
}
