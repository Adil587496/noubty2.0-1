package com.chillhub.app.services;

import java.util.List;
import java.util.Optional;

import com.chillhub.app.entities.Doctor;

public interface IDoctorService {

	List<Doctor> getAll();

	Optional<Doctor> getOneById(int id);

	void addOrUpdate(Doctor p);

	void delete(Doctor p);

	Doctor getByRoom(String room);
	
	public Doctor getByRefMedical(String ref);
	
	public List<Doctor> findDispoDoc();

}