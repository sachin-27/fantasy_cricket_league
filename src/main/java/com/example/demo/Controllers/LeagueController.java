package com.example.demo.Controllers;

import com.example.demo.Beans.League;
import com.example.demo.Services.LeagueService;
import com.example.demo.dto.LeagueDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/league")
public class LeagueController {

    @Autowired
    private LeagueService leagueService;

    @RequestMapping(method = RequestMethod.POST)
    public League addLeague(@RequestBody LeagueDto leagueDto){
        League league = new League();
        league.setLeagueName(leagueDto.getLeagueName());
        League insertedLeague = leagueService.addLeague(league);
        return insertedLeague;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public League updateLeague(@RequestBody League league){
        League updatedLeague = leagueService.updateLeague(league);
        return updatedLeague;
    }

    @RequestMapping(method = RequestMethod.GET, params = "leagueId")
    public League getLeagueByLeagueId(Long leagueId){
        League league = leagueService.getLeagueByLeagueId(leagueId);
        return league;
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public boolean deleteLeague(@RequestBody League league){
        boolean isDeleted = leagueService.deleteLeague(league);
        return isDeleted;
    }

}
