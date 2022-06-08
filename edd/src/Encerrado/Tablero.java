package edd.src.Encerrado;

import edd.src.Estructuras.*;
import java.util.Random;

/**
 * Clase Tablero, nos representa el tablero y las fichas.
* @author Estrada García Luis Gerardo - 319013832
* @author Hernandez Floriano Eduardo - 319121498
 */
public class Tablero{

	private String dibujo;
	private String ficha;						
	private boolean e1;
	private boolean e2;
	private boolean e3;
	private boolean e4;
	private boolean e5;
	private String[] color = new String[5];
	private String[][] nodos = new String[5][3];
	private Pila<String> mov = new Pila<String>();
	//private String[] nodos = new String[5];
	
	String f1 = "⣴⣿⣿⣿";	
	String ff1 = "⠻⣿⣿⠟";
	
	String f2 = "⣴⣿⣿⣦";
	String ff2 = "⠻⣿⣿⢿";

	String f3 = "⣠⣾⣿⣷⡄";
	String ff3 = "⣹⢿⣿⡿⠃";
					
	String f4 = "⢱⣿⣿⣿⡄";
	String ff4 = "⠘⢿⣿⡿⠃";
	
	String f5 = "⣀⣠⣀";
	String ff5 = "⠠⣿⣿⣿⣷⠄";
	String fff5 = "⠛⠿⠟⠛";
	
	public Tablero(){
		
		dibujo = new String();
		ficha = new String();
		e1 = false;
		e2 = false;
		e3 = false;
		e4 = false;
		e5 = false;
	}
	
	/**
	 * Nos dibuja el tablero en forma de String
	 */
	public void dibujaTablero(){	
			
			dibujo = "";
			dibujo = "\033[1m\033[107m 2 \033[49m                                       \033[107m 3 \033[0m\033[49m\n";
			dibujo = dibujo + f2 + "⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀"+ f3 + "\n";
			dibujo = dibujo + ff2 + "⡉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉" + ff3 + "\n";
			dibujo = dibujo + "⠄⢰⡇⠄⠙⠢⣄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⡴⠚⠁⠄⣿⠄⠄\n";
			dibujo = dibujo + "⠄⢸⡇⠄⠄⠄⠈⠳⢤⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣠⠔⠋⠄⠄⠄⠄⣿⠄⠄\n";
			dibujo = dibujo + "⠄⢸⡇⠄⠄⠄⠄⠄⠄⠙⠦⣄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⡤⠚⠁⠄⠄⠄⠄⠄⠄⣿⠄⠄\n";
			dibujo = dibujo + "⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠈⠳⣤⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣠⠴⠋⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄\n";
			dibujo = dibujo + "⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⢦⣀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⡤⠞⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄\n";
			dibujo = dibujo + "⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠳⣄⡀⠄⠄⠄⠄⠄⠄⣀⡴⠋⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄\n";
			dibujo = dibujo + "⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⢦"+ f5 + "⣠⠞⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄\n";
			dibujo = dibujo + "⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄" + ff5 + "⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄\n";
			dibujo = dibujo + "⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣠⠖"+ fff5 + "⢦⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄\n";
			dibujo = dibujo + "⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⡴⠚⠁⠄⠄⠄⠄⠄⠄⠉⠲⣄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄\n";
			dibujo = dibujo + "⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣠⠖⠋⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠓⢦⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄\n";
			dibujo = dibujo + "⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⢀⡤⠚⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⠲⣄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄\n";
			dibujo = dibujo + "⠄⢸⡇⠄⠄⠄⠄⠄⠄⣠⠴⠋⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠓⢤⡀⠄⠄⠄⠄⠄⠄⣿⠄⠄\n";
			dibujo = dibujo + "⠄⢸⡇⠄⠄⠄⢀⡤⠞⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⠦⣄⠄⠄⠄⠄⣿⠄⠄\n";
			dibujo = dibujo + "⠄⢸⡇⠄⣀⠴⠋⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠳⢤⡀⠄⣿⠄⠄\n";
			dibujo = dibujo + f1 + "⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄" + f4 + "\n";
			dibujo = dibujo + ff1 + "⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄" + ff4 + "\n";
			dibujo = dibujo + "\033[1m\033[107m 1 \033[49m                                       \033[107m 4 \033[0m\033[49m\n";
		
		System.out.println(dibujo);
	}
	/**
	 * Nos dibuja las fichas en forma de String
	 */
	public void dibujaFicha(int o){
	
		if(o == 0){
			System.out.println("  \033[91m⢠⣶⣿⣿⣶⡄    \033[96m⢠⣶⣿⣿⣶⡄    \033[91m⢠⣶⣿⣿⣶⡄    \033[96m⢠⣶⣿⣿⣶⡄");
			System.out.println("  \033[91m⣿⣿⣿⣿⣿⣿    \033[96m⣿⣿⣿⣿⣿⣿    \033[91m⣿⣿⣿⣿⣿⣿    \033[96m⣿⣿⣿⣿⣿⣿");;
			System.out.println("  \033[91m⠘⠿⣿⣿⠿⠃    \033[96m⠘⠿⣿⣿⠿⠃    \033[91m⠘⠿⣿⣿⠿⠃    \033[96m⠘⠿⣿⣿⠿⠃\033[39m");
			System.out.println("  Ficha 1   Ficha 2   Ficha 3   Ficha 4");
		}else if( o == 1){
		
			System.out.println("            \033[91m⢠⣶⣿⣿⣶⡄    \033[91m⢠⣶⣿⣿⣶⡄   ");
			System.out.println("\033[93mJugador 1:  \033[91m⣿⣿⣿⣿⣿⣿    \033[91m⣿⣿⣿⣿⣿⣿   ");
			System.out.println("            \033[91m⠘⠿⣿⣿⠿⠃    \033[91m⠘⠿⣿⣿⠿⠃  \n\033[39m");		
			
			System.out.println("            \033[96m⢠⣶⣿⣿⣶⡄    \033[96m⢠⣶⣿⣿⣶⡄");
			System.out.println("\033[93mJugador 2:  \033[96m⣿⣿⣿⣿⣿⣿    \033[96m⣿⣿⣿⣿⣿⣿");
			System.out.println("            \033[96m⠘⠿⣿⣿⠿⠃    \033[96m⠘⠿⣿⣿⠿⠃\033[39m");
		
		}
		
			
	}
	
	/**
	 * Nos dibuja la posición inicial del tablero por defecto.
	 */
	public void pInicial(){
		
		Random random = new Random();
		int valor = random.nextInt((10 - 1) + 1) + 1;
		
		String color1 = new String();//"\033[91m";
		String color2 = new String(); //"\033[96m";
		
		if(valor <= 5){
			color1 = "\033[91m";
			color2 = "\033[96m";
		}else{			
			color1 = "\033[96m";
			color2 = "\033[91m";		
		}
		
		f2 = color2 + f2 + "\033[39m";
		ff2 = color2 + ff2 + "\033[39m";
		e2 = true;
		
		f4 = color2 + f4 + "\033[39m";
		ff4 = color2 + ff4 + "\033[39m";
		e4 = true;
		
		f1 = color1 + f1 + "\033[39m";
		ff1 = color1 + ff1 + "\033[39m";
		e1 = true;
		
		f3 = color1 + f3 + "\033[39m";
		ff3 = color1 + ff3 + "\033[39m";
		e3 = true;
		
		f5 = "\033[39m" + f5 + "\033[39m";
		ff5 = "\033[39m" + ff5 + "\033[39m";
		fff5 = "\033[39m" + fff5 + "\033[39m";
		//esquinas
		for(int i = 0; i < 5; i++){
		
			for(int o = 0; o < 3; o++){
			
				
					
			}
		
		}		
		
		dibujaTablero();
		
	}
	
	/**
	 * Nos posiciona la ficha en la posición deseada
	 */
	public void mueveFicha(String f, String p){
	
		//String color = new String();
	   	
	   	if(f.contains("1") || f.contains("3")){	
			
			if(p.contains("1") && !e1){
				
				boolean a = true;
				
				if(color[4] != null && color[4].contains("Color 1")){				
					a = false;
				}
				if(color[1] != null && color[1].contains("Color 1")){
					a = false;
				}
				if(color[3] != null && color[3].contains("Color 1")){
					a = false;
				}
				
				if(a){
					
					f1 = "\033[91m" + f1 + "\033[39m";
					ff1 = "\033[91m" + ff1 + "\033[39m";
					e1 = true;
					color[0] = "Color 1";
					
				}else{				
					//System.out.println("primero fui yo");				
					throw new IllegalArgumentException();
				}
				
			}
			
			if(p.contains("2") && !e2){
				
				boolean a = true;
				
				if(color[0] != null && color[0].contains("Color 1")){
					a = false;
				}
				if(color[2] != null && color[2].contains("Color 1")){
					a = false;					
				}
				if(color[4] != null && color[4].contains("Color 1")){
					a = false;
				}
				
				if(a){
					f2 = "\033[91m" + f2 + "\033[39m";
					ff2 = "\033[91m" + ff2 + "\033[39m";
					e2 = true;			
					color[1] = "Color 1";	
				}else{
				
					//System.out.println("primero fui yo");
					throw new IllegalArgumentException();
				}
			
			}
			if(p.contains("3") && !e3){
			
				boolean a = true;
				
				if(color[1] != null && color[1].contains("Color 1") ){
					a = false;				
				}
				if(color[3] != null &&	color[3].contains("Color 1")){
					a = false;				
				}
				
				if(a){
					f3 = "\033[91m" + f3 + "\033[39m";
					ff3 = "\033[91m" + ff3 + "\033[39m";
					e3 = true;
					color[2] = "Color 1";
				}else{					
					//System.out.println("primero fui yo");
					throw new IllegalArgumentException();
				}
			
			}
			if(p.contains("4") && !e4){
			
				boolean a = true;
				
				if(color[4] != null && color[4].contains("Color 1")){
					a = false;
				}
				if(color[2] != null && color[2].contains("Color 1")){
					a = false;
				}
				if(color[0] != null && color[0].contains("Color 1")){
					a = false;
				}
				
				if(a){				
					f4 = "\033[91m" + f4 + "\033[39m";
					ff4 = "\033[91m" + ff4 + "\033[39m";
					e4 = true;
					color[3] = "Color 1";
				}else{
					//System.out.println("primero fui yO");
					throw new IllegalArgumentException();
				}
				
			}
			
			if(p.contains("5") && !e5){
			
				boolean a = true;	
				
				for(int i = 0; i < color.length-1; i++){
				
					if(color[i] != null && color[i].contains("Color 1")){
						a = false;
						break;											
					}	
				
				}						
							
				if(a){
					
					f5 = "\033[91m" + f5 + "\033[39m";
					ff5 = "\033[91m" + ff5 + "\033[39m";
					fff5 = "\033[91m" + fff5 + "\033[39m";
					e5 = true;
					color[4] = "Color 1";
					
				}else{
					//System.out.println("primero fui yo");
					throw new IllegalArgumentException();
				}
			}
		}
		
		//Ficha 2 o 4
		if(f.contains("2") || f.contains("4")){		   		
			
			if((p.contains("1") && !e1)){
				
				
				boolean a = true;
				
				if(color[4] != null && color[4].contains("Color 2")){				
					a = false;
				}
				if(color[1] != null && color[1].contains("Color 2")){
					a = false;
				}
				if(color[3] != null && color[3].contains("Color 2")){
					a = false;
				}
				if(a){
				
					f1 = "\033[96m" + f1 + "\033[39m";
					ff1 = "\033[96m" + ff1 + "\033[39m";
					e1 = true;
					color[0] = "Color 2";
				}else{
					//System.out.println("primero fui yo");
					throw new IllegalArgumentException();
				}
			}
			
			if(p.contains("2") && !e2){
			System.out.println("salsa");
				boolean a = true;
				
				if(color[0] != null && color[0].contains("Color 2")){
					a = false;
				}
				if(color[2] != null && color[2].contains("Color 2")){
					a = false;					
				}
				if(a){
					
					f2 = "\033[96m" + f2 + "\033[39m";
					ff2 = "\033[96m" + ff2 + "\033[39m";
					e2 = true;			
					color[1] = "Color 2";	
				}else{				
					//System.out.println("primero fui yo");
					throw new IllegalArgumentException();
				}				
			}
			
			if(p.contains("3") && !e3){
	
				boolean a = true;
				
				if(color[1] != null && color[1].contains("Color 2") ){
					a = false;				
				}
				if(color[3] != null &&	color[3].contains("Color 2")){
					a = false;				
				}
				if(a){
					f3 = "\033[96m" + f3 + "\033[39m";
					ff3 = "\033[96m" + ff3 + "\033[39m";
					e3 = true;
					color[2] = "Color 2";
				}else{
					//System.out.println("primero fui yo");	
					throw new IllegalArgumentException();			
				}
					
				
			}
			if(p.contains("4") && !e4){
				
				boolean a = true;
				
				if(color[4] != null && color[4].contains("Color 2")){
					a = false;
				}
				if(color[2] != null && color[2].contains("Color 2")){
					a = false;
				}
				if(color[0] != null && color[0].contains("Color 2")){
					a = false;
				}
				
				if(a){	
					
					f4 = "\033[96m" + f4 + "\033[39m";
					ff4 = "\033[96m" + ff4 + "\033[39m";
					e4 = true;
					color[3] = "Color 2";
				}else{
					//System.out.println("Primero fui yo");
					throw new IllegalArgumentException();
				}
			}	
			if(p.contains("5") && !e5){
				
				boolean a = true;	
				
				for(int i = 0; i < color.length-1; i++){
				
					if(color[i] != null && color[i].contains("Color 2")){
						a = false;
						break;											
					}	
				
				}						
				if(a){
					f5 = "\033[96m" + f5 + "\033[39m";
					ff5 = "\033[96m" + ff5 + "\033[39m";
					fff5 = "\033[96m" + fff5 + "\033[39m";
					e5 = true;
					color[4] = "Color 2";			
				}else{
					//System.out.println("primero fui yo");
					throw new IllegalArgumentException();
				}
			}	
		}
		//Está a medias, necesitopulirlo
		dibujaTablero();
	}
	
}
