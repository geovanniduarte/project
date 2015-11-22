package com.geo.project.service.usuario;

import java.util.List;

import com.geo.project.common.EntityRepository;
import com.geo.project.common.EntityService;
import com.geo.project.common.model.InvCliente;
import com.geo.project.common.model.PyrUsuario;

public interface UsuarioService extends EntityService<PyrUsuario>  {	
	public boolean enviarMensajePruebaUsuario(String username);
}
