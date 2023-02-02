
package dao.interfaces;

import Controlador.VentaEspecialidadDesarrolloWeb;
import java.util.List;

public interface interface_desarrollo_web {
    public boolean crear(VentaEspecialidadDesarrolloWeb u);
    public boolean actualizar(VentaEspecialidadDesarrolloWeb u);
    public boolean borrar(String usuario);
    public List<VentaEspecialidadDesarrolloWeb> obtener();
}
