package com.example.demo.dto;

public class UserTeamDto {

    private String userTeamName;
    private Long userId;
    private Long leagueId;

    public UserTeamDto(){

    }

    public UserTeamDto(String teamName, Long userId, Long leagueId){
        this.userTeamName = teamName;
        this.userId = userId;
        this.leagueId = leagueId;
    }

    public String getUserTeamName() {
        return userTeamName;
    }

    public void setUserTeamName(String userTeamName) {
        this.userTeamName = userTeamName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(Long leagueId) {
        this.leagueId = leagueId;
    }

    @Override
    public String toString() {
        return "UserTeamDto{" +
                "userTeamName='" + userTeamName + '\'' +
                ", userId=" + userId +
                ", leagueId=" + leagueId +
                '}';
    }
}
