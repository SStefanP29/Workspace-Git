package modelo.repositorios.om;

import java.util.ArrayList;
import java.util.List;

import modelo.dominio.Ruta;
import modelo.dominio.Vendedor;
import modelo.repositorios.Populable;

public class VendedorMother implements Populable<Vendedor> {

	public List<Vendedor> crearVariosVendedores() {
		List<Vendedor> vendedores = new ArrayList<Vendedor>();
		vendedores.add(new Vendedor("87654321Z", "Miguel Álvarez", Ruta.norte));
		vendedores.add(new Vendedor("76543210Y", "Elena Gutiérrez", Ruta.sur));
		vendedores.add(new Vendedor("65432109X", "Pablo Herrera", Ruta.central));
		vendedores.add(new Vendedor("54321098W", "Cristina Vázquez", Ruta.periferia));
		vendedores.add(new Vendedor("43210987V", "Sergio Navarro", Ruta.complementaria));
		vendedores.add(new Vendedor("32109876U", "Isabel Domínguez", Ruta.norte));
		vendedores.add(new Vendedor("21098765T", "Antonio Castillo", Ruta.sur));
		vendedores.add(new Vendedor("10987654S", "Marta Ibáñez", Ruta.central));
		vendedores.add(new Vendedor("09876543R", "Raúl Romero", Ruta.periferia));
		vendedores.add(new Vendedor("98765432Q", "Clara Medina", Ruta.complementaria));
		vendedores.add(new Vendedor("87654321P", "Alberto Gómez", Ruta.norte));
		vendedores.add(new Vendedor("76543210O", "Patricia Torres", Ruta.sur));
		vendedores.add(new Vendedor("65432109N", "Javier Silva", Ruta.central));
		vendedores.add(new Vendedor("54321098M", "Lorena Fuentes", Ruta.periferia));
		vendedores.add(new Vendedor("43210987L", "Fernando Muñoz", Ruta.complementaria));
		return vendedores;
	}

	@Override
	public List<Vendedor> getElementos() {
		return crearVariosVendedores();
	}

}
