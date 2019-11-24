package com.example.demo.Controllers;

import com.example.demo.Beans.UserTeam;
import com.example.demo.Beans.UserTeamPlayers;
import com.example.demo.Services.LeagueService;
import com.example.demo.Services.PlayerService;
import com.example.demo.Services.UserService;
import com.example.demo.Services.UserTeamService;
import com.example.demo.dto.UserTeamDto;
import com.example.demo.dto.UserTeamPlayerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/team")
public class UserTeamController {

    @Autowired
    private UserTeamService userTeamService;

    @Autowired
    private UserService userService;

    @Autowired
    private LeagueService leagueService;

    @Autowired
    private PlayerService playerService;

    @RequestMapping(method = RequestMethod.GET)
    public List<UserTeam> getAllUserTeams(){
        List<UserTeam> allUserTeams = userTeamService.getAllUserTeams();
        return allUserTeams;
    }

    @RequestMapping(method = RequestMethod.POST)
    public UserTeam addUserTeam(@RequestBody UserTeamDto userTeamDto){
        UserTeam userTeam = new UserTeam();
        userTeam.setUserTeamName(userTeamDto.getUserTeamName());
        userTeam.setUser(userService.getUserByUserId(userTeamDto.getUserId()));
        userTeam.setUserTeamPoints(0);
        userTeam.setLeague(leagueService.getLeagueByLeagueId(userTeamDto.getLeagueId()));
        UserTeam insertedUserTeam = userTeamService.addUserTeam(userTeam);

        return insertedUserTeam;
    }

    @RequestMapping(method = RequestMethod.GET, params = "userId")
    public List<UserTeam> getTeamsByUserId(Long userId){
        List<UserTeam> userTeams = userTeamService.getUserTeamsByUser(userId);
        return userTeams;
    }

    @RequestMapping(method = RequestMethod.GET, params = "leagueId")
    public List<UserTeam> getTeamsByLeagueId(Long leagueId){
        List<UserTeam> userTeams = userTeamService.getUserTeamsByLeague(leagueId);
        return userTeams;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public UserTeam updateUserTeam(@RequestBody UserTeam userTeam){
        UserTeam updatedUserTeam = userTeamService.updateUserTeam(userTeam);
        return updatedUserTeam;
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public boolean deleteUserTeam(@RequestBody UserTeam userTeam){
        boolean isDeleted = userTeamService.deleteUserTeam(userTeam);
        return isDeleted;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/player")
    public UserTeamPlayers addPlayerToUserTeam(@RequestBody UserTeamPlayerDto userTeamPlayerDto){
        UserTeamPlayers userTeamPlayers = new UserTeamPlayers();
        userTeamPlayers.setPlayerId(userTeamPlayerDto.getPlayerId());
        userTeamPlayers.setUserTeam(userTeamService.getUserTeamByUserTeamId(userTeamPlayerDto.getUserTeamId()));
        UserTeamPlayers insertedUserTeamPlayers = playerService.addPlayersToUserTeam(userTeamPlayers);
        return insertedUserTeamPlayers;
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/player")
    public UserTeamPlayers updatePlayerToUserTeam(@RequestBody UserTeamPlayers userTeamPlayers){
        UserTeamPlayers updatedUserTeamPlayers = playerService.updatePlayersToUserTeam(userTeamPlayers);
        return updatedUserTeamPlayers;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/player")
    public boolean deleteUserTeamPlayer(@RequestBody UserTeamPlayers userTeamPlayers){
        boolean isDeleted = playerService.deletePlayersFromUserTeam(userTeamPlayers);
        return isDeleted;
    }

}
