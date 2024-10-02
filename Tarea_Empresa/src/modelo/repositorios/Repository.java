package modelo.repositorios;

import java.util.Optional;

public interface Repository<T, S> {
	// CRUD
	public boolean agregar(T objeto);

	public Optional<T> getByKey(S key);

	public boolean update(T objeto);

	public Optional<T> delete(S key);
}
