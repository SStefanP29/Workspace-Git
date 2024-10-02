package modelo.dominio;

public class PedidoComercial extends Pedido {
	// propiedades
	private Vendedor vendedor;

	public PedidoComercial(int numeroDeSerie, String fecha, Persona cliente, float cuantiaTotal, Vendedor vendedor) {
		super(numeroDeSerie, fecha, cliente, cuantiaTotal);
		this.vendedor = vendedor;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	@Override
	public boolean equalKey(Integer keyable) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		return "PedidoComercial [vendedor=" + vendedor + "]";
	}
}
