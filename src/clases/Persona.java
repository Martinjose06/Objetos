/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author mzuleta4
 */
public class Persona {
    long identificacion;
    String primer_nombre;
    String primer_apellido;
    
    public Persona(long identificacion, String primer_nombre, String primer_apellido){
        this.identificacion = identificacion;
        this.primer_nombre = primer_nombre;
        this.primer_apellido = primer_apellido;
    }

    public long getIdentificacion() {
        return identificacion;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setIdentificacion(long identificacion) {
        this.identificacion = identificacion;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }
    
    
    
    
}
