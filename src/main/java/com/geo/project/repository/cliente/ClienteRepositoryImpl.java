package com.geo.project.repository.cliente;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.geo.project.common.EntityRepositoryImpl;
import com.geo.project.common.model.InvCliente;

@Repository
public class ClienteRepositoryImpl extends EntityRepositoryImpl<InvCliente> implements ClienteRepository {
	
	@Autowired
	private SessionFactory sessionFactory;	

}
