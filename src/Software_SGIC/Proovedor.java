package Software_SGIC;

public class Proovedor {

	String nombreProovedor;
	int telefono;
	String correoElectronico;

	public String getNombreProovedor() {
		return nombreProovedor;
	}

	public void setNombreProovedor(String nombreProovedor) {
		this.nombreProovedor = nombreProovedor;
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

	public Proovedor(String nombreProovedor, int telefono, String correoElectronico) {
		super();
		this.nombreProovedor = nombreProovedor;
		this.telefono = telefono;
		this.correoElectronico = correoElectronico;
	}

}
