package com.example.demo.Models.Service;

import java.util.List;

import com.example.demo.Models.Entity.Producto;

public interface IProductoService {

	public List<Producto> listarTodos();
	public void guardar (Producto producto);
	public Producto buscarPorId(Long id);
	public void Eliminar(Long id);
}
