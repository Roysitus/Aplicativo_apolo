
package Controlador;

public class Docente {
    
    private String nombre, apellido, id_docente;
    private String especilidad, tipo;
    private int incremento = 0;
    
    public Docente(String nombre, String apellido, String id_docente, String especilidad, String tipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id_docente = id_docente;
        this.especilidad = especilidad;
        this.tipo = tipo;
    }
    
    public String generar(){
        return "DOC-"+incremento;
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

    public String getId_docente() {
        return id_docente;
    }

    public void setId_docente(String id_docente) {
        this.id_docente = id_docente;
    }

    public String getEspecilidad() {
        return especilidad;
    }

    public void setEspecilidad(String especilidad) {
        this.especilidad = especilidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIncremento() {
        return incremento;
    }

    public void setIncremento(int incremento) {
        this.incremento = incremento;
    }
    
}
