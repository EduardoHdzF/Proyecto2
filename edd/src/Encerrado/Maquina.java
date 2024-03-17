package edd.src.Encerrado;

import edd.src.Estructuras.*;
import java.util.Random;

/**
 * Clase Maquina, es donde se moverá nuestro árbol
 * @author Estrada García Luis Gerardo 
 * @author Hernandez Floriano Eduardo 
 */
public class Maquina{

	public ArbolBinarioCompleto<Tiro> mini;
	public Tablero tablero;
	public String[] colores;
	private Jugador yo;
	private Jugador contrincante;
	private boolean azar;
	private boolean minimax;
	
	public Maquina(){
			
		yo = new Jugador();
		contrincante = new Jugador();		
		mini = new ArbolBinarioCompleto<Tiro>();	
		tablero = new Tablero();		
		yo.setFicha("\033[96m");
		yo.setColor("Color 2");
		contrincante.setFicha("\033[91m");
		contrincante.setColor("Color 1");
		
	}
	
	public Maquina(Tablero t){
		
		yo = new Jugador();
		contrincante = new Jugador();
		mini = new ArbolBinarioCompleto<Tiro>();	
		tablero = t;
		colores = t.getColores();
		yo.setFicha("\033[96m");
		yo.setColor("Color 2");
		contrincante.setFicha("\033[91m");
		contrincante.setColor("Color 1");
	
	}	
	
	public void setAzar(boolean a){
		
		this.azar = a;
	
	}
	
	public boolean getAzar(){
	
		return this.azar;
		
	}
	
	public boolean getMinimax(){
	
		return this.minimax;	
		
	}
	public void setMinimax(boolean m){
	
		this.minimax = m;
	
	}
	
	/*
	 * Nos efectúa el tiro de la máquina de acuerdo a la estrategia actual.
	 */
	public void tira()throws Exception{
		
		if(minimax){
		
			mini();
			
		}else if(azar){
		
			tiroAzar();			
			
		}
	}
	
	/**
	 * Aquí lo que nos hace es el tiro usando minimax
	 */
	public void mini(){
	
		System.out.println("          \033[41mTurno de la Máquina\033[49m");
		
		try{
			    	    
			Thread.sleep(2000);
			
		}catch(Exception e){
		
			System.out.println(e);
			
		}
		
		mini = new ArbolBinarioCompleto<Tiro>();
		
		Cola<Tiro> cola = new Cola<Tiro>();
		
		Tiro t = new Tiro(tablero.clone(), yo);
		
		mini.add(t);
		
		cola.push(t);
				
		int altura = mini.altura();
		
		//Nos ayuda a saber el número de nodos de acuerdo a la profundidad 10.		
		int f = potenciaDos(10);
		
		/* Nos ayuda a llenar el arbol de acuerdo a todos los tiros posibles hasta una profundidad de 10 */		
		while(mini.size() < f-2){
		
			if(mini.size() == (potenciaDos(mini.altura()+1)-1)){
				altura = mini.altura();				
			}
			
			if(altura % 2 == 0){
			
				tMinimax(cola, cola.pop(), yo);
				
			}else{
			
				tMinimax(cola, cola.pop(), contrincante);
				
			}			
			
		}
						
		
		eligeOp(mini.vertice(mini.raiz()));	
		
	}
	
	/**
     * Nos devuelte el resultado de 2^a
     * @param a el número al que será elevado el 2
     */
    private int potenciaDos(int a){
    	
    	int f = 1;
    	
    	for(int i = 1; i <= a; i++){
		
			f *= 2;
			
		}
    	return f;
    }
    
    /**
     * Nos hace los posibles tiros de acuerdo al tiro dado y al jugador dado
     * @param cola, nos ayuda para hacer los tiros correspondientes al nodo padre.
     * @param t, tiro que se ocupará como referencia para los siguientes tiros.
     * @param jug, el jugador que realizará los movimientos.
     */
	public void tMinimax(Cola<Tiro> cola, Tiro t, Jugador jug){
				
		Tiro te = new Tiro(t.tab.clone(), jug);
		
		//¿Puedo hacer movimientos con la disposición actual del tablero? si no, solo lo agrega al árbol
		if(t.valido){
		
			try{
				
				int p = te.tab.posVacia();
				
				if(jug.getColor().equals("Color 1")){
					/*Nos permite verificar si la ficha que voy a mover se puede o no, si no, ya no se podrá hacer ningún movimiento
					 *con esta posición del tablero */
					  
					try{
					
						te.tab.clone().mueve(contrincante, p, 1);
						
					}catch(Exception e){
						
						te.valido = false;
						throw new Exception();
						
					}								
								
				}else if(jug.getColor().equals("Color 2")){
					
					/*Nos permite verificar si la ficha que voy a mover se puede o no, si no, ya no se podrá hacer ningún movimiento
					 *con esta posición del tablero */
					try{
											
						te.tab.clone().mueve(yo, p, 1);
						
					}catch(Exception e){
						
						te.valido = false;
						throw new Exception();
					}				
				
				}
				
				te.opciones(1);
			
					
			}catch(Exception e){
								
				if(!te.tab.puedoMoverme(jug)){	
					
					
					if(jug.getColor().equals("Color 1")){
							
						te.setPuntuacion(1);
					
					}else if(jug.getColor().equals("Color 2")){
					
						te.setPuntuacion(-1);
					
					}					
					
				}
				
			}
			
		}else{
		
			te.valido = false;
			
		}	
					
		mini.add(te);
		cola.push(te);
		
		te = new Tiro(t.tab.clone(), jug);
		
		if(t.valido){
			
			try{
				int p = te.tab.posVacia();
				
				if(jug.getColor().equals("Color 1")){
					
					/*Nos permite verificar si la ficha que voy a mover se puede o no, si no, ya no se podrá hacer ningún movimiento
					 *con esta posición del tablero */
					 
					try{
						
						te.tab.clone().mueve(contrincante, p, 2);
						
					}catch(Exception e){
						
						te.valido = false;
						throw new Exception();
						
					}							
								
				}else if(jug.getColor().equals("Color 2")){
					
					/*Nos permite verificar si la ficha que voy a mover se puede o no, si no, ya no se podrá hacer ningún movimiento
					 *con esta posición del tablero */
					 
					try{
					
						te.tab.clone().mueve(yo, p, 2);
						
					}catch(Exception e){
						
						te.valido = false;
						throw new Exception();
						
					}
									
				}
				te.opciones(2);
			
			}catch(Exception e){
				
				if(!te.tab.puedoMoverme(jug)){
					
					if(jug.getColor().equals("Color 1")){
					
						te.setPuntuacion(1);
					
					}else if(jug.getColor().equals("Color 2")){
					
						te.setPuntuacion(-1);
					
					}					
					
				}
				
			}
			
		}else{
		
			te.valido = false;
			
		}
		
		mini.add(te);
		cola.push(te);
					
	}
	
	/**
	 * Asigna puntuaciones a los tiros y elige los más convenientes de acuerdo al arbol minimax
	 * Lo hace haciendo un recorrido PostOrden del árbol.	 
	 */
	public void eligeOp(ArbolBinario<Tiro>.Vertice v){
	
		if(v == null){
								
			return;
			
		}	
		
		
	
		ArbolBinario<Tiro>.Vertice  i = null;
		ArbolBinario<Tiro>.Vertice  d = null;
		
		if(v.hayIzquierdo()){
		
			i = mini.vertice(v.izquierdo());
			
		}
		
		if(v.hayDerecho()){
		
			d = mini.vertice(v.derecho());
			
		}
				
		eligeOp(i);
	
		eligeOp(d);
		
		Tiro t = v.get();
		
		if(!v.hayPadre()){		
			
			t.setPuntuacion(max(i.get().getPuntuacion(), d.get().getPuntuacion()));
			
			String a = "";
			
			if(max(i.get().getPuntuacion(), d.get().getPuntuacion()) ==  i.get().getPuntuacion()){
				
				if(i.get().valido){				
					a = "izquierdo";
				}else{
					a = "derecho";	
				}
			}
			
			if(max(i.get().getPuntuacion(), d.get().getPuntuacion()) ==  d.get().getPuntuacion()){
				
				if(d.get().valido){
					a = "derecho";
				}else{
					a = "izquierdo";
				}
				
			}
			//System.out.println("He llegado a la raíz y elijo " + t.getPuntuacion() + " " + a);
						
			
			int p = tablero.posVacia();
			if(a.contains("derecho")) tablero.mueve(yo, p, 2);
			if(a.contains("izquierdo")) tablero.mueve(yo, p, 1);
				
			
			return;
		
		}
		
		if(v.hayDerecho() && v.hayIzquierdo()){
		
			if(t.participante.getColor().equals("Color 1")){
			
				t.setPuntuacion(max(i.get().getPuntuacion(), d.get().getPuntuacion()));	
				return;
				
			}
			else if(t.participante.getColor().equals("Color 2")){
			
				t.setPuntuacion(min(i.get().getPuntuacion(), d.get().getPuntuacion()));	
				return;
				
			}
			
		}
		
		if(!t.tab.puedoMoverme(t.participante)){
			
				if(t.participante.getColor().equals("Color 1")){
				
					t.setPuntuacion(1);
					return;
					
				}else if(t.participante.getColor().equals("Color 2")){
				
					t.setPuntuacion(-1);
					return;		
				}
		
		}
		
		if(t.participante.getColor().contains("Color 1")){
				
			
			if(!t.tab.puedoMoverme(yo)){
				
				t.setPuntuacion(-1);
				return;				
			
			}
			
		}
		
		if(t.participante.getColor().contains("Color 2")){
			
			
			if(!t.tab.puedoMoverme(contrincante)){
				
				t.setPuntuacion(1);				
				return;
								
			}
			
		}
		
		return;
	
		
	}
	
	
	/**	
      * Auxiliar que nos devuelve el máximo de dos números.
      * @param a el primer elemento.
      * @param b el segundo elemento.
      * @return el máximo entre estos dos números.
     */
    private int max(int a, int b){
    	if(a > b){
    		return a;
    	}else if(b > a){
    		return b;
    	}else if(a == b){
    		return a;
    	}
    	return -3;
    }
    
    
    /**	
      * Auxiliar que nos devuelve el mínimo de dos números.
      * @param a el primer elemento.
      * @param b el segundo elemento.
      * @return el mínimo entre estos dos números.
     */
    private int min(int a, int b){
    	if(a < b){
    		return a;
    	}else if(b < a){
    		return b;
    	}else if(a == b){
    		return a;
    	}
    	return -3;
    }
    
    
	/**
	 * Nos hace un tiro al azar si se encuentra un espacio en blanco en el tablero.
	 */
	public void tiroAzar(){
	
		if(!tablero.puedoMoverme(yo)) throw new IllegalArgumentException();
		
		System.out.println("          \033[41mTurno de la Máquina\033[49m");
		
		try{
			    	    
			Thread.sleep(2000);
			
		}catch(Exception e){
		
			System.out.println(e);
			
		}
		
		int p = tablero.posVacia();
		
		Random random = new Random();
		
		int valor = random.nextInt((10 - 1) + 1) + 1;
				
		
		if(valor <= 5){
			try{				
				tablero.mueve(yo, p, 1);
			}catch(IllegalArgumentException iea){
				tablero.mueve(yo, p, 2);
			}
			
		}else{
			try{				
				tablero.mueve(yo, p, 2);
			}catch(IllegalArgumentException iea){
				tablero.mueve(yo, p, 1);
			}			
		}
		
		//tablero.dibujaTablero();	
	}
}




