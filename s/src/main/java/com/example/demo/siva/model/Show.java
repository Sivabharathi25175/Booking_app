package com.example.demo.siva.model;


import java.sql.Date;
import java.util.List;

import com.example.demo.siva.Enum.Feature;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
public class Show {
	@Id
	private long show_id;
	
	private  Date sh_starttime;
	private Date shw_endtime;
	@ManyToOne
	private Movie movie;
	
	@ElementCollection
	@Enumerated(EnumType.ORDINAL)
	private List<Feature> featurerequired;
	
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public List<Feature> getFeaturerequired() {
		return featurerequired;
	}
	public void setFeaturerequired(List<Feature> featurerequired) {
		this.featurerequired = featurerequired;
	}
	
	
	
	
	

}
