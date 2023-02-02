
package Controlador;

public class Usuario extends Persona{
    
    private  static int incremento = 0;

    public  static int getIncremento() {
        return incremento;
    }

    public  static void setIncremento(int aIncremento) {
        incremento = aIncremento;
    }
    
    public Usuario(String id_usuario, String contraseña, String nombre, String apellido, String dni, String correo, int edad) {
        super(id_usuario, contraseña,nombre, apellido, dni, correo, edad);
    }
    
    @Override
    public String generar() {
        return "USER-"+incremento;
    }
    
}
