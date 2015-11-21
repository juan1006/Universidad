package com.mycompany.desarrollovca.controller;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mycompany.desarrollovca.model.Cliente;
import com.mycompany.desarrollovca.service.ClienteServiceImp;

@Controller	
public class ClienteController {

	@Autowired
	private ClienteServiceImp clienteService;
	
	@RequestMapping(value = "cliente.htm" , method = RequestMethod.GET)
	public void initListarCliente(Model model){					
		try{			
			model.addAttribute("listaCliente", clienteService.obtenerListCliente());		
	    }catch (Exception e)
		{
				e.printStackTrace();
		}			
	}
	
	
	@RequestMapping(value = "cliente-registro-n.htm" , method = RequestMethod.GET)
	public void initClienteNatural(Model model ,@ModelAttribute("cliente") Cliente cliente){	
		Map<String,String> tipoIdentidad = null;
		
		try{
    	
		model.addAttribute("cliente" , cliente);
		
		tipoIdentidad = new LinkedHashMap<String,String>();
		tipoIdentidad.put("DNI", "DNI");
		tipoIdentidad.put("CE", "Carnet Extranjeria");		
		model.addAttribute("tipoIdentidadLista", tipoIdentidad);
		
	    }catch (Exception e)
		{
				e.printStackTrace();
		}			
	}
	
	@RequestMapping(value = "cliente-registro-j.htm" , method = RequestMethod.GET)
	public void initClienteNJuridico(Model model ,@ModelAttribute("cliente") Cliente cliente){	
		Map<String,String> tipoIdentidad = null;
		
		try{
    	
		model.addAttribute("cliente" , cliente);
		
		tipoIdentidad = new LinkedHashMap<String,String>();
		tipoIdentidad.put("DNI", "DNI");
		tipoIdentidad.put("CE", "Carnet Extranjeria");		
		model.addAttribute("tipoIdentidadLista", tipoIdentidad);
		
	    }catch (Exception e)
		{
				e.printStackTrace();
		}			
	}
	
	@RequestMapping(value = "cliente_registrar.htm" , method =RequestMethod.POST)
	public ModelAndView registrarCliente(Model model ,@ModelAttribute("cliente") Cliente cliente){
		ModelAndView mav = null;
		
		try{		
				if (cliente.getPrimerNombre() != null)
				{
					int datoInsCliente = clienteService.insertar(cliente);
					
					if (datoInsCliente == 1){						
						mav = new ModelAndView("cliente");
						mav.addObject("listaCliente", clienteService.obtenerListCliente());
					}else{
						mav = new ModelAndView("cliente");
						System.out.println("Error al grabar Cliente");
					}
				}
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		
		return mav;			
	}
	
}
