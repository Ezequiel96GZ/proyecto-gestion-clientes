package dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import identities.localidad;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class localidadDAO {

    public LinkedList<localidad> getLocalidadesByIDProvincia(int idprovincia) {
        LinkedList<localidad> ListaLocalidades = new LinkedList<>();

        Connection conn = null;
        ResultSet rs = null;    // objeto donde guarda el resultado de la consulta
        String sql = "SELECT * FROM localidad where idprovincia = " + idprovincia;
        Conexion c = new Conexion();

        try {
            conn = c.getConexion();
            Statement stm = (Statement) conn.createStatement();
            rs = stm.executeQuery(sql);

            while(rs.next()) {
            localidad lo = new localidad();
            lo.setIdlocalidad(rs.getInt(1));
            lo.setIdprovincia(idprovincia);
            lo.setDescripcion(rs.getString(3));
            ListaLocalidades.add(lo);
            }
        } catch (SQLException e) {
            System.out.println("Algo pasó al llenar la lista de localidades by idProvincia");
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la base");
            }
        }
        return ListaLocalidades;
    }

}
