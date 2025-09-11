
package practico4;

import java.util.HashSet;
import java.util.Set;


/**
 *
 * @Grupo 2, trabajo practico N4
 *  
 * 
 */
public class Alumno {
    private int legajo;
    private String apellido; 
    private String nombre; 
    private HashSet<Materia> materia;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.materia = new HashSet<>(); 
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarMateria(Materia m){
        materia.add(m);  
    }
    
    
    public int cantidadMaterias(){
         
    return materia.size();
    }

    public Set<Materia> materiasInscriptas(){ 
//Uso esta coleccion porque es la que me permite exteriorizar las materias en las que esta inscripto el alumno para usarlo en jinternal Frame    
        return materia;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 88 * hash + this.legajo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        return this.legajo == other.legajo; 
    }

    

    @Override
    public String toString() {
        return  apellido + ", " + nombre;
    }
    
    
}
