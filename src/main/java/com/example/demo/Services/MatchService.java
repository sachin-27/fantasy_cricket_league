package com.example.demo.Services;

import com.example.demo.Common.HttpRequestSender;
import org.springframework.stereotype.Service;

@Service
public class MatchService {

    private String addApiKeyAsParameter = "?apikey=0Kva5FncbGXzLXiFZ4BbwVKLMHN2";

    public String getCurrentAndUpcomingMatches(){
        String url = "http://cricapi.com/api/matches/";
        url = url + addApiKeyAsParameter;
        String matches = HttpRequestSender.getResponse(url);
        return matches;
    }

    // probably don't need this
    public String getOldMatches(){
        String url = "http://cricapi.com/api/cricket";
        url = url + addApiKeyAsParameter;
        String matches = HttpRequestSender.getResponse(url);
        return matches;
    }


    public String getMatchLiveScore(int matchid){
        String url = "http://cricapi.com/api/cricketScore";
        url = url + addApiKeyAsParameter;
        url = url + addMatchIdAsParameter(matchid);
        String matchScore = HttpRequestSender.getResponse(url);
        return matchScore;
    }

    public String getMatchSummary(int matchId){
        String url = "http://cricapi.com/api/fantasySummary";
        url = url + addApiKeyAsParameter;
        url = url + addMatchIdAsParameter(matchId);
        String matchSummary = HttpRequestSender.getResponse(url);
        return matchSummary;
    }

    public String getMatchPlayers(int matchid){
        String url = "http://cricapi.com/api/fantasySquad";
        url = url + addApiKeyAsParameter;
        url = url + addMatchIdAsParameter(matchid);
        String matchPlayers = HttpRequestSender.getResponse(url);
        return matchPlayers;
    }

    /////////////////////  Helper Methods //////////////////////////////////

    private String addMatchIdAsParameter(int matchId){
        String value = "&unique_id=" + Integer.toString(matchId);
        return value;
    }
}
