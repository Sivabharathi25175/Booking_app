package com.example.demo.siva.model;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import com.example.demo.siva.Enum.Language;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
public class Movie {
	@Id
	private long id;
	private String name;
	private String Describtion;
	private Language language;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescribtion() {
		return Describtion;
	}
	public void setDescribtion(String describtion) {
		Describtion = describtion;
	}
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}

	
//	m actor
//	1  m
//	m  1
//	m m
	

}
