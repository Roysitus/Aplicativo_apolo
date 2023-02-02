
package dao.clases;

import Conexion.Conectar;
import Controlador.VentaEspecialidadProgramacion;
import dao.interfaces.interface_programacion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class desarrolloProgramacionCAD extends Conectar implements interface_programacion{
    @Override
    public boolean crear(VentaEspecialidadProgramacion u) {
        int tamaño = obtener().size();
        u.setIncremento(tamaño);
        u.setCuenta(tamaño);
        u.setId_venta(u.generar_id_venta());
        u.setId_curso(u.generar());
        u.monto();
        System.out.println(""+u.getId_venta());
        System.out.println(""+u.getId_curso());
        conectar();
        String sql = "insert into programacion (tipo , id_cliente, id_venta, precio, id_curso, docente) values('" + u.getTipo() + "','" + u.getId_cliente() + "','" + u.getId_venta() + 
                "','" + u.getPrecio()+ "','" + u.getId_curso()+ "','" + u.getDocente()+ "')";
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
                Logger.getLogger(desarrolloProgramacionCAD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public boolean actualizar(VentaEspecialidadProgramacion u) {
        conectar();
        String sql = "update programacion set tipo='" + u.getTipo() + "', id_cliente='" + u.getId_cliente() + "', precio='" + u.getPrecio() + "', id_curso='" + u.getId_curso()+ "', docente='" + u.getDocente()+
                "' where id_venta ='" + u.getId_venta()+ "'";
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
                Logger.getLogger(desarrolloProgramacionCAD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public boolean borrar(String usuario) {
        conectar();
        String sql = "delete from programacion where id_venta='" + usuario + "'";
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
                Logger.getLogger(desarrolloProgramacionCAD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public List<VentaEspecialidadProgramacion> obtener() {
        conectar();
        List<VentaEspecialidadProgramacion> consumos = new ArrayList<>();
        
        String sql = "SELECT * FROM `programacion`";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                VentaEspecialidadProgramacion d = new VentaEspecialidadProgramacion(rs.getString("tipo"), rs.getString("id_cliente"), rs.getString("id_venta"), rs.getDouble("precio"), rs.getString("id_curso"), rs.getString("docente"));
                consumos.add(d);
            }
        } catch (Exception e) {
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(desarrolloProgramacionCAD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return consumos;
    }
    
    public VentaEspecialidadProgramacion buscar(String usuario){
        for(VentaEspecialidadProgramacion ad : obtener()){
            if(ad.getId_venta().equals(usuario)){
                return ad;
            }
        }
        return null;
    }
}
