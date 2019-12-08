package com.footballRanking.Service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.footballRanking.Service.MatchI;
import com.footballRanking.bean.Player;
import com.footballRanking.dao.MatchMapper;
import com.footballRanking.entity.Match;

@Service
public class MatchImpl implements MatchI{
	@Autowired
	MatchMapper matchMapper;
	
	public List<Match> getList() {
		return matchMapper.select();
	}

	public List<Player> getTwoPlayerRes(String player1Name, String player2Name) {
		List<Player> list = new ArrayList<Player>();
		Player player1 = new Player();
		Player player2 = new Player();
		int totalNum = matchMapper.selectTotalNumByPlayer(player1Name);
		int winNum = matchMapper.selectWinNumByPlayer(player1Name);
		player1.setName(player1Name);
		player1.setTotalMatch(totalNum);
		player1.setWonMatch(winNum);
		
		totalNum = matchMapper.selectTotalNumByPlayer(player2Name);
		winNum = matchMapper.selectWinNumByPlayer(player2Name);
		player2.setName(player2Name);
		player2.setTotalMatch(totalNum);
		player2.setWonMatch(winNum);
		list.add(player1);
		list.add(player2);
		return list;
	}
	
	public void addMatch(String winPlayer, String losePlayer) {
		Match match = new Match();
		match.setWinPlayer(winPlayer);
		match.setLosePlayer(losePlayer);
		match.setCreateDate(new Date());
		matchMapper.insert(match);
		
	}

}
