package com.geo.project;

import static org.junit.Assert.*;

import java.net.URI;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import org.springframework.web.client.RestTemplate;

import com.geo.project.common.model.PyrPregunta;
import com.geo.project.common.model.PyrUsuario;
import com.geo.project.service.usuario.UsuarioService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/applicationContext.xml")
public class PreguntaTest {
	
	
	@Autowired
	private UsuarioService usuarioService;
	private static final String BASE_URL = "http://localhost:8080/pyr/clientes";
	private RestTemplate restTemplate = new RestTemplate();
	@Test
	public void crearPregunta() {		
		String url = BASE_URL + "/create";
		PyrPregunta pregunta = new PyrPregunta(1,"que edad tienes?");
		URI newPreguntaLocation = restTemplate.postForLocation(url, pregunta);
		System.out.println("URL GEO: " + newPreguntaLocation);
		/*
		PyrPregunta newPregunta = new PyrPregunta(1, "Que es el arte?");
		Long resp = preguntaService.insert(newPregunta);		
		assertNotSame(Long.valueOf(0),resp);
		*/
		assertEquals(Long.valueOf(1), Long.valueOf(newPreguntaLocation.toString()));
	}
	
	//@Test
	public void crearUsuario() {
		System.out.println( "Creando usuario" );
		PyrUsuario newUsuario = new PyrUsuario("geovanni.duarte", "1234", "alsgasdg");
		Long resp = usuarioService.insert(newUsuario);		
		assertNotSame(Long.valueOf(0),resp);
	}
	
	//@Test
	public void getUsuario() {
		System.out.println( "Creando usuario" );
		PyrUsuario obtenido = usuarioService.findById(1L);	
		System.out.println( "obteniendo usuario" + obtenido );
		assertEquals(Long.valueOf(1),obtenido.getIdentifier());
	}
	
	//@Test
	public void enviarMensaje() {
		boolean enviado = usuarioService.enviarMensajePruebaUsuario("geovannk");
		assert(enviado);
	}
	

}
