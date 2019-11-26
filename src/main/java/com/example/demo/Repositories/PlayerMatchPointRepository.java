package com.example.demo.Repositories;

import com.example.demo.Beans.PlayerMatchPoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerMatchPointRepository extends JpaRepository<PlayerMatchPoint, Long> {

    public List<PlayerMatchPoint> findAllByPlayerIdAndMatchId(Long playerId, Long matchId);

    

}
