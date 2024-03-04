package u6.u7.entregable;

public class Manager {
	private String nombre;
	private int tlfn_contacto;
	
	public Manager(String nombre, int tlfn) {
		this.nombre = nombre;
		this.tlfn_contacto = tlfn;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTlfn_contacto() {
		return tlfn_contacto;
	}

	public void setTlfn_contacto(int tlfn_contacto) {
		this.tlfn_contacto = tlfn_contacto;
	}
	
}
