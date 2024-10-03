package test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelo.dominio.Dependiente;
import modelo.repositorios.RepositorioLista;
import modelo.repositorios.om.DependienteMother;

class RepositorioListaDependientesTest {
	// Como no parece tener ning�n estado mutable o
	// dependencias de configuraci�n externa, puedes
	// inicializarla directamente al momento de declarar
	// la variable de instancia. Es una buena pr�ctica
	// inicializar directamente objetos "inmutables" o
	// que no tienen dependencias que cambian de prueba
	// en prueba, ya que no es necesario recrearlos para
	// cada prueba. Al hacerlo directamente al declarar
	// la variable, se reduce el c�digo repetitivo
	DependienteMother dependienteMother = new DependienteMother();
	List<Dependiente> dependientes;
	RepositorioLista<Dependiente, String> repositorioListaDependiente;

	@BeforeEach
	void setUp() throws Exception {
		dependientes = repositorioListaDependiente.getElementos();
		repositorioListaDependiente = new RepositorioLista<Dependiente, String>(dependienteMother);
	}

	@Test
	void testAdd() {
		Dependiente dependienteNuevo = new Dependiente("1", "Bartolom�", 5);
		assertFalse(dependientes.contains(dependienteNuevo));
		dependientes.add(dependienteNuevo);
		assertTrue(dependientes.contains(dependienteNuevo));
	}

	@Test
	void testGetByKey() {
		// Con un dependiente existente
		Dependiente dependiente = dependientes.get(0);
		String dniComprobacion = dependiente.getDni();
		Optional<Dependiente> dependienteByKey = repositorioListaDependiente.getByKey(dniComprobacion);
		assertTrue(dependienteByKey.isPresent());
		// Con un dependiente no existente
		String dniInventadoNoExistente = "12345";
		Optional<Dependiente> dependienteNoExistente = repositorioListaDependiente.getByKey(dniInventadoNoExistente);
		assertTrue(dependienteNoExistente.isEmpty());
	}

	@Test
	void testUpdate() {
		// Actualizamos un dependiente que no existe, por lo que el resultado de la
		// actualizaci�n debe de ser false
		Dependiente dependienteActualizado = new Dependiente("1", "Bartolom�", 5);
		boolean updateDependienteNoExistente = repositorioListaDependiente.update(dependienteActualizado);
		assertFalse(updateDependienteNoExistente);

		// Actualizamos los datos de un dependiente que existe(dni existente), por lo
		// que el resultado de la actualizaci�n, debe ser true
		Dependiente dependienteExistente = dependientes.get(10);
		String dniDependienteExistente = dependienteExistente.getDni();
		boolean updateDependienteExistente = repositorioListaDependiente
				.update(new Dependiente(dniDependienteExistente, "Nuevo nombre", 10));
		assertTrue(updateDependienteExistente);
		Dependiente dependienteExtraido = dependientes.get(2);
		String dniExtraido = dependienteExtraido.getDni();
		Dependiente dependienteParaActualizar = new Dependiente(dniExtraido, "Stefan", 111);
		boolean actualizado = repositorioListaDependiente.update(dependienteParaActualizar);
		assertTrue(actualizado);
	}

	@Test
	void testDelete() {
		Dependiente dependiente = dependientes.get(0);
		String dniComprobacion = dependiente.getDni();
		Optional<Dependiente> dependienteParaBorrar = repositorioListaDependiente.delete(dniComprobacion);
		assertTrue(dependienteParaBorrar.isPresent());
	}
}
