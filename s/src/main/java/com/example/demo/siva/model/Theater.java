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
public class Theater  {
	@Id
	private long id;
	private String name;
	private String address;
	@OneToMany
	private List<Audi> aduti;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Audi> getAduti() {
		return aduti;
	}
	public void setAduti(List<Audi> aduti) {
		this.aduti = aduti;
	}
	
	

}
