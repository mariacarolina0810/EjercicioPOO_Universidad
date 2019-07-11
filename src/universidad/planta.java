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
public class planta extends docente {
    
     private String fechaContrato;
     private int cantProyectos;
    
    public planta(String tipoDocumento, String documento, String apellidos, 
            String nombres, int edad, boolean activo, 
            String profesion, String asignatura,
            String fechaContrato, int cantProyectos) {
        super(tipoDocumento, documento, apellidos, nombres, edad, activo, profesion, asignatura);
        
        this.fechaContrato=fechaContrato;
        this.cantProyectos=cantProyectos;
    }
     public String mostrar(){
         String resultado="";
        resultado=mostrarInfo()+"\t"+asignatura+"\t"+profesion+"\t"+fechaContrato+"\t"+cantProyectos;
         return resultado;
   }

    public void setCantProyectos(int cantProyectos) {
        this.cantProyectos = cantProyectos;
    }
    
}
