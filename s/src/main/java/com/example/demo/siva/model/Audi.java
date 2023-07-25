package com.example.demo.siva.model;

import java.util.List;

import com.example.demo.siva.Enum.Feature;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity

public class Audi {
	@Id
	private long id;
	
	
	private String name;
	@OneToMany
	private List<seat> seats;
	@OneToMany
	private List<Show> shows;
	
	@ElementCollection
	@Enumerated(EnumType.ORDINAL)
	private List<Feature> featurssupported;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<seat> getSeats() {
		return seats;
	}
	public void setSeats(List<seat> seats) {
		this.seats = seats;
	}
	public List<Show> getShows() {
		return shows;
	}
	public void setShows(List<Show> shows) {
		this.shows = shows;
	}
	public List<Feature> getFeaturssupported() {
		return featurssupported;
	}
	public void setFeaturssupported(List<Feature> featurssupported) {
		this.featurssupported = featurssupported;
	}
	
	

}
