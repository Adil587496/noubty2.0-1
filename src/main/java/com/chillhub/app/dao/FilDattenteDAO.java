package com.chillhub.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chillhub.app.entities.Queue;

@Repository
public interface FilDattenteDAO extends JpaRepository<Queue, Integer> {

}
