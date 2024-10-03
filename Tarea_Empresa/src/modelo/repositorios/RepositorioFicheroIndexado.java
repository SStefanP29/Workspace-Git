package modelo.repositorios;

import java.util.Optional;

public class RepositorioFicheroIndexado<T extends Keyable<S>, S> implements Repository<T, S> {

	@Override
	public boolean agregar(T objeto) {
		return false;
	}

	@Override
	public Optional<T> getByKey(S key) {
		return Optional.empty();
	}

	@Override
	public boolean update(T objeto) {
		return false;
	}

	@Override
	public Optional<T> delete(S key) {
		return Optional.empty();
	}
}
