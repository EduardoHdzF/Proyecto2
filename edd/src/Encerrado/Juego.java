package edd.src.Encerrado;

import edd.src.Estructuras.*;

import java.util.Scanner;

/**
 * Clase Juego
 * @author Hernandez Floriano Eduardo - 319121498
 * @author Estrada García Luis Gerardo - 319013832
 */
public class Juego{
	
	private Scanner entrada;
	
	private Cola<Jugador> jugadores;
	
	private Tablero tablero;
	
	private boolean maquina; 
	
	private Jugador ahora;//El jugador que está jugando ahora, es null si el turno es de la máquina
	
	private Maquina m;
	
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
		System.out.println("*Ingrese el número 199 si desea salir*");
		String en = entrada.nextLine();
		
		if(en.contains("199")){
			despedida();
		}
    }
	
	/**
	 * Despliega las instrucciones del juego.
	 */
	public void intrucciones(){
	
	
	}
	
	/**
     * Despliega unas palabras de despedida, además de una linda imágen
     */ 
    public void despedida(){
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		try{	    	    
			Thread.sleep(200);
		}catch(Exception e){
			System.out.println(e);
		}
		
		System.out.println("Hasta la próxima :)");	
		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠛⠉⠉⠉⠉⠉⠉⠉⠛⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⠏⠄⢀⣠⣶⣶⣶⣶⣤⡀⠄⠄⠹⣿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⡏⠄⠄⣾⡿⢿⣿⣿⡿⢿⣿⡆⠄⠄⢻⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("⣿⣿⣿⣿⣿⣿⣿⡿⠃⠄⠄⢿⣇⣸⣿⣿⣇⣸⡿⠃⠄⠄⠸⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("⣿⣿⣿⣿⣿⡿⠋⠄⠄⠄⠄⠄⠉⠛⠛⠛⠛⠉⠄⠄⠄⠄⠄⠄⠙⣿⣿⣿⣿⣿");
		System.out.println("⣿⣿⣿⣿⡟⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⢿⣿⣿⣿");
		System.out.println("⣿⣿⣿⡟⠄⠄⠄⠠⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⢿⣿⣿");
		System.out.println("⣿⣿⡟⠄⠄⠄⢠⣆⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣧⠄⠄⠄⠈⢿⣿");
		System.out.println("⣿⣿⡇⠄⠄⠄⣾⣿⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢰⣿⣧⠄⠄⠄⠘⣿");
		System.out.println("⣿⣿⣇⠄⣰⣶⣿⣿⣿⣦⣀⡀⠄⠄⠄⠄⠄⠄⠄⢀⣠⣴⣿⣿⣿⣶⣆⠄⢀⣿");
		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠏⠄⠄⢸⣿⠇⠄⠄⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⣤⣴⣾⣿⣶⣤⣤⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");    
		System.exit(0);
		
    }
    
	/**
	 * Registra el nombre de los jugadores o selecciona si desea jugar con la máquina.
	 */
	public void jugadores(){			
		
		System.out.println("     Ingrese el nombre del Jugador 1");
		System.out.println(" Ingrese el número 199 si desea salir ");
		
		String n = entrada.nextLine();
		if(n.contains("199")){
			despedida();
		}	
		Jugador q = new Jugador();
		
		if(n != ""){
		
			q.setNombre(n);
						
		}else{
					
			q.setNombre("Jugador 1");
			
		}
		
		jugadores.push(q);
		
		System.out.println("\n     Desea tener un jugador 2 ");
		System.out.println(" Digite s (sí), n (no) y después presione ENTER");
		System.out.println("*Ingrese el número 199 si desea salir*");
		
		String r = entrada.nextLine();
		if(r.contains("199")){
			despedida();
		}
		
		if(r.equals("s")){
		 	
		 	System.out.println("\n     Ingrese el nombre del Jugador 2");
		 	System.out.println("*Ingrese el número 199 si desea salir*");
		 	n = entrada.nextLine();
		 	if(n.contains("199")){
				despedida();
			}
		 	q = new Jugador();
		 	
		 	if(n != ""){
				q.setNombre(n);
			}else{
			
				q.setNombre("Jugador 2");
			}
		 	
		 	jugadores.push(q);
		 	
		}else if(r.equals("n") || r.equals("")){
		 	
		 	System.out.println("\n>> Jugará con la máquina <<");
		 	m = new Maquina(tablero);
		 	maquina = true;
		 	
		}else{
		
			System.out.println("\n     Ingrese el nombre del Jugador 2");
			System.out.println("*Ingrese el número 199 si desea salir*");
			
		 	n = entrada.nextLine();
		 	if(n.contains("199")){
				despedida();
			}
			
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
	 * Nos permite elegir la estrategia que queramos que ocupe la máquina
	 */
	public void estrategia(){
    	
    	if(maquina){
    	
			while(true){
			
				System.out.println("--------------- Estrategia ---------------------");
				System.out.println("Elija la estrategia de la máquina");
				System.out.println("Escriba 1 si quiere \"al azar\" o 2 si quiere \"minimax\"");
				System.out.println("*Ingrese el número 199 si desea salir*");
				
				String en = entrada.nextLine();
				
				if(en.contains("199")){
						despedida();
				}
					
				try{
					if(en.equals("1")){
						System.out.println("Escogió al azar");	
						m.setAzar(true);
						m.setMinimax(false);
					}else if(en.equals("2")){
						System.out.println("Escogió minimax");
						m.setAzar(false);
						m.setMinimax(true);
					}else{
					 	throw new IllegalArgumentException();
					}
					
					break;
					
				}catch(IllegalArgumentException i){				
				
					System.out.println("\n\033[43mEscriba una opción correcta\033[49m\n");
					
				}catch(Exception e){
				
					System.out.println("\n\033[43mOcurrió un error, intente de nuevo\033[49m\n");
					
				}
				
			}
		}
		
    
    }
    /**
     * Nos dice quien será el jugador que inicia el juego según lo elegido
     * @param q, el número de jugador que desea iniciar, entre 1 y 2, en otro caso
     * nos manda un error.     
     */
    public void quien(){       	
		
		Jugador j = new Jugador();
		Jugador a = turno();
		Jugador b = null;
		
		while(true){
			
			System.out.println("\n*********¿Quién iniciará el juego?**********");
			if(!maquina){
				b = turno();
			}
			if(b != null){			
				System.out.println("\nEscriba quien desea que inicie el juego, 1) para " + a + "; 2) para " + b +  "\n");							
			}else{
				System.out.println("\nEscriba quien desea que inicie el juego, 1) para " + a + "; 2) para "+ "maquina"  +  "\n");											
			}
			
			System.out.println("*Ingrese el número 199 si desea salir*");
			String en = entrada.nextLine();
			if(en.contains("199")){
				despedida();
			}
			
			try{
				int q = Integer.parseInt(en);
					
				if(q == 2){
					if(maquina){    		
						ahora = null;
						System.out.println("\n\033[42mComienza la máquina\033[49m\n");
					}else{
						j = jugadores.pop();	
						jugadores.push(j);
						j = jugadores.pop();
						
						System.out.println("\n\033[42mComienza "  + j.getNombre()+ "\033[49m\n");
						ahora = j;
						jugadores.push(j);
						
					}
				}else if(q == 1){
					
					j = jugadores.pop();
					System.out.println("\n\033[42mComienza "  + j.getNombre() + "\033[49m\n");
					ahora = j;
					jugadores.push(j);
								
				}else{
					throw new IllegalArgumentException();
				}
				break;
				
			}catch(Exception e){
				System.out.println("\n\033[43mIngrese una posición válida\033[49m");
			
			}
    	}
    
    }
    
    /**
     * Nos devuelve el jugador que sigue en el turno
   	 * @return el jugador a quien le toca tirar.
     */
    public Jugador turno(){
    
    	Jugador j = jugadores.pop();
    		
    	if(ahora == j && maquina){
    		jugadores.push(j);
    		ahora = null;
    		return null;
    	}else{
    		System.out.println("(turno)Sol " + ahora + " Luna " + j);
    		ahora = j;
    		jugadores.push(j);
    		
    	}
    	return j;
    }
    
	/**
     * Nos da la bienvenida y es en escencia donde se mueve el juego.
     */
    public void corre(){
    
		//System.out.println("\033[H\033[2J");
		//System.out.flush();
		System.out.println("\033[H\033[2J");
				
		bienvenida();
		jugadores();
		
		//Muestra quienes son los jugadores
		Jugador j = jugadores.pop();		
		
		System.out.println("\nJugador 1: " + j.getNombre());
		
		jugadores.push(j);
		
		if(maquina != true){
		
			j = jugadores.pop();
			System.out.println("\nJugador 2: " + j.getNombre());
			jugadores.push(j);
			
		}else{
			
			System.out.println("\nJugador 2: \033[41mMáquina\033[49m");
			
		}
		
		//Nos muestra los elementos del juego
		
		System.out.println("\nElementos del juego: Un tablero con 5 posiciones:");
		System.out.println("las numeradas del 1 al 4 y la posición 5 que es la del centro.\n");				
		
		
		tablero.dibujaTablero();				
		tablero.dibujaFicha(0);
		
		
		System.out.println("\n      Escoja la posición de inicial de las fichas");		
		System.out.println("\nPresione w si quiere poner una posición deseada o ENTER si quiere la posición por defecto");	
		System.out.println("*Ingrese el número 199 si desea salir*");
												
		String d = entrada.nextLine();
		
		if(d.contains("199")){
			despedida();
		}
		
		if(d.equals("w")){
			
			String[] paso = new String[4];
			
			Lista<String> falta = new Lista<String>();
			
			falta.add("Ficha 1");
			falta.add("Ficha 2");
			falta.add("Ficha 3");
			falta.add("Ficha 4");
			
			for(int a = 0; a < 4; a++){
			
				while(true){
				
				System.out.println("\n		Escriba la ficha con la posición deseada en forma de pareja ordenada");
				System.out.println("De la forma <Ficha>, posición, ejemplo: Ficha 1, 1 (Asegúrese de escribir la palabra de la manera correcta:)\n");
				System.out.println("Fichas disponibles para su posicionamiento en el tablero: " + falta.toString() + "\n");				
				System.out.println("*Ingrese el número 199 si desea salir*\n");
							
					tablero.dibujaFicha(0);
					
					String en = entrada.nextLine();
					
					if(en.contains("199")){
						despedida();
					}
					
					String[] aux = en.split(",");																		
					
					try{
					
						if(aux[1].contains("5")) {							
							throw new IllegalArgumentException();								
						}																	
						
												
						for(int i = 0; i < 4; i++){
							
							if(paso[i] != null && aux[0] != null){
							
								if(paso[i].contains(aux[0])) throw new IllegalArgumentException();//a = //false;
								
								String[] p = paso[i].split(",");
								
								if(p[1].contains(aux[1])) throw new IllegalArgumentException();//a = //false;
								
							}else{
							
								break;
							
							}
						}
						
						tablero.mueveFicha(aux[0], aux[1]);
						paso[a] = en;
						falta.delete(aux[0]);
						break;
							
					}catch(Exception e){
					
							//System.out.println(e);
							System.out.println("\n\033[43mIngrese una posición válida\033[49m");	
					}
				}
			}
		
		
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
		j.setColor("Color 1");
		jugadores.push(j);
		
		System.out.println("vs");
		
		if(!maquina){
			j = jugadores.pop();
			System.out.println(j.getNombre());
			j.setFicha("\033[96m");
			j.setColor("Color 2");
			jugadores.push(j);
		}else{
		
			System.out.println("\033[41mMáquina\033[49m");
		
		}
		
		estrategia();
		
		quien();
		
		System.out.println("\033[41mBien\033[49m " + ahora);

		//Pruebas------
		Maquina m = new Maquina(tablero);
		
		ArbolBinarioCompleto<Integer> prueba = new ArbolBinarioCompleto<Integer>();
		
		/*prueba.add(6);
		
		prueba.add(3);		
		prueba.add(7);
		
		prueba.add(9);		
		prueba.add(5);
		
		prueba.add(2);
		int a = prueba.bfs();
		
		
		System.out.println("bfs " + a);
		/*
		prueba.add(2);
		prueba.add(1);
		prueba.add(4);
		prueba.add(8);*/
		
		int f = 1;
		//Sacamos el número de nodos "no es el numero en realidad" con altura 2, es decir prof 3
		for(int i = 1; i <= 4; i++){
		
			f = f * 2;
			
		}
		
		System.out.println("Potencia es: " + f + " form " + potenciaDos(3));
		prueba.add(1);
		
		int altura = prueba.altura();
		
		System.out.println(altura);
		
		while(prueba.size() < f-2 ){
		
			//if(altura == 0){
				//tMinimax(cola, cola.pop(), yo);
			//}.
			
			if(prueba.size() == (potenciaDos(prueba.altura()+1)-1)){
				altura = prueba.altura();
			}
			System.out.println("Altura " + altura + " modulo 2 = " + altura % 2);
			
			
			if(altura % 2 != 0){ //&& (prueba.size() == (potenciaDos(altura+1)-1))){
			
				//tMinimax(cola, cola.pop(), contrincante);
				System.out.println(prueba);
				prueba.add(1);
				System.out.println(prueba + " agregué");
				prueba.add(1);
				System.out.println(prueba + " agregué");
				
			}else{
			
				//tMinimax(cola, cola.pop(), yo);
				System.out.println(prueba);
				prueba.add(2);
				System.out.println(prueba + " agregué");
				prueba.add(2);
				System.out.println(prueba + " agregué");
			}
			
			
			
		}
		
		System.out.println("a ver " + prueba.bfs() + " altura " + prueba.altura());
		System.out.println(prueba + "\n Elementos " + prueba.size());
		
		
		if(ahora == null){
			System.out.println("Trabajando en ello...");
			try{					
				m.tira();
			}catch(IllegalArgumentException iea){
				System.out.println("Eres automático");
				//break;
			}
			turno();
			tiroUsuario();
		}else{
		
			tiroUsuario();	
		
		}
				
    }
    
    private int potenciaDos(int a){
    	
    	int f = 1;
    	
    	for(int i = 1; i <= a; i++){
		
			f *= 2;
			
		}
    	return f;
    }
   
    public void tiroUsuario(){
    	
    	int contador = 0;
    	
    	while(tablero.puedoMoverme(ahora)){
				
				while(true){
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("                                  \n\033[39m\033[40m" + ahora + "\033[49m\033[39m");
					
					try{
					
					
					tablero.dibujaTablero();
					System.out.println("\nIngrese la ficha que desee mover, escriba 1 si su ficha está más a su izquierda o 2 si está más a su derecha");
					System.out.println("*Ingrese el número 199 si desea salir*");
					
					String en = entrada.nextLine();
					
					if(en.contains("199")){
						despedida();
					}
					
					int fich = Integer.parseInt(en);	
					
					if(fich < 1 || fich > 2){
						throw new IllegalArgumentException();
					}
					
					System.out.println("\nIngrese la posición que desea jugar(recuerde que solo puede elegir un número entre el 1 y 5)");				
					
					System.out.println("*Ingrese el número 199 si desea salir*");
												
						en = entrada.nextLine();
						
						if(en.contains("199")){
							despedida();
						}
						
						int ps = Integer.parseInt(en);
						
						if(ps < 1 || ps > 5){
							throw new IllegalArgumentException();
						}
						
						System.out.println(ahora + " es el jugador que ha tirado" );
						System.out.println();
						
						//if(contador == 0){
						tablero.mueve(ahora, ps, fich);//La función que nos permite mover la ficha en el lugar indicado
						//}else{
							
							//tablero.mueve(turno(), ps, fich);
						//}
						turno();
						break;
						
					}catch(Exception e){
						
						System.out.println("\n\033[43mIngrese una posición válida\033[49m");
						
					}
					
				}
				contador++;
				
				//System.out.println("                                  \n\033[30m\033[40m" + ahora + "\033[49m\033[39m");					
				tablero.dibujaTablero();
				
				if(ahora == null){
				//System.out.println("                                  \n\033[30m\033[40m" + ahora + "\033[49m\033[39m");	
					try{
										
						m.tira();
						tablero = m.tablero;
						//String[] e = tablero.getColores();
						//for(int q = 0; q < e.length; q++){
							//System.out.println(e[q]);	
						//}
					}catch(IllegalArgumentException iea){
						tablero.dibujaTablero();
						System.out.println("Plastica");
						break;
					}
					turno();
					
					
				}else{
					continue;			
				}
				
			}
			
    }
	public static void main(String[] args){
			
		Juego nuevo = new Juego();
		nuevo.corre();
	
	}

}
