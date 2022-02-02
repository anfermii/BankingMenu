package com.classboxes.classboxesproject.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class Account {
	@Id
	@Column(name="ACC_NUM")
	private int acc_Num;
	@Column(name="ACC_TYPE")
	private String acc_Type;
	@Column(name="AMOUNT")
	private double amount;
	public int getAcc_Num() {
		return acc_Num;
	}
	public void setAcc_Num(int acc_Num) {
		this.acc_Num = acc_Num;
	}
	public String getAcc_Type() {
		return acc_Type;
	}
	public void setAcc_Type(String acc_Type) {
		this.acc_Type = acc_Type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
}
