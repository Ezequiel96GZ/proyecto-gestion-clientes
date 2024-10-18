
package identities;

public class proveedor {
    private int idproveedor;
    private String razon_social;
    private long cuit;
    private int iddireccion;

    public proveedor() {
    }

    public proveedor(int idproveedor, String razon_social, long cuit, int iddireccion) {
        this.idproveedor = idproveedor;
        this.razon_social = razon_social;
        this.cuit = cuit;
        this.iddireccion = iddireccion;
    }

    public int getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(int idproveedor) {
        this.idproveedor = idproveedor;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public int getIddireccion() {
        return iddireccion;
    }

    public void setIddireccion(int iddireccion) {
        this.iddireccion = iddireccion;
    }

    @Override
    public String toString() {
        return "proveedor{" + "idproveedor=" + idproveedor + ", razon_social=" + razon_social + ", cuit=" + cuit + ", iddireccion=" + iddireccion + '}';
    }
    
    
}

