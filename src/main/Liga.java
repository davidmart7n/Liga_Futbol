package main;

import java.util.Random;
import java.util.Scanner;

import gestion_jornadas.Partido;

public class Liga {
	static Equipo[]enumeracion= new Equipo[6];
	ListaEquipos equipos;
	static Scanner sc = new Scanner(System.in);
	static char opcion=0;
	static String stop;

	
	
	public Liga(ListaEquipos equipos) {
		this.equipos = equipos;
		repartirNumerosEquipos();
		
		//System.out.println(equipos);
		
		
		for (int i=1; i<=10;i++){
			System.out.println("\n RESULTADOS JORNADA "+i+ ": \n ");
			nuevaJornada(i);
			System.out.println("\n **PULSE TECLA PARA CONTINUAR** ");
			
			mostrarCabecera(i);

			stop=sc.next();
			
			
			
			}
	
		
	}
	public static void mostrarOpciones() {
		int i=1;
		do {
			while (i<=10){
				mostrarCabecera(i);
				System.out.println("\n RESULTADOS JORNADA "+i+ ": \n ");
				nuevaJornada(i);
				System.out.println("\n **PULSE TECLA PARA CONTINUAR** ");
				
				stop=sc.next();
				mostrarCabecera(i);
				
				
				
				}
			opcion = sc.next().charAt(0);

			switch (opcion) {

			case 'a':
				imprimirResultados();
				
				
				break;

			case 'b':
				System.out.println();
				break;

			case 'c':
				break;

			case 'd':
				

				break;

			case 'e':
				System.out.println("Ha decidido salir del programa");
				break;

			default:
				System.out.println("La opcion elegida no existe\n por favor escoge una opción válida");

			}

		} while (opcion != 'e');
		
	}
	public static void imprimirResultados() {
		
		
	}
	
	
	public static void reproducirJornadas() {
		
		for (int i=1; i<=10;i++){
			System.out.println("\n RESULTADOS JORNADA "+i+ ": \n ");
			nuevaJornada(i);
			System.out.println("\n **PULSE TECLA PARA CONTINUAR** ");

			stop=sc.next();
			mostrarCabecera(i);
			}
			

	
	}
	public void repartirNumerosEquipos() {
		
		int[] asignados = new int[equipos.getNumEquipos()]; 
		int i=0, rand, z=0;
		boolean haSidoAsignado;
			
			while (i<equipos.getNumEquipos()) {
				
				//System.out.println("hola");
				
				rand = (int)(Math.random()*(equipos.getNumEquipos()));
				
				//System.out.println(rand);
				
				haSidoAsignado = false;
				
				for(z=0;z<i && !haSidoAsignado ;z++) {
					
					//System.out.println("z: "+z);
				
					if(asignados[z]==rand) {
						haSidoAsignado=true;
						//System.out.println("NO");
					
					}}
					
				if(!haSidoAsignado) {
					
					asignados[i]=rand;
					enumeracion[i]=equipos.seleccionarEquipo(rand);
					//System.out.println("yes");
						i++;
						haSidoAsignado=true;
						}
					
					}
	
						}
	
	
		
	
	
	public static void nuevaJornada(int numJornada) {
			
		
		switch (numJornada) {
		case 1:
		
		Partido partido1= new Partido(enumeracion[1], enumeracion[2]);
		Partido partido2= new Partido(enumeracion[3] ,enumeracion[4]);
		Partido partido3= new Partido(enumeracion[5] ,enumeracion[0]);
		
		

		break;
		
		case 2:
			
			Partido partido4= new Partido(enumeracion[1] ,enumeracion[3]);
			Partido partido5= new Partido(enumeracion[2] ,enumeracion[5]);
			Partido partido6= new Partido(enumeracion[4] ,enumeracion[0]);
			

			break;
	
			 
		case 3:
			
			Partido partido7= new Partido(enumeracion[1] ,enumeracion[4]);
			Partido partido8= new Partido(enumeracion[2] ,enumeracion[0]);
			Partido partido9= new Partido(enumeracion[3] ,enumeracion[5]);
			

			break;
		
		case 4:
		
			Partido partido10= new Partido(enumeracion[1] ,enumeracion[5]);
			Partido partido11= new Partido(enumeracion[2] ,enumeracion[4]);
			Partido partido12= new Partido(enumeracion[3] ,enumeracion[0]);

			break;
		
		case 5:
			
			Partido partido13= new Partido(enumeracion[1] ,enumeracion[0]);
			Partido partido14= new Partido(enumeracion[2] ,enumeracion[3]);
			Partido partido15= new Partido(enumeracion[4] ,enumeracion[5]);
			
			break;
		
		
		case 6:
			
			Partido partido16= new Partido(enumeracion[1], enumeracion[2]);
			Partido partido17= new Partido(enumeracion[3] ,enumeracion[4]);
			Partido partido18= new Partido(enumeracion[5] ,enumeracion[0]);
			break;
			
		case 7:
				
			Partido partido19= new Partido(enumeracion[1] ,enumeracion[3]);
			Partido partido20= new Partido(enumeracion[2] ,enumeracion[5]);
			Partido partido21= new Partido(enumeracion[4] ,enumeracion[0]);
			break;
		
				
		case 8:
				
			Partido partido22= new Partido(enumeracion[1] ,enumeracion[4]);
			Partido partido23= new Partido(enumeracion[2] ,enumeracion[0]);
			Partido partido24= new Partido(enumeracion[3] ,enumeracion[5]);

			break;
			
		case 9:
			
			Partido partido25= new Partido(enumeracion[1] ,enumeracion[5]);
			Partido partido26= new Partido(enumeracion[2] ,enumeracion[4]);
			Partido partido27= new Partido(enumeracion[3] ,enumeracion[0]);

			break;
			
		case 10:
				
			Partido partido28= new Partido(enumeracion[1] ,enumeracion[0]);
			Partido partido29= new Partido(enumeracion[2] ,enumeracion[3]);
			Partido partido30= new Partido(enumeracion[4] ,enumeracion[5]);
				
			break;
			
		}
	}	
		public static void mostrarCabecera(int numJornada) {
					
			System.out.println("\n a: Ver resultados\n" + "b: Ver clasificación \n" + "c: Siguiente Jornada \n" + "d: salir\n\n");
			
		
		}
	

			
	}
		
	
	
	
	
	


