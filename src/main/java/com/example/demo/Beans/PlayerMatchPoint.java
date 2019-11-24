package com.example.demo.Beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "Player_Match_Point")
@Table(name = "Player_Match_Point")
public class PlayerMatchPoint implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_match_point_id")
    private Long playerMatchPointId;

    @Column(name = "player_id")
    private Long playerId;

    @Column(name = "match_id")
    private Long matchId;

    @Column(name = "points_secured")
    private int pointsSecured;

    public PlayerMatchPoint(){

    }

    public PlayerMatchPoint(Long playerMatchPointId, Long playerId, Long matchId, int pointsSecured){
        this.playerMatchPointId = playerMatchPointId;
        this.playerId = playerId;
        this.matchId = matchId;
        this.pointsSecured = pointsSecured;
    }

    public Long getPlayerMatchPointId() {
        return playerMatchPointId;
    }

    public void setPlayerMatchPointId(Long playerMatchPointId) {
        this.playerMatchPointId = playerMatchPointId;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    public int getPointsSecured() {
        return pointsSecured;
    }

    public void setPointsSecured(int pointsSecured) {
        this.pointsSecured = pointsSecured;
    }

    @Override
    public String toString() {
        return "PlayerMatchPoint{" +
                "playerMatchPointId=" + playerMatchPointId +
                ", playerId=" + playerId +
                ", matchId=" + matchId +
                ", pointsSecured=" + pointsSecured +
                '}';
    }
}
