package com.example.demo.siva.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class Ticket {
	@Id
	private long id;
	private Date bookedat;
	@ManyToMany
	private User bookedby;
	private int amount;
	@OneToMany
	private List<Showseat> showseat;
	@OneToOne
	private Payment payment;
	
	
	public Date getBookedat() {
		return bookedat;
	}
	public void setBookedat(Date bookedat) {
		this.bookedat = bookedat;
	}
	public User getBookedby() {
		return bookedby;
	}
	public void setBookedby(User bookedby) {
		this.bookedby = bookedby;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public List<Showseat> getShowseat() {
		return showseat;
	}
	public void setShowseat(List<Showseat> showseat) {
		this.showseat = showseat;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
	
	
	

}
