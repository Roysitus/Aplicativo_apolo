
package dao.clases;

import Conexion.Conectar;
import Controlador.Docente;
import dao.interfaces.interface_docente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class docenteCAD extends Conectar implements interface_docente{
    @Override
    public boolean crear(Docente u) {
        int tamaño = obtener().size();
        u.setIncremento(tamaño);
        u.setId_docente(u.generar());
        System.out.println(""+u.getId_docente());
        conectar();
        String sql = "insert into docente (nombre , apellido, id_docente, especialidad, tipo) values('" + u.getNombre() + "','" + u.getApellido() + "','" + u.getId_docente() + 
                "','" + u.getEspecilidad()+ "','" + u.getTipo()+ "')";
        try {
            Statement st = conexion.createStatement();
            st.execute(sql);
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(docenteCAD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public boolean actualizar(Docente u) {
        conectar();
        String sql = "update docente set nombre='" + u.getNombre() + "', apellido='" + u.getApellido() + "', especialidad='" + u.getEspecilidad()+ "', tipo='" + u.getTipo()+
                "' where id_docente ='" + u.getId_docente() + "'";
        try {
            Statement st = conexion.createStatement();
            st.execute(sql);
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(docenteCAD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public boolean borrar(String usuario) {
        conectar();
        String sql = "delete from docente where id_docente='" + usuario + "'";
        try {
            Statement st = conexion.createStatement();
            st.execute(sql);
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(docenteCAD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public List<Docente> obtener() {
        conectar();
        List<Docente> consumos = new ArrayList<>();
        
        String sql = "select * from docente";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Docente d = new Docente(rs.getString("nombre"), rs.getString("apellido"), rs.getString("id_docente"), rs.getString("especialidad"), rs.getString("tipo"));
                consumos.add(d);
            }
        } catch (Exception e) {
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(docenteCAD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return consumos;
    }
    
    public Docente buscar(String usuario){
        for(Docente ad : obtener()){
            if(ad.getId_docente().equals(usuario)){
                return ad;
            }
        }
        return null;
    }
}
