package dao;

import ConfigManager.Formateo;
import identities.usuario;
import java.sql.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.util.LinkedList;
import java.sql.Date;

public class usuarioDAO {

    public boolean validarUsuario(usuario u) {
        boolean ok = false;
        Connection conn = null;
        //  Statement stm = null;    // Buffer 
        ResultSet rs = null;    // objeto donde guarda el resultado de la consulta
        String sql = "SELECT * FROM usuario where nombre = '" + u.getNombre() + "' and password ='" + u.getPassword() + "'";
        Conexion c = new Conexion();

        try {
            conn = c.getConexion();
            Statement stm = (Statement) conn.createStatement();
            rs = stm.executeQuery(sql);

            if (rs.first()) {
                ok = true;
            }

        } catch (Exception e) {
        }
        return ok;
    }

    public LinkedList<usuario> getAllUsuarios() {
        LinkedList<usuario> listausuarios = new LinkedList<>(); // creo la lista que voy a retornar
        Connection cn = null;
        Statement stm = null;    // Buffer 
        ResultSet rs = null;    // objeto donde guarda el resultado de la consulta
        String sql = "SELECT * FROM usuario";
        Conexion conn = new Conexion();

        try {
            cn = conn.getConexion();
            stm = (Statement) cn.createStatement();
            rs = stm.executeQuery(sql);
            // Llenar la lista con el resultado que se encuentra en el rs

            while (rs.next()) {
                usuario u = new usuario();  // creo un usuario y cargo sus atributos
                u.setIdusuario(rs.getInt(1));
                u.setNombre(rs.getString(2));
                u.setPassword(rs.getString(3));
                u.setEstado(rs.getBoolean(4));
                u.setFecultingreso(rs.getDate(5));
                listausuarios.add(u); // sumo el usuario a la lista
            }

        } catch (SQLException e) {
            System.out.println("Error al cargar lista de usuarios" + e.getMessage());
        } finally {
            // cierro las conexiones a la base
            try {
                cn.close();
                stm.close();
                rs.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar las conexiones de getAllUsuarios" + e.getMessage());
            }
        }
        return listausuarios;
    }

    public int addUsuario(usuario u) {
        int ok = 0;
        Formateo f = new Formateo();
        Date fec = Date.valueOf(f.formatearFecha(u.getFecultingreso()));

        Conexion cx = new Conexion();
        PreparedStatement ps = null;
        String sql = "INSERT INTO usuario (idusuario,nombre,password,estado,fecultingreso) VALUES (0,?,?,?,?)";
        Connection conn = cx.getConexion();

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, u.getNombre());
            ps.setString(2, u.getPassword());
            ps.setBoolean(3, u.isEstado());
            ps.setDate(4, fec);
            ok = ps.executeUpdate();
            System.out.println("El ok vale: " + ok);

        } catch (SQLException e) {
            System.out.println("Error al INSERTAR un Usuario: " + e.getMessage());
        } finally {
            try {
                conn.close();
                System.out.println("conexion cerrada");
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexion: " + e.getMessage());
            }
        }
        return ok;
    }

    public int updateUsuario(usuario u) {
        int ok = 0;
        Formateo f = new Formateo();
        Date fec = Date.valueOf(f.formatearFecha(u.getFecultingreso()));

        Conexion cx = new Conexion();
        PreparedStatement ps = null;
        String sql = "UPDATE usuario SET nombre=?,password=?,estado=?,fecultingreso=? WHERE idusuario = ?";
        Connection conn = cx.getConexion();

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, u.getNombre());
            ps.setString(2, u.getPassword());
            ps.setBoolean(3, u.isEstado());
            ps.setDate(4, fec);
            ps.setInt(5, u.getIdusuario());
            ok = ps.executeUpdate();
            System.out.println("El ok vale: " + ok);

        } catch (SQLException e) {
            System.out.println("Error al INSERTAR un Usuario: " + e.getMessage());
        } finally {
            try {
                conn.close();
                System.out.println("conexion cerrada");
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexion: " + e.getMessage());
            }
        }
        return ok;
    }

    public usuario getUsuarioByID(int idusr) {
        usuario u = new usuario();
        Connection conn = null;
        ResultSet rs = null;    // objeto donde guarda el resultado de la consulta
        String sql = "SELECT * FROM usuario where idusuario = " + idusr;
        System.out.println(sql);
        Conexion c = new Conexion();

        try {
            conn = c.getConexion();
            Statement stm = (Statement) conn.createStatement();
            rs = stm.executeQuery(sql);

            if (rs.first()) {
                u.setIdusuario(idusr);
                u.setNombre(rs.getString(2));
                u.setPassword(rs.getString(3));
                u.setEstado(rs.getBoolean(4));
                u.setFecultingreso(rs.getDate(5));
            }

        } catch (SQLException e) {
            System.out.println("Algo pasó al buscar el usuario por ID");
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la base");
            }

        }

        return u;
    }

    public LinkedList<usuario> getAllUsuariosFind(String datobuscado) {
        LinkedList<usuario> listausuariosbuscados = new LinkedList<>(); // creo la lista que voy a retornar
        Connection cn = null;
        Statement stm = null;    // Buffer 
        ResultSet rs = null;    // objeto donde guarda el resultado de la consulta
        String sql = "SELECT * FROM usuario WHERE nombre LIKE '" + datobuscado + "%'";
        Conexion conn = new Conexion();

        try {
            cn = conn.getConexion();
            stm = (Statement) cn.createStatement();
            rs = stm.executeQuery(sql);
            // Llenar la lista con el resultado que se encuentra en el rs

            while (rs.next()) {
                usuario u = new usuario();  // creo un usuario y cargo sus atributos
                u.setIdusuario(rs.getInt(1));
                u.setNombre(rs.getString(2));
                u.setPassword(rs.getString(3));
                u.setEstado(rs.getBoolean(4));
                u.setFecultingreso(rs.getDate(5));
                listausuariosbuscados.add(u); // sumo el usuario a la lista
            }

        } catch (SQLException e) {
            System.out.println("Error al cargar la lista de usuarios buscados" + e.getMessage());
        } finally {
            try {
                cn.close();
                stm.close();
                rs.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar las conexiones de getAllUsuariosFind" + e.getMessage());
            }
        }
        return listausuariosbuscados;
    }

}
