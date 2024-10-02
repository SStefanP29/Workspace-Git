package test;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelo.dominio.Articulo;
import modelo.repositorios.RepositorioLista;
import modelo.repositorios.om.ArticuloMother;

class RepositorioListaArticuloTest {

	ArticuloMother articuloMother = new ArticuloMother();
	List<Articulo> elementosExtraidos;
	RepositorioLista<Articulo, Long> repositorioListaArticulo;

	@BeforeEach
	void setUp() throws Exception {
		repositorioListaArticulo = new RepositorioLista<Articulo, Long>(articuloMother);
		elementosExtraidos = repositorioListaArticulo.getElementos();
	}

	@Test
	void testAdd() {
		Articulo articuloNuevoUno = new Articulo(12l, "Descripción muy larga", 104.4f);
		repositorioListaArticulo.agregar(articuloNuevoUno);
		assertTrue(elementosExtraidos.contains(articuloNuevoUno));
	}

	@Test
	void testGetByKey() {
		Articulo articuloExtraido = elementosExtraidos.get(3);
		Long idExtraido = articuloExtraido.getId();
		Optional<Articulo> articuloParaComprobar = repositorioListaArticulo.getByKey(idExtraido);
		assertTrue(articuloParaComprobar.isPresent());
	}

	@Test
	void testUpdate() {
		Articulo articuloExtraido = elementosExtraidos.get(5);
		Long idExtraido = articuloExtraido.getId();
		Articulo articuloActualizado = new Articulo(idExtraido, "HOLAHOLA", 12f);
		boolean update = repositorioListaArticulo.update2(articuloActualizado, idExtraido);
		assertTrue(update);
	}

	@Test
	void testDelete() {
		Articulo articuloExtraido = elementosExtraidos.get(5);
		Long idExtraido = articuloExtraido.getId();
		Optional<Articulo> articuloParaEliminar = repositorioListaArticulo.delete(idExtraido);
		assertTrue(articuloParaEliminar.isPresent());
	}
}
