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
public class administrativo extends personal{
    
    private String cargo, fechaContrato;
    
    public administrativo(String tipoDocumento, String documento, String apellidos, String nombres, 
            int edad, boolean activo,String cargo, String fechaContrato) {
        super(tipoDocumento, documento, apellidos, nombres, edad, activo);
        this.cargo=cargo;
        this.fechaContrato=fechaContrato;
    }
    public String mostrar(){
        String resultado ="";
        resultado =mostrarInfo()+"\t"+cargo+"\t"+fechaContrato;
        return resultado;        
    }
    public void setcargo (String cargo){
        this.cargo=cargo;
    }
    
}
