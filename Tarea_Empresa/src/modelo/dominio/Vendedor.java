package modelo.dominio;

public class Vendedor extends Persona {
	private Ruta ruta;

	public Vendedor(String dNICliente, String nombre, Ruta ruta) {
		super(dNICliente, nombre);
		this.ruta = ruta;
	}

	public Ruta getRuta() {
		return ruta;
	}

	public void setRuta(Ruta ruta) {
		this.ruta = ruta;
	}

	@Override
	public String toString() {
		return "Vendedor [ruta=" + ruta + "]";
	}

}
