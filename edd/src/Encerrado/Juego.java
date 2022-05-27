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
	
	/**
	 * Crea la interfaz de usuario para manejar el juego.
	 */
	public Juego(){		
		jugadores = new Cola<Jugador>();	
		entrada = new Scanner(System.in);				
		tablero = new Tablero();
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
		q.setNombre(n);
		jugadores.push(q);
		System.out.println("\n     Desea tener un jugador 2 ");
		System.out.println(" Digite s (sí), n (no) y después presione ENTER");
		String r = entrada.nextLine();
		if(r.equals("s")){
		 	
		 	System.out.println("\n     Ingrese el nombre del Jugador 2");
		 	n = entrada.nextLine();
		 	q = new Jugador();
		 	q.setNombre(n);
		 	jugadores.push(q);
		}else if(r.equals("n")) System.out.println("\n>> Jugará con la máquina <<");
		
		
		
	}
	
	/**
     * Nos da la bienvenida y es en escencia donde se mueve el juego.
     */
    public void corre(){
	
		Bienvenida();
		Jugadores();
		
		tablero.dibujaTablero(0);		
		System.out.println(tablero.dibujaFicha());
		
    }
    
    
	public static void main(String[] args){
			
		Juego nuevo = new Juego();
		nuevo.corre();
	
	}

}
