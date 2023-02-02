
package dao.clases;

import Conexion.Conectar;
import Controlador.Administrador;
import dao.interfaces.interface_administrador;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class administradorCAD extends Conectar implements interface_administrador{
    @Override
    public boolean crear(Administrador u) {
        int tamaño = obtener().size();
        u.setIncremento(tamaño);
        u.setId_usuario(u.generar());
        System.out.println(""+u.getId_usuario());
        conectar();
        String sql = "insert into administrador (id_usuario , contraseña, nombre, apellido, dni, correo, edad) values('" + u.getId_usuario() + "','" + u.getContraseña() + "','" + u.getNombre() + 
                "','" + u.getApellido()+ "','" + u.getDni()+ "','" + u.getCorreo()+ "','" + u.getEdad()+ "')";
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
                Logger.getLogger(administradorCAD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public boolean actualizar(Administrador u) {
        conectar();
        String sql = "update administrador set contraseña='" + u.getContraseña() + "', nombre='" + u.getNombre() + "', apellido='" + u.getApellido() + "', dni='" + u.getDni()+ "', correo='" + u.getCorreo()+ "', edad='" + u.getEdad()+
                "' where id_usuario ='" + u.getId_usuario()+ "'";
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
                Logger.getLogger(administradorCAD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public boolean borrar(String usuario) {
        conectar();
        String sql = "delete from administrador where id_usuario='" + usuario + "'";
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
                Logger.getLogger(administradorCAD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public List<Administrador> obtener() {
        conectar();
        List<Administrador> consumos = new ArrayList<>();
        
        String sql = "SELECT * FROM `administrador`";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Administrador d = new Administrador(rs.getString("id_usuario"), rs.getString("contraseña"), rs.getString("nombre"), rs.getString("apellido"), rs.getString("dni"), rs.getString("correo"), rs.getInt("edad"));
                consumos.add(d);
            }
        } catch (Exception e) {
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(administradorCAD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return consumos;
    }
    
    public Administrador buscar(String usuario){
        for(Administrador ad : obtener()){
            if(ad.getId_usuario().equals(usuario)){
                return ad;
            }
        }
        return null;
    }
    
}
