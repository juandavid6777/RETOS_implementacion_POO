package Juego;

import java.util.Random;
import java.util.Scanner;

public class juego implements piedrapepeltijeras {

    private String nombre;
    private int OpcionUsuario, Opcionpc;

    Scanner captura = new Scanner(System.in);

public void iniciar() {
      System.out.println("ingrese su nick");
      nombre=captura.next();

    }

 public void jugar() {
       System.out.println(nombre+" elija \1. si elije piedra \2. si elije papel \3. si elije tijera");
       OpcionUsuario=captura.nextInt();
       Random aleatorio= new Random();
       Opcionpc=aleatorio.nextInt(3)+1;
       System.out.println("piedra, pepel o tijera");
    }

    
 public void finalizar() {
        System.out.println("elija \1.Piedra \2.Papel \3.Tijera");
        OpcionUsuario = captura.nextInt();
        System.out.print("La pc eligio: ");
        switch ( Opcionpc )
        {
  case 1:
System.out.println("Piedra");
 switch ( OpcionUsuario )
                {
     case 1: System.out.println("Empatan"); 
             break;
        case 2: System.out.println("Ganadoor"); 
        break;
       case 3: System.out.println("La pc es ganador");
       break;
                }
       break;
    case 2:
 System.out.println("Papel");
 switch ( OpcionUsuario )
                {
 case 1: System.out.println("La pc es ganador"); 
       break;
 case 2: System.out.println("Empatan"); 
      break;
     case 3: System.out.println("Ganadoor"); 
       break;
                }
       break;
 
case 3:
 System.out.println("Tijera");
 switch ( OpcionUsuario )
                {
 case final: System.out.println("Ganadoor"); 
     break;
 case finall: System.out.println("La compu es ganador"); 
break;
 case 3: System.out.println("Empatan"); 
break;
                }
break;
        }
    }
}