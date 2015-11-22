package com.geo.project.service.usuario;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.geo.project.common.EntityServiceImpl;
import com.geo.project.common.model.InvCliente;
import com.geo.project.common.model.PyrUsuario;
import com.geo.project.common.model.PyrUsuarole;
import com.geo.project.repository.usuario.UsuarioRepository;

@Service
public class UsuarioServiceImpl extends EntityServiceImpl<PyrUsuario> implements UserDetailsService, UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	private static final Logger logger = LoggerFactory.getLogger(UsuarioServiceImpl.class);
	private static RestTemplate restTemplate = new RestTemplate();
	private static final String API_KEY = "AIzaSyDwhOfKkmj4dOZfFo-AHdDkct8m09jnlV8";
	
	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		try{	
		com.geo.project.common.model.PyrUsuario user = usuarioRepository.findByUserName(username);
		System.out.println("usuario spring : " + user);
		List<GrantedAuthority> authorities = buildUserAuthority(user.getRoles()); 
		System.out.println("roles: " + user);
		return buildUserForAuthentication(user, authorities);
		}catch(Exception e)
		{e.printStackTrace();return null;}
	}
	
	
	private UserDetails buildUserForAuthentication(PyrUsuario user,	List<GrantedAuthority> authorities) {
		return new User(user.getUsuanomb(), user.getUsuapass(), user.getUsuahabi(), true, true, true, authorities);
	}


	private List<GrantedAuthority> buildUserAuthority(List<PyrUsuarole> roles) {
		Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();		 
		// Build user's authorities
		for (PyrUsuarole rol : roles) {
			setAuths.add(new SimpleGrantedAuthority(rol.getUsrorole()));
		}
 		List<GrantedAuthority> Result = new ArrayList<GrantedAuthority>(setAuths); 
		return Result;
	}

	
	/**
	 * Obtiene el codigo de google de un usuario.
	 * @return codigo C2DM para mensajeria.
	 */
	public String getCodigoC2DM(String username) {
		PyrUsuario user = usuarioRepository.findByUserName(username);
		return user.getUsuac2dm();
	}
	
	/**
	 * Envia mensaje de pruega a un usuario username.
	 * @param username nombre del usuario.
	 */
	public boolean enviarMensajePruebaUsuario(String username) {
		String registration_id = getCodigoC2DM(username);
		return enviarMensajePrueba(registration_id);
	}
	
	/**
	 * Envia mensaje de prueba al cliente con registration_id
	 * @param registration_id
	 * @return si lo envi� o no.
	 */
	public static boolean enviarMensajePrueba(String registration_id) {		
		String GCM_URL = "https://android.googleapis.com/gcm/send";
		String msg = "Esto es una prueba.";
		boolean flag = false;
		JSONObject json = new JSONObject();		
		JSONArray ids = new JSONArray();
		ids.add(registration_id);
		json.put("registration_ids", ids);
		JSONObject data = new JSONObject();
		data.put("msg",msg);
		json.put("data",data);
		json.put("collapse_key", "pyr");
		
		System.out.println("ENTITY: " + json.toString() );
		HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.APPLICATION_JSON);
	    headers.setContentLength(msg.length());
	    headers.add("Authorization","key=" + API_KEY);	    
	    HttpEntity request= new HttpEntity(json, headers);
	    
	    ResponseEntity<String> response = null;
	    try {
	    	response = restTemplate.postForEntity(GCM_URL, request, String.class);	    
	    } catch (HttpClientErrorException e) {
	    	e.printStackTrace();
	    	 System.out.println("Respuesta: " + e.getResponseBodyAsString() );
	    }
 	    int iResponse = response.getStatusCode().value();
	    String respData = response.getBody();
	    System.out.println("Respuesta: " + respData );
	    if (iResponse == HttpStatus.OK.value())   // OK = 200
        {
            if (respData.startsWith("id=")) {
                flag = true;
                }
        }
		
		return flag;		
	}

}
