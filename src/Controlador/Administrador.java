
package Controlador;

public class Administrador extends Persona{
    
    private  int incremento = 0;

    public  int getIncremento() {
        return incremento;
    }

    public  void setIncremento(int aIncremento) {
        incremento = aIncremento;
    }
    
    public Administrador(String id_usuario, String contraseña,String nombre, String apellido, String dni, String correo, int edad) {
        super(id_usuario, contraseña,nombre, apellido, dni, correo, edad);
    }
    
    @Override
    public String generar() {
        return "ADMIN-"+incremento;
    }
    
}
