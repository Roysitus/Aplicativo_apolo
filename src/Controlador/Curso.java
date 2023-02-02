
package Controlador;

public abstract class Curso {
    
    private String id_curso, docente;
    private int cuenta = 0;
    
    public Curso(String id_curso, String docente) {
        this.id_curso = id_curso;
        this.docente = docente;
    }

    public abstract String generar();
    
    public String generar_id_venta(){
        return "VENT-"+cuenta;
    }
    
    public String getId_curso() {
        return id_curso;
    }

    public void setId_curso(String id_curso) {
        this.id_curso = id_curso;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

}
