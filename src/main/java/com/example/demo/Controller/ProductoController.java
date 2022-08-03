package com.example.demo.Controller;
import java.util.List;
import com.example.demo.Models.Entity.Producto;
import com.example.demo.Models.Service.IProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/views/productos")
public class ProductoController {
	@Autowired
	private IProductoService productoService;
	
	@GetMapping("/")
	public String listarProductos(Model model) {
		List<Producto> listadoProductos = productoService.listarTodos();
		
		model.addAttribute("titulo" , "Lista de productos");
		model.addAttribute("productos", listadoProductos);
		
		return "/views/productos/listar";
	}
}
