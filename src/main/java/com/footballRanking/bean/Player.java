package com.footballRanking.bean;

public class Player {
	private String name;
	private int totalMatch;
	private int wonMatch;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalMatch() {
		return totalMatch;
	}
	public void setTotalMatch(int totalMatch) {
		this.totalMatch = totalMatch;
	}
	public int getWonMatch() {
		return wonMatch;
	}
	public void setWonMatch(int wonMatch) {
		this.wonMatch = wonMatch;
	}


}
