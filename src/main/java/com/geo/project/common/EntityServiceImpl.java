package com.geo.project.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.geo.project.repository.cliente.ClienteRepository;

public class EntityServiceImpl <T extends Identificable<Long>> {
	
	@Autowired
	private EntityRepository<T> entityRepository;

	@Transactional
	public Long insert(T entity) {
		entityRepository.insert(entity);
		return entity.getIdentifier();
	}	
	
	@Transactional
	public Long insertUpdate(T entity) {
		entityRepository.insertUpdate(entity);
		return entity.getIdentifier();
	}
	
	@Transactional
	public void update(T entity) {
		entityRepository.update(entity);
	}
	
	@Transactional	
	public void delete(T entity) {
		entityRepository.delete(entity);
	}

	@Transactional
	public Long count() {
		return  entityRepository.count();		
	}

	@Transactional
	public List<T> findAll() {		
		return entityRepository.findAll();
	}

	@Transactional
	public List<T> find(T entity) {
		return entityRepository.find(entity);
	}

	@Transactional
	public T findById(Long usuaid) {
		return entityRepository.findById(usuaid);
	}
}
