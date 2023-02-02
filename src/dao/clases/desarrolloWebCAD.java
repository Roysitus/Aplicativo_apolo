
package dao.clases;

import Conexion.Conectar;
import Controlador.VentaEspecialidadDesarrolloWeb;
import dao.interfaces.interface_desarrollo_web;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class desarrolloWebCAD extends Conectar implements interface_desarrollo_web{
    @Override
    public boolean crear(VentaEspecialidadDesarrolloWeb u) {
        int tamaño = obtener().size();
        u.setIncremento(tamaño);
        u.setCuenta(tamaño);
        u.setId_venta(u.generar_id_venta());
        u.setId_curso(u.generar());
        u.monto();
        System.out.println(""+u.getId_venta());
        System.out.println(""+u.getId_curso());
        conectar();
        String sql = "insert into desarrollo (tipo , id_cliente, id_venta, precio, id_curso, docente) values('" + u.getTipo() + "','" + u.getId_cliente() + "','" + u.getId_venta() + 
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
                Logger.getLogger(desarrolloWebCAD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public boolean actualizar(VentaEspecialidadDesarrolloWeb u) {
        conectar();
        String sql = "update desarrollo set tipo='" + u.getTipo() + "', id_cliente='" + u.getId_cliente() + "', precio='" + u.getPrecio() + "', id_curso='" + u.getId_curso()+ "', docente='" + u.getDocente()+
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
                Logger.getLogger(desarrolloWebCAD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public boolean borrar(String usuario) {
        conectar();
        String sql = "delete from desarrollo where id_venta='" + usuario + "'";
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
                Logger.getLogger(desarrolloWebCAD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public List<VentaEspecialidadDesarrolloWeb> obtener() {
        conectar();
        List<VentaEspecialidadDesarrolloWeb> consumos = new ArrayList<>();
        
        String sql = "SELECT * FROM `desarrollo`";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                VentaEspecialidadDesarrolloWeb d = new VentaEspecialidadDesarrolloWeb(rs.getString("tipo"), rs.getString("id_cliente"), rs.getString("id_venta"), rs.getDouble("precio"), rs.getString("id_curso"), rs.getString("docente"));
                consumos.add(d);
            }
        } catch (Exception e) {
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(desarrolloWebCAD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return consumos;
    }
    
    public VentaEspecialidadDesarrolloWeb buscar(String usuario){
        for(VentaEspecialidadDesarrolloWeb ad : obtener()){
            if(ad.getId_venta().equals(usuario)){
                return ad;
            }
        }
        return null;
    }
}
