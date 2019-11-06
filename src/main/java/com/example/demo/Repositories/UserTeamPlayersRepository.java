package com.example.demo.Repositories;

import com.example.demo.Beans.UserTeam;
import com.example.demo.Beans.UserTeamPlayers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserTeamPlayersRepository extends JpaRepository<UserTeamPlayers, Integer> {

    public List<UserTeamPlayers> findAllByUserTeam(UserTeam userTeam);

}
