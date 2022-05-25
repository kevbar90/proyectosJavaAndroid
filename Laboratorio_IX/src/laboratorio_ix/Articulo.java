/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio_ix;

/**
 *
 * @author Kevin Barrientos
 */
public class Articulo {
    private String material;
    private String color;
    private int cantidad;
    private float Precio;
    
    public Articulo (){}
    public String fraseC(){
    String mensajeCuaderno = "-----------DETALLE-CUADERNOS------------";    
    return mensajeCuaderno;
    }
    public String fraseL(){
    String mensajeLibro = "-----------DETALLE-LIBROS------------";
    return mensajeLibro;
    }
    public String fraseLap(){
    String mensajeLap = "-----------DETALLE-lAPICEROS------------";
    return mensajeLap;
    }
    public String fraseR(){
    String mensajeReg = "-----------DETALLE-REGLAS------------";
    return mensajeReg;
    }
        
    public float calculo(){
    float calculo = this.cantidad*this.Precio;
    return calculo;
    }
    
    
    
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    
}
