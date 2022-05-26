package edd.src.Encerrado;

import src.Estructuras.*;

import java.util.Scanner;

/**
 * Clase Juego
* @author Estrada García Luis Gerardo - 319013832
* @author Hernandez Floriano Eduardo - 319121498
 */
public class Juego{
	
	private Scanner entrada;
	
	/**
	 * Crea la interfaz de usuario para manejar el juego.
	 */
	public Juego() {
			
		entrada = new Scanner(System.in);		
		
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
	
	public void Jugadores(){
			
			
			
	}
	
	/**
     * Nos da la bienvenida y es en escencia donde se mueve el juego.
     */
    public void corre(){
	
		Bienvenida();
    }
    
    
	public static void main(String[] args){
			
		Juego nuevo = new Juego();
		nuevo.corre();
	
	}

}
