
package identities;

public class cliente {
    private int idcliente;
    private String razonsocial;
    private long cuit;
    private direccion direccion;
    private boolean estado;

    public cliente() {
    }

    public cliente(int idcliente, String razonsocial, long cuit, direccion direcion, boolean estado) {
        this.idcliente = idcliente;
        this.razonsocial = razonsocial;
        this.cuit = cuit;
        this.direccion = direcion;
        this.estado = estado;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(direccion direccion) {
        this.direccion = direccion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "cliente{" + "idcliente=" + idcliente + ", razonsocial=" + razonsocial + ", cuit=" + cuit + ", direccion=" + direccion + ", estado=" + estado + '}';
    }

   
    
    
   
    
    
}

