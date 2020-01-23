package com.chillhub.app.services;

import java.util.List;
import java.util.Optional;

import com.chillhub.app.entities.Queuer;

public interface IQueuerService {

	List<Queuer> getAll();

	Optional<Queuer> getOneById(int id);

	void addOrUpdate(Queuer q);

	void delete(Queuer q);

}