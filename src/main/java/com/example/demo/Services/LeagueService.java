package com.example.demo.Services;

import com.example.demo.Beans.League;
import com.example.demo.Repositories.LeagueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeagueService {

    @Autowired
    private LeagueRepository leagueRepository;

    public League addLeague(League league){
        League insertedLeague = leagueRepository.save(league);
        return insertedLeague;
    }

    public League getLeagueByLeagueId(Long leagueId){
        League league = leagueRepository.findByLeagueId(leagueId);
        return league;
    }

    public League updateLeague(League league){
        if(leagueRepository.existsById((league.getLeagueId()))){
            League updatedLeague = leagueRepository.save(league);
            return updatedLeague;
        }
        else{
            return null;
        }
    }

    public boolean deleteLeague(League league){
        try{
            leagueRepository.delete(league);
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

}
