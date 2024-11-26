package gestion_jornadas;

import java.util.Random;

import main.ListaEquipos;

public class Jornada {
	
	ListaEquipos equipos;
	ListaPartidos partidos;
	
	public Jornada (ListaEquipos equipos, int maxEquipos) {
		
		this.equipos=equipos;
		int[]asignados = new int [maxEquipos];
		int j=0,rand,z;
		boolean haSidoAsignado;
		
for (int i=0; i<maxEquipos; i++) {
			
			rand = (int)(Math.random()*(maxEquipos+1))+1;
			
			haSidoAsignado = false;
			z = 0;
			while ( z<maxEquipos && !haSidoAsignado ) {
				if (rand == asignados[z]) {
					haSidoAsignado = true;
				}else {
					z++;
				}
			}
			if(!haSidoAsignado) {
				equipos.seleccionarEquipo(j).setNumLiga(rand);
				asignados[j] = rand;
				
				j++;
			}
			
			if(haSidoAsignado) {
				
				
				
				
			}
		}
	}}