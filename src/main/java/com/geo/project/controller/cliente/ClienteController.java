package com.geo.project.controller.cliente;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.geo.project.common.MyController;

@Controller
@RequestMapping("/clientes")
public class ClienteController extends MyController {
	
	@RequestMapping("/create")
	@ResponseBody
	public String insert() {
		return "";
	}
	
}
