package main;

//nombre de la clase
public class Jugador {
	
	//Atributos
	
	private int dorsal;
	private String nombre;
	private int edad;
	private String club;
	private Posicion posicion_principal;
	private Posicion posicion_secundaria;
	private Estado estado;
	private int goles=0;

	
	//Constructor
	public Jugador(String nombre, int edad, String club, int dorsal, Posicion posicion_principal, Posicion posicion_secundaria, 
			Estado estado) {

		this.dorsal = dorsal;
		this.nombre = nombre;
		this.posicion_principal = posicion_principal;
		this.posicion_secundaria = posicion_secundaria;
		this.estado = estado;
		this.club = club;
		this.edad = edad;
		this.goles=0;
	}

	//To String (devuelve los datos del jugador)
	
	public void haMarcado() {
		goles++;
	}
	public String getClub() {
		return club;
	}

	public String toString() {
		return "Jugador: "+nombre+" [dorsal=" + dorsal + ", edad=" + edad + ", club=" + club
				+ ", posicion_principal=" + posicion_principal + ", posicion_secundaria=" + posicion_secundaria
				+ ", estado=" + estado + "] \n";
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}
	
		

	
		
		}


