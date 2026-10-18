package Software_SGIC;

import java.sql.*;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Mysql {

	private final String DB_URL = "jdbc:mysql://localhost:3306/bdSGIC?useSSL=false";
	private final String DB_USER = "root";
	private final String DB_PASS = "";

	private Connection getConnection() throws SQLException {

		return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

	}

	public void listarProovedores(DefaultTableModel tabla) {

		String sentencia = "SELECT nombreProv, telProv, correoProv FROM proovedores";

		try {

			Connection conexion = getConnection();
			PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia);
			ResultSet rs = declaracionSQL.executeQuery();

			tabla.setRowCount(0);

			while (rs.next()) {
				String nombreProv = rs.getString(1);
				String telProv = rs.getString(2);
				String correoProv = rs.getString(3);

				Object[] fila = { nombreProv, telProv, correoProv };
				tabla.addRow(fila);

			}
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());

		}

	}

	public void altaProovedor(String n, int t, String c) {

		String sentencia = "INSERT INTO proovedores(nombreProv, telProv, correoProv) VALUES('" + n + "'," + t + ",'" + c
				+ "');";
		System.out.println(sentencia);
		try {

			Connection conexion = getConnection();
			PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia);

			declaracionSQL.executeUpdate();

		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());

		}

	}

	public void listarIngredientes(DefaultTableModel tabla) {

		String sentencia = "SELECT nombreIngrediente, cantidad, tipoMedida, fechaVencimiento, idIngrediente FROM ingrediente";

		try {

			Connection conexion = getConnection();
			PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia);
			ResultSet rs = declaracionSQL.executeQuery();

			tabla.setRowCount(0);

			while (rs.next()) {
				String nombreIngrediente = rs.getString(1);
				double cantidad = rs.getDouble(2);
				String tipoMedida = rs.getString(3);
				String fechaVencimiento = rs.getString(4);
				int idIngrediente = rs.getInt(5);

				Object[] fila = { nombreIngrediente, cantidad + tipoMedida, fechaVencimiento, idIngrediente };
				tabla.addRow(fila);

			}
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());

		}
	}

	public void listarIngredientesPlato(DefaultTableModel tabla) {

		String sentencia = "SELECT nombreIngrediente, idIngrediente FROM ingrediente";

		try {

			Connection conexion = getConnection();
			PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia);
			ResultSet rs = declaracionSQL.executeQuery();

			tabla.setRowCount(0);

			while (rs.next()) {
				String nombreIngrediente = rs.getString(1);
				int idIngrediente = rs.getInt(2);

				Object[] fila = {idIngrediente, nombreIngrediente};
				tabla.addRow(fila);

			}
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());

		}

	}
	
	public void listarPlatoMenu(DefaultTableModel tabla) {

		String sentencia = "SELECT nombrePlato, idPlato FROM plato";

		try {

			Connection conexion = getConnection();
			PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia);
			ResultSet rs = declaracionSQL.executeQuery();

			tabla.setRowCount(0);

			while (rs.next()) {
				String nombrePlato = rs.getString(1);
				int idPlato = rs.getInt(2);

				Object[] fila = {idPlato, nombrePlato};
				tabla.addRow(fila);

			}
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());

		}

	}

	public void altaIngredientes(String nIng, String sabor, String fechaVencimiento, double cantidad, String tipoMedida,
			String aptoVeganos, String aptoDiabeticos, String libreGluten) {

		String sentencia = "INSERT INTO ingrediente(nombreIngrediente, sabor, fechaVencimiento, cantidad, tipoMedida, aptoVeganos, aptoDiabeticos, libreGluten) VALUES('"
				+ nIng + "','" + sabor + "','" + fechaVencimiento + "'," + cantidad + ",'" + tipoMedida + "','"
				+ aptoVeganos + "','" + aptoDiabeticos + "','" + libreGluten + "');";
		System.out.println(sentencia);
		try {

			Connection conexion = getConnection();
			PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia);

			declaracionSQL.executeUpdate();

		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());

		}

	}

	public void listarDepositos(DefaultTableModel tabla) {

		String sentencia = "SELECT nombreAlmacenamiento, tipoAlmacenamiento, idAlmacenamiento FROM almacenamiento";

		try {

			Connection conexion = getConnection();
			PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia);
			ResultSet rs = declaracionSQL.executeQuery();

			tabla.setRowCount(0);

			while (rs.next()) {

				String nombreAlmacenamiento = rs.getString(1);
				String tipoAlmacenamiento = rs.getString(2);
				int idAlmacenamiento = rs.getInt(3);

				Object[] fila = { nombreAlmacenamiento, tipoAlmacenamiento, idAlmacenamiento };
				tabla.addRow(fila);

			}
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());

		}

	}

	public void altaDepositos(String nombreAlmacenamiento, String tipoAlmacenamiento) {

		String sentencia = "INSERT INTO almacenamiento(nombreAlmacenamiento, tipoAlmacenamiento) VALUES('"
				+ nombreAlmacenamiento + "','" + tipoAlmacenamiento + "');";
		System.out.println(sentencia);
		try {

			Connection conexion = getConnection();
			PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia);

			declaracionSQL.executeUpdate();

		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());

		}

	}
	
	public void altaPlatos(String nombrePlato, String tipoPlato, String receta) {
		
		String sentencia =  "INSERT INTO plato(nombrePlato, tipoPlato, receta) VALUES('"+ nombrePlato + "','" + tipoPlato + "','"+ receta + "');";
		
		try {
			
			Connection conexion = getConnection();
			PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia);
			
			declaracionSQL.executeUpdate();
			
		} catch (SQLException ex) {
			
			JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
			
		}
	}
	
	public void altaMenu(String nombreMenu) {
		
		String sentencia =  "INSERT INTO menu(nombreMenu) VALUES('"+ nombreMenu + "');";
		
		try {
			
			Connection conexion = getConnection();
			PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia);
			
			declaracionSQL.executeUpdate();
			
		} catch (SQLException ex) {
			
			JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
			
		}
	}
	
	public void listarPlatos(DefaultTableModel tabla) {

		String sentencia = "SELECT nombrePlato, tipoPlato, idPlato FROM plato";

		try {

			Connection conexion = getConnection();
			PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia);
			ResultSet rs = declaracionSQL.executeQuery();

			tabla.setRowCount(0);

			while (rs.next()) {

				String nombrePlato = rs.getString(1);
				String tipoPlato = rs.getString(2);
				int idPlato = rs.getInt(3);

				Object[] fila = { nombrePlato, tipoPlato, idPlato };
				tabla.addRow(fila);

			}
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());

		}

	}
	
	public void listarMenu(DefaultTableModel tabla) {

		String sentencia = "SELECT nombreMenu, idMenu FROM menu";

		try {

			Connection conexion = getConnection();
			PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia);
			ResultSet rs = declaracionSQL.executeQuery();

			tabla.setRowCount(0);

			while (rs.next()) {

				String nombreMenu = rs.getString(1);
				int idMenu = rs.getInt(2);

				Object[] fila = { nombreMenu, idMenu };
				tabla.addRow(fila);

			}
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());

		}

	}
	
	public void eliminarProveedor(int telProv) {
	    String sentencia = "DELETE FROM proovedores WHERE telProv = ?";
	    
	    try {
	        Connection conexion = getConnection();
	        PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia);
	        
	        declaracionSQL.setInt(1, telProv);
	        
	        declaracionSQL.executeUpdate();
	        
	        declaracionSQL.close();
	        conexion.close();
	        
	        JOptionPane.showMessageDialog(null, "Proveedor eliminado con exito.");
	        
	    } catch (SQLException ex) {
	        JOptionPane.showMessageDialog(null, "Error al eliminar: " + ex.getMessage());
	    }
	}
	
	public void eliminarPlato(int id) {
	    String sentencia = "DELETE FROM plato WHERE idPlato = ?";
	    
	    try {
	        Connection conexion = getConnection();
	        PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia);
	        
	        declaracionSQL.setInt(1, id);
	        
	        declaracionSQL.executeUpdate();
	        
	        declaracionSQL.close();
	        conexion.close();
	        
	        JOptionPane.showMessageDialog(null, "Plato eliminado con exito.");
	        
	    } catch (SQLException ex) {
	        JOptionPane.showMessageDialog(null, "Error al eliminar: " + ex.getMessage());
	    }
	}
	
	public void eliminarIngrediente(int id) {
	    String sentencia = "DELETE FROM ingrediente WHERE idIngrediente = ?";
	    
	    try {
	        Connection conexion = getConnection();
	        PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia);
	        
	        declaracionSQL.setInt(1, id);
	        
	        declaracionSQL.executeUpdate();
	        
	        declaracionSQL.close();
	        conexion.close();
	        
	        JOptionPane.showMessageDialog(null, "Ingrediente eliminado con exito.");
	        
	    } catch (SQLException ex) {
	        JOptionPane.showMessageDialog(null, "Error al eliminar: " + ex.getMessage());
	    }
	}
	
	public void eliminarMenu(int id) {
	    String sentencia = "DELETE FROM menu WHERE idMenu = ?";
	    
	    try {
	        Connection conexion = getConnection();
	        PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia);
	        
	        declaracionSQL.setInt(1, id);
	        
	        declaracionSQL.executeUpdate();
	        
	        declaracionSQL.close();
	        conexion.close();
	        
	        JOptionPane.showMessageDialog(null, "Menú eliminado con exito.");
	        
	    } catch (SQLException ex) {
	        JOptionPane.showMessageDialog(null, "Error al eliminar: " + ex.getMessage());
	    }
	}

	
	public void eliminarDeposito(int id) {
	    String sentencia = "DELETE FROM almacenamiento WHERE idAlmacenamiento = ?";
	    
	    try {
	        Connection conexion = getConnection();
	        PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia);
	        
	        declaracionSQL.setInt(1, id);
	        
	        declaracionSQL.executeUpdate();
	        
	        declaracionSQL.close();
	        conexion.close();
	        
	        JOptionPane.showMessageDialog(null, "Depósito eliminado con exito.");
	        
	    } catch (SQLException ex) {
	        JOptionPane.showMessageDialog(null, "Error al eliminar: " + ex.getMessage());
	    }
	}

}
