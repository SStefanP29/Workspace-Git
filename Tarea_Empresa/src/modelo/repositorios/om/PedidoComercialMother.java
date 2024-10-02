package modelo.repositorios.om;

import java.util.ArrayList;
import java.util.List;

import modelo.dominio.PedidoComercial;
import modelo.dominio.Persona;
import modelo.dominio.Vendedor;
import modelo.repositorios.Populable;

public class PedidoComercialMother implements Populable<PedidoComercial> {

	public List<PedidoComercial> crearVariosPedidosComerciales() {

		PersonaMother personaMother = new PersonaMother();
		List<Persona> personas = personaMother.getElementos();

		VendedorMother vendedorMother = new VendedorMother();
		List<Vendedor> vendedores = vendedorMother.getElementos();

		List<PedidoComercial> pedidosComerciales = new ArrayList<PedidoComercial>();
		pedidosComerciales.add(new PedidoComercial(1001, "2024-10-01", personas.get(0), 1000f, vendedores.get(0)));
		pedidosComerciales.add(new PedidoComercial(1002, "2024-10-02", personas.get(1), 1200f, vendedores.get(1)));
		pedidosComerciales.add(new PedidoComercial(1003, "2024-10-03", personas.get(2), 1500f, vendedores.get(2)));
		pedidosComerciales.add(new PedidoComercial(1004, "2024-10-04", personas.get(3), 1100f, vendedores.get(3)));
		pedidosComerciales.add(new PedidoComercial(1005, "2024-10-05", personas.get(4), 1300f, vendedores.get(4)));
		pedidosComerciales.add(new PedidoComercial(1006, "2024-10-06", personas.get(5), 1700f, vendedores.get(5)));
		pedidosComerciales.add(new PedidoComercial(1007, "2024-10-07", personas.get(6), 1600f, vendedores.get(6)));
		pedidosComerciales.add(new PedidoComercial(1008, "2024-10-08", personas.get(7), 1900f, vendedores.get(7)));
		pedidosComerciales.add(new PedidoComercial(1009, "2024-10-09", personas.get(8), 2100f, vendedores.get(8)));
		pedidosComerciales.add(new PedidoComercial(1010, "2024-10-10", personas.get(9), 1000f, vendedores.get(9)));
		pedidosComerciales.add(new PedidoComercial(1011, "2024-10-11", personas.get(10), 2300f, vendedores.get(10)));
		pedidosComerciales.add(new PedidoComercial(1012, "2024-10-12", personas.get(11), 1800f, vendedores.get(11)));
		pedidosComerciales.add(new PedidoComercial(1013, "2024-10-13", personas.get(12), 1400f, vendedores.get(12)));
		pedidosComerciales.add(new PedidoComercial(1014, "2024-10-14", personas.get(13), 2400f, vendedores.get(13)));
		pedidosComerciales.add(new PedidoComercial(1015, "2024-10-15", personas.get(14), 2000f, vendedores.get(14)));
		return pedidosComerciales;
	}

	@Override
	public List<PedidoComercial> getElementos() {
		return crearVariosPedidosComerciales();
	}
}
