package com.example.demo.Beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "User_team_players")
@Table(name = "User_team_players")
public class UserTeamPlayers implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_team_player_id")
    private int userTeamPlayerId;

    @Column(name = "player_id")
    private int playerId;

    @OneToOne
    @JoinColumn(name = "user_team_id", referencedColumnName = "user_team_id")
    private UserTeam userTeam;

    public UserTeamPlayers(int userTeamPlayerId, int playerId, UserTeam userTeam){
        this.userTeamPlayerId = userTeamPlayerId;
        this.playerId = playerId;
        this.userTeam = userTeam;
    }

    public UserTeamPlayers(){

    }

    public int getUserTeamPlayerId() {
        return userTeamPlayerId;
    }

    public void setUserTeamPlayerId(int userTeamPlayerId) {
        this.userTeamPlayerId = userTeamPlayerId;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public UserTeam getUserTeam() {
        return userTeam;
    }

    public void setUserTeam(UserTeam userTeam) {
        this.userTeam = userTeam;
    }

    @Override
    public String toString() {
        return "UserTeamPlayers{" +
                "userTeamPlayerId=" + userTeamPlayerId +
                ", playerId=" + playerId +
                ", userTeam=" + userTeam +
                '}';
    }
}
