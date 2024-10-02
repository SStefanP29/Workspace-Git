package modelo.dominio;

public class Dependiente extends Persona {
	private int numeroMostrador;

	public Dependiente(String dNICliente, String nombre, int numeroMostrador) {
		super(dNICliente, nombre);
		this.numeroMostrador = numeroMostrador;
	}

	public int getNumeroMostrador() {
		return numeroMostrador;
	}

	public void setNumeroMostrador(int numeroMostrador) {
		this.numeroMostrador = numeroMostrador;
	}

	@Override
	public String toString() {
		return super.toString() + "Dependiente [numeroMostrador=" + numeroMostrador + "]";
	}
}
