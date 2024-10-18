package dao;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import identities.cliente;
import identities.direccion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class clienteDAO {

    public int addCliente(cliente cli) {
        int ok = 0;
        Conexion cx = new Conexion();
        PreparedStatement ps = null;
        String sql = "INSERT INTO cliente(idcliente, razonsocial, cuit, iddireccion, estado) VALUES (0,?,?,?,?)";
        Connection conn = cx.getConexion();

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, cli.getRazonsocial());
            ps.setLong(2, cli.getCuit());
            ps.setBoolean(3, cli.isEstado());
            ps.setInt(4, cli.getDireccion().getIddireccion());
            ok = ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error al INSERTAR un Cliente: " + e.getMessage());
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

    public int updateCliente(cliente cli) {
        int ok = 0;

        return ok;
    }

    public LinkedList<cliente> getAllClientes() {
        LinkedList<cliente> listaClientes = new LinkedList<>();
        Connection cn = null;
        Statement stm = null;    // Buffer 
        ResultSet rs = null;    // objeto donde guarda el resultado de la consulta
        String sql = "SELECT * FROM cliente";
        Conexion conn = new Conexion();

        try {
            cn = conn.getConexion();
            stm = (Statement) cn.createStatement();
            rs = stm.executeQuery(sql);
            // Llenar la lista con el resultado que se encuentra en el rs

            while (rs.next()) {
            cliente c = new cliente();  // creo un usuario y cargo sus atributos
            c.setIdcliente(rs.getInt(1));
            c.setRazonsocial(rs.getString(2));
            c.setCuit(rs.getLong(3));
            c.setDireccion(null); //getDireccionByID(rs.getInt(4)); // Acá hay que dar de alta la direccion y pedir el id
            c.setEstado(rs.getBoolean(5));
            listaClientes.add(c);
            }
        }catch(SQLException ex){
            System.out.println("Ha ocurrido un error al llenar la lista de clientes: " + ex.getMessage());
        }
        
        return listaClientes;
    }

    public cliente getClienteByID(int idcli) {
        cliente clientebuscado = new cliente();

        return clientebuscado;
    }

}
