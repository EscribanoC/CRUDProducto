package com.hlc.producto.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hlc.producto.entidades.Producto;
import com.hlc.producto.servicio.ProductoServicio;

import jakarta.annotation.PostConstruct;

@Component
public class InicializarDatos {
	@Autowired
	private ProductoServicio productoServicio;
		
		@PostConstruct
		public void init() {
			Producto producto1 = new Producto();
			producto1.setNombre("Producto 1");
			producto1.setPrecio(10.99);
			productoServicio.guardarProducto(producto1);
			
			Producto producto2 = new Producto();
			producto2.setNombre("Producto 2");
			producto2.setPrecio(3.14);
			productoServicio.guardarProducto(producto1);
		}
}
