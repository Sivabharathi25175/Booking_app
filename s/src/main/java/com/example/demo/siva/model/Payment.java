package com.example.demo.siva.model;

import com.example.demo.siva.Enum.Paymentprovider;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
public class Payment {
	
	@Id
	private long id;
	private String transtionnumber;
	@Enumerated(EnumType.ORDINAL)
	private Paymentprovider paymentprovider;
	public String getTranstionnumber() {
		return transtionnumber;
	}
	public void setTranstionnumber(String transtionnumber) {
		this.transtionnumber = transtionnumber;
	}
	public Paymentprovider getPaymentprovider() {
		return paymentprovider;
	}
	public void setPaymentprovider(Paymentprovider paymentprovider) {
		this.paymentprovider = paymentprovider;
	}
	
	
	

}
