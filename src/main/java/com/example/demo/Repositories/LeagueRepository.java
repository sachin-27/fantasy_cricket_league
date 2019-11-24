package com.example.demo.Repositories;

import com.example.demo.Beans.League;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LeagueRepository extends JpaRepository<League, Integer> {

    public List<League> findAll();

    public List<League> findAllByLeagueId(int leagueId);

}
