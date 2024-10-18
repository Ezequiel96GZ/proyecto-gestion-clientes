
package identities;

public class ventadetalle {
    private int ventadetalle;
    private int idventa;
    private int idproducto;
    private int cantidad;
    private double preciounitario;
    private double subtotal;

    public ventadetalle() {
    }

    public ventadetalle(int ventadetalle, int idventa, int idproducto, int cantidad, double preciounitario, double subtotal) {
        this.ventadetalle = ventadetalle;
        this.idventa = idventa;
        this.idproducto = idproducto;
        this.cantidad = cantidad;
        this.preciounitario = preciounitario;
        this.subtotal = subtotal;
    }

   
    @Override
    public String toString() {
        return "ventadetalle{" + "ventadetalle=" + ventadetalle + ", idventa=" + idventa + ", idproducto=" + idproducto + ", cantidad=" + cantidad + ", preciounitario=" + preciounitario + ", subtotal=" + subtotal + '}';
    }

    public int getVentadetalle() {
        return ventadetalle;
    }

    public void setVentadetalle(int ventadetalle) {
        this.ventadetalle = ventadetalle;
    }

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPreciounitario() {
        return preciounitario;
    }

    public void setPreciounitario(double preciounitario) {
        this.preciounitario = preciounitario;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    
    
    
}
