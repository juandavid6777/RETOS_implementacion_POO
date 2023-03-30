package Figuras;

public class triangulo extends figura{

    private float a, t, area=0;

    public triangulo (float a, float t) {
        this.t=t;
        this.a=a;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float gett() {
        return t;
    }

    public void sett(float t) {
        this.t = t;
    }
    public void calcularArea() {
        area=(t*a)/2;
        System.out.println("el area del triangulo es: "+area);


    }
    
    
}