package com.example.demo.Beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "League")
@Table(name = "League")
public class League implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "league_id")
    private int leagueId;

    @Column(name = "league_name")
    private String leagueName;

    public League(){

    }

    public League(int league_id, String league_name){
        this.leagueId = league_id;
        this.leagueName = league_name;
    }

    public int getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(int leagueId) {
        this.leagueId = leagueId;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    @Override
    public String toString() {
        return "League{" +
                "leagueId=" + leagueId +
                ", leagueName='" + leagueName + '\'' +
                '}';
    }
}
