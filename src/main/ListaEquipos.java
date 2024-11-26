package main;

import java.util.Arrays;

public class ListaEquipos {
	
	private Equipo[]lista;
	private int numEquipos;
	
	public ListaEquipos(int n) {
		numEquipos=0;
		lista= new Equipo[n];
		
	
	
	
	
	}

	public Equipo[] getLista() {
		return lista;
	}

	public void setLista(Equipo[] lista) {
		this.lista = lista;
	}

	public int getNumEquipos() {
		return numEquipos;
	}

	public void setNumEquipos(int numEquipos) {
		this.numEquipos = numEquipos;
	
	}
	
	public Equipo seleccionarEquipo(int num) {
		return lista[num];
		}
	
	@Override
	public String toString() {
		return "EQUIPOS INSCRITOS TEMPORADA 23/24 \n\n LISTA " + Arrays.toString(lista) + "\n\n numEquipos=" + numEquipos;
	}
	
	public void anadirEquipo(Equipo eqnuevo) {
		
		if(numEquipos< lista.length) {
			lista[numEquipos]= eqnuevo;
			numEquipos++;
			
	}
	
	}

}
