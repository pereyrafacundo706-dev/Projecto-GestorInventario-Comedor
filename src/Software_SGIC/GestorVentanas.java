package Software_SGIC;

import javax.swing.table.DefaultTableModel;

public class GestorVentanas {

	Mysql bdComedor = new Mysql();

	public static void main(String[] args) {

		VentanaPrincipal ventanaInicio = new VentanaPrincipal();
		ventanaInicio.setVisible(true);

	}

	public void listarProovedores(DefaultTableModel tabla) {

		bdComedor.listarProovedores(tabla);

	}

	public boolean altaProovedores(String n, int t, String c) {

		boolean exito = false;

		if (n.length() < 3) {
			exito = false;

		} else {
			bdComedor.altaProovedor(n, t, c);

		}

		return exito;

	}

	public void listarIngredientes(DefaultTableModel tabla) {

		bdComedor.listarIngredientes(tabla);

	}
	
	public void listarIngredientesPlato(DefaultTableModel tabla) {

		bdComedor.listarIngredientesPlato(tabla);

	}
	
	public void listarPlatosMenu(DefaultTableModel tabla) {

		bdComedor.listarPlatoMenu(tabla);

	}

	public boolean altaIngredientes(String nIng, String sabor, String fechaVencimiento, double cantidad, String tipoMedida, String aptoVeganos, String aptoDiabeticos, String libreGluten) {

		boolean exito = false;

		if (nIng.length() < 3) {
			exito = false;

		} else {
			bdComedor.altaIngredientes(nIng, sabor, fechaVencimiento, cantidad, tipoMedida, aptoVeganos, aptoDiabeticos, libreGluten);

		}

		return exito;

	}

	public void listarDepositos(DefaultTableModel tabla) {

		bdComedor.listarDepositos(tabla);

	}
	
	public void listarPlatos(DefaultTableModel tabla) {

		bdComedor.listarPlatos(tabla);

	}
	
	public void listarMenu(DefaultTableModel tabla) {

		bdComedor.listarMenu(tabla);

	}

	public boolean altaDepositos(String nombreAlmacenamiento, String tipoAlmacenamiento) {

		boolean exito = false;

		if (nombreAlmacenamiento.length() < 3) {
			exito = false;

		} else {
			bdComedor.altaDepositos(nombreAlmacenamiento, tipoAlmacenamiento);

		}
		return exito;

	}
	
	public void altaPlatos(String nombrePlato, String tipoPlato, String receta) {
		
		bdComedor.altaPlatos(nombrePlato, tipoPlato, receta);
	}
	
	public void altaMenu(String nombreMenu) {
		bdComedor.altaMenu(nombreMenu);
	}
	
	public void eliminarProv(int teléfono) {
		bdComedor.eliminarProveedor(teléfono);
	}
	
	public void eliminarPlato(int id) {
		bdComedor.eliminarPlato(id);
	}
	
	public void eliminarIngrediente(int id) {
		bdComedor.eliminarIngrediente(id);
	}
	
	public void eliminarMenu(int id) {
		bdComedor.eliminarMenu(id);
	}
	
	public void eliminarDeposito(int id) {
		bdComedor.eliminarDeposito(id);
	}
	
	

}
