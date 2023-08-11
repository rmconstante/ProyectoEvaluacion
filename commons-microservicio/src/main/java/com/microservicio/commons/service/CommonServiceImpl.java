package com.microservicio.commons.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


public class CommonServiceImpl<E,R extends CrudRepository<E, Long>> implements CommonService<E>{

	@Autowired
	protected R repository;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<E> findAll() {
		
		return repository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<E> findById(Long id) {
		
		return repository.findById(id);
	}

	@Override
	public E save(E entity) {
		// TODO Auto-generated method stub
		return repository.save(entity);
	}

	@Override
	public void deleteByID(long id) {
		repository.deleteById(id);
		// TODO Auto-generated method stub
		
	}

}