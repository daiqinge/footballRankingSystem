package com.footballRanking.dao;

import com.footballRanking.entity.Match;
import java.util.List;

public interface MatchMapper {

    int insert(Match record);

    List<Match> select();
    
    Integer selectTotalNumByPlayer(String name);
    
    Integer selectWinNumByPlayer(String name);

}