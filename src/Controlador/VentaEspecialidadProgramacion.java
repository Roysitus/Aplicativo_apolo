
package Controlador;

public class VentaEspecialidadProgramacion extends Curso{
    
    private String tipo, id_cliente, id_venta;
    private double precio;
    int incremento = 0;

    public VentaEspecialidadProgramacion(String tipo, String id_cliente, String id_venta, double precio, String id_curso, String docente) {
        super(id_curso, docente);
        this.tipo = tipo;
        this.id_cliente = id_cliente;
        this.id_venta = id_venta;
        this.precio = precio;
    }
    
    public void monto(){
        if(tipo.equals("JAVA")){
            setPrecio(200);
        }
        if(tipo.equals("KOTLIN")){
            setPrecio(400);
        }
        if(tipo.equals("PYTHON")){
            setPrecio(380);
        }
    }

    public int getIncremento() {
        return incremento;
    }

    public void setIncremento(int incremento) {
        this.incremento = incremento;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String generar() {
        if(tipo.equals("JAVA")){
            return "JAVC-"+incremento;
        }else if(tipo.equals("KOTLIN")){
            return "KOTL-"+incremento;
        }else if(tipo.equals("PYTHON")){
            return "PY-"+incremento;
        }
        return "";
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getId_venta() {
        return id_venta;
    }

    public void setId_venta(String id_venta) {
        this.id_venta = id_venta;
    }
}
