
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import modelo.ModeloLogico;
import vista.FrTraductor;

public class Controlador implements ActionListener, WindowListener  {
FrTraductor vista= new FrTraductor();
ModeloLogico  modelo=new ModeloLogico();

    public Controlador(FrTraductor vista, ModeloLogico modelo) {
        this.vista=vista;
        this.modelo=modelo;
        this.vista.btn1.addActionListener(this);
        this.vista.addWindowListener(this);
    }


 
private void llenado(){
for(String item:  modelo.llenarCombo()){
this.vista.CbBox1.addItem(item);

}
}
private void traducirPalabra(){
this.modelo.setIndexPalabra(this.vista.CbBox1.getSelectedIndex());
this.vista.txtN1.setText(this.modelo.traducirPalabra());
}

    @Override
    public void actionPerformed(ActionEvent e) {

if(e.getSource()==this.vista.btn1)
this.traducirPalabra();       
    }

    @Override
    public void windowOpened(WindowEvent e) {
        this.llenado();
        }

    @Override
    public void windowClosing(WindowEvent e) {
         }

    @Override
    public void windowClosed(WindowEvent e) {
        }

    @Override
    public void windowIconified(WindowEvent e) {
      }

    @Override
    public void windowDeiconified(WindowEvent e) {
           }

    @Override
    public void windowActivated(WindowEvent e) {
          }

    @Override
    public void windowDeactivated(WindowEvent e) {
    
    }



}
   

