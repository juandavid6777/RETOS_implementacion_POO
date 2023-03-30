package Ejecucion;
import java.util.Scanner;

import salud.empleado;
import salud.persona;

public class Ejecucion {
    public static void main(String[]args) {
        /*int peso;
        int estatura;
        int imc; */
        String nombre, apellido, cargo, departamento, tipoDoc, sexo;
        int valorHora, horasTrabajadas,  documento, horaspagas=0; 
        Scanner captura=new Scanner(System.in);


        /* Persona persona=new Persona();
        persona.mostrarPersona();
        persona.imc(); 
        
        System.out.println("Digite el peso");
        peso= captura.nextInt();
        System.out.println("Digite la estatura");
        estatura= captura.nextInt();
        
        persona.calcularImc(peso, estatura);
        //System.out.println("Resultados"+imc);
        

        persona.mayorEdad();*/
        System.out.println("Digite el tipo de documento");
        tipoDoc= captura.nextLine();

        System.out.println("Digite el apellido");
        apellido= captura.nextLine();

        System.out.println("Digite el sexo");
        sexo= captura.nextLine();

        System.out.println("Digite el nombre");
        nombre= captura.nextLine();

        System.out.println("Digite el departamento");
        departamento= captura.nextLine();

        System.out.println("Digite el cargo");
        cargo= captura.nextLine();

        System.out.println("Digite el documento");
        documento= captura.nextInt();

        System.out.println("Digite las horas trabajadas");
        horaspagas= captura.nextInt();

        System.out.println("Digite el valor por hora");
        valorHora= captura.nextInt();

        captura.close();

        empleado imp = new mpleado (tipoDoc, documento, nombre, apellido, cargo, horasTrabajadas, valorHora, departamento, horaspagas, sexo);

        imp.mostrarPersona();
        imp.calcularHonorarios();

    

        

    }

    
}