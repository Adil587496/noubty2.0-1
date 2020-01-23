package com.chillhub.app.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class Nurse extends User {

	private String refMedicale;

	@OneToMany(mappedBy = "nurse", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Queuer> createdQueuers;

	public String getRefMedicale() {
		return refMedicale;
	}

	public void setRefMedicale(String refMedicale) {
		this.refMedicale = refMedicale;
	}

	@Override
	public String toString() {
		return "Nurse [refMedicale=" + refMedicale + ", createdQueuers=" + createdQueuers + "]";
	}

	public List<Queuer> getCreatedQueuers() {
		return createdQueuers;
	}

	public void setCreatedQueuers(List<Queuer> createdQueuers) {
		this.createdQueuers = createdQueuers;
	}

}
