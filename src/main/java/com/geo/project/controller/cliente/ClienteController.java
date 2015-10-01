package com.geo.project.controller.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.geo.project.common.MyController;
import com.geo.project.common.model.InvCliente;
import com.geo.project.repository.cliente.ClienteRepository;

@Controller
@RequestMapping("/clientes")
public class ClienteController extends MyController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@RequestMapping("/create")
	@ResponseBody
	public String insert(@RequestBody InvCliente cliente) {
		long clientid = clienteRepository.insert(cliente);
		return "" + clientid;
	}	
}
