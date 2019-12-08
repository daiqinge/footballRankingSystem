package com.footballRanking.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.footballRanking.Service.MatchI;
import com.footballRanking.bean.Player;
import com.footballRanking.entity.Match;


@RestController
@RequestMapping("/matchController")
public class matchController {
	@Autowired
	private MatchI matchService;
	
	@PostMapping("/getList")
	@ResponseBody
	public List<Match> getList(HttpServletRequest request) {
		return matchService.getList();
	}
	
	@PostMapping("/getTwoPlayerRes")
	@ResponseBody
		public List<Player> getTwoPlayerRes(String player1, String player2) {
		return matchService.getTwoPlayerRes(player1, player2);
	}
	
	@PostMapping("/addMatch")
	@ResponseBody
	public String addMatch(String winPlayer, String losePlayer) {
		matchService.addMatch(winPlayer, losePlayer);
		return "success!";
	}
}
