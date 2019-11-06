package com.example.demo.Controllers;

import com.example.demo.Beans.User;
import com.example.demo.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /////////////////////////////////////// User Methods ///////////////////////////////////////////

    @RequestMapping(method = RequestMethod.POST)
    public User addUser(String userName, String userPassword, String userEmail){
        User user = new User();
        user.setUserName(userName);
        user.setUserPassword(userPassword);
        user.setUserEmail(userEmail);
        user.setUserPoints(0);
        User insertedUser = userService.addUser(user);

        return insertedUser;
    }

    @RequestMapping(method = RequestMethod.GET, params = "userName")
    public User getUserByUserName(String userName){
        User user = userService.getUserByUserName(userName);
        return user;
    }

    @RequestMapping(method = RequestMethod.GET, params = "userId")
    public User getUserByUserId(int userId){
        User user = userService.getUserByUserId(userId);
        return user;
    }

    @RequestMapping(value = "/leaderboard", method = RequestMethod.GET)
    public List<User> getUsersByHighestPoints(){
        List<User> leaderBoard = userService.getUserByHighestPoints();
        return leaderBoard;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public User updateUser(@RequestBody User user){
        User updatedUser = userService.updateUser(user);
        return updatedUser;
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public boolean deleteuser(User user){
        boolean isDeleted = userService.deleteUser(user);

        if(isDeleted){
            return true;
        }
        else{
            return false;
        }
    }

}
