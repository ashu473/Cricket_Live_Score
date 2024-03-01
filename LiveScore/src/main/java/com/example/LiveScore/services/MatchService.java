package com.example.LiveScore.services;

import com.example.LiveScore.entities.Match;

import java.util.List;
import java.util.Map;

public interface MatchService {
    // get all matches
    List<Match> getAllMatches();
    // get all matches
    List<Match> getLiveMatches();
    // get cwc2023 point table
    List<Map<String,String>> getPointTable();
}
