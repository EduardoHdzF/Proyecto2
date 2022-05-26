package edd.src.Estructuras;
public class Practica3 {
    
    public static void sumaCercana(Lista lista, int N){

    }
    public static void permutacionesCadena(String cadena){

    }
    public static void primosQueSuman(int S, int P, int N){

    }
    public static void N_Reinas(int N){

    }

    public static void main(String[] args) {
        //Puedes hacer tus pruebas aqui
       
        
        //ArbolBinarioCompleto<Integer> ola = new ArbolBinarioCompleto<Integer>();
        //ArbolBinarioBusqueda<Integer> ola = new ArbolBinarioBusqueda<Integer>();
        ArbolAVL<Integer> ola = new ArbolAVL<Integer>();
		
		/*ola.add(2);
		ola.add(1);
		ola.add(3);
		ola.add(4);
		ola.add(0);
		ola.add(-1);
		ola.add(8);
		
		ola.add(10);
		ola.add(9);
		ola.add(11);
		
		ola.add(-15);
		ola.add(-12);
		
		System.out.println("Original \n" + ola.toString() + "\n" + ola.size());		
        ola.search(10);
        
        
        System.out.println("Borro 2 " + ola.delete(2)+ " \n" + ola.toString());
        
        //ola.search(10);	
        //System.out.println("Borro 8 " + ola.delete(8)+ " \n" + ola.toString());
        
        //System.out.println("Borro 11 " + ola.delete(11)+ " \n" + ola.toString());
        
        //System.out.println("Borro 10 " + ola.delete(10)+ " \n" + ola.toString());
        
        //System.out.println("Borro 1 " + ola.delete(1)+ " \n" + ola.toString());
        
        //System.out.println("Borro 0 " + ola.delete(0)+ " \n" + ola.toString());
        
        //System.out.println("Borro 3 " + ola.delete(3)+ " \n" + ola.toString());
        System.out.println("Borro 9 " + ola.delete(9)+ " \n" + ola.toString());
        Integer a = 2;
        //System.out.println(a.equals(2));
        //System.out.println(a.compareTo(0));
        */
        ola.add(10);
        ola.add(20);
        ola.add(30);
        ola.add(5);
        ola.add(7);
        ola.add(15);
        ola.add(40);
        
        System.out.println("Original \n" + ola.toString() + "\n" + ola.size());		
        
        System.out.println("Borro 7 " + ola.delete(7)+ " \n" + ola.toString());
        System.out.println("Borro 30 " + ola.delete(30)+ " \n" + ola.toString());
        System.out.println("Borro 40 " + ola.delete(40)+ " \n" + ola.toString() + ola.size());


	System.out.println("⣴⣿⣿⣦⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣠⣾⣿⣷⡄");
	System.out.println("⠻⣿⣿⢿⡉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⣹⢿⣿⡿⠃");
	System.out.println("⠄⢰⡇⠄⠙⠢⣄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⡴⠚⠁⠄⣿⠄⠄");
System.out.println("⠄⢸⡇⠄⠄⠄⠈⠳⢤⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣠⠔⠋⠄⠄⠄⠄⣿⠄⠄");
System.out.println("⠄⢸⡇⠄⠄⠄⠄⠄⠄⠙⠦⣄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⡤⠚⠁⠄⠄⠄⠄⠄⠄⣿⠄⠄");
System.out.println("⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠈⠳⣤⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣠⠴⠋⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄");
System.out.println("⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⢦⣀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⡤⠞⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄");
System.out.println("⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠳⣄⡀⠄⠄⠄⠄⠄⠄⣀⡴⠋⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄");
System.out.println("⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⢦⣀⣠⣀⣠⠞⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄");
System.out.println("⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠠⣿⣿⣿⣷⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄");
System.out.println("⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣠⠖⠛⠿⠟⠛⢦⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄");
System.out.println("⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⡴⠚⠁⠄⠄⠄⠄⠄⠄⠉⠲⣄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄");
System.out.println("⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣠⠖⠋⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠓⢦⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄");
System.out.println("⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⢀⡤⠚⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⠲⣄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄");
System.out.println("⠄⢸⡇⠄⠄⠄⠄⠄⠄⣠⠴⠋⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠓⢤⡀⠄⠄⠄⠄⠄⠄⣿⠄⠄");
System.out.println("⠄⢸⡇⠄⠄⠄⢀⡤⠞⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⠦⣄⠄⠄⠄⠄⣿⠄⠄");
System.out.println("⠄⢸⡇⠄⣀⠴⠋⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠳⢤⡀⠄⣿⠄⠄");
System.out.println("⣴⣿⣿⣿⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢱⣿⣿⣿⡄");
System.out.println("⠻⣿⣿⠟⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠘⢿⣿⡿⠃");

System.out.println("⣠⣾⣿⣿⣦⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣴⣾⣿⣷⣦⠄");
System.out.println("⣿⣿⣿⣿⣿⡗⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⣿⣿⣿⣿⣿⠇");
System.out.println("⠈⠻⢿⡿⠛⢶⣄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣀⡴⠛⠻⣿⠟⠋⠄");
System.out.println("⠄⠄⢸⡇⠄⠄⠉⠳⣦⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⣠⠞⠋⠄⠄⠄⣿⠄⠄⠄");
System.out.println("⠄⠄⢸⡇⠄⠄⠄⠄⠈⠙⢶⣄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣀⡴⠛⠁⠄⠄⠄⠄⠄⣿⠄⠄⠄");
System.out.println("⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠉⠳⣦⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⣠⠞⠋⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄");
System.out.println("⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⢶⣄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣠⡴⠛⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄");
System.out.println("⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠻⣦⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⣤⠞⠋⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄");
System.out.println("⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⢷⣄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣠⡴⠛⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄");
System.out.println("⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠻⣦⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⣤⠞⠋⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄");
System.out.println("⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⢷⣄⠄⠄⠄⠄⠄⠄⠄⣠⡴⠛⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄");
System.out.println("⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠻⢦⣤⣶⣤⣤⠞⠋⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄");
System.out.println("⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⣿⣿⣿⣿⡆⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄");
System.out.println("⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⣤⠿⣿⣿⣿⠿⢧⣀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄");
System.out.println("⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣠⡴⠛⠁⠄⠄⠄⠄⠄⠄⠙⠷⣄⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄");
System.out.println("⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⣤⠞⠋⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠻⢦⣀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄");
System.out.println("⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣠⡴⠛⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⠷⣄⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄");
System.out.println("⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⣤⠞⠉⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠛⢦⣀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄");
System.out.println("⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣠⡴⠋⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⠳⣤⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄");
System.out.println("⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⢀⣴⠞⠉⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠛⢦⣄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄");
System.out.println("⠄⠄⢸⡇⠄⠄⠄⠄⠄⣠⡶⠋⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⠳⣤⡀⠄⠄⠄⠄⠄⣿⠄⠄⠄");
System.out.println("⠄⠄⢸⡇⠄⠄⢀⣴⠞⠉⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠛⢦⣄⠄⠄⠄⣿⠄⠄⠄");
System.out.println("⢀⣴⣾⣷⣤⡶⠋⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⠓⣠⣴⣿⣶⣄⠄");
System.out.println("⣿⣿⣿⣿⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⣿⣿⣿⣿⡆");
System.out.println("⠙⠿⣿⡿⠟⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠹⢿⣿⡿⠟⠄");

System.out.println("\033[1m \033[107m 1 \033[49m                                                     \033[107m 2 \033[0m\033[49m");
System.out.println("⣠⣾⣿⣿⣦⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣴⣾⣿⣷⣦⠄");
System.out.println("⣿⣿⣿⣿⣿⡗⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⣿⣿⣿⣿⣿⠇");
System.out.println("⠈⠻⢿⡿⠛⢶⣄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣀⡴⠛⠻⣿⠟⠋⠄");
System.out.println("⠄⠄⢸⡇⠄⠄⠉⠳⣦⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⣠⠞⠋⠄⠄⠄⣿⠄⠄⠄");
System.out.println("⠄⠄⢸⡇⠄⠄⠄⠄⠈⠙⢶⣄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣀⡴⠛⠁⠄⠄⠄⠄⠄⣿⠄⠄⠄");
System.out.println("⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠉⠳⣦⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⣠⠞⠋⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄");
System.out.println("⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⢶⣄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣠⡴⠛⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄");
System.out.println("⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠻⣦⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⣤⠞⠋⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄");
System.out.println("⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⢷⣄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣠⡴⠛⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄");
System.out.println("⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠻⣦⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⣤⠞⠋⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄");
System.out.println("⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⢷⣄⠄⠄⠄⠄⠄⠄⠄⣠⡴⠛⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄");
System.out.println("⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠻⢦⣤⣶⣤⣤⠞⠋⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄");
System.out.println("⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⣿⣿⣿⣿⡆⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄");
System.out.println("⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⣤⠿⣿⣿⣿⠿⢧⣀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄");
System.out.println("⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣠⡴⠛⠁⠄⠄⠄⠄⠄⠄⠙⠷⣄⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄");
System.out.println("⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⣤⠞⠋⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠻⢦⣀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄");
System.out.println("⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣠⡴⠛⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⠷⣄⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄");
System.out.println("⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⣤⠞⠉⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠛⢦⣀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄");
System.out.println("⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣠⡴⠋⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⠳⣤⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄");
System.out.println("⠄⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⢀⣴⠞⠉⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠛⢦⣄⠄⠄⠄⠄⠄⠄⠄⠄⣿⠄⠄⠄");
System.out.println("⠄⠄⢸⡇⠄⠄⠄⠄⠄⣠⡶⠋⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⠳⣤⡀⠄⠄⠄⠄⠄⣿⠄⠄⠄");
System.out.println("⠄⠄⢸⡇⠄⠄⢀⣴⠞⠉⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠛⢦⣄⠄⠄⠄⣿⠄⠄⠄");
System.out.println("⢀⣴⣾⣷⣤⡶⠋⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠙⠓⣠⣴⣿⣶⣄⠄");
System.out.println("⣿⣿⣿⣿⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⣿⣿⣿⣿⡆");
System.out.println("⠙⠿⣿⡿⠟⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠹⢿⣿⡿⠟⠄");
System.out.println("\033[1m \033[107m 3 \033[49m                                                      \033[107m 4 \033[0m\033[49m");

System.out.println("⢠⣶⣿⣿⣶⡄");
System.out.println("⣿⣿⣿⣿⣿⣿");
System.out.println("⠘⠿⣿⣿⠿⠃");


    }
    
}
