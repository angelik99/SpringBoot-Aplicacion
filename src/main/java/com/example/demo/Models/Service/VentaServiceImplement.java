package com.example.demo.Models.Service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Entity.Venta;
import com.example.demo.Models.Repository.VentaRepository;
@Service
public class VentaServiceImplement implements IVentaService {
	
	@Autowired
	private VentaRepository ventaRepository;

	@Override
	public List<Venta> listarTodos() {
		
		return (List<Venta>) ventaRepository.findAll();
	}

	@Override
	public void guardar(Venta venta) {
		ventaRepository.save(venta);

	}

	@Override
	public Venta buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Eliminar(Long id) {
		// TODO Auto-generated method stub

	}
public List<Venta> buscaPorFechaNumTarjeta(Date fechaVenta, String numtarjeta) {
		
		return (List<Venta>) ventaRepository.findByNumtarjetaAndFechaVenta(numtarjeta, fechaVenta);
	}


}
