package main;


public class Equipo {
	
	private ListaJugadores jugadores;
	private String entrenador;
	private String patrocinador;
	private String presidente;
	private int numTrofeos;
	private int numJugadores;
	private String nombre;
	private int numLiga;
	private int puntos;
	
		
		
	public String getNombre() {
		return nombre;
	}


	public Equipo(String nombre, ListaJugadores jugadores, String entrenador, String patrocinador, String presidente,
			int numTrofeos, int numJugadores) {
		this.jugadores = jugadores;
		this.entrenador = entrenador;
		this.patrocinador = patrocinador;
		this.presidente = presidente;
		this.numTrofeos = numTrofeos;
		this.numJugadores = numJugadores;
		this.nombre = nombre;
		numLiga=0;
		puntos=0;
	}
	public int getPuntos() {
		return puntos;
		
	}
	public void setPuntos(int puntos) {
		 this.puntos=this.puntos + puntos;
	}


	public int getNumLiga() {
		return numLiga;
	}


	public void setNumLiga(int numLiga) {
		this.numLiga = numLiga;
	}


	public ListaJugadores getJugadores() {
		return jugadores;
	}
	


	public void setJugadores(ListaJugadores jugadores) {
		this.jugadores = jugadores;
	}


	public String getEntrenador() {
		return entrenador;
	}


	public void setEntrenador(String entrenador) {
		this.entrenador = entrenador;
	}


	public String getPatrocinador() {
		return patrocinador;
	}


	public void setPatrocinador(String patrocinador) {
		this.patrocinador = patrocinador;
	}


	public String getPresidente() {
		return presidente;
	}


	public void setPresidente(String presidente) {
		this.presidente = presidente;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getNumTrofeos() {
		return numTrofeos;
	}


	public void setNumTrofeos(int numTrofeos) {
		this.numTrofeos = numTrofeos;
	}


	public int getNumJugadores() {
		return numJugadores;
	}


	public void setNumJugadores(int numJugadores) {
		this.numJugadores = numJugadores;
	}
	
	public String nombreEquipo() {
		return nombre;
		
	}
	
	
	@Override
	public String toString() {
		return "\n\n" + nombre +" \nINFORMACIÓN \n" + jugadores
				+" entrenador=" + entrenador + ", patrocinador=" + patrocinador
				+ ", presidente=" + presidente + ", numTrofeos=" + numTrofeos + ", numJugadores=" + numJugadores + "]"+"numLiga="+numLiga;
	
	}	
	
	
	

}
