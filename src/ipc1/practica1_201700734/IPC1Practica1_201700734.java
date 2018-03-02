/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipc1.practica1_201700734;

import java.util.InputMismatchException;
import java.util.Scanner;


public class IPC1Practica1_201700734 {

    
    public static void main(String[] args) {
          Scanner sn = new Scanner(System.in);  
            boolean salir = false;                
            
            int opcion;                           
            
              do{                                 
                 System.out.println("Ingresa una de las opciones \n"); 
                 System.out.println("1. Dificultad del juego\n"
                                    + "2. Parámetros iniciales\n"
                                    + "3. Iniciar Juego \n"
                                    + "4. Salir \n");
               
                 try {                             
            
                 opcion= sn.nextInt();             
                 switch (opcion){                  
                     case 1: 
                              dificultadjuego();   
                     break;
                     case 2: 
                              parametros ();
                     break;
                     case 3: 
                         
                     break;
                     case 4: 
                         salir = true;       
                     break;
                     default:
                         System.out.println("Solo seleciones de 1 a 5\n");  
                 }
                 } catch (InputMismatchException e){    
                     System.out.println("Debes insertar un nuemro \n"); 
                     sn.next();                         
                     
                 }
                 
               } while(!salir);                 
    }
 public static boolean dificultad;
public  static void dificultadjuego(){
  Scanner sn = new Scanner(System.in);  
            boolean salir = false;                
            
            int opcion;                           
            
              do{                                 
                 System.out.println("Ingresa la dificultad \n"); 
                 System.out.println("1. Facil\n"                     
                                    + "2. Dificil\n"
                                    + "3. Regresar \n");
               
                 try {                             
            
                 opcion= sn.nextInt();             
                 switch (opcion){                  
                     case 1: 
                            dificultad=true;  
                                   System.out.println("Dificultad Facil seleccionada \n"
                                         + "Jugadores de 2 a 3\n"
                                         + "Subidas 5 a 10\n"
                                         + "Bajones 5 a 10\n");
                             salir = true; 
                     break;
                     case 2: 
                            dificultad=false;
                                    System.out.println("Dificultad Dificil seleccionada \n"
                                         + "Jugadores de 2 a 4\n"
                                         + "Subidas 20 a 40\n"
                                         + "Bajones 20 a 40\n");
                             salir = true; 
                     break;
                     case 3:  
                         salir = true;       
                     break;
                     default:
                         System.out.println("Solo seleciones de 1 a 5\n");  
                 }
                 } catch (InputMismatchException e){    
                     System.out.println("Debes insertar un nuemro \n"); 
                     sn.next();                         
                     
                 }
                 
               } while(!salir); 
    
    
}
public  static void parametros(){
  Scanner sn = new Scanner(System.in);  
            boolean salir = false;                
            
            int opcion;                           
            
              do{                                 
                 System.out.println("Ingresa los Parametros Iniciales \n"); 
                 System.out.println("1. Jugadores\n"
                                    + "2. Subidas y bajones\n"
                                    + "3. Regresar \n");
               
                 try {                             
            
                 opcion= sn.nextInt();             
                 switch (opcion){                  
                     case 1: 
                            jugadores();  
                             salir = true;
                     break;
                     case 2: 
                            subidasybajones();
                            salir = true;
                     break;
                     case 3:  
                         salir = true;       
                     break;
                     default:
                         System.out.println("Solo seleciones de 1 a 5\n");  
                 }
                 } catch (InputMismatchException e){    
                     System.out.println("Debes insertar un nuemro \n"); 
                     sn.next();                         
                     
                 }
                 
               } while(!salir); 
    
    
}
public static String[] nombres;
public static int nojuga;

public static void jugadores(){
    boolean op;
     
    if(dificultad==true) {
        System.out.println("Ingrese el numero de los jugadores(2 a 3 jugadores");
         Scanner juga = new Scanner(System.in);
          Scanner jugas = new Scanner(System.in);
         nojuga= juga.nextInt();
         nombres = new String [nojuga];
                for(int i=0; i< nombres.length; i++) //creamos un ciclo para poder ingresar los nombres
                {
                    System.out.println("Ingrese el nombre de la Persona"); //Mostramos en pantalla
                    nombres [i]= jugas.nextLine();  //guardamos los nombre en un areglo, segun el orden de entrada
                            
                }
                
    }
     if(dificultad==false){
         System.out.println("Ingrese el numero de los jugadores(2 a 4 jugadores");
         Scanner juga = new Scanner(System.in);
          Scanner jugas = new Scanner(System.in);
         nojuga= juga.nextInt();
         nombres = new String [nojuga];
         for(int i=0; i< nombres.length; i++) //creamos un ciclo para poder ingresar los nombres
                {
                    System.out.println("Ingrese el nombre de la Persona"); //Mostramos en pantalla
                    nombres [i]= jugas.nextLine();  //guardamos los nombre en un areglo, segun el orden de entrada
                            
                }
                
        
         }
}
public static int subidas=0,bajadas=0;
public static void subidasybajones(){
    if(dificultad==true) {
        System.out.println("Ingrese el numero de subidas");
         Scanner subi = new Scanner(System.in);
         Scanner baja= new Scanner(System.in);
         subidas= subi.nextInt();
         bajadas= baja.nextInt();
                
}
  if(dificultad==false){
     System.out.println("Ingrese el numero de subidas 5 a 10");
         Scanner subi = new Scanner(System.in);
         Scanner baja= new Scanner(System.in);
         subidas= subi.nextInt();
         bajadas= baja.nextInt(); 
  }
}
}
