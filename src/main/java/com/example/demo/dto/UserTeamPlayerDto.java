package com.example.demo.dto;

public class UserTeamPlayerDto {

    private Long playerId;
    private Long userTeamId;

    public UserTeamPlayerDto(){

    }

    public UserTeamPlayerDto(Long playerId, Long userTeamId){
        this.playerId = playerId;
        this.userTeamId = userTeamId;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public Long getUserTeamId() {
        return userTeamId;
    }

    public void setUserTeamId(Long userTeamId) {
        this.userTeamId = userTeamId;
    }


    @Override
    public String toString() {
        return "UserTeamPlayerDto{" +
                "playerId=" + playerId +
                ", userTeamId=" + userTeamId +
                '}';
    }
}
