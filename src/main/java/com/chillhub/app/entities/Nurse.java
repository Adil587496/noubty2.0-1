package com.chillhub.app.entities;

import javax.persistence.Entity;

@Entity
public class Nurse extends User {
	
	private String refMedicale;

	public String getRefMedicale() {
		return refMedicale;
	}

	public void setRefMedicale(String refMedicale) {
		this.refMedicale = refMedicale;
	}

	@Override
	public String toString() {
		return "Nurse [refMedicale=" + refMedicale + "]";
	}

}
