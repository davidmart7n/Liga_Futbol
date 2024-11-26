package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import gestion_jornadas.Jornada;

public class GestionGeneral {

	static Scanner teclado = new Scanner(System.in);
	final static int MAX_EQUIPOS = 6;
	// Atributos

	public static void main(String[] args) throws IOException {

		// Inicializaciones
		ListaEquipos listadoEquipos;
		ListaJugadores listaJugadores;
		Liga liga;
		
		char opcion = 0;

		// carga fichero

		listaJugadores = leerFicheroJugadores();
		
		
		listadoEquipos = crearEquipos(listaJugadores);
		
		leerFicheroClubes(listadoEquipos);
		
		
		
		//System.out.println(listadoEquipos);
		
		
		// Inicio Algoritmo
		mostrarCabecera();

		do {
			mostrarMenu();
			opcion = teclado.next().charAt(0);

			switch (opcion) {

			case 'a':
				System.out.println("Ha elegido Nueva Liga\n");
				liga=new Liga(listadoEquipos);
				
				
				break;

			case 'b':
				System.out.println();
				break;

			case 'c':
				break;

			case 'd':
				System.out.println("Ha elegido Mostrar Equipos");
				System.out.println(listadoEquipos);

				break;

			case 'e':
				System.out.println("Ha decidido salir del programa");
				break;

			default:
				System.out.println("La opcion elegida no existe\n por favor escoge una opción válida");

			}

		} while (opcion != 'e');

	}
	

	/***************************************************************************************
	 ************************* METODOS ADICIONALES
	 * 
	 * @return
	 * @throws IOException *******************************************
	 *****************************************************************************************/

	public static void mostrarCabecera() {

		System.out.println("\n\n***********************************************\n"
				+ "***************BIENVENIDO A LA LIGA DE DEIVID*********************\n"
				+ "**********************************************************\n");
	}

	public static void mostrarMenu() {

		System.out.println("a: Nueva Liga\n" + "b...\n" + "c...\n" + "d: Imprimir jugadores\n" + "e: salir\n\n");

	}

	public static ListaJugadores leerFicheroJugadores() throws IOException {

		String linea, nombre, equipo;
		int dorsal, edad = 0;
		Estado estado;
		Posicion principal, secundaria;
		Jugador j;
		ListaJugadores lista = new ListaJugadores(42);

		try {

			BufferedReader br = new BufferedReader(new FileReader("Info_Equipos.txt"));
			linea = br.readLine();
			while (linea != null) {

				StringTokenizer st = new StringTokenizer(linea, ",");
				while (st.hasMoreTokens()) {

					nombre = st.nextToken();
					edad = Integer.parseInt(st.nextToken());
					equipo = st.nextToken();
					dorsal = Integer.parseInt(st.nextToken());
					principal = Posicion.valueOf(st.nextToken());
					secundaria = Posicion.valueOf(st.nextToken());
					estado = Estado.valueOf(st.nextToken());

					j = new Jugador(nombre, edad, equipo, dorsal, principal, secundaria, estado);
					lista.anadirJugador(j);

				}
				linea = br.readLine();
				// System.out.println(linea);
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("No se ha encontrado el fichero\n");
		}
		return lista;
	}
	
	
	public static ListaEquipos leerFicheroClubes(ListaEquipos lista) throws IOException {
			
	
		String linea, nombre, presidente = null, entrenador = null, patrocinador = null;
		int z=0;
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader("Info_Clubes.txt"));
			linea = br.readLine();
			while (linea != null) {
	
				StringTokenizer st = new StringTokenizer(linea, ",");
				while (st.hasMoreTokens()) {
					
					
						nombre = st.nextToken();
					presidente = st.nextToken();
					entrenador = st.nextToken();
					patrocinador = st.nextToken();
					
					lista.seleccionarEquipo(z).setEntrenador(entrenador);
					lista.seleccionarEquipo(z).setPresidente(presidente);
					lista.seleccionarEquipo(z).setPatrocinador(patrocinador);
					
					z++;
			
					}
					linea=br.readLine();					}						
	
			
			
				
		br.close();

	
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("No se ha encontrado el fichero\n");
		}
		return lista;
		
	}
	

	public static ListaEquipos crearEquipos(ListaJugadores lista)  throws IOException {
		
		
		String linea, nombre, presidente = null, entrenador = null, patrocinador = null;
		
		ListaEquipos listaEquipos = new ListaEquipos(6); // Max Equipos 
		
		Equipo Barcelona, Madrid, Atletico, Villareal, Sevilla, Rayo;

		ListaJugadores bcn = new ListaJugadores(10), ray = new ListaJugadores(10), mad = new ListaJugadores(10),
				atl = new ListaJugadores(10), vil = new ListaJugadores(10), sev = new ListaJugadores(10);

		Jugador jug;

		for (int i = 0; i < lista.getLista().length; i++) {

			jug = lista.seleccionarJugador(i);

			switch (jug.getClub()) {

			case "Barcelona":
				bcn.anadirJugador(jug);
				break;

			case "Madrid":
				mad.anadirJugador(jug);
				break;

			case "AtMadrid":
				atl.anadirJugador(jug);
				break;

			case "Villarreal":
				vil.anadirJugador(jug);
				break;

			case "Sevilla":
				sev.anadirJugador(jug);
				break;

			case "Rayo":
				ray.anadirJugador(jug);
				break;

			default:
				System.out.println("Este equipo no esta inscrito!");
				break;

				}
			}

			Barcelona = new Equipo("Barcelona", bcn, null, null, null, 0, bcn.getNumJugadores());
			Madrid = new Equipo("Madrid", mad, null, null, null, 0, mad.getNumJugadores());
			Atletico = new Equipo("Atletico", atl, null, null, null, 0, atl.getNumJugadores());
			Villareal = new Equipo("Villarreal", vil, null, null, null, 0, vil.getNumJugadores());
			Sevilla = new Equipo("Sevilla", sev, null, null, null, 0, 0); sev.getNumJugadores();
			Rayo = new Equipo("Rayo", ray, null, null, null, 0, 0); ray.getNumJugadores();

			listaEquipos.anadirEquipo(Barcelona);
			listaEquipos.anadirEquipo(Madrid);
			listaEquipos.anadirEquipo(Sevilla);
			listaEquipos.anadirEquipo(Villareal);
			listaEquipos.anadirEquipo(Atletico);
			listaEquipos.anadirEquipo(Rayo);
				
			return listaEquipos;
			
			}
		
	}









/*

public static ArrayList<String> leerFicheroClubes() throws IOException {

	String info[], nombre, linea, presidente = null, entrenador = null, patrocinador = null;
	String equipo = null;
	ArrayList<String> clubes = new ArrayList<String>();
	int i = 0;

	ListaInfoClubes lista = null;

	try {

		BufferedReader br = new BufferedReader(new FileReader("Info_Clubes.txt"));

		linea = br.readLine();
		while (linea != null) {

			StringTokenizer st = new StringTokenizer(linea, ",");
			while (st.hasMoreTokens()) {

				nombre = st.nextToken();
				presidente = st.nextToken();
				entrenador = st.nextToken();
				patrocinador = st.nextToken();

			}
			clubes.add(equipo);
			clubes.add(presidente);
			clubes.add(entrenador);
			clubes.add(patrocinador);

		}
	}

	catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("No se ha encontrado el fichero\n");
	}
	return clubes;
	
	

}

}*/