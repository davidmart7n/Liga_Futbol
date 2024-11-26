package gestion_jornadas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import main.Equipo;
import main.ListaEquipos;

public class Clasificaciones {
	
	Equipo[]clasificacion= new Equipo[6];
	
	
 public Clasificaciones(ListaEquipos lista) {
	 List<Equipo> listaEquipos = new ArrayList<>();
	 
	 listaEquipos.add(lista.seleccionarEquipo(0));
	 listaEquipos.add(lista.seleccionarEquipo(1));
	 listaEquipos.add(lista.seleccionarEquipo(2));
	 listaEquipos.add(lista.seleccionarEquipo(3));
	 listaEquipos.add(lista.seleccionarEquipo(4));
	 listaEquipos.add(lista.seleccionarEquipo(5));
	 
	Collections.sort(listaEquipos, new Comparator<Equipo>() {

		@Override
		public int compare(Equipo o1, Equipo o2) {
			// TODO Auto-generated method stub2
			return Integer.compare(o2.getPuntos(), o1.getPuntos());
		}
		
	}); 
	
		for (Equipo equipo : listaEquipos) {
			System.out.println(equipo.getPuntos());
		
			
		}
	 
	}
	
	
}


