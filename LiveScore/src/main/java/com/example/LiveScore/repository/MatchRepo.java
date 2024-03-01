package com.example.LiveScore.repository;

import com.example.LiveScore.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match,Integer> {
    // want to fetch match by teamHeading
    Optional<Match> findByTeamHeading(String teamHeading);

}
