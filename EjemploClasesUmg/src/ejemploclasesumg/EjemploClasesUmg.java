
package ejemploclasesumg;

public class EjemploClasesUmg {

    public static void main(String[] args) {
       Persona persona = new Persona();
       persona.nombre ="Juan"; 
        persona.edad=25;
        persona.sexo='M';
        persona.estatura=1.68;
        
        persona.presentar();
        System.out.println("");
        persona.comer();
        persona.comer();
    }
    
}
