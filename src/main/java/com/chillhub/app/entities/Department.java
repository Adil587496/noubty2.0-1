package com.chillhub.app.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nomDep;
	private String codeDep;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomDep() {
		return nomDep;
	}
	public void setNomDep(String nomDep) {
		this.nomDep = nomDep;
	}
	public String getCodeDep() {
		return codeDep;
	}
	public void setCodeDep(String codeDep) {
		this.codeDep = codeDep;
	}
	
	
	
}
