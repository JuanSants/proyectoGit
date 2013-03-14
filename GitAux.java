/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prgitejemplo;

/**
 *@author MFB
 */
public class GitAux {
    
    public void metodoAlumno1(){
        System.out.println("metodo 1");
	  System.out.println("modificado por alum 1");//insertado por alm1
    }
    
    public void metodoAlumno2(){
        System.out.println("metodo 2");
    }
    
    public void metodoComunitario(){
	//Comentario Incluido para pruebas
        System.out.println("Aqui escribimos todos");
		//modificaciones alumno 1
	System.out.println("Alumno 1 inserta esta sentencia");

    }

    public void testGitAux(){
     // metodo rama testing
       System.out.println("Metodo de testing");
	}
}
