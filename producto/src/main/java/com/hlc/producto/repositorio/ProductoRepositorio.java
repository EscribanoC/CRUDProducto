package com.hlc.producto.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hlc.producto.entidades.Producto;

@Repository
public interface ProductoRepositorio extends CrudRepository<Producto, Long>{
	
}
