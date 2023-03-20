package animaland;
import java.io.Serializable;

public class Usuario implements Serializable{
    private String nombre,nivel,tiempo;

    public Usuario(String nombre, String nivel, String tiempo) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNivel() {
        return nivel;
    }

    public String getTiempo() {
        return tiempo;
    }
    
}