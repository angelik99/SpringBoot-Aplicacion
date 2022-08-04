package com.example.demo.Models.Service;

import java.util.Date;
import java.util.List;


import com.example.demo.Models.Entity.Venta;

public interface IVentaService {
	public List<Venta> listarTodos();
	public List<Venta> buscaPorFechaNumTarjeta(Date fechaVenta, String numtarjeta);
	public void guardar (Venta venta);
	public Venta buscarPorId(Long id);
	public void Eliminar(Long id);
}
