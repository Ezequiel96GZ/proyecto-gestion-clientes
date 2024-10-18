
package identities;

import java.util.Date;

public class usuario {
private int idusuario; 
private String nombre; 
private String password; 
private boolean estado; 
private Date fecultingreso;   

    public usuario() {
    }

    public usuario(int idusuario, String nombre, String password, boolean estado, Date fecultingreso) {
        this.idusuario = idusuario;
        this.nombre = nombre;
        this.password = password;
        this.estado = estado;
        this.fecultingreso = fecultingreso;
    }

     
    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Date getFecultingreso() {
        return fecultingreso;
    }

    public void setFecultingreso(Date fecultingreso) {
        this.fecultingreso = fecultingreso;
    }

    @Override
    public String toString() {
        return "usuario{" + "idusuario=" + idusuario + ", nombre=" + nombre + ", password=" + password + ", estado=" + estado + ", fecultingreso=" + fecultingreso + '}';
    }

  
    


}
