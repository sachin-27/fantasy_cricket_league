package com.example.demo.Beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "League")
@Table(name = "League")
public class League implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "league_id")
    private long leagueId;

    @Column(name = "league_name")
    private String leagueName;

    @Column(name = "match_id")
    private Long matchId;

    public League(){

    }

    @Override
    public String toString() {
        return "League{" +
                "leagueId=" + leagueId +
                ", leagueName='" + leagueName + '\'' +
                ", matchId=" + matchId +
                '}';
    }

    public long getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(long leagueId) {
        this.leagueId = leagueId;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }
}
