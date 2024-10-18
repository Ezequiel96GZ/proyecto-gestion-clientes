
package identities;

public class provincia {
    private int idprovincia;
    private String descripcion;

    public provincia() {
    }

    public provincia(int idprovincia, String descripcion) {
        this.idprovincia = idprovincia;
        this.descripcion = descripcion;
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
        return  descripcion ;
    }

 
    
    
}
