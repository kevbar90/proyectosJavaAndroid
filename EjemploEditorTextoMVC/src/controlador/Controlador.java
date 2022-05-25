
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.FrmAreaTexto;


public class Controlador implements ActionListener {
FrmAreaTexto vista = new FrmAreaTexto();
Modelo modelo = new Modelo();  

    public Controlador(FrmAreaTexto vista, Modelo modelo) {
        this.vista=vista;
        this.modelo=modelo;
        
        this.vista.miGuardar.addActionListener(this);
    }

    public Controlador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void guardar(){
    modelo.setTexto(vista.txtArea.getText());
    modelo.setRuta(vista.FcEmergente.getSelectedFile().toString());
    modelo.guardar();
    
    }
    
    private void arir(){
    vista.FcEmergente.showOpenDialog(vista);
    modelo.setRuta(vista.FcEmergente.getSelectedFile().toString());
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==vista.miGuardar)
           this.guardar();
    }



}
