
package dao.clases;

import Conexion.Conectar;
import Controlador.Administrador;
import Controlador.Usuario;
import dao.interfaces.interface_usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class usuarioCAD extends Conectar implements interface_usuario{

    @Override
    public boolean crear(Usuario u) {
        int tamaño = obtener().size();
        u.setIncremento(tamaño);
        u.setId_usuario(u.generar());
        System.out.println(""+u.getId_usuario());
        conectar();
        String sql = "insert into usuario (id_usuario , contraseña, nombre, apellido, dni, correo, edad) values('" + u.getId_usuario() + "','" + u.getContraseña() + "','" + u.getNombre() + 
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
                Logger.getLogger(usuarioCAD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public boolean actualizar(Usuario u) {
        conectar();
        String sql = "update usuario set contraseña='" + u.getContraseña() + "', nombre='" + u.getNombre() + "', apellido='" + u.getApellido() + "', dni='" + u.getDni()+ "', correo='" + u.getCorreo()+ "', edad='" + u.getEdad()+
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
                Logger.getLogger(usuarioCAD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public boolean borrar(String usuario) {
        conectar();
        String sql = "delete from usuario where id_usuario='" + usuario + "'";
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
                Logger.getLogger(usuarioCAD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public List<Usuario> obtener() {
        conectar();
        List<Usuario> consumos = new ArrayList<>();
        
        String sql = "select * from usuario";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Usuario d = new Usuario(rs.getString("id_usuario"), rs.getString("contraseña"), rs.getString("nombre"), rs.getString("apellido"), rs.getString("dni"), rs.getString("correo"), rs.getInt("edad"));
                consumos.add(d);
            }
        } catch (Exception e) {
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(usuarioCAD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return consumos;
    }
    
    public Usuario buscar(String usuario){
        for(Usuario ad : obtener()){
            if(ad.getId_usuario().equals(usuario)){
                return ad;
            }
        }
        return null;
    }
    
}
