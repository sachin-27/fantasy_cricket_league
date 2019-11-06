package com.example.demo.Controllers;

import com.example.demo.Services.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/match")
public class MatchController {

    @Autowired
    private MatchService matchService;

    @RequestMapping(method = RequestMethod.GET)
    public String getAllMatches(){
        String allMatches = matchService.getCurrentAndUpcomingMatches();
        return allMatches;
    }

    @RequestMapping(value = "/score", method = RequestMethod.GET, params = "matchId")
    public String getMatchScore(int matchId){
        String matchScore = matchService.getMatchScore(matchId);
        return matchScore;
    }

    @RequestMapping(value = "/players", method = RequestMethod.GET, params = "matchId")
    public String getMatchPlayers(int matchId){
        String matchPlayers = matchService.getMatchPlayers(matchId);
        return matchPlayers;
    }

}
