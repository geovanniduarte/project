package com.geo.project.repository.cliente;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.geo.project.common.model.InvCliente;

@Repository
public class ClienteRepositoryImpl implements ClienteRespository {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Long insert(InvCliente entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(InvCliente entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(InvCliente entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long insertUpdate(InvCliente entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<InvCliente> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<InvCliente> find(InvCliente entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InvCliente findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
