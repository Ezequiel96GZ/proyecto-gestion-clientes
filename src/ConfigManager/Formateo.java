package ConfigManager;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Formateo {

    public String formatearFecha(Date f) {
        String fecha;

        fecha = "2024-01-01";
        try {
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            fecha = formato.format(f);
        } catch (Exception ex) {
            System.out.println("error de Formateo de Fecha" + ex);
        }
        return fecha;
    }

}
