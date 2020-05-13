package com.spring.poesub.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Ascendancy {

	@Id
	private String ascendancy;

	public String getascendancy() {
		return ascendancy;
	}

	public void setascendancy(String ascendancy) {
		this.ascendancy = ascendancy;
	}
	
}