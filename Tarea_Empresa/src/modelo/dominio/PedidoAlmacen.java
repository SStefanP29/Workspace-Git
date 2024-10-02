package modelo.dominio;

public class PedidoAlmacen extends Pedido {
	private Dependiente dependiente;

	public PedidoAlmacen(int numeroDeSerie, String fecha, Persona cliente, float cuantiaTotal,
			Dependiente dependiente) {
		super(numeroDeSerie, fecha, cliente, cuantiaTotal);
		this.dependiente = dependiente;
	}

	public Dependiente getDependiente() {
		return dependiente;
	}

	public void setDependiente(Dependiente dependiente) {
		this.dependiente = dependiente;
	}

	@Override
	public String toString() {
		return "PedidoAlmacen [dependiente=" + dependiente + "]";
	}

	@Override
	public boolean equalKey(Integer keyable) {
		// TODO Auto-generated method stub
		return false;
	}

}
