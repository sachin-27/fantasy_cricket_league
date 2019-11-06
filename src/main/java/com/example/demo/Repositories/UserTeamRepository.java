package com.example.demo.Repositories;

import com.example.demo.Beans.User;
import com.example.demo.Beans.UserTeam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserTeamRepository extends JpaRepository<UserTeam, Integer> {

    public List<UserTeam> findAllByUserOrderByUser_team_pointsDesc(User user);

    public List<UserTeam> findAll();

}
