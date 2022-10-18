
package ContextoEstatico;

public class Persona {
    private int idPersona;
    private String nombre;
    private static int contadorPersonas;

    public Persona() {
    }

    public Persona(String nombre) {
          this.nombre = nombre;
        //Asignamos el nuevo valor al idPersona
        Persona.contadorPersonas++;
        this.idPersona = Persona.contadorPersonas;
        this.nombre = nombre;
        
    }

  

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int contadorPersonas) {
        Persona.contadorPersonas = contadorPersonas;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
    
    
    
    
}
