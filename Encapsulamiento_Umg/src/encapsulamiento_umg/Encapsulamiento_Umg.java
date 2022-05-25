/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento_umg;

/**
 *
 * @author Kevin Barrientos
 */
public class Encapsulamiento_Umg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Persona persona = new Persona();
    persona.setNombre("Kevin");
    persona.setEdad(20);
    
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Edad: "+persona.getEdad());
    }
    
}
