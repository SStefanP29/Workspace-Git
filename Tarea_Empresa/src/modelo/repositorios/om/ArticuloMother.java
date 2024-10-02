package modelo.repositorios.om;

import java.util.ArrayList;
import java.util.List;

import modelo.dominio.Articulo;
import modelo.repositorios.Populable;

public class ArticuloMother implements Populable<Articulo> {

	public List<Articulo> crearVariosArticulos() {
		List<Articulo> articulos = new ArrayList<Articulo>();
		articulos.add(new Articulo(1L, "Ordenador portátil", 899.99f));
		articulos.add(new Articulo(2L, "Smartphone", 499.99f));
		articulos.add(new Articulo(3L, "Tablet", 299.99f));
		articulos.add(new Articulo(4L, "Monitor 24 pulgadas", 199.99f));
		articulos.add(new Articulo(5L, "Teclado mecánico", 89.99f));
		articulos.add(new Articulo(6L, "Rat�n inalámbrico", 49.99f));
		articulos.add(new Articulo(7L, "Impresora multifunción", 149.99f));
		articulos.add(new Articulo(8L, "Auriculares Bluetooth", 79.99f));
		articulos.add(new Articulo(9L, "Cámara digital", 599.99f));
		articulos.add(new Articulo(10L, "Disco duro externo 1TB", 59.99f));
		articulos.add(new Articulo(11L, "Memoria USB 64GB", 14.99f));
		articulos.add(new Articulo(12L, "Silla ergonómica", 129.99f));
		articulos.add(new Articulo(13L, "Altavoces estéreo", 39.99f));
		articulos.add(new Articulo(14L, "Cargador rápido", 24.99f));
		articulos.add(new Articulo(15L, "Tarjeta gráfica", 349.99f));
		return articulos;
	}

	@Override
	public List<Articulo> getElementos() {
		return crearVariosArticulos();
	}
}
