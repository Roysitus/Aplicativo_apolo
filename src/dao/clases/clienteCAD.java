
package dao.clases;

import Conexion.Conectar;
import Controlador.Cliente;
import dao.interfaces.interface_cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class clienteCAD extends Conectar implements interface_cliente{
    @Override
    public boolean crear(Cliente u) {
        int tamaño = obtener().size();
        u.setIncremento(tamaño);
        u.setId_cliente(u.generar());
        System.out.println(""+u.getId_cliente());
        conectar();
        String sql = "insert into cliente (nombre , apellido, id_cliente, dni, edad) values('" + u.getNombre() + "','" + u.getApellido() + "','" + u.getId_cliente() + 
                "','" + u.getDni()+ "','" + u.getEdad()+ "')";
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
                Logger.getLogger(clienteCAD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public boolean actualizar(Cliente u) {
        conectar();
        String sql = "update cliente set nombre='" + u.getNombre() + "', apellido='" + u.getApellido() + "', dni='" + u.getDni() + "', edad='" + u.getEdad()+
                "' where id_cliente ='" + u.getId_cliente()+ "'";
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
                Logger.getLogger(clienteCAD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public boolean borrar(String usuario) {
        conectar();
        String sql = "delete from cliente where id_cliente='" + usuario + "'";
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
                Logger.getLogger(clienteCAD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public List<Cliente> obtener() {
        conectar();
        List<Cliente> consumos = new ArrayList<>();
        
        String sql = "select * from cliente";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Cliente d = new Cliente(rs.getString("nombre"), rs.getString("apellido"), rs.getString("id_cliente"), rs.getString("dni"), rs.getInt("edad"));
                consumos.add(d);
            }
        } catch (Exception e) {
        } finally {
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(clienteCAD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return consumos;
    }
    
    public Cliente buscar(String usuario){
        for(Cliente ad : obtener()){
            if(ad.getId_cliente().equals(usuario)){
                return ad;
            }
        }
        return null;
    }
}
