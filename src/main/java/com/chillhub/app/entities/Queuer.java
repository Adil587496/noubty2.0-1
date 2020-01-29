package com.chillhub.app.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Queuer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String ref;
	private String status;
	private int turn;

	@ManyToOne
	@JoinColumn(name = "fk_appointment")
	private Appointment appointment;

	@ManyToOne
	@JoinColumn(name = "fk_department")
	private Department department;

	@ManyToOne
	@JoinColumn(name = "fk_creator")
	private Nurse nurse;
	
	@ManyToOne
	@JoinColumn(name = "fk_doctor")
	private Doctor doctor;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Nurse getNurse() {
		return nurse;
	}

	public void setNurse(Nurse nurse) {
		this.nurse = nurse;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getTurn() {
		return turn;
	}

	public void setTurn(int turn) {
		this.turn = turn;
	}

	@Override
	public String toString() {
		return "Queuer [id=" + id + ", ref=" + ref + ", status=" + status + ", turn=" + turn + ", appointment="
				+ appointment + ", department=" + department + ", nurse=" + nurse + ", doctor=" + doctor + "]";
	}

}
