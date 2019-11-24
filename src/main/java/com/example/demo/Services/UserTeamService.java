package com.example.demo.Services;

import com.example.demo.Beans.League;
import com.example.demo.Beans.User;
import com.example.demo.Beans.UserTeam;
import com.example.demo.Repositories.UserTeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserTeamService {

    @Autowired
    private UserTeamRepository userTeamRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private LeagueService leagueService;

    public UserTeam addUserTeam(UserTeam userTeam){
        UserTeam insertedUserTeam = userTeamRepository.save(userTeam);
        return insertedUserTeam;
    }

    public UserTeam getUserTeamByUserTeamId(Long userTeamId){
        UserTeam userTeam = userTeamRepository.findByUserTeamId(userTeamId);
        return userTeam;
    }

    public List<UserTeam> getUserTeamsByUser(Long userId){
        User user = userService.getUserByUserId(userId);
        List<UserTeam> allTeamsOfCurrentUser = userTeamRepository.findAllByUserOrderByUserTeamPointsDesc(user);
        return allTeamsOfCurrentUser;
    }

    public List<UserTeam> getAllUserTeams(){
        List<UserTeam> allUserTeams = userTeamRepository.findAll();
        return allUserTeams;
    }

    public List<UserTeam> getUserTeamsByLeague(Long leagueId){
        League league = leagueService.getLeagueByLeagueId(leagueId);
        List<UserTeam> userTeamsInLeague = userTeamRepository.findAllByLeagueOrderByUserTeamPointsDesc(league);
        return userTeamsInLeague;
    }

    public UserTeam updateUserTeam(UserTeam userTeam){
        if(userTeamRepository.existsById(userTeam.getUserTeamId())){
            UserTeam updatedUserTeam = userTeamRepository.save(userTeam);
            return updatedUserTeam;
        }
        else{
            return null;
        }
    }

    public boolean deleteUserTeam(UserTeam userTeam){
        try{
            userTeamRepository.delete(userTeam);
            return true;
        }
        catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

}
