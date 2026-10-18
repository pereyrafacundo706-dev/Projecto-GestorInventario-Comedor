package Software_SGIC;

public class Proveedor {

	String nombreProveedor;
	int telefono;
	String correoElectronico;

	public String getNombreProovedor() {
		return nombreProveedor;
	}

	public void setNombreProovedor(String nombreProovedor) {
		this.nombreProveedor = nombreProovedor;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public Proveedor(String nombreProveedor, int telefono, String correoElectronico) {
		super();
		this.nombreProveedor = nombreProveedor;
		this.telefono = telefono;
		this.correoElectronico = correoElectronico;
	}

}
