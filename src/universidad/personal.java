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
public class personal {
    protected String tipoDocumento,documento, apellidos, nombres;
    protected int edad;
    protected boolean activo;
    
    public personal (String tipoDocumento, String documento, String apellidos, 
            String nombres, int edad, boolean activo){
     this.tipoDocumento=tipoDocumento;
     this.documento=documento;
     this.apellidos=apellidos;
     this.nombres=nombres;
     this.edad=edad;
     this.activo=activo;
             
    }
    public String mostrarInfo(){
       String resultado ="";
       String estado="";
       if (this.activo){
           estado="Activo";   
       }else{
           estado="Inactivo";
       }
       resultado=tipoDocumento+"\t"+documento+"\t"+nombres+"\t"+apellidos+"\t"+Integer.toString(edad)+"\t"+estado;
       return resultado;
       
    }
    public void setEdad (int edad){
        this.edad=edad;
    }
    public void setactivo (boolean activo){
        this.activo=activo;
    }
}
