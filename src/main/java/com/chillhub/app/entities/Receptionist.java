package com.chillhub.app.entities;

import javax.persistence.Entity;

@Entity
public class Receptionist extends User {
	
	private String regCode;

	public String getRegCode() {
		return regCode;
	}

	public void setRegCode(String regCode) {
		this.regCode = regCode;
	}

	@Override
	public String toString() {
		return "Receptionist [regCode=" + regCode + "]";
	}
	
	

}
