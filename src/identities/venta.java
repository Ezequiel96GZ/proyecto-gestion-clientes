
package identities;

import java.util.Date;

public class venta {
    private int idventa;
    private Date fecha;
    private int nrocomprobante;
    private int idcliente;
    private float importetotal;
    private int idvendedor;
    private boolean estado;

    public venta() {
    }

    public venta(int idventa, Date fecha, int nrocomprobante, int idcliente, float importetotal, int idvendedor, boolean estado) {
        this.idventa = idventa;
        this.fecha = fecha;
        this.nrocomprobante = nrocomprobante;
        this.idcliente = idcliente;
        this.importetotal = importetotal;
        this.idvendedor = idvendedor;
        this.estado = estado;
    }

   
    @Override
    public String toString() {
        return "venta{" + "idventa=" + idventa + ", fecha=" + fecha + ", nrocomprobante=" + nrocomprobante + ", idcliente=" + idcliente + ", importetotal=" + importetotal + ", idvendedor=" + idvendedor + ", estado=" + estado + '}';
    }

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNrocomprobante() {
        return nrocomprobante;
    }

    public void setNrocomprobante(int nrocomprobante) {
        this.nrocomprobante = nrocomprobante;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public float getImportetotal() {
        return importetotal;
    }

    public void setImportetotal(float importetotal) {
        this.importetotal = importetotal;
    }

    public int getIdvendedor() {
        return idvendedor;
    }

    public void setIdvendedor(int idvendedor) {
        this.idvendedor = idvendedor;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

 
   
    
    
}
