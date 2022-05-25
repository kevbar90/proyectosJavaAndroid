/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio_ix;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Kevin Barrientos
 */
public class Laboratorio_IX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Articulo articulo = new Articulo();
    int menu, submenu;
    
    FileWriter fw;
    PrintWriter pw;

    do{
    Scanner sc = new Scanner(System.in);
        System.out.println("REGISTRO DE ARTICULOS");
        System.out.println("Seleccione ua opcion");
        System.out.println("1 CUADERNO");
        System.out.println("2 LIBRO");
        System.out.println("3 LAPICERO");
        System.out.println("4 REGLA");
        System.out.println("0. salir\n");
        menu=sc.nextInt();
        
        switch(menu){
            case 1:
                do{
                System.out.println("1.REGISTRAR CUADERNOS: ");
                System.out.println("0.regresar al menu principal");    
                submenu=sc.nextInt();
                switch (submenu){
                    case 1:                      
                        System.out.println("ingrese el material");
                        articulo.setMaterial(sc.next());
                        System.out.println("ingrese el color");
                        articulo.setColor(sc.next());
                        System.out.println("ingrese la cantidad");
                        articulo.setCantidad(sc.nextInt());
                        System.out.println("ingrese el precio unitario");
                        articulo.setPrecio(sc.nextFloat());
                        
                        System.out.println(articulo.fraseC());                                                                                       
                        System.out.println("--> MATERIAL: "+articulo.getMaterial()+"\n--> COLOR: "+articulo.getColor()+"\n--> CANTIDAD: "+articulo.getCantidad()+"\n--> PRECIO UNIDAD: "+articulo.getPrecio());
                        System.out.println("--> SALDO TOTAL= "+articulo.calculo());
                        System.out.println("------------------------------");
    try{
    fw = new FileWriter ("C:\\Users\\Kevin Barrientos\\Desktop\\UMG\\2022\\PROGRAMACIÓN I\\LABORATORIO IX\\cuadernos.txt");
    pw = new PrintWriter(fw);
    
    pw.println(articulo.fraseC()+"\n--> MATERIAL: "+articulo.getMaterial()+"\n--> COLOR: "+articulo.getColor()+"\n--> CANTIDAD: "+articulo.getCantidad()+"\n--> PRECIO UNIDAD: "+articulo.getPrecio()+"\n--> SALDO TOTAL= "+articulo.calculo()+"\n--------------------------");
    fw.close();
    
    }catch(Exception e){
            System.err.println("ERROR EN EL ARCHIVO"+e);                        
    }                                                  
 }
                                
                }while (submenu!=0);
                break;
      
                 case 2:
                do{
                System.out.println("1.REGISTRAR LIBROS: ");
                System.out.println("0.regresar al menu principal");    
                submenu=sc.nextInt();
                switch (submenu){
                    case 1:
                        System.out.println("ingrese el material");
                        articulo.setMaterial(sc.next());
                        System.out.println("ingrese el color");
                        articulo.setColor(sc.next());
                        System.out.println("ingrese la cantidad");
                        articulo.setCantidad(sc.nextInt());
                        System.out.println("ingrese el precio unitario");
                        articulo.setPrecio(sc.nextFloat());
                        System.out.println(articulo.fraseL());
                        System.out.println("--> MATERIAL: "+articulo.getMaterial()+"\n--> COLOR: "+articulo.getColor()+"\n--> CANTIDAD: "+articulo.getCantidad()+"\n--> PRECIO UNIDAD: "+articulo.getPrecio());
                        System.out.println("--> SALDO TOTAL= "+articulo.calculo());
                        System.out.println("------------------------------");
                        
    try{
    fw = new FileWriter ("C:\\Users\\Kevin Barrientos\\Desktop\\UMG\\2022\\PROGRAMACIÓN I\\LABORATORIO IX\\libros.txt");
    pw = new PrintWriter(fw);
    
    pw.println(articulo.fraseL()+"\n--> MATERIAL: "+articulo.getMaterial()+"\n--> COLOR: "+articulo.getColor()+"\n--> CANTIDAD: "+articulo.getCantidad()+"\n--> PRECIO UNIDAD: "+articulo.getPrecio()+"\n--> SALDO TOTAL= "+articulo.calculo()+"\n--------------------------");
    fw.close();
    
    }catch(Exception e){
            System.err.println("ERROR EN EL ARCHIVO"+e);                        
    }                                                                                           
}
                                
                }while (submenu!=0);
                break;
                
                 case 3:
                do{
                System.out.println("1.REGISTRAR LAPICEROS: ");
                System.out.println("0.regresar al menu principal");    
                submenu=sc.nextInt();
                switch (submenu){
                    case 1:
                        System.out.println("ingrese el material");
                        articulo.setMaterial(sc.next());
                        System.out.println("ingrese el color");
                        articulo.setColor(sc.next());
                        System.out.println("ingrese la cantidad");
                        articulo.setCantidad(sc.nextInt());
                        System.out.println("ingrese el precio unitario");
                        articulo.setPrecio(sc.nextFloat());
                        System.out.println(articulo.fraseLap());
                        System.out.println("--> MATERIAL: "+articulo.getMaterial()+"\n--> COLOR: "+articulo.getColor()+"\n--> CANTIDAD: "+articulo.getCantidad()+"\n--> PRECIO UNIDAD: "+articulo.getPrecio()); 
                        System.out.println("--> SALDO TOTAL= "+articulo.calculo());
                        System.out.println("------------------------------");
                        
    try{
    fw = new FileWriter ("C:\\Users\\Kevin Barrientos\\Desktop\\UMG\\2022\\PROGRAMACIÓN I\\LABORATORIO IX\\lapiceros.txt");
    pw = new PrintWriter(fw);
    
    pw.println(articulo.fraseLap()+"\n--> MATERIAL: "+articulo.getMaterial()+"\n--> COLOR: "+articulo.getColor()+"\n--> CANTIDAD: "+articulo.getCantidad()+"\n--> PRECIO UNIDAD: "+articulo.getPrecio()+"\n--> SALDO TOTAL= "+articulo.calculo()+"\n--------------------------");
    fw.close();
    
    }catch(Exception e){
            System.err.println("ERROR EN EL ARCHIVO"+e);                        
    }                                                                                           
}
                                
                }while (submenu!=0);
                break;
                
                 case 4:
                do{
                System.out.println("1.REGISTRAR REGLAS: ");
                System.out.println("0.regresar al menu principal");    
                submenu=sc.nextInt();
                switch (submenu){
                    case 1:
                        System.out.println("ingrese el material");
                        articulo.setMaterial(sc.next());
                        System.out.println("ingrese el color");
                        articulo.setColor(sc.next());
                        System.out.println("ingrese la cantidad");
                        articulo.setCantidad(sc.nextInt());
                        System.out.println("ingrese el precio unitario");
                        articulo.setPrecio(sc.nextFloat());
                        System.out.println(articulo.fraseR());
                        System.out.println("--> MATERIAL: "+articulo.getMaterial()+"\n--> COLOR: "+articulo.getColor()+"\n--> CANTIDAD: "+articulo.getCantidad()+"\n--> PRECIO UNIDAD: "+articulo.getPrecio()); 
                        System.out.println("--> SALDO TOTAL= "+articulo.calculo());
                        System.out.println("------------------------------");

                            try{
    fw = new FileWriter ("C:\\Users\\Kevin Barrientos\\Desktop\\UMG\\2022\\PROGRAMACIÓN I\\LABORATORIO IX\\reglas.txt");
    pw = new PrintWriter(fw);
    
    pw.println(articulo.fraseR()+"\n--> MATERIAL: "+articulo.getMaterial()+"\n--> COLOR: "+articulo.getColor()+"\n--> CANTIDAD: "+articulo.getCantidad()+"\n--> PRECIO UNIDAD: "+articulo.getPrecio()+"\n--> SALDO TOTAL= "+articulo.calculo()+"\n--------------------------");
    fw.close();
    
    }catch(Exception e){
            System.err.println("ERROR EN EL ARCHIVO"+e);                        
    }
                        
                }
                                
                }while (submenu!=0);
                break;
                
        }
    }while (menu!=0);
    
        
        
        
    }
    
}
