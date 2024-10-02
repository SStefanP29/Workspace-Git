package modelo.repositorios;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RepositorioLista<T extends Keyable<S>, S> implements Repository<T, S> {
	protected List<T> elementos;

	public RepositorioLista(Populable<T> populable) {
		super();
		this.elementos = populable.getElementos();
	}

	// Constructor vac�o por si queremos crear un objeto sin ning�n valor
	public RepositorioLista() {
		super();
		this.elementos = new ArrayList<T>();
	}

	@Override
	public boolean agregar(T objeto) {
		return elementos.add(objeto);
	}

	@Override
	public Optional<T> getByKey(S key) {
		return elementos.stream().filter((elemento) -> {
			return (elemento).equalKey(key);
		}).findFirst();
	}

	public boolean update2(T objeto, S llave) {
		if (delete(llave).isPresent()) {
			elementos.remove(objeto);
			return elementos.add(objeto);
		}
		return false;
	}

	@Override
	public boolean update(T objeto) {
		if (elementos.remove(objeto)) {
			return elementos.add(objeto);
		}
		return false;
	}

	@Override
	public Optional<T> delete(S key) {
		Optional<T> objetoEntero = getByKey(key);
		if (objetoEntero.isPresent()) {
			elementos.remove(objetoEntero.get());
			return objetoEntero;
		}
		return Optional.empty();
	}

	public List<T> getElementos() {
		return elementos;
	}

	public void setElementos(List<T> elementos) {
		this.elementos = elementos;
	}

}
