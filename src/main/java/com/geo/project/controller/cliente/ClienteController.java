package com.geo.project.controller.cliente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.geo.project.common.MyController;
import com.geo.project.common.model.InvCliente;
import com.geo.project.repository.cliente.ClienteRepository;
import com.geo.project.service.cliente.ClienteService;

@Controller
@RequestMapping("/ws/clientes")
public class ClienteController extends MyController {
	
		
	@Autowired
	private ClienteService clienteService;
	
	@RequestMapping(value = "/clientes", method = RequestMethod.POST, consumes = {"application/json"})
	@ResponseBody
	public String insert(@RequestBody InvCliente cliente) {
		System.out.println("CREATE"); 
		long clientid = clienteService.insert(cliente);
		return "" + clientid;
	}	
	
	@RequestMapping(value = "/clientes", method = RequestMethod.GET)
	@ResponseBody
	public List<InvCliente> insert() {	
		List<InvCliente> clientes = clienteService.findAll();
		System.out.println("get clientes " + clientes);
		return clientes;
	}
	
	@RequestMapping(value = "/clientes/{clieid}", method = RequestMethod.GET)
	@ResponseBody
	public InvCliente find(@PathVariable long clieid) {	
		InvCliente cliente = clienteService.findById(clieid);
		return cliente;
	}
	
	@RequestMapping(value = "/clientes/{clieid}", method = RequestMethod.PUT)
	@ResponseBody
	public Long edit(@PathVariable long clieid, @RequestBody InvCliente cliente) {	
		Long clienid = clienteService.insertUpdate(cliente);
		return clienid;
	}
	
}
