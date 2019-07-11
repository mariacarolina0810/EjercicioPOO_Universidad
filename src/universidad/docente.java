/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

/**
 *
 * @author CBN
 */
public class docente extends personal{
     
    protected String profesion, asignatura;
    
    public docente(String tipoDocumento, String documento, String apellidos, 
            String nombres, int edad, boolean activo, 
            String profesion, String asignatura) {
        super(tipoDocumento, documento, apellidos, nombres, edad, activo);
        this.profesion=profesion;
        this.asignatura=asignatura;
    }
    public void setasignatura (String asignatura){
        this.asignatura=asignatura;
    }
    
}
