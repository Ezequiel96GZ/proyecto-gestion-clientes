package dao;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import identities.provincia;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class provinciaDAO {

    public LinkedList<provincia> getAllProvincias() {
        LinkedList<provincia> listaProvincias = new LinkedList<>();
        Connection cn = null;
        Statement stm = null;    // Buffer 
        ResultSet rs = null;    // objeto donde guarda el resultado de la consulta
        String sql = "SELECT * FROM provincia";
        Conexion conn = new Conexion();
        
          try {
            cn = conn.getConexion();
            stm = (Statement) cn.createStatement();
            rs = stm.executeQuery(sql);
            // Llenar la lista con el resultado que se encuentra en el rs

            while (rs.next()) {
                provincia p = new provincia();  // creo un usuario y cargo sus atributos
                p.setIdprovincia(rs.getInt(1));
                p.setDescripcion(rs.getString(2));
                listaProvincias.add(p);
            }

        } catch (SQLException e) {
            System.out.println("Error al cargar lista de provincias" + e.getMessage());
        } finally {
            // cierro las conexiones a la base
            try {
                cn.close();
                stm.close();
                rs.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar las conexiones de getAllProvincias" + e.getMessage());
            }
        }
        return listaProvincias;
    }
         
}
