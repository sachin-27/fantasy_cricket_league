package com.example.demo.Services;

import com.example.demo.Common.HttpRequestSender;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Service
public class MatchService {

    public String getCurrentAndUpcomingMatches() {
        String url = "http://cricapi.com/api/matches";
        Map<String, String> parameters = new HashMap<>();
        parameters.put("apikey", "0Kva5FncbGXzLXiFZ4BbwVKLMHN2");
        String matches = HttpRequestSender.getResponse(url, parameters);
        return matches;
    }

    // probably don't need this
    public String getOldMatches(){
        String url = "http://cricapi.com/api/cricket";
        Map<String, String> parameters = new HashMap<>();
        parameters.put("apikey", "0Kva5FncbGXzLXiFZ4BbwVKLMHN2");
        String matches = HttpRequestSender.getResponse(url, parameters);
        return matches;
    }


    public String getMatchLiveScore(int matchId){
        String url = "http://cricapi.com/api/cricketScore";
        Map<String, String> parameters = new HashMap<>();
        parameters.put("apikey", "0Kva5FncbGXzLXiFZ4BbwVKLMHN2");
        parameters.put("unique_id", Integer.toString(matchId));
        String matchScore = HttpRequestSender.getResponse(url, parameters);
        return matchScore;
    }

    public String getMatchSummary(int matchId){
        String url = "http://cricapi.com/api/fantasySummary";
        Map<String, String> parameters = new HashMap<>();
        parameters.put("apikey", "0Kva5FncbGXzLXiFZ4BbwVKLMHN2");
        parameters.put("unique_id", Integer.toString(matchId));
        String matchSummary = HttpRequestSender.getResponse(url, parameters);
        return matchSummary;
    }

    public String getMatchPlayers(int matchId){
        String url = "http://cricapi.com/api/fantasySquad";
        Map<String, String> parameters = new HashMap<>();
        parameters.put("apikey", "0Kva5FncbGXzLXiFZ4BbwVKLMHN2");
        parameters.put("unique_id", Integer.toString(matchId));
        String matchPlayers = HttpRequestSender.getResponse(url, parameters);
        return matchPlayers;
    }

    /////////////////////  Helper Methods //////////////////////////////////

}
