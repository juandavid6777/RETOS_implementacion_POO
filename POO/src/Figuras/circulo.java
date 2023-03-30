package Figuras;

public class circulo extends figura {
private double c;


 public circulo (Double c) {
    this.c=c;
 }

public Double getR() {
    return c;
}

public void setR(Double c) {
    this. c = c;
}

public void calcularArea() {
    double pi= 3.1416;
    double area= (c*c)*pi;
    System.out.println("el circulo tiene un area de: "+area);
}
    
}
