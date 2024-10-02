package modelo.repositorios.om;

import java.util.ArrayList;
import java.util.List;

import modelo.dominio.Dependiente;
import modelo.dominio.PedidoAlmacen;
import modelo.dominio.Persona;
import modelo.repositorios.Populable;

public class PedidoAlmacenMother implements Populable<PedidoAlmacen> {

	public List<PedidoAlmacen> crearVariosPedidosAlmacen() {
		PersonaMother personaMother = new PersonaMother();
		List<Persona> personas = personaMother.getElementos();
		DependienteMother dependienteMother = new DependienteMother();
		List<Dependiente> dependientes = dependienteMother.getElementos();

		List<PedidoAlmacen> pedidosAlmacen = new ArrayList<PedidoAlmacen>();
		pedidosAlmacen.add(new PedidoAlmacen(1001, "2024-10-01", personas.get(0), 1000f, dependientes.get(0)));
		pedidosAlmacen.add(new PedidoAlmacen(1002, "2024-10-02", personas.get(1), 1200f, dependientes.get(1)));
		pedidosAlmacen.add(new PedidoAlmacen(1003, "2024-10-03", personas.get(2), 1500f, dependientes.get(2)));
		pedidosAlmacen.add(new PedidoAlmacen(1004, "2024-10-04", personas.get(3), 1100f, dependientes.get(3)));
		pedidosAlmacen.add(new PedidoAlmacen(1005, "2024-10-05", personas.get(4), 1300f, dependientes.get(4)));
		pedidosAlmacen.add(new PedidoAlmacen(1006, "2024-10-06", personas.get(5), 1700f, dependientes.get(5)));
		pedidosAlmacen.add(new PedidoAlmacen(1007, "2024-10-07", personas.get(6), 1600f, dependientes.get(6)));
		pedidosAlmacen.add(new PedidoAlmacen(1008, "2024-10-08", personas.get(7), 1900f, dependientes.get(7)));
		pedidosAlmacen.add(new PedidoAlmacen(1009, "2024-10-09", personas.get(8), 2100f, dependientes.get(8)));
		pedidosAlmacen.add(new PedidoAlmacen(1010, "2024-10-10", personas.get(9), 1000f, dependientes.get(9)));
		pedidosAlmacen.add(new PedidoAlmacen(1011, "2024-10-11", personas.get(10), 2300f, dependientes.get(10)));
		pedidosAlmacen.add(new PedidoAlmacen(1012, "2024-10-12", personas.get(11), 1800f, dependientes.get(11)));
		pedidosAlmacen.add(new PedidoAlmacen(1013, "2024-10-13", personas.get(12), 1400f, dependientes.get(12)));
		pedidosAlmacen.add(new PedidoAlmacen(1014, "2024-10-14", personas.get(13), 2400f, dependientes.get(13)));
		pedidosAlmacen.add(new PedidoAlmacen(1015, "2024-10-15", personas.get(14), 2000f, dependientes.get(14)));
		return pedidosAlmacen;
	}

	@Override
	public List<PedidoAlmacen> getElementos() {
		return crearVariosPedidosAlmacen();
	}

}
