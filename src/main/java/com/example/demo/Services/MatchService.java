package com.example.demo.Services;

import org.springframework.stereotype.Service;

@Service
public class MatchService {

    public String getCurrentAndUpcomingMatches(){
        String matches = "Hit api to get the json data";
        return matches;
    }

    // probably don't need this
    public String getOldMatches(){
        String matches = "Hit api to get the json data";
        return matches;
    }

    public String getMatchScore(int matchid){
        String matchScore = "Hit api to get the json data";
        return matchScore;
    }

    public String getMatchPlayers(int matchid){
        String matchPlayers = "Hit api to get json data";
        return matchPlayers;
    }

}
