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
	
	
	String r1 = "⣴⣿⣿⣿";	
	String rr1 = "⠻⣿⣿⠟";
	
	String r2 = "⣴⣿⣿⣦";
	String rr2 = "⠻⣿⣿⢿";

	String r3 = "⣠⣾⣿⣷⡄";
	String rr3 = "⣹⢿⣿⡿⠃";
					
	String r4 = "⢱⣿⣿⣿⡄";
	String rr4 = "⠘⢿⣿⡿⠃";
	
	String r5 = "⣀⣠⣀";
	String rr5 = "⠠⣿⣿⣿⣷⠄";
	String rrr5 = "⠛⠿⠟⠛";
	
	public Tablero(){
		
		dibujo = new String();
		ficha = new String();
		e1 = false;
		e2 = false;
		e3 = false;
		e4 = false;
		e5 = false;
	}
	
	public String[] getColores(){
		return this.color;		
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
		String a = new String();
		String b = new String();
		
		if(valor <= 5){
			color1 = "\033[91m";
			color2 = "\033[96m";	
			a = "Color 1";	
			b = "Color 2";
		}else{			
			color1 = "\033[96m";
			color2 = "\033[91m";		
			a = "Color 2";	
			b = "Color 1";
		}
		
		f2 = color2 + r2 + "\033[39m";
		ff2 = color2 + rr2 + "\033[39m";
		color[1] = b;
		e2 = true;
		
		f4 = color2 + r4 + "\033[39m";
		ff4 = color2 + rr4 + "\033[39m";
		color[3] = b;
		e4 = true;
		
		f1 = color1 + r1 + "\033[39m";
		ff1 = color1 + rr1 + "\033[39m";
		color[0] = a;
		e1 = true;
		
		f3 = color1 + r3 + "\033[39m";
		ff3 = color1 + rr3 + "\033[39m";
		color[2] = a;
		e3 = true;
		
		f5 = "\033[39m" + r5 + "\033[39m";
		ff5 = "\033[39m" + rr5 + "\033[39m";
		fff5 = "\033[39m" + rrr5 + "\033[39m";
		color[4] = null;
		//esquinas
		/*for(int i = 0; i < 5; i++){
		
			for(int o = 0; o < 3; o++){
			
				
					
			}
		
		}*/		
		
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
		
		dibujaTablero();
	}
	
	/**
	 * Nos mueve el tablero de acuerdo al tiro del jugador correspondiente
	 */
	public void mueve(Jugador j, int p, int f){
	
		if(j == null){
			System.out.println("pendiente");
			return;
		}
		
		if(p < 1 || p > 5){
			
			throw new IllegalArgumentException();
		
		}		
		
		String tinte = j.getColor();
		String ficha = j.getFicha();
		
		if(!puedoMoverme(f, tinte)) throw new IllegalArgumentException();		
		
		for(int i = 0; i < color.length; i++){
				//System.out.println("- " + i + " - " + color[i] );
				System.out.println("Color "+ i + " " + color[i]);
				
		}
		//System.out.println(ficha  + "   " + tinte + color[4]);  verde
		
		if(p == 1 && !e1){
				System.out.println("C1 ");
				boolean a = true;			
				/*
				if(color[4] != null && color[4].contains(tinte)){				
					a = false;
				}
				if(color[1] != null && color[1].contains(tinte)){
					a = false;
				}
				if(color[3] != null && color[3].contains(tinte)){
					a = false;
				}
				*/
				if(a){
					eliminaPrimeraA(f, tinte);
					f1 = ficha + r1.toString() + "\033[39m";
					ff1 = ficha + rr1 + "\033[39m";
					e1 = true;
					color[0] = tinte;
					
				}else{				
					//System.out.println("primero fui yo");				
					throw new IllegalArgumentException();
				}
				
		}else if(p == 1 && e1){
			
			throw new IllegalArgumentException();
			
		}
			
			if(p == 2 && !e2){
				System.out.println("C2 ");
				boolean a = true;
				/*
				if(color[0] != null && color[0].contains(tinte)){
					a = false;
				}
				if(color[2] != null && color[2].contains(tinte)){
					a = false;					
				}
				if(color[4] != null && color[4].contains(tinte)){
					a = false;
				}
				*/
				if(a){
				eliminaPrimeraA(f, tinte);
					f2 = ficha + r2 + "\033[39m";
					ff2 = ficha + rr2 + "\033[39m";
					e2 = true;			
					color[1] = tinte;	
				}else{
				
					//System.out.println("primero fui yo");
					throw new IllegalArgumentException();
				}
			
			}else if(p == 2 && e2){
			
				throw new IllegalArgumentException();
				
			}
		
			if(p == 3 && !e3){
			System.out.println("C3 ");
				boolean a = true;
				/*
				if(color[1] != null && color[1].contains(tinte) ){
					a = false;				
				}
				if(color[3] != null &&	color[3].contains(tinte)){
					a = false;				
				}
				*/
				if(a){
				eliminaPrimeraA(f, tinte);
					f3 = ficha + r3 + "\033[39m";
					ff3 = ficha + rr3 + "\033[39m";
					e3 = true;
					color[2] = tinte;
				}else{					
					//System.out.println("primero fui yo");
					throw new IllegalArgumentException();
				}
				
			}else if(p == 3 && e3){
			
				throw new IllegalArgumentException();
			
			}
		
		
			if(p == 4 && !e4){
			System.out.println("C4 ");
				boolean a = true;
				/*
				if(color[4] != null && color[4].contains(tinte)){
					a = false;
				}
				if(color[2] != null && color[2].contains(tinte)){
					a = false;
				}
				if(color[0] != null && color[0].contains(tinte)){
					a = false;
				}
				*/
				if(a){			
				eliminaPrimeraA(f, tinte);	
					f4 = ficha + r4 + "\033[39m";
					ff4 = ficha + rr4 + "\033[39m";
					e4 = true;
					color[3] = tinte;
				}else{
					//System.out.println("primero fui yO");
					throw new IllegalArgumentException();
				}
				
			}else if(p == 4 && e4){
			
				throw new IllegalArgumentException();
				
			}
		
			
			if(p == 5 && !e5){
			System.out.println("C5 ");
				boolean a = true;	
				/*
				for(int i = 0; i < color.length-1; i++){
				System.out.println("- " + i + " - " + color[i] );
					if(color[i] != null && color[i].contains(tinte)){
						System.out.println("--");
						a = false;
						break;											
					}	
				
				}						
				*/		
				if(a){
					eliminaPrimeraA(f, tinte);
					f5 = ficha + r5 + "\033[39m";
					ff5 = ficha + rr5 + "\033[39m";
					fff5 = ficha + rrr5 + "\033[39m";
					e5 = true;
					color[4] = tinte;
					
				}else{
					//System.out.println("primero fui yo");
					throw new IllegalArgumentException();
				}
			}else if(p == 5 && e5){
			
				throw new IllegalArgumentException();
			
			}
			
			System.out.println("----------------------------------------------------primero fui yo");
			//Borra la primera aparición de la ficha del color del jugador( a la izquierda)
		
		for(int i = 0; i < color.length; i++){
				//System.out.println("- " + i + " - " + color[i] );
				System.out.println("Color "+ i + " " + color[i]);
				
			}
			
		dibujaTablero();
	}
	
	
	/**
	 * Nos elimina la parimera aparición de la ficha del color deseado.
 	 * La primera aparición se cuenta de izquierda a derecha.
	 */
	private void eliminaPrimeraA(int f, String tinte){	
		
		if(f == 1){
			for(int i = 0; i < color.length-1; i++){
				System.out.println("- " + i + " - " + color[i] );
					if(color[i] != null && color[i].contains(tinte)){
						//System.out.println("--");
						//a = false;
						borra(i+1);
						
						break;											
					}else if(i == 1 && color[i] != null){
						
						if(color[4] != null && color[4].contains(tinte)){
							
							borra(5);
							
						}
					}	
				
			}
		}
		//Borra la segunda aparición de la ficha del color del jugador (a la derecha)
		if(f == 2){
			
			for(int i = 0; i < color.length-1; i++){
				System.out.println("--- " + (3-i) + " --- " + color[3-i] );
					if(color[3-i] != null && color[3-i].contains(tinte)){
						//System.out.println("--");
						//a = false;
						borra((3-i)+ 1);
						
						break;											
					}else if(3-i == 2 && color[3-i] != null){
						
						if(color[4] != null && color[4].contains(tinte)){
							
							borra(5);
							
						}
					}	
				
			}
		
		}	
		
		
	}
	
	private boolean puedoMoverme(int f, String tinte){
	
		boolean a = false;
		if(f == 1){
		
			for(int i = 0; i < color.length-1; i++){
				//System.out.println("- " + i + " - " + color[i] );
					if(color[i] != null && color[i].contains(tinte)){
						//System.out.println("--");
						//a = false;
						//borra(i+1);
						if(i == 0){
							
							if(color[1] == null) a = true;	
							if(color[4] == null) a = true;
												
						}
						if(i == 1){
							
							if(color[0] == null) a = true;
							if(color[2] == null) a = true;
							if(color[4] == null) a = true;						
						}
						if(i == 2){
							
							if(color[1] == null) a = true;
							if(color[3] == null) a = true;
							if(color[4] == null) a = true;							
						
						}
						if(i == 3){
						
							if(color[2] == null) a = true;
							if(color[4] == null) a = true;						
						}						
						break;											
											
					}else if(i == 1 && color[i] != null){
						
						if(color[4] != null && color[4].contains(tinte)){
							
							//if(i == 4){
							for(int b = 0; b < color.length-1; b++){
				
								if(color[b] == null){
									a = true;
								//break;											
								}	
				
							}	
								
							
							//}
							
						}
					}	
				
			}
		}
		//Borra la segunda aparición de la ficha del color del jugador (a la derecha)
		if(f == 2){
			
			for(int i = 0; i < color.length-1; i++){
				System.out.println("--- " + (3-i) + " --- " + color[3-i] );
					if(color[3-i] != null && color[3-i].contains(tinte)){
						
						if(3-i == 0){
							
							if(color[1] == null) a = true;	
							if(color[4] == null) a = true;
												
						}
						if(3-i == 1){
							
							if(color[0] == null) a = true;
							if(color[2] == null) a = true;
							if(color[4] == null) a = true;						
						}
						if(3-i == 2){
							
							if(color[1] == null) a = true;
							if(color[3] == null) a = true;
							if(color[4] == null) a = true;							
						
						}
						if(3-i == 3){
						
							if(color[2] == null) a = true;
							if(color[4] == null) a = true;						
						}						
						break;
																
					}else if(3-i == 2 && color[3-i] != null){
						
						if(color[4] != null && color[4].contains(tinte)){
							
							for(int b = 0; b < color.length-1; b++){
				
								if(color[b] == null){
									a = true;
								//break;											
								}	
				
							}
							
						}
					}	
				
			}
		
		}
		return a;	

	}


	/**
	 * Nos dice si alguna ficha del jugador tiene la posibilidad de moverse
	 */
	public boolean puedoMoverme(Jugador j){
	
		String tinte = j.getColor();

		boolean a = false;

		for(int i = 0; i < color.length; i++){
			if(color[i] != null)
			System.out.println(!color[i].equals(tinte) + " caki " + i );
			
			if(color[i] != null && !color[i].equals(tinte)){
				
				continue;
			
			}
			
			if(i == 0 && e1){
								
				//boolean a = true;
				
				if(color[4] == null){				
					a = true;
				}
				if(color[1] == null){
					a = true;
				}
								
				//return a;
			
			
			}else if(i == 1 && e2){
			//System.out.println("salsa");
				//boolean a = true;
				
				if(color[0] == null){
					a = true;
				}
				if(color[2] == null){
					a = true;					
				}
				if(color[4] == null){				
					a = true;
				}
				/*
				if(a){
					
					f2 = "\033[96m" + f2 + "\033[39m";
					ff2 = "\033[96m" + ff2 + "\033[39m";
					e2 = true;			
					color[1] = "Color 2";	
				}else{				
					//System.out.println("primero fui yo");
					throw new IllegalArgumentException();
				}*/
				//return a;				
			
			
			}else if(i == 2 && e3){
	
				//boolean a = true;
				
				if(color[1] == null){
					a = true;				
				}
				if(color[3] == null){
					a = true;				
				}
				if(color[4] == null){				
					a = true;
				}
				/*
				if(a){
					f3 = "\033[96m" + f3 + "\033[39m";
					ff3 = "\033[96m" + ff3 + "\033[39m";
					e3 = true;
					color[2] = "Color 2";
				}else{
					//System.out.println("primero fui yo");	
					throw new IllegalArgumentException();			
				}
				*/
				
			
			}else if(i == 3 && e4){
				
				//boolean a = true;
				
				if(color[4] == null){
					a = true;
				}
				if(color[2] == null){
					a = true;
				}
				/*
				if(a){	
					
					f4 = "\033[96m" + f4 + "\033[39m";
					ff4 = "\033[96m" + ff4 + "\033[39m";
					e4 = true;
					color[3] = "Color 2";
				}else{
					//System.out.println("Primero fui yo");
					throw new IllegalArgumentException();
				}*/
				
			}else if(i == 4 && e5){
				
				//boolean a = true;	
				
				for(int o = 0; o < color.length-1; o++){
				
					if(color[o] == null){
						return true;															
					}	
				
				}
				
				//return false;	
				/*	
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
				*/
			}
			
			
				
		
		}	
		System.out.println(" aaa " + a);			
		return a;
	}	
	
	/**
	 * Nos elimina el color de vértice que le den por argumento
	 * Dando la sensación de que se movió la ficha
	 */
	private void borra(int i){
		
		if(i == 1){
		
			f1 = r1;
			ff1 =  rr1;
			e1 =  false;			
			color[0] = null;
		
		}
		if(i == 2){
		
			f2 = r2;
			ff2 = rr2;
			e2 =  false;			
			color[1] = null;
		
		}
		if(i == 3){
		
			f3 = r3;
			ff3 = rr3;
			e3 =  false;			
			color[2] = null;
		
		}
		if(i == 4){
		
			f4 = r4;
			ff4 = rr4;
			e4 =  false;			
			color[3] = null;
		
		}
		if(i == 5){
		
			f5 = r5;
			ff5 = rr5;
			fff5 = rrr5;
			e5 = false;
			color[4] = null;
		
		}
	
	}
	
}
