package modelo.repositorios.om;

import java.util.ArrayList;
import java.util.List;

import modelo.dominio.Dependiente;
import modelo.repositorios.Populable;

public class DependienteMother implements Populable<Dependiente> {

	public List<Dependiente> crearVariosDependientes() {
		List<Dependiente> dependientes = new ArrayList<Dependiente>();
		dependientes.add(new Dependiente("87654321Z", "Miguel Álvarez", 1));
		dependientes.add(new Dependiente("76543210Y", "Elena Gutiérrez", 2));
		dependientes.add(new Dependiente("65432109X", "Pablo Herrera", 3));
		dependientes.add(new Dependiente("54321098W", "Cristina Vázquez", 4));
		dependientes.add(new Dependiente("43210987V", "Sergio Navarro", 5));
		dependientes.add(new Dependiente("32109876U", "Isabel Domínguez", 6));
		dependientes.add(new Dependiente("21098765T", "Antonio Castillo", 7));
		dependientes.add(new Dependiente("10987654S", "Marta Ibáñez", 8));
		dependientes.add(new Dependiente("09876543R", "Raúl Romero", 9));
		dependientes.add(new Dependiente("98765432Q", "Clara Medina", 10));
		dependientes.add(new Dependiente("87654321P", "Alberto Gómez", 11));
		dependientes.add(new Dependiente("76543210O", "Patricia Torres", 12));
		dependientes.add(new Dependiente("65432109N", "Javier Silva", 13));
		dependientes.add(new Dependiente("54321098M", "Lorena Fuentes", 14));
		dependientes.add(new Dependiente("43210987L", "Fernando Muñoz", 15));
		return dependientes;
	}

	@Override
	public List<Dependiente> getElementos() {
		return crearVariosDependientes();
	}

}
