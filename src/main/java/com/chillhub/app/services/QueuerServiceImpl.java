package com.chillhub.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.chillhub.app.dao.QueuerDao;
import com.chillhub.app.entities.Queuer;

public class QueuerServiceImpl implements IQueuerService {
	
	@Autowired
	QueuerDao dao;
	
	@Override
	public List<Queuer> getAll() {
		return dao.findAll();
	}
	
	@Override
	public Optional<Queuer> getOneById(int id) {
		return dao.findById(id);
	}
	
	@Override
	public void addOrUpdate(Queuer q) {
		dao.save(q);
	}
	
	@Override
	public void delete(Queuer q) {
		dao.delete(q);
	}

}
