package com.geo.project.repository.usuario;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.geo.project.common.model.PyrUsuario;

@Repository
public class UsuarioRepositoryImpl implements UsuarioRepository {

	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public PyrUsuario findByUserName(String usuanomb) {
		List<PyrUsuario> users = new ArrayList<PyrUsuario>();
		System.out.println("usuario: " + usuanomb);
		users = getSession()
			.createQuery("from PyrUsuario where usuanomb = :usua")
			.setParameter("usua", usuanomb).list();
 
		if (users.size() > 0) {
			return users.get(0);
		} else {
			return null;
		}
	}

	public Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public Long insert(PyrUsuario PyrUsuario) {
		return (Long) getSession().save(PyrUsuario);	
	}
	
	@Override
	@Transactional
	public Long insertUpdate(PyrUsuario PyrUsuario) {
		getSession().saveOrUpdate(PyrUsuario);
		return PyrUsuario.getUsuaid();
	}

	@Override
	public void update(PyrUsuario PyrUsuario) {
		getSession().update(PyrUsuario);
	}

	@Override
	public void delete(PyrUsuario PyrUsuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PyrUsuario> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PyrUsuario> find(PyrUsuario PyrUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PyrUsuario findById(Long usuaid) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
