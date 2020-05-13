package com.spring.poesub.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class PREAscendancy_Gem {

	@Id
	private int num;
	private String gemname;
	private int gemcount;

	public String getGemname() {
		return gemname;
	}

	public void setGemname(String gemname) {
		this.gemname = gemname;
	}


	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getGemcount() {
		return gemcount;
	}

	public void setGemcount(int gemcount) {
		this.gemcount = gemcount;
	}


}
