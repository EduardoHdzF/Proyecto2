package edd.src.Encerrado;

import edd.src.Estructuras.*;

import java.util.Scanner;

/**
 * Clase Juego
* @author Estrada García Luis Gerardo - 319013832
* @author Hernandez Floriano Eduardo - 319121498
 */
public class Juego{
	
	private Scanner entrada;
	private Cola<Jugador> jugadores;
	private Tablero tablero;
	private boolean maquina; 
	
	/**
	 * Crea la interfaz de usuario para manejar el juego.
	 */
	public Juego(){		
		jugadores = new Cola<Jugador>();	
		entrada = new Scanner(System.in);				
		tablero = new Tablero();
		maquina = false;
	}
	
	/*
     * Mensaje de bienvenida
     */
    public void Bienvenida() {
		System.out.println("\n\033[96m-------- Hola, bienvenido al juedo del encerrado --------\033[39m\n");				
		System.out.println("\033[5m                Presione ENTER para jugar\033[25m");		
		System.out.println("\n El juego consiste en lograr que las piezas del oponente"); 
		System.out.println("              ya no puedan moverse");
		entrada.nextLine();
		
    }
	
	/**
	 * Registra el nombre de los jugadores o selecciona si desea jugar con la máquina.
	 */
	public void Jugadores(){			
		
		System.out.println("     Ingrese el nombre del Jugador 1");
		String n = entrada.nextLine();
		Jugador q = new Jugador();
		if(n != "" || n != null){
			q.setNombre(n);
		}else{
			q.setNombre("Jugador 1");
		}
		
		jugadores.push(q);
		
		System.out.println("\n     Desea tener un jugador 2 ");
		System.out.println(" Digite s (sí), n (no) y después presione ENTER");
		
		String r = entrada.nextLine();
		
		if(r.equals("s")){
		 	
		 	System.out.println("\n     Ingrese el nombre del Jugador 2");
		 	n = entrada.nextLine();
		 	q = new Jugador();
		 	
		 	if(n != "" || n != null){
				q.setNombre(n);
			}else{
				q.setNombre("Jugador 1");
			}
		 	
		 	jugadores.push(q);
		 	
		}else if(r.equals("n") || r.equals("")){
		 	
		 	System.out.println("\n>> Jugará con la máquina <<\n");
		 	
		 	maquina = true;
		 	
		}
		
		
	}
	
	/**
     * Nos da la bienvenida y es en escencia donde se mueve el juego.
     */
    public void corre(){
		System.out.println("\033[H\033[2J");
		System.out.flush();
		Bienvenida();
		Jugadores();
		
		tablero.dibujaTablero(0);		
		tablero.dibujaFicha(0);
		
		System.out.println("\n Presione ENTER para continuar");
		entrada.nextLine();
		System.out.println("\033[H\033[2J");
		System.out.println("\n        Escoja la posición de inicial de las fichas \n");
		System.out.println("      Numerando de izquieda a derecha, eligiendo la posición deseada\n");
		System.out.println("Presione w si quiere poner una posición deseada o ENTER si quiere la posición por defecto\n");
		
		
		String d = entrada.nextLine();
		System.out.println("\nFichas de cada jugador\n");
		tablero.dibujaFicha(1);
		if(d.equals("w")){
			
			//Se debe poner que el usuario pueda elegir la posición de las fichas
		}else{
			System.out.println("\nPosición inicial por defecto\n");
			tablero.pInicial();	
		}
		//System.out.println("\033[H\033[2J");
		
		//System.out.close();
		//tablero.dibujaFicha(1);
		
    }
    
    
	public static void main(String[] args){
			
		Juego nuevo = new Juego();
		nuevo.corre();
	
	}

}
