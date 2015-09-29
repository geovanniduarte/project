package com.geo.project.common;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.GenericTypeResolver;
import org.springframework.transaction.annotation.Transactional;

public class EntityRepositoryImpl<T extends Identificable<Long>> {
	
	@Autowired
	private SessionFactory sessionFactory;
	private final Class<T> genericType;
	private final String RECORD_COUNT_HQL;
    private final String FIND_ALL_HQL;
	
	
	public EntityRepositoryImpl() {
		 this.genericType = (Class<T>) GenericTypeResolver.resolveTypeArgument(getClass(), EntityRepositoryImpl.class);
		 this.RECORD_COUNT_HQL = "select count(*) from " + this.genericType.getName();
	     this.FIND_ALL_HQL = "from " + this.genericType.getName() + " t ";
	}

	public Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public Long insert(T entity) {
		return (Long) getSession().save(entity);	
	}
	
	
	@Transactional
	public Long insertUpdate(T entity) {
		getSession().saveOrUpdate(entity);
		return entity.getIdentifier();
	}

	
	public void update(T entity) {
		getSession().update(entity);
	}

	
	public void delete(T entity) {
		// TODO Auto-generated method stub
		
	}

	
	public Long count() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<T> find(T entity) {
		
		return null;
	}

	@Transactional
	public T findById(Long usuaid) {
		T object = (T) getSession().get(this.genericType, usuaid);
		return object;
	}
	
}
