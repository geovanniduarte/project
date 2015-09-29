package com.geo.project.repository.usuario;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.geo.project.common.EntityRepositoryImpl;
import com.geo.project.common.model.PyrUsuario;

@Repository
public class UsuarioRepositoryImpl extends EntityRepositoryImpl<PyrUsuario> implements UsuarioRepository {	
	
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
	
}
