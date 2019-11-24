package com.example.demo.Beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "User_team_players")
@Table(name = "User_team_players")
public class UserTeamPlayers implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_team_player_id")
    private Long userTeamPlayerId;

    @Column(name = "player_id")
    private int playerId;

    @OneToOne
    @JoinColumn(name = "user_team_id", referencedColumnName = "user_team_id")
    private UserTeam userTeam;

    @Column(name = "player_name")
    private String playerName;

    public UserTeamPlayers(Long userTeamPlayerId, int playerId, UserTeam userTeam, String playerName){
        this.userTeamPlayerId = userTeamPlayerId;
        this.playerId = playerId;
        this.userTeam = userTeam;
        this.playerName = playerName;
    }

    public UserTeamPlayers(){

    }

    public Long getUserTeamPlayerId() {
        return userTeamPlayerId;
    }

    public void setUserTeamPlayerId(Long userTeamPlayerId) {
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
                ", playerName='" + playerName + '\'' +
                '}';
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
