/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author Kevin Barrientos
 */
public class Factura {
    public Factura(){}
    
    private int nFactura;
 /*   
    LocalDate fechaActual=LocalDate.now();
    LocalTime horaActual= LocalTime.now();
  */  
    Date fechaActual = new Date();
    DateFormat formatoFecha = new SimpleDateFormat("dd-MM-YY HH:mm:ss");
    String fecha = formatoFecha.format(fechaActual);
    

    public int getnFactura() {
        return nFactura;
    }

    public void setnFactura(int nFactura) {
        this.nFactura = nFactura;
    }
    
    public int contador (){
    int contador=0;
    contador=contador+1;
        return contador;
    }
    
    
}

