package u6.u7.entregable;

import java.util.LinkedList;
import java.util.List;

public class Artista {
	public enum estilos_musicales{POP, ROCK, INDIE}
	private estilos_musicales estilo_asociado;
	private int coste;
	private String nombre;
	private Manager manager_asociado;
	private List<Musico> lista_musicos;
	
	public Artista(String nombre, estilos_musicales estilo, int coste, Manager manager) {
		this.nombre = nombre;
		this.estilo_asociado = estilo;
		this.coste = coste;
		this.manager_asociado = manager;
		this.lista_musicos  = new LinkedList<Musico>();
	}
	
	public void addMusico(Musico musico) {
		this.lista_musicos.add(musico);
	}
	
	public void delMusico(Musico musico) {
		this.lista_musicos.remove(musico);
	}
	
	public void imprimeMusicos(){
		for(Musico a : this.lista_musicos) {
			System.out.println(a.getNombre());
		}
	}

	public estilos_musicales getEstilo_asociado() {
		return estilo_asociado;
	}

	public void setEstilo_asociado(estilos_musicales estilo_asociado) {
		this.estilo_asociado = estilo_asociado;
	}

	public int getCoste() {
		return coste;
	}

	public void setCoste(int coste) {
		this.coste = coste;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getManager_asociado() {
		return manager_asociado.getNombre();
	}

	public void setManager_asociado(Manager manager_asociado) {
		this.manager_asociado = manager_asociado;
	}

	public List<Musico> getLista_musicos() {
		return lista_musicos;
	}

	public void setLista_musicos(List<Musico> lista_musicos) {
		this.lista_musicos = lista_musicos;
	}
}
