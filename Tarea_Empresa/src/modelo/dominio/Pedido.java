package modelo.dominio;

import modelo.repositorios.Keyable;

public abstract class Pedido implements Keyable<Integer> { // De pedido no hacemos OM porque la clase es abstracta
	// propiedades
	private int numeroDeSerie;
	private String fecha;
	private Persona cliente;
	private float cuantiaTotal;

	public Pedido(int numeroDeSerie, String fecha, Persona cliente, float cuantiaTotal) {
		super();
		this.numeroDeSerie = numeroDeSerie;
		this.fecha = fecha;
		this.cliente = cliente;
		this.cuantiaTotal = cuantiaTotal;
	}

	public int getNumeroDeSerie() {
		return numeroDeSerie;
	}

	public void setNumeroDeSerie(int numeroDeSerie) {
		this.numeroDeSerie = numeroDeSerie;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Persona getCliente() {
		return cliente;
	}

	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}

	public float getCuantiaTotal() {
		return cuantiaTotal;
	}

	public void setCuantiaTotal(float cuantiaTotal) {
		this.cuantiaTotal = cuantiaTotal;
	}

	@Override
	public String toString() {
		return "Pedido [numeroDeSerie=" + numeroDeSerie + ", fecha=" + fecha + ", cliente=" + cliente
				+ ", cuantiaTotal=" + cuantiaTotal + "]";
	}
}
