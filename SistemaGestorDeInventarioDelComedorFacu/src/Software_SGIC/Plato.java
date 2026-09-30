package Software_SGIC;

import java.util.List;

public class Plato {

	String nombre;
	String tipo;
	String receta;
	int id;
	Ingrediente[] ing; 
	
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
	public Ingrediente[] getIng() {
		return ing;
	}
	public void setIng(Ingrediente[] ing) {
		this.ing = ing;
	} 
	

	
	
	
	public Plato(String nombre, String tipo, String receta, int id, Ingrediente[] ing) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.receta = receta;
		this.id = id;
		this.ing = ing;
	}
	
	
	
}
