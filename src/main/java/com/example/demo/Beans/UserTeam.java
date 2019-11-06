package com.example.demo.Beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "User_team")
@Table(name = "User_team")
public class UserTeam implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_team_id")
    private int userTeamId;

    @Column(name = "user_team_name")
    private String userTeamName;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;

    @Column(name = "user_team_points")
    private int userTeamPoints;

    public UserTeam(int user_teamId, String userTeamName, User user, int userTeamPoints){
        this.userTeamId = userTeamId;
        this.userTeamName = userTeamName;
        this.user = user;
        this.userTeamPoints = userTeamPoints;
    }

    public UserTeam(){

    }

    public int getUserTeamId() {
        return userTeamId;
    }

    public void setUserTeamId(int userTeamId) {
        this.userTeamId = userTeamId;
    }

    public String getUserTeamName() {
        return userTeamName;
    }

    public void setUserTeamName(String userTeamName) {
        this.userTeamName = userTeamName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getUserTeamPoints() {
        return userTeamPoints;
    }

    public void setUserTeamPoints(int userTeamPoints) {
        this.userTeamPoints = userTeamPoints;
    }

    @Override
    public String toString() {
        return "UserTeam{" +
                "userTeamId=" + userTeamId +
                ", userTeamName='" + userTeamName + '\'' +
                ", user=" + user +
                ", userTeamPoints=" + userTeamPoints +
                '}';
    }
}
