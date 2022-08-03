package com.example.demo.Controller;

import java.util.List;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.Models.Entity.Producto;
import com.example.demo.Models.Entity.Venta;
import com.example.demo.Models.Service.IProductoService;
import com.example.demo.Models.Service.IVentaService;


@Controller
@RequestMapping("/views/ventas")
public class VentaController {
	@Autowired
	private IProductoService productoService;
	
	@Autowired
	private IVentaService ventaService;
	
	
	
	
	@GetMapping("/create")
	public String Crear(Model model) {
		Venta venta = new Venta();
		List<Producto> listadoProductos = productoService.listarTodos();
		model.addAttribute("titulo", "Formulario");
		model.addAttribute("venta", venta);
		model.addAttribute("productos", listadoProductos);
		
		
		return "/views/ventas/frmCreate";
		
		
}
	public String validar(@ModelAttribute Producto producto, Integer precio,  RedirectAttributes attribute ) {
		
		if(precio > 9999999) {
			attribute.addFlashAttribute("info", "No puede pagar mas de 10.000.000");
		}
		return "/views/ventas/frmCreate";
	}
	@PostMapping("/save")
	public String guardar(@Valid @ModelAttribute Venta venta,  BindingResult result, 
			Model model, Integer precio, RedirectAttributes attribute,  String estado ) {
		List<Producto> listadoProductos = productoService.listarTodos();

		if(result.hasErrors()) {
			
			model.addAttribute("titulo", "Formulario");
			model.addAttribute("venta", venta);
			model.addAttribute("productos", listadoProductos);
			attribute.addFlashAttribute("error", "Existen Errores");
			return "/views/ventas/frmCreate";
		}
	
		
		ventaService.guardar(venta);		
		estado="APROBADA";
		attribute.addFlashAttribute("success", "Estado de la compra: " + estado);
		return "redirect:/views/productos/";
	}
}




	
	
	
	
	