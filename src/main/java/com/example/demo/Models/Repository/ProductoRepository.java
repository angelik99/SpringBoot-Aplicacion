package com.example.demo.Models.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.Entity.Producto;
@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long> {

}
