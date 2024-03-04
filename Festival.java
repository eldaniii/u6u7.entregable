package u6.u7.entregable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import u6.u7.entregable.Artista.estilos_musicales;

public class Festival {
	private String nombre;
	private int codPostal;
	private List<Artista> lista_total = new ArrayList<Artista>();
	private List<Artista> lista_pop = new ArrayList<Artista>();
	private List<Artista> lista_rock = new ArrayList<Artista>();
	private List<Artista> lista_indie = new ArrayList<Artista>();
	private HashMap<estilos_musicales, List<Artista>> conjunto_estilo;
	
	public Festival(String nombre, int codPostal) {
		this.nombre = nombre;
		this.codPostal = codPostal;
	}
	
	public void inscribeArtista(Artista.estilos_musicales estilo, Artista artista) {
		try {
			this.lista_total.add(artista);
			switch(estilo) {
				case POP: this.lista_pop.add(artista);
				break;
				case ROCK: this.lista_rock.add(artista);
				break;
				case INDIE: this.lista_indie.add(artista);
				break;
			}
		} catch (Exception e) {
			if (estilo!=artista.getEstilo_asociado()) System.out.println("ERROR. El estilo insertado por parámetro no coincide con el artista.");
		}
	}
	
	public void cuantosInscritos() {
		int contador = 0;
		for (Artista a : this.lista_total) contador++;
		System.out.println(contador);
	}
	
	public void artistasByCache(Artista.estilos_musicales estilo) {
		switch(estilo) {
		case POP: System.out.println(lista_pop);;
		break;
		case ROCK: System.out.println(lista_rock);
		break;
		case INDIE: System.out.println(lista_indie);
		break;
		}
	}
	
	public void artistasInscritos() {
		
		/*Iterator<Entry<estilos_musicales, List<Artista>>> it = conjunto_estilo.entrySet().iterator();
		 
	    while(it.hasNext()) {
	      Entry<estilos_musicales, List<Artista>> entry = it.next();
	      System.out.println(entry.getValue());
	    }*/
		
		for (Artista a : this.lista_total) System.out.println(a.getNombre());
	}
}
