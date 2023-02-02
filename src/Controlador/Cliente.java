
package Controlador;

public class Cliente {
    
    private String nombre, apellido, id_cliente, dni;
    private int edad, incremento = 0;

    public Cliente(String nombre, String apellido, String id_cliente, String dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id_cliente = id_cliente;
        this.dni = dni;
        this.edad = edad;
    }
    
    public String generar(){
        return "CLI-"+incremento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIncremento() {
        return incremento;
    }

    public void setIncremento(int incremento) {
        this.incremento = incremento;
    }
    
}
