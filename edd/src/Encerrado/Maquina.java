package edd.src.Encerrado;

import edd.src.Estructuras.*;
import java.util.Random;

/**
 * Clase Maquina, es donde se moverá nuestro árbol
* @author Estrada García Luis Gerardo - 319013832
* @author Hernandez Floriano Eduardo - 319121498
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
	
	public void setMinimax(boolean m){
	
		this.minimax = m;
	
	}
	
	public void tira(){
		
		if(minimax){
		
			mini();
			
		}else if(azar){
		
			tiroAzar();			
			
		}
	}
	
	public void mini(){
	
		System.out.println("          \033[41mTurno de la Máquina\033[49m");
		
		Cola<Tiro> cola = new Cola<Tiro>();
		
		Tiro t = new Tiro(tablero, yo);//Estaba tablero.clone()
		
		mini.add(t);
		
		cola.push(t);
		
		System.out.println("Altura inicial" + mini.altura());
		
		int altura = mini.altura();
		
		//Nos ayuda a saber el número de nodos de acuerdo a la profundidad 3.		
		int f = potenciaDos(3);
		
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
		
		//Tiro v = cola.pop();
		//tMinimax(cola, v, yo);
		System.out.println("Altura " + mini.altura() + " con elementos " + mini.size());
		
		
		
		eligeOp(mini.vertice(mini.raiz()));
		this.tablero = t.tab;
		System.out.println(mini.toString());
		System.out.println(this.tablero);
		
	}
	
	 private int potenciaDos(int a){
    	
    	int f = 1;
    	
    	for(int i = 1; i <= a; i++){
		
			f *= 2;
			
		}
    	return f;
    }
    
	public void tMinimax(Cola<Tiro> cola, Tiro t, Jugador jug){
	
		
		
		System.out.println("--------------------------------Pruebas de arbol--------------");		
			
		
		Tiro te = new Tiro(t.tab.clone(), jug);		//new Tiro(tablero.clone(), yo);
								
		
		try{
			/* Aqui se puede mejorar el t.opciones para que sea más facil elegir puntuación
			 * se me ocurrió poner el jugador de manera distinta, ya que se elegirá al jugador contrario(por lo de minimax)
			*/
			te.opciones(1);
		
		}catch(Exception e){
			
			//System.out.println("Puedo? " + te.tab.puedoMoverme(jug));		
			if(!te.tab.puedoMoverme(jug)){	
			
				if(jug.getColor().equals("Color 1")){
				
					te.setPuntuacion(1);
				
				}else if(jug.getColor().equals("Color 2")){
				
					te.setPuntuacion(-1);
				
				}
				mini.add(te);
				cola.push(te);
				
			}
			//return;
			//System.out.println("whysky");
			
		}
		
		mini.add(te);
		cola.push(te);
		
		te = new Tiro(t.tab.clone(), jug);
		
		try{
		
			te.opciones(2);
		
		}catch(Exception e){
			
			//System.out.println("Puedo? " + te.tab.puedoMoverme(jug));
			if(!te.tab.puedoMoverme(jug)){
				
				if(jug.getColor().equals("Color 1")){
				
					te.setPuntuacion(1);
				
				}else if(jug.getColor().equals("Color 2")){
				
					te.setPuntuacion(-1);
				
				}
				mini.add(te);
				cola.push(te);
				
			}
			System.out.println("whysky");
			//return;
		}
		
		mini.add(te);
		cola.push(te);
		
		
		System.out.println("--------------Pruebas minimacs------------");
	}
	
	public void eligeOp(ArbolBinario<Tiro>.Vertice v){
	
		if(v == null){
			
			return;
			
		}	
		
		Tiro t = v.get();
	
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
		
		
		if(!v.hayPadre()){		
			
			t.setPuntuacion(max(i.get().getPuntuacion(), d.get().getPuntuacion()));
			
			String a = "";
			
			if(max(i.get().getPuntuacion(), d.get().getPuntuacion()) ==  i.get().getPuntuacion()){
				a = "izquierdo";
			}
			
			if(max(i.get().getPuntuacion(), d.get().getPuntuacion()) ==  d.get().getPuntuacion()){
				a = "derecho";
			}
			
			if(a.contains("derecho")) t.opciones(2);
			if(a.contains("izquierdo")) t.opciones(1);
			
			//t.tab.dibujaTablero();//Creo que aquí es el error
			
			System.out.println("He llegado a la raíz y elijo " + t.getPuntuacion() + " " + a);
			
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
		
		tablero.dibujaTablero();	
	}
}




