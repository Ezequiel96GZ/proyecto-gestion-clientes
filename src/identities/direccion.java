
package identities;

public class direccion {
     private int id;
     private int iddireccion;
     private String calle;
     private int numero;
     private int idprovincia;
     private int idlocalidad;

    public direccion() {
    }

    public direccion(int id, int iddireccion, String calle, int numero, int idprovincia, int idlocalidad) {
        this.id = id;
        this.iddireccion = iddireccion;
        this.calle = calle;
        this.numero = numero;
        this.idprovincia = idprovincia;
        this.idlocalidad = idlocalidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIddireccion() {
        return iddireccion;
    }

    public void setIddireccion(int iddireccion) {
        this.iddireccion = iddireccion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getIdprovincia() {
        return idprovincia;
    }

    public void setIdprovincia(int idprovincia) {
        this.idprovincia = idprovincia;
    }

    public int getIdlocalidad() {
        return idlocalidad;
    }

    public void setIdlocalidad(int idlocalidad) {
        this.idlocalidad = idlocalidad;
    }

    @Override
    public String toString() {
        return "direccion{" + "id=" + id + ", iddireccion=" + iddireccion + ", calle=" + calle + ", numero=" + numero + ", idprovincia=" + idprovincia + ", idlocalidad=" + idlocalidad + '}';
    }


     
}
