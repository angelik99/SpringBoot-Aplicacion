package com.example.demo.Models.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.Entity.Venta;
@Repository
public interface VentaRepository extends CrudRepository<Venta, Long> {

	List<Venta> findByNumtarjetaAndFechaVenta(String numtarjeta, Date fechaVenta);
}
