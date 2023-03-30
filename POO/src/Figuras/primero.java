package Figuras;

import java.util.Scanner;

public class primero {
    public static void main(String[] args) {
        
float a, b, c;
    double r;
    int respuesta=1, figura;

Scanner captura=new Scanner(System.in);

    while (respuesta==1) {
        System.out.println("a que figura quieres sacar el area?. \1. para circulo \2. para triangulo \3. para rectangulo ");
        figura=captura.nextInt();

        switch (figura) {
            case 1:
 System.out.println("cual es el radio del circulo");
     r=captura.nextInt();
         circulo figura1 = new circulo(r);
         figura1.calcularArea();
         System.out.println("ingresa f si quieres terminar el juego, r si quieres continuar con otra figura");
         respuesta=captura.nextInt();
         break;
 case 2:
    System.out.println("Ingresa la altura del triangulo: ");
     a=captura.nextInt();
     System.out.println("Ingresa la base del triangulo: ");
        b=captura.nextInt();

        triangulo figura2 = new triangulo();
        figura2.calcularArea();
         System.out.println("ingresa f si quieres terminar el juego, r si quieres continuar con otra figura");
        respuesta=captura.nextInt();
        break;

case 3:
   System.out.println("cual es  la altura del rectangulo: ");
     a=captura.nextInt();
     System.out.println("cual es la base del rectangulo: ");
    b=captura.nextInt();
        System.out.println("ingresa f si quieres terminar el juego, r si quieres continuar con otra figura");
    respuesta=captura.nextInt();
rectangulo figura3 = new rectangulo(b, a);
            figura3.calcularArea();

            break;
            default:
            System.out.println("no existe figura");
            break;

        }
        
        
    }


}
}