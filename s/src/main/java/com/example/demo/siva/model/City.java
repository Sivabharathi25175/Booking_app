package com.example.demo.siva.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
public class City  {
	
	@Id
	private long cid;
	
	private String name;
	@OneToMany
	private List<Theater> Theaters;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Theater> getTheaters() {
		return Theaters;
	}
	public void setTheaters(List<Theater> theaters) {
		Theaters = theaters;
	}
	

}
