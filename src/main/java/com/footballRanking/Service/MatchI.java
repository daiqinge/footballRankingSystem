package com.footballRanking.Service;

import java.util.List;

import com.footballRanking.bean.Player;
import com.footballRanking.entity.Match;

public interface MatchI {
       public List<Match> getList();
       public List<Player> getTwoPlayerRes(String winPlayer, String losePlayer);
       public void addMatch(String winPlayer, String losePlayer);
}
