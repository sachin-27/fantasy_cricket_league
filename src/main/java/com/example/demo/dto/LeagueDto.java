package com.example.demo.dto;

public class LeagueDto {
    String leagueName;
    Long matchId;

    @Override
    public String toString() {
        return "LeagueDto{" +
                "leagueName='" + leagueName + '\'' +
                ", matchId=" + matchId +
                '}';
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

    public LeagueDto() {
    }

    public LeagueDto(String leagueName, Long matchId) {
        this.leagueName = leagueName;
        this.matchId = matchId;
    }
}
