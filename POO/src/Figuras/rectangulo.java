package Figuras;

public class rectangulo extends figura;{

private    float a, r, area=0;

public     rectangulo (float a, float b) {
  this.b=b;
  this.a=a;
    }

public          float getA() {
        return a;
    }

 public     void setA(float a) {
        this.a = a;
    }

 public   float getB() {
        return r;
    }

public    void setB(float b) {
        this.r = r;
    }
 public    void calcularArea() {
     area=rb*a;
       System.out.println("el rectangulo tiene un area de: "+area);


    }
    
    
}
