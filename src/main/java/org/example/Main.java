package org.example;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
   public static void main(String []arg){

      //RECIBIR DATOS USUARIO
      Scanner lea = new Scanner(System.in);
      String nombreJugador;
      String opcionJugador;
      String opcionPC;
      final String nombrePc="PRODESK";
      boolean bandera = false;

      // INTERFAZ DE BIENVANIDA
      System.out.println("*******     *     *******");
      System.out.println("** SCISSORS PAPER GAME **");
      System.out.println("*******     *     *******");

      System.out.print("Digita tu userName: ");
      nombreJugador= lea.nextLine();

      System.out.print("Juega, escribe tu opcio de juego (piedra, papel y tijera): ");
      opcionJugador= lea.nextLine().toLowerCase();

      //PROBAR EL BLOQUE UNO
      System.out.println("nombre: "+nombreJugador);
      System.out.println("opcion: "+opcionJugador);

      //3.CLASIFICAR DATOS INGRESADOS //3.CREAR BANDERA
      if (opcionJugador.equals("piedra")|| opcionJugador.equals("papel") || opcionJugador.equals("tijera")){

         bandera=true;
         System.out.println("la opcion es correcta");

      }
      else{
         bandera=false;
         System.out.println("la opcion es incorrecta");

      }
      //IMPLEMENTAR CICLO(3 REPETICIONES)
      int contador=0;
      while (contador<3 && bandera){
         //contador=contador+1;
         contador++;

         // 5. GENERANDO LA OPCION DEL COMPUTADOR
         Random aleatoria=new Random();
         int numeroAleatorio= aleatoria.nextInt(3);
         System.out.println(numeroAleatorio);

         if (numeroAleatorio==0){
            opcionPC="piedra";
         }
         else if(numeroAleatorio==1){
            opcionPC="papel";

         }
         else{
            opcionPC="tijera";
         }
         System.out.println("el usuario elige :"+opcionJugador);
         System.out.println("el computador elige :"+opcionPC);
         System.out.println("---------------------");

         //6.ELEGIR EL GANADOR
         if (opcionJugador.equals("piedra") && opcionPC.equals("piedra")){
            System.out.println("EMPATE");
         }
         else if (opcionJugador.equals("piedra") && opcionPC.equals("papel")) {
            System.out.println("GANA " +nombrePc);
         }
         else if (opcionJugador.equals("piedra") && opcionPC.equals("tijera")) {
            System.out.println("GANA " +nombreJugador);
         }
         else if (opcionJugador.equals("tijera") && opcionPC.equals("tijera")) {
            System.out.println("EMPATE");
         }
         else if (opcionJugador.equals("tijera") && opcionPC.equals("papel")) {
            System.out.println("GANA " +nombreJugador);
         }
         else if (opcionJugador.equals("tijera") && opcionPC.equals("piedra")) {

         }
         else if (opcionJugador.equals("papel") && opcionPC.equals("papel")) {
            System.out.println("EMPATE");
         }
         else if (opcionJugador.equals("papel") && opcionPC.equals("tijera")) {
            System.out.println("GANA " +nombrePc);
         }
         else if (opcionJugador.equals("papel") && opcionPC.equals("piedra")){
            System.out.println("GANA " +nombreJugador);
         }else {

         }

      }

   }
}