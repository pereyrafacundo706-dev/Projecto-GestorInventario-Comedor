package Software_SGIC;

import java.util.List;

public class Plato {

	String nombre;
	String tipo;
	String receta;
	int id;
	String[] nombreIng; 
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getReceta() {
		return receta;
	}
	public void setReceta(String receta) {
		this.receta = receta;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String[] getNombreIng() {
		return nombreIng;
	}
	public void setNombreIng(String[] nombreIng) {
		this.nombreIng = nombreIng;
	}
	public Plato(String nombre, String tipo, String receta, int id, String[] nombreIng) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.receta = receta;
		this.id = id;
		this.nombreIng = nombreIng;
	}
	
	
	
}
