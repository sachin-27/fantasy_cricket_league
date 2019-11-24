package com.example.demo.Services;

import com.example.demo.Beans.UserTeamPlayers;
import com.example.demo.Common.HttpRequestSender;
import com.example.demo.Repositories.UserTeamPlayersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PlayerService {

    @Autowired
    private UserTeamPlayersRepository userTeamPlayersRepository;

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

    public UserTeamPlayers addPlayersToUserTeam(UserTeamPlayers userTeamPlayers){
        UserTeamPlayers insertedUserTeamPlayers = userTeamPlayersRepository.save(userTeamPlayers);
        return insertedUserTeamPlayers;
    }

    public UserTeamPlayers updatePlayersToUserTeam(UserTeamPlayers userTeamPlayers){
        if(userTeamPlayersRepository.existsById(userTeamPlayers.getUserTeamPlayerId())){
            UserTeamPlayers updatedUserTeamPlayers = userTeamPlayersRepository.save(userTeamPlayers);
            return updatedUserTeamPlayers;
        }
        else{
            return null;
        }
    }

    public boolean deletePlayersFromUserTeam(UserTeamPlayers userTeamPlayers){
        try{
            userTeamPlayersRepository.delete(userTeamPlayers);
            return true;
        } catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
