package edd.src.Encerrado;

import edd.src.Estructuras.*;
import java.util.Random;

/**
 * Clase Maquina, es donde se moverá nuestro árbol
* @author Estrada García Luis Gerardo - 319013832
* @author Hernandez Floriano Eduardo - 319121498
 */
public class Maquina{

	public ArbolBinarioCompleto<Integer> mini;
	public Tablero tablero;
	public String[] colores;
	private Jugador jug;
	private boolean azar;
	private boolean minimax;
	
	public Maquina(){
			
		jug = new Jugador();
		mini = new ArbolBinarioCompleto<Integer>();	
		tablero = new Tablero();
		jug.setFicha("\033[96m");
		jug.setColor("Color 2");
	}
	
	public Maquina(Tablero t){
		
		jug = new Jugador();
		mini = new ArbolBinarioCompleto<Integer>();	
		tablero = t;
		colores = t.getColores();
		jug.setFicha("\033[96m");
		jug.setColor("Color 2");
	
	}	
	
	public void setAzar(boolean a){
		
		this.azar = a;
	
	}
	
	public void setMinimax(boolean m){
	
		this.minimax = m;
	
	}
	
	public void tira(){
		
		if(minimax){
		
		}else if(azar){
			tiroAzar();			
		}
	}
	
	public void minimax(){
	
		
	
	}
	
	public void tiroAzar(){
	
		if(!tablero.puedoMoverme(jug)) throw new IllegalArgumentException();
		
		System.out.println("          \033[41mTurno de la Máquina\033[49m");
		
		int p = tablero.posVacia();
		
		Random random = new Random();
		
		int valor = random.nextInt((10 - 1) + 1) + 1;
		
		
		
		if(valor <= 5){
			try{				
				tablero.mueve(jug, p, 1);
			}catch(IllegalArgumentException iea){
				tablero.mueve(jug, p, 2);
			}
			
		}else{
			try{				
				tablero.mueve(jug, p, 2);
			}catch(IllegalArgumentException iea){
				tablero.mueve(jug, p, 1);
			}			
		}
		
	}
}




