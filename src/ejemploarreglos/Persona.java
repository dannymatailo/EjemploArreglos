/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarreglos;

/**
 *
 * @author labctr
 */
public class Persona {
    private String Nombre;
    private String apellido;
    private int Calificacion;

    public Persona(String Nombre, String apellido, int Calificacion) {
        this.Nombre = Nombre;
        this.apellido = apellido;
        this.Calificacion = Calificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCalificacion() {
        return Calificacion;
    }

   
    
   /* @Override
    public String toString(){
      return Calificaciones;  
    }*/

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCalificacion(int Calificacion) {
        this.Calificacion = Calificacion;
    }
    
}
