package com.geo.project.common;

import java.util.List;

public interface EntityRepository<T> {	
	public Long insert(T entity);
	public void update(T entity);
	public void delete(T entity);
	public Long insertUpdate(T entity);
	public Long count();
	public List<T> findAll();
	public List<T> find(T entity);
	public T findById(Long id);
}
