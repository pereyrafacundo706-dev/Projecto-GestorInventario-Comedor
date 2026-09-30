package Software_SGIC;

public class Menu {

	int id;
	String nombre;
	Plato[] plato;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Plato[] getPlato() {
		return plato;
	}
	public void setPlato(Plato[] plato) {
		this.plato = plato;
	}
	public Menu(int id, String nombre, Plato[] plato) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.plato = plato;
	}
	
	
}
