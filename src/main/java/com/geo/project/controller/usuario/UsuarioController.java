package com.geo.project.controller.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.geo.project.common.MyController;
import com.geo.project.common.model.PyrUsuario;
import com.geo.project.service.usuario.UsuarioService;

@Controller
@RequestMapping(value = "/ws/users")
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
		System.out.println("createPregunta");
		long preguntaId = usuarioService.insert(newUsuario);
		return entityWithLocation(url, (int) preguntaId);
	}
}
