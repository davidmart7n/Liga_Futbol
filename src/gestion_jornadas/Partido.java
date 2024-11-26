package gestion_jornadas;

import main.Equipo;
import main.Jugador;

public class Partido {
	
	private Equipo local;
	private Equipo visitante;
	private int[] resultado = new int[2];
	
	public Partido(Equipo local, Equipo visitante) {
		this.local = local;
		this.visitante = visitante;
		jugarPartido();
		goleadores();
		resultadoImprimir(resultado[0], resultado[1], local.getNombre(), visitante.getNombre());
	}
	
	public void jugarPartido(){
		
		int golesLocal, golesVisitante;
		golesLocal = (int) (Math.random()*7);
		golesVisitante = (int) (Math.random()*7);
		
		resultado[0]=golesLocal;
		resultado[1]=golesVisitante;
		
		if(resultado[0]<resultado[1]) {
			visitante.setPuntos(3);
			
		}
		else if(resultado[1]<resultado[0]){
			local.setPuntos(3);
		}
		else {local.setPuntos(1);
			 visitante.setPuntos(1);
			
		}
		
	}
	public void goleadores() {
		
int aleatorio;
		
		for (int i=0; i<resultado[0]; i++) {
			aleatorio = (int)(Math.random()*7);
			local.getJugadores().seleccionarJugador(aleatorio).haMarcado();
		}
		
		for (int i=0; i<resultado[1]; i++) {
			aleatorio = (int)(Math.random()*7);
			visitante.getJugadores().seleccionarJugador(aleatorio).haMarcado();
		}
		
	}
	
	public void resultadoImprimir(int local, int visitante, String local1, String visitante1) {
		
		System.out.println(""+local1+" "+local+" - "+ visitante1+" "+visitante);
		
	}

	}
	
	
