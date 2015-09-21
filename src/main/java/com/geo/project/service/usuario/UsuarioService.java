package com.geo.project.service.usuario;

import java.util.List;

import com.geo.project.common.model.PyrUsuario;

public interface UsuarioService {
	public Long insert(PyrUsuario PyrUsuario);
	public void update(PyrUsuario PyrUsuario);
	public void delete(PyrUsuario PyrUsuario);
	public Long count();
	public Long insertUpdate(PyrUsuario PyrUsuario);
	public List<PyrUsuario> findAll();
	public List<PyrUsuario> find(PyrUsuario PyrUsuario);
	public PyrUsuario findById(Long usuaid);
	public boolean enviarMensajePruebaUsuario(String username);
}
