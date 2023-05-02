package modelo;

public class Persona {
    
    private String nombre;
    private String correo;
    private String contrasena;
    
    public Persona(){
        
    }
    
    public Persona(String nombre, String correo, String contrasena) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrasena() {
        return contrasena;
    }
}
