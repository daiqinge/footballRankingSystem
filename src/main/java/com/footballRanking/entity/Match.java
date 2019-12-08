package com.footballRanking.entity;

import java.util.Date;

public class Match {
	int id;
	String winPlayer;
	String losePlayer;
	Date createDate;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWinPlayer() {
		return winPlayer;
	}
	public void setWinPlayer(String winPlayer) {
		this.winPlayer = winPlayer;
	}
	public String getLosePlayer() {
		return losePlayer;
	}
	public void setLosePlayer(String losePlayer) {
		this.losePlayer = losePlayer;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
