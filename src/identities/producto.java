
package identities;

public class producto {
    private int idproducto;
    private String codproducto;
    private String descripcion;
    private double preciounitario;
    private String stock;
    private int idproveedor;

    public producto() {
    }

    public producto(int idproducto, String codproducto, String descripcion, double preciounitario, String stock, int idproveedor) {
        this.idproducto = idproducto;
        this.codproducto = codproducto;
        this.descripcion = descripcion;
        this.preciounitario = preciounitario;
        this.stock = stock;
        this.idproveedor = idproveedor;
    }

  
    @Override
    public String toString() {
        return "producto{" + "idproducto=" + idproducto + ", codproducto=" + codproducto + ", descripcion=" + descripcion + ", preciounitario=" + preciounitario + ", stock=" + stock + ", idproveedor=" + idproveedor + '}';
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getCodproducto() {
        return codproducto;
    }

    public void setCodproducto(String codproducto) {
        this.codproducto = codproducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPreciounitario() {
        return preciounitario;
    }

    public void setPreciounitario(double preciounitario) {
        this.preciounitario = preciounitario;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public int getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(int idproveedor) {
        this.idproveedor = idproveedor;
    }
    
    
}
