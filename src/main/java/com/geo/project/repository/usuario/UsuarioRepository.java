package com.geo.project.repository.usuario;

import java.util.List;
import com.geo.project.common.model.PyrUsuario;

public interface UsuarioRepository {
	
	public PyrUsuario findByUserName(String usuanomb);
	public Long insert(PyrUsuario PyrUsuario);
	public void update(PyrUsuario PyrUsuario);
	public void delete(PyrUsuario PyrUsuario);
	public Long insertUpdate(PyrUsuario PyrUsuario);
	public Long count();
	public List<PyrUsuario> findAll();
	public List<PyrUsuario> find(PyrUsuario PyrUsuario);
	public PyrUsuario findById(Long usuaid);
}
