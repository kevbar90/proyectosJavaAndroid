/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Kevin Barrientos
 */
public class Cliente {
    public Cliente(){}
    
    private String nombre;
    private String telefono;
    private String direccion;
    private String nit;
    private String pago;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }
    
    
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(in);
    
    
    public String texto (){
    try{
    direccion = buffer.readLine();
    }catch (IOException e){}; 
    return direccion;
    }
    
    public String nombreCompleto (){
    try{
    nombre = buffer.readLine();
    }catch (IOException e){}; 
    return nombre;
    }    
    
    
       
}
