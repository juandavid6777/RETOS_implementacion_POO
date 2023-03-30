package salud;

public class empleado extends persona {

    private String cargo, departamento; 
    private int valorHora=0, hTrabajadas=0, honorarios=0;

    
    public empleado(String tipoDoc, int documento, String nombre, String apellido, String cargo2, int horasTrabajadas,
            int valorHora2, String departamento2, int horaspagas, String sexo) {
    }
    public void Empleado(String _tipodoc, int _documento, String _nombre, 
    String _apellido, String _cargo, int _horasTrabajadas, 
     int _valorHora, String _departamento, int _horaspagas,String_sexo;
         horaspagas=horaspagas;
          cargo=_cargo;
        horasTrabajadas=_horasTrabajadas;
        valorHora=_valorHora;
        departamento=_departamento;)

    }
    public void mostrarPersona(){
        System.out.println("tu tipo de documento es: "+getTipoDoc()+"tu documento es: "+getDocumento()+"tu nombres es: "+getNombre()+"tu apellido es: "+getApellido()+
        "tu cargo es: "+cargo+"tu departamento es"+departamento+"tu sexo es: "+getSexo()+"Digita las horas trabajadas: "+hTrabajadas+ "digita el valor por hora"+valorHora);
    }
    private String getApellido() {
        return null;
    }
    private String getSexo() {
        return null;
    }
    private String getDocumento() {
        return null;
    }
    public void calcularHonorarios() {
        honorarios= horasTrabajadas*valorHora;
        System.out.println("Sus horas pagadas son: "+horaspagas);


    }
    

    
