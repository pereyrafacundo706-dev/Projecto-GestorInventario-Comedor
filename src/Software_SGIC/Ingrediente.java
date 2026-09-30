package Software_SGIC;

public class Ingrediente {
	
	String sabor;
	String tipoMedida;
	String aptoDiabeticos;
	String libreGluten;
	String nombre;
	double cantidad;
	String fechaVencimiento;
	int id;
	String proovedor;
	//fecha Ingreso
	
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public String getTipoMedida() {
		return tipoMedida;
	}
	public void setTipoMedida(String tipoMedida) {
		this.tipoMedida = tipoMedida;
	}
	
	public String getAptoDiabeticos() {
		return aptoDiabeticos;
	}
	public void setAptoDiabeticos(String aptoDiabeticos) {
		this.aptoDiabeticos = aptoDiabeticos;
	}
	public String getLibreGluten() {
		return libreGluten;
	}
	public void setLibreGluten(String libreGluten) {
		this.libreGluten = libreGluten;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public String getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProovedor() {
		return id;
	}
	public void setProovedor(String proovedor) {
		this.proovedor = proovedor;
	}
	public Ingrediente(String sabor, String tipoMedida, String aptoDiabeticos, String libreGluten, String nombre, double cantidad, String fechaVencimiento, int id, String proovedor) {
		super();
		this.sabor = sabor;
		this.tipoMedida = tipoMedida;
		this.aptoDiabeticos = aptoDiabeticos;
		this.libreGluten = libreGluten;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.fechaVencimiento = fechaVencimiento;
		this.id = id;
		this.proovedor = proovedor;
	}
	
	
}
