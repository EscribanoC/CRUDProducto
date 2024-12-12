package com.hlc.producto.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hlc.producto.entidades.Producto;

import com.hlc.producto.repositorio.ProductoRepositorio;

@Service
public class ProductoServicio {
	@Autowired
	private ProductoRepositorio productoRepositorio;
	
	public Iterable<Producto> listarTodosLosProductos(){
		return productoRepositorio.findAll();
	}
	
	public Producto guardarProducto(Producto producto) {
		return productoRepositorio.save(producto);
	}
	
	public Producto obtenerPorId(Long id) {
		return productoRepositorio.findById(id).orElseThrow(
				() -> new IllegalArgumentException("Producto no encontrado " + id)
				);
	}	
	
	public void eliminarProducto(Long id) {
		productoRepositorio.deleteById(id);
	}
}
