
package dao.interfaces;

import Controlador.Docente;
import java.util.List;

public interface interface_docente {
    public boolean crear(Docente u);
    public boolean actualizar(Docente u);
    public boolean borrar(String usuario);
    public List<Docente> obtener();
}
