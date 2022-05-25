
package traductor_mvc;

import controlador.Controlador;
import modelo.ModeloLogico;
import vista.FrTraductor;

public class Traductor_mvc {

    public static void main(String[] args) {
        FrTraductor ft = new FrTraductor();
        ModeloLogico m = new ModeloLogico();
        Controlador c = new Controlador(ft, m);
        ft.setVisible(true);
        ft.setLocationRelativeTo(null);


    }
    
}
