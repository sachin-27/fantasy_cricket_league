package com.example.demo.Repositories;

import com.example.demo.Beans.League;
import com.example.demo.Beans.User;
import com.example.demo.Beans.UserTeam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserTeamRepository extends JpaRepository<UserTeam, Long> {

    public List<UserTeam> findAllByUserOrderByUserTeamPointsDesc(User user);

    public List<UserTeam> findAll();

    public List<UserTeam> findAllByLeagueOrderByUserTeamPointsDesc(League league);

    public UserTeam findByUserTeamId(Long userTeamId);

}
