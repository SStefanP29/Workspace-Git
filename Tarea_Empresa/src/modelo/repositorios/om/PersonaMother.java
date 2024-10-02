package modelo.repositorios.om;

import java.util.ArrayList;
import java.util.List;

import modelo.dominio.Persona;
import modelo.repositorios.Populable;

public class PersonaMother implements Populable<Persona> {

	// Método para obtener una lista de 15 personas
	public List<Persona> crearVariasPersonas() { // Quitamos que sea estático
		List<Persona> personas = new ArrayList<>();

		personas.add(new Persona("12345678A", "Juan Pérez"));
		personas.add(new Persona("23456789B", "María López"));
		personas.add(new Persona("34567890C", "Carlos García"));
		personas.add(new Persona("45678901D", "Ana González"));
		personas.add(new Persona("56789012E", "Pedro Martínez"));
		personas.add(new Persona("67890123F", "Lucía Fernández"));
		personas.add(new Persona("78901234G", "José Rodríguez"));
		personas.add(new Persona("89012345H", "Sara Sánchez"));
		personas.add(new Persona("90123456I", "David Ramírez"));
		personas.add(new Persona("01234567J", "Laura Herrera"));
		personas.add(new Persona("11111111K", "Luis Torres"));
		personas.add(new Persona("22222222L", "Carmen Díaz"));
		personas.add(new Persona("33333333M", "Jorge Ruiz"));
		personas.add(new Persona("44444444N", "Sofía Morales"));
		personas.add(new Persona("55555555O", "Manuel Ortega"));

		return personas;
	}

	@Override
	public List<Persona> getElementos() {

		return crearVariasPersonas();
	}
}
