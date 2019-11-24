package com.example.demo.dto;

public class LeagueDto {
    String leagueName;

    @Override
    public String toString() {
        return "LeagueDto{" +
                "leagueName='" + leagueName + '\'' +
                '}';
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public LeagueDto() {
    }

    public LeagueDto(String leagueName) {
        this.leagueName = leagueName;
    }
}
