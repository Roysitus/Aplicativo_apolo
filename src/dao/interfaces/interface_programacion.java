
package dao.interfaces;

import Controlador.VentaEspecialidadProgramacion;
import java.util.List;

public interface interface_programacion {
    public boolean crear(VentaEspecialidadProgramacion u);
    public boolean actualizar(VentaEspecialidadProgramacion u);
    public boolean borrar(String usuario);
    public List<VentaEspecialidadProgramacion> obtener();
}
