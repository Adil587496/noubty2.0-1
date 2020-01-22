package com.chillhub.app.entities;

import javax.persistence.Entity;

@Entity
public class Doctor extends User {
	
	private String refMedicale;
	private boolean disponible;
	
	public String getRefMedicale() {
		return refMedicale;
	}
	public void setRefMedicale(String refMedicale) {
		this.refMedicale = refMedicale;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	@Override
	public String toString() {
		return "Doctor [refMedicale=" + refMedicale + ", disponible=" + disponible + "]";
	}

}
