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
public class Universidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        alumnos a1,p2;
        administrativo ad1;
        catedratico c1;
        planta p1;
        
        a1=new alumnos("CC","1083011165","Peralta Charris","María Carolina",23, true,"2013173075","Educación","Lic.Informatica",9);
        System.out.println(a1.mostrar());
        
        c1=new catedratico("CC","36540011","Charris polo","Elizabeth", 62,true,"docente","Lenguaje","01/02/2013","05/10/2018");
        System.out.println(c1.mostrar());
        
    }
    
}
