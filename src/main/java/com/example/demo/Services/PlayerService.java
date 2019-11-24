package com.example.demo.Services;

import com.example.demo.Common.HttpRequestSender;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PlayerService {

    public String getPlayers(String playerName){
        String url = "http://cricapi.com/api/playerFinder";
        Map<String, String> parameters = new HashMap<>();
        parameters.put("apikey", "0Kva5FncbGXzLXiFZ4BbwVKLMHN2");
        parameters.put("name", playerName);
        String players = HttpRequestSender.getResponse(url, parameters);
        return players;
    }

    public String getPlayerDetails(int playerId){
        String url = "http://cricapi.com/api/playerStats";
        Map<String, String> parameters = new HashMap<>();
        parameters.put("apikey", "0Kva5FncbGXzLXiFZ4BbwVKLMHN2");
        parameters.put("pid", Integer.toString(playerId));
        String playerDetails = HttpRequestSender.getResponse(url, parameters);
        return playerDetails;
    }

}
