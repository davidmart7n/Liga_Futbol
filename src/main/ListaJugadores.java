










package main;

import java.util.Arrays;

public class ListaJugadores {
	
	private int numJugadores;
	private Jugador[]lista;
	
	//Constructor
	public ListaJugadores(int n) {
		
		this.numJugadores=0;
		this.lista=new Jugador[n];
		
	}
	public void imprimirLista() {
		
		for(int i=0;i<lista.length;i++) {
			System.out.println(lista[i]+"  "+i);
		}
		
	}
	public int getNumJugadores() {
		return numJugadores;
	}
	public void setNumJugadores(int numJugadores) {
		this.numJugadores = numJugadores;
	}
	public Jugador[] getLista() {
		return lista;
	}
	
	public Jugador seleccionarJugador(int num) {
		return lista[num];
	}
	public void setLista(Jugador[] lista) {
		this.lista = lista;
	}
	public void anadirJugador(Jugador nuevo) {
		if (numJugadores<lista.length){
			lista[numJugadores]=nuevo;
			numJugadores++;
		}
	}
	public void expulsarJugador(Jugador expulsado) {
		
		boolean encontrado= false;
		int i=0;
		
		if(expulsado==lista[0]) {
			encontrado=true;
		}
		while ((encontrado==false)&&(i>lista.length)) {
				
				if (expulsado==lista[i]) {
					encontrado=true;	
				}
				else i++;}
			
			for(int z=0;z>lista.length;z++) {
		
					if(lista[z]==lista[i]) {
						lista[z]=lista[z+1];
						i++;
		}
	}
	}
	@Override
	public String toString() {
		return "Número de jugadores=" + numJugadores + 
				"\nlista:" + Arrays.toString(lista) + "]";
	}
		
	}
	

