package com.mycompany.desarrollovca.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.mycompany.desarrollovca.model.Color;
import com.mycompany.desarrollovca.model.Producto;
import com.mycompany.desarrollovca.model.Talla;
import com.mycompany.desarrollovca.service.ColorServiceImp;
import com.mycompany.desarrollovca.service.ProductoServiceImp;
import com.mycompany.desarrollovca.service.TallaServiceImp;

@Controller
public class ProductoController {

	@Autowired
	private ProductoServiceImp productoService;
	@Autowired
	private TallaServiceImp colorService;
	@Autowired
	private ColorServiceImp tallaService;
	
	@RequestMapping(value = "producto.htm" , method = RequestMethod.GET)
	public void initListarProducto(Model model){	
		try{			
			model.addAttribute("listarProducto", productoService.obtenerListProducto());		
	    }catch (Exception e)
		{
				e.printStackTrace();
		}			
	}
	
	@RequestMapping(value = "producto-registro.htm" , method = RequestMethod.GET)
	public void initProducto(Model model ,@ModelAttribute("producto") Producto producto){	
		Map<Integer,String> tipoTalla = null;
		Map<Integer,String> tipoColor = null;
		List<Color> listColor = null;
		List<Talla> listTalla = null;
		
		try{
			listColor = tallaService.obtenerListColor();
			listTalla = colorService.obtenerListTalla();
		
		tipoTalla = new LinkedHashMap<Integer,String>();
		tipoColor = new LinkedHashMap<Integer,String>();
		
		for(Color color:listColor){
			tipoColor.put(color.getCodColor(), color.getNombreColor());
		}
		
		for(Talla talla:listTalla){
			tipoTalla.put(talla.getCodTalla(), talla.getNombreTalla());
		}
	
		model.addAttribute("listaColor", tipoColor);
		model.addAttribute("listaTalla", tipoTalla);
		model.addAttribute("producto",producto);
		
	    }catch (Exception e)
		{
				e.printStackTrace();
		}			
	}
							 	
	@RequestMapping(value = "producto_registrar.htm" , method = {RequestMethod.POST,RequestMethod.GET})
	public ModelAndView registrarProducto(Model model ,@ModelAttribute("producto") Producto producto){
		ModelAndView mav = null;
		
		try{		
				if (producto.getDescripcion() != null)
				{
					int datoInsProducto = productoService.insertar(producto);
					
					if (datoInsProducto == 1){						
						mav = new ModelAndView("producto");
						mav.addObject("listarProducto", productoService.obtenerListProducto());
					}else{
						mav = new ModelAndView("producto_registrar");	
						System.out.println("Error al grabar Producto");
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
