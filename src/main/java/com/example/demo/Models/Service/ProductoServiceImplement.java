package com.example.demo.Models.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Entity.Producto;
import com.example.demo.Models.Repository.ProductoRepository;
@Service
public class ProductoServiceImplement implements IProductoService {
	@Autowired
	private ProductoRepository productoRepository;
	@Override
	public List<Producto> listarTodos() {
		
		return (List<Producto>) productoRepository.findAll();
	}

	@Override
	public void guardar(Producto producto) {
		productoRepository.save(producto);

	}

	@Override
	public Producto buscarPorId(Long id) {
		
		return productoRepository.findById(id).orElse(null);
	}

	@Override
	public void Eliminar(Long id) {
		productoRepository.deleteById(id);
	}
	

}
