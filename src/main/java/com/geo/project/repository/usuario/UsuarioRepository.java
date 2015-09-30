package com.geo.project.repository.usuario;

import com.geo.project.common.EntityRepository;
import com.geo.project.common.model.PyrUsuario;

public interface UsuarioRepository extends EntityRepository<PyrUsuario> {	
	public PyrUsuario findByUserName(String usuanomb);	
}
