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
public class catedratico extends docente {
    
    private String fechaInicio,fechaFin;
    
    
    public catedratico(String tipoDocumento, String documento, String apellidos, 
            String nombres, int edad, boolean activo, 
            String profesion,String asignatura,
            String fechaInicio, String fechaFin) {
        super(tipoDocumento, documento, apellidos, nombres, edad, activo, profesion, asignatura);
        this.fechaInicio=fechaInicio;
        this.fechaFin=fechaFin;
    }
    public String mostrar(){
        String resultado="";
        resultado=mostrarInfo()+"\t"+asignatura+"\t"+profesion+"\t"+fechaInicio+"\t"+fechaFin;
        return resultado;
    }
    
}
