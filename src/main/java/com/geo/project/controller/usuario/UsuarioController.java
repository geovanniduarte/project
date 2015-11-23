package com.geo.project.controller.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.geo.project.common.MyController;
import com.geo.project.common.model.PyrUsuario;
import com.geo.project.service.cliente.ClienteService;
import com.geo.project.service.usuario.UsuarioService;

@Controller
@RequestMapping(value = "/ws/usuarios")
public class UsuarioController extends MyController {

	@Autowired
	private UsuarioService usuarioService;
	
	/**
	 * Creates a new Usuario, setting its URL as the Location header on the
	 * response.
	 */
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	@ResponseBody
	@ResponseStatus(HttpStatus.CREATED)
	public HttpEntity<String> createPregunta(@RequestBody PyrUsuario newUsuario,
			@Value("#{request.requestURL}") StringBuffer url) {	
		long preguntaId = usuarioService.insert(newUsuario);
		return entityWithLocation(url, (int) preguntaId);
	}
	
	@Autowired
	private ClienteService clienteService;
	
	@RequestMapping(value = "/usuarios", method = RequestMethod.POST, consumes = {"application/json"})
	@ResponseBody
	public String insert(@RequestBody PyrUsuario usuario) {
		System.out.println("CREATE"); 
		long clientid = usuarioService.insert(usuario);
		return "" + clientid;
	}	
	
	@RequestMapping(value = "/usuarios", method = RequestMethod.GET)
	@ResponseBody
	public List<PyrUsuario> insert() {	
		List<PyrUsuario> usuarios = usuarioService.findAll();
		return usuarios;
	}
	
	@RequestMapping(value = "/usuarios/{usuaid}", method = RequestMethod.GET)
	@ResponseBody
	public PyrUsuario find(@PathVariable long usuaid) {	
		PyrUsuario usuario = usuarioService.findById(usuaid);
		return usuario;
	}
	
	@RequestMapping(value = "/usuarios/{usuaid}", method = RequestMethod.PUT)
	@ResponseBody
	public Long edit(@PathVariable long usuaid, @RequestBody PyrUsuario usuario) {	
		Long clienid = usuarioService.insertUpdate(usuario);
		return clienid;
	}
		
}
