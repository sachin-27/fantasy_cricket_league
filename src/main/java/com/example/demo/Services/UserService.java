package com.example.demo.Services;

import com.example.demo.Beans.User;
import com.example.demo.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private LoginService loginService;

    public User addUser(User user){
        String hashedPassword = loginService.hashPassword(user.getUserPassword());
        user.setUserPassword(hashedPassword);
        User insertedUser = userRepository.save(user);
        return insertedUser;
    }

    public User getUserByUserName(String userName){
        User user = userRepository.findByUserName(userName);
        return user;
    }

    public User getUserByUserId(int userId){
        User user = userRepository.findByUserId(userId);
        return user;
    }

    public List<User> getUserByHighestPoints(){
        List<User> leaderBoard = userRepository.findAllByUserIdNotNullOrderByUserPointsDesc();
        return leaderBoard;
    }

    public User updateUser(User user){
        if(userRepository.existsById(user.getUserId())){
            User updatedUser = userRepository.save(user);
            return updatedUser;
        }
        else{
            return null;
        }
    }

    public boolean deleteUser(User user){
        try{
            userRepository.delete(user);
            return true;
        }
        catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean authenticateUserByUserNameAndPassword(String userName, String password){
        boolean loginSuccessful = false;
        User user = getUserByUserName(userName);

        if(user != null){
            loginSuccessful = loginService.checkPassword(password, user.getUserPassword());
        }
        if(loginSuccessful){
            return true;
        }
        else{
            return false;
        }
    }

}
