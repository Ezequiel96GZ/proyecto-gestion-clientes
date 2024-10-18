
package identities;

public class localidad {
    private int idlocalidad;
    private int idprovincia;
    private String descripcion;

    public localidad() {
    }

    public localidad(int idlocalidad, int idprovincia, String descripcion) {
        this.idlocalidad = idlocalidad;
        this.idprovincia = idprovincia;
        this.descripcion = descripcion;
    }

    public int getIdlocalidad() {
        return idlocalidad;
    }

    public void setIdlocalidad(int idlocalidad) {
        this.idlocalidad = idlocalidad;
    }

    public int getIdprovincia() {
        return idprovincia;
    }

    public void setIdprovincia(int idprovincia) {
        this.idprovincia = idprovincia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return descripcion ;
    }

 
    
    
}
