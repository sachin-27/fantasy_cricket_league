package com.example.demo.Controllers;

import com.example.demo.Beans.User;
import com.example.demo.Beans.UserTeam;
import com.example.demo.Services.UserService;
import com.example.demo.Services.UserTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/userteam")
public class UserTeamController {

    @Autowired
    private UserTeamService userTeamService;

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public List<UserTeam> getAllUserTeams(){
        List<UserTeam> allUserTeams = userTeamService.getAllUserTeams();
        return allUserTeams;
    }

    @RequestMapping(method = RequestMethod.POST)
    public UserTeam addUserTeam(String userTeamName, int userId){
        UserTeam userTeam = new UserTeam();
        userTeam.setUserTeamName(userTeamName);
        userTeam.setUser(userService.getUserByUserId(userId));
        userTeam.setUserTeamPoints(0);
        UserTeam insertedUserTeam = userTeamService.addUserTeam(userTeam);

        return insertedUserTeam;
    }



}
