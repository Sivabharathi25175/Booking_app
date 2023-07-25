package com.example.demo.siva.model;

import com.example.demo.siva.Enum.Seattype;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class Showseattype {
	
	@Id
	private long id;
	@ManyToOne
	private Show show;
	@Enumerated(EnumType.ORDINAL)
	private Seattype seattype;
	private int price;
	public Show getShow() {
		return show;
	}
	public void setShow(Show show) {
		this.show = show;
	}
	public Seattype getSeattype() {
		return seattype;
	}
	public void setSeattype(Seattype seattype) {
		this.seattype = seattype;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	
	
}
