package com.mycompany.desarrollovca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mycompany.desarrollovca.model.Empleado;
import com.mycompany.desarrollovca.service.ClienteService;
import com.mycompany.desarrollovca.service.ClienteServiceImp;
import com.mycompany.desarrollovca.service.EmpleadoServiceImp;

@Controller
public class LoginController {

	@Autowired
	private EmpleadoServiceImp empleadoService;
	@Autowired
	private ClienteServiceImp clienteService;
	
	@RequestMapping(value="login.htm", method = {RequestMethod.GET, RequestMethod.POST})	
    public ModelAndView displayLogin(Model model,@ModelAttribute("empleado") Empleado empleado)
    {   
		ModelAndView mav = null;
		
		try
		{
        model.addAttribute("empleado",empleado);
        
        if(empleado!= null){
        	if( empleado.nick != null && empleado.contrasena != null){

    			Empleado datosEmpleado = empleadoService.validarEmpleado(empleado.getNick(),empleado.getContrasena());
    			if (datosEmpleado != null)
    			{
    				System.out.println("Usuario correcto");
    			//	request.setAttribute("loggedInUser", datosEmpleado.getNick());    			
    				mav = new ModelAndView("cliente");
    				mav.addObject("listaCliente", clienteService.obtenerListCliente());
    			}
    			else
    			{
    				System.out.println("Usuario incorrecto");
    				mav = new ModelAndView("login");
    				mav.addObject("empleadoBean", datosEmpleado);
    				//request.setAttribute("message", "Invalid credentials!!");
    			}
	
        	}
        }
        
        if(mav == null){
        	mav = new ModelAndView("login");
        }
		}catch (Exception e)
		{
			e.printStackTrace();
		}
        
        return mav;
    }


	@RequestMapping(value = "registrar.htm", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView registrarEmpleado(Model model,@ModelAttribute("empleado") Empleado empleado){
	ModelAndView mav = null;
	try
		{			
			model.addAttribute("empleadoRegistrar",empleado);
			if (empleado.getApellidoMat() != null)
			{
				int datoInsEmpleado = empleadoService.insertar(empleado);
				
				if (datoInsEmpleado == 1){
					mav = new ModelAndView("login");
				}else{
					mav = new ModelAndView("registro");
				}
			}else{
				mav = new ModelAndView("registro");
			}
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return mav;
	}
}
