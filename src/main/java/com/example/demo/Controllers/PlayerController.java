package com.example.demo.Controllers;

import com.example.demo.Services.PlayerService;
import com.example.demo.Services.UserTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/players")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @Autowired
    UserTeamService userTeamService;

    @RequestMapping(method = RequestMethod.GET, params = "playerName")
    public String getPlayers(String playerName){
        String players = playerService.getPlayers(playerName);
        return players;
    }

    @RequestMapping(method = RequestMethod.GET, params = "pid")
    public String getPlayerDetails(int pid){
        String playerDetails = playerService.getPlayerDetails(pid);
        return playerDetails;
    }
}
