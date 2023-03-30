package salud;

import java.util.Scanner;


public  persona {
    public String tipoDoc;
    public String nombre;
    public String apellido;
    public String sexo;
    public int documento;
    public int edad;
    public float peso;

    public persona(String tipodoc, int documento, String nombre, String apellido, int edad, String sexo) {

    }
    public persona() {

    }

    public void solicitarrDatos() {
        Scanner captura=new Scanner(System.in);

        System.out.println("Digite el tipo de documento");
        tipoDocumento= captura.nextLine();
        System.out.println("Digite el apellido");
        apellido= captura.nextLine();
        System.out.println("Digite el nombre");
        nombre= captura.nextLine();
        System.out.println("Digite el sexo");
        sexo= captura.nextLine();
        System.out.println("Digite el documento");
        documento= captura.nextInt();
        System.out.println("Digite la edad");
        edad= captura.nextInt();
        captura.close();
    }
    public void mostrarPersona() {
        System.out.println("El tipo de documento es:"+tipoDocumento);
        System.out.println("El  apellido es:"+apellido);
        System.out.println("El  nombre es:"+nombre);
        System.out.println("El  sexo es:"+sexo);
        System.out.println("El  documento es:"+documento);
        System.out.println("El  edad es:"+edad);
    }
    public void calcularImc (float peso, float estatura) {
        peso= peso/(estatura*estatura);
        if (peso>25) {
        System.out.println("Tiene sobre peso"+peso);
           } else if (peso>=20) {
             System.out.println("Peso ideal"+peso);
            } else {
        System.out.println("Peso por debajo "+peso);
            }
                    
    }
    public void imc(){
        if (peso>25) {
      System.out.println("Tiene sobre peso"+peso);
           } else if (peso>=20) {
        System.out.println("Peso ideal"+peso);
            } else {
       System.out.println("Peso por debajo "+peso);
            }
    }
    public void mayorEdad() {
        if (edad>18) {
            System.out.println("Es mayor de edad");
            
        } else {
       System.out.println("es menor de edad");

        }
        
    } 
    public String getTipoDocumento() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDocumento) {
        this.tipoDoc = tipoDoc;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        {
        public String getSexo() {
            return sexo;
        }
        public void setSexo(String sexo) {
            this.sexo = sexo;
        }
        public int getDocumento() {
            return documento;
        }
        public void setDocumento(int documento) {
            this.documento = documento;
        }
        public int getEdad() {
            return edad;
        }
        public void setEdad(int edad) {
            this.edad = edad;
        }
        public float getPesoActual() {
            return peso;
        }
        public void setPesoActual(float pesoActual) {
            this.peso = pesoActual;
        }
    }
}