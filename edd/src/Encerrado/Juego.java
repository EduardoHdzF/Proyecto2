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
    public void bienvenida() {
		System.out.println("\n\033[96m-------- Hola, bienvenido al juedo del encerrado --------\033[39m\n");				
		System.out.println("\033[5m                Presione ENTER para jugar\033[25m");		
		System.out.println("\n El juego consiste en lograr que las piezas del oponente"); 
		System.out.println("              ya no puedan moverse");
		entrada.nextLine();
		
    }
	
	/**
	 * Despliega las instrucciones del juego.
	 */
	public void intrucciones(){
	
	
	}
	
	/**
	 * Registra el nombre de los jugadores o selecciona si desea jugar con la máquina.
	 */
	public void jugadores(){			
		
		System.out.println("     Ingrese el nombre del Jugador 1");
				
		String n = entrada.nextLine();
		Jugador q = new Jugador();
		
		if(n != ""){
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
		 	
		 	if(n != ""){
				q.setNombre(n);
			}else{
			
				q.setNombre("Jugador 2");
			}
		 	
		 	jugadores.push(q);
		 	
		}else if(r.equals("n") || r.equals("")){
		 	
		 	System.out.println("\n>> Jugará con la máquina <<");
		 	
		 	maquina = true;
		 	
		}else{
		
			System.out.println("\n     Ingrese el nombre del Jugador 2");
		 	n = entrada.nextLine();
		 	q = new Jugador();
		 	
		 	if(n != ""){
				q.setNombre(n);
			}else{
			
				q.setNombre("Jugador 2");
			}
		 	
		 	jugadores.push(q);
		 	
		 }
		
		
		
		
	}
	
	/**
     * Nos da la bienvenida y es en escencia donde se mueve el juego.
     */
    public void corre(){
    
		System.out.println("\033[H\033[2J");
		//System.out.flush();		
		bienvenida();
		jugadores();
		
		Jugador j = jugadores.pop();
		
		System.out.println("\nJugador 1: " + j.getNombre());
		jugadores.push(j);
		
		if(maquina != true){
			j = jugadores.pop();
			System.out.println("\nJugador 2: " + j.getNombre());
			jugadores.push(j);
		}
		System.out.println("\nElementos del juego: Un tablero con 5 posiciones:");
		System.out.println("las numeradas del 1 al 4 y la posición 5 que es la del centro.\n");
				
		//System.out.println("    Numerando de izquieda a derecha, eligiendo la posición deseada\n");
		
		
		tablero.dibujaTablero();				
		tablero.dibujaFicha(0);
		
		System.out.println("\n      Escoja la posición de inicial de las fichas");
		System.out.println("\nPresione w si quiere poner una posición deseada o ENTER si quiere la posición por defecto");									
		String d = entrada.nextLine();
		
		if(d.equals("w")){
			for(int a = 0; a < 4; a++){
			while(true){
			
			System.out.println("\nEscriba la ficha con la posición deseada en forma de pareja ordenada");
			System.out.println("De la forma <Ficha>, posición, ejemplo: Ficha 1, 1");
			
				tablero.dibujaFicha(0);
				
				String en = entrada.nextLine();
				
				String[] aux = en.split(",");
							
				
				for(int i = 0; i < aux.length; i++){
					System.out.println(aux[i]);
				}
				
				
					try{
						if(aux[1].contains("5")) {
							System.out.println("papi");
							throw new IllegalArgumentException();								
						}
						tablero.mueveFicha(aux[0], aux[1]);
						break;
						
					}catch(Exception e){
						System.out.println(e);
						System.out.println("Ingrese una posición válida");	
					}
				}
			}
			//tablero.mueveFicha(
			//Se debe poner que el usuario pueda elegir la posición de las fichas
		}else{
			System.out.println("\nPosición por defecto\n");
			tablero.pInicial();	
		}
		
		System.out.println("\n Presione ENTER para continuar");
		entrada.nextLine();
		//System.out.println("\033[H\033[2J");					
		System.out.println("Fichas de cada jugador\n");
		tablero.dibujaFicha(1);
		
		
		j = jugadores.pop();
		System.out.println(j.getNombre());
		j.setFicha("\033[91m");
		jugadores.push(j);
		
		if(!maquina){
			j = jugadores.pop();
			System.out.println(j.getNombre());
			j.setFicha("\033[96m");
			jugadores.push(j);
		}
		
    }
    
    
	public static void main(String[] args){
			
		Juego nuevo = new Juego();
		nuevo.corre();
	
	}

}
