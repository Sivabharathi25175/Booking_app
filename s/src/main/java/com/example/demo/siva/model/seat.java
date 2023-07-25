package com.example.demo.siva.model;

import com.example.demo.siva.Enum.Seattype;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
@Table(name = "`Seat`")
public class seat {
	@Id
	private long id;
	private String number;
	private int se_row;
	private int Se_col;
	@Enumerated(EnumType.ORDINAL)
	private Seattype seattype;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public Seattype getSeattype() {
		return seattype;
	}
	public void setSeattype(Seattype seattype) {
		this.seattype = seattype;
	}
	
	

}
