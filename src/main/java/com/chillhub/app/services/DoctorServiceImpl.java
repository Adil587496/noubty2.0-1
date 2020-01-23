package com.chillhub.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.chillhub.app.dao.DoctorDao;
import com.chillhub.app.entities.Doctor;

public class DoctorServiceImpl implements IDoctorService {

	@Autowired
	DoctorDao dao;
	
	@Override
	public List<Doctor> getAll() {
		return dao.findAll();
	}
	
	@Override
	public Optional<Doctor> getOneById(int id) {
		return dao.findById(id);
	}
	
	@Override
	public void addOrUpdate(Doctor d) {
		dao.save(d);
	}
	
	@Override
	public void delete(Doctor d) {
		dao.delete(d);
	}
	
	@Override
	public Doctor getByRoom(String room) {
		return dao.findByRoom(room);
	}
	
	@Override
	public Doctor getByRefMedical(String ref) {
		return dao.findByRefMedicale(ref);
	}
	
	
	@Override
	public List<Doctor> findDispoDoc() {
		return dao.findByDisponible(true);
	}
	
	
}