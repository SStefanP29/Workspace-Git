package modelo.dominio;

import java.util.Objects;

import modelo.repositorios.Keyable;

public class Persona implements Keyable<String> { // Como de Persona, extienden Dependiente y Vendedor, no hace falta
													// que estos implementen Keyable(), ya que lo hace su padre
	private String dni;
	private String nombre;

	public Persona(String dNICliente, String nombre) {
		super();
		this.dni = dNICliente;
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(dni, other.dni);
	}

	@Override
	public boolean equalKey(String keyable) {
		return this.getDni().equals(keyable);
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}

}
