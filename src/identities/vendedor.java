
package identities;

public class vendedor {
    private int idvendedor;
    private String nombre;
    private String apellido;
    private int iddireccion;

    public vendedor() {
    }

    public vendedor(int idvendedor, String nombre, String apellido, int iddireccion) {
        this.idvendedor = idvendedor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.iddireccion = iddireccion;
    }

    public int getIdvendedor() {
        return idvendedor;
    }

    public void setIdvendedor(int idvendedor) {
        this.idvendedor = idvendedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIddireccion() {
        return iddireccion;
    }

    public void setIddireccion(int iddireccion) {
        this.iddireccion = iddireccion;
    }

    @Override
    public String toString() {
        return "vendedor{" + "idvendedor=" + idvendedor + ", nombre=" + nombre + ", apellido=" + apellido + ", iddireccion=" + iddireccion + '}';
    }
    
    
    
}
