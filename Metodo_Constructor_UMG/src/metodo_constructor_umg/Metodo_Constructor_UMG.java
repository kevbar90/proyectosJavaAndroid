/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo_constructor_umg;

/**
 *
 * @author Kevin Barrientos
 */
public class Metodo_Constructor_UMG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona = new Persona("Kevin", 31, 'M');
        System.out.println("nombre: "+persona.getNombre()+"\nedad: "+persona.getEdad()+"\nsexo: "+persona.getSexo());    
    }
    
    
}
