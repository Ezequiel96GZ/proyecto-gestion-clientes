
package dao;

import ConfigManager.config;
import com.mysql.jdbc.Connection;

public class Conexion {
   Connection cn = null;
   
   private final String URL = config.MySQL + config.HOST + config.PORT +config.DB;
   
   public Connection getConexion(){
       try {
            Class.forName(config.DRIVER);
            cn =(Connection) java.sql.DriverManager.getConnection(URL, config.USR,config.PWD);       
       } catch (Exception e) {
           e.printStackTrace();
       }
    
       return cn;
   }
}
