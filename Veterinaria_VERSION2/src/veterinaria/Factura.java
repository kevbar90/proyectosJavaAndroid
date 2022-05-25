/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Kevin Barrientos
 */
public class Factura {
    public Factura(){}
    
    private int nFactura; 
    LocalDate fechaActual=LocalDate.now();
    LocalTime horaActual= LocalTime.now();

    public int getnFactura() {
        return nFactura;
    }

    public void setnFactura(int nFactura) {
        this.nFactura = nFactura;
    }

    
    
}
