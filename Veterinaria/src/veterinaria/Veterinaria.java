/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Kevin Barrientos
 */
public class Veterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Animal animal = new Animal();
 Cliente cliente= new Cliente();
 Servicio servicio= new Servicio();
 Factura factura = new Factura();

int menu,submenu,menuAnimal;

Scanner sc = new Scanner(System.in);
FileWriter fw;
PrintWriter pw;        

do{
        
        System.out.println("---------Venerinaria BlueVet---------");
        System.out.println("---------SELECCIONE UNA OPCIÓN-------");
        System.out.println("1 CONSULTA GENERAL / COSTO Q.50.00");
        System.out.println("2 VACUNACIÓN       / COSTO Q.30.00");
        System.out.println("3 CONTROL DE PESO  / COSTO Q.20.00");
        System.out.println("4 DERMATOLOGÍA     / COSTO Q.75.00");
        System.out.println("0. salir");
        System.out.println("------------------------------------");
        menu=sc.nextInt();
        switch(menu){
            case 1:
                do{
                System.out.println("1.REGISTRO CONSULTA GENERAL: ");
                System.out.println("0.regresar al menu principal");    
                submenu=sc.nextInt();
                switch (submenu){
                    case 1:
                        System.out.println("INGRESE EL NOMBRE DEL CLIENTE: ");
                        cliente.nombreCompleto();
                        System.out.println("INGRESE EL TELÉFONO:");
                        cliente.setTelefono(sc.next());
                        System.out.println("INGRESE LA DIRECCIÓN:");
                        cliente.texto();
                        System.out.println("INGRESE EL NIT: ");
                        cliente.setNit(sc.next());
                        System.out.println("TIPO DE PAGO: ");
                        cliente.setPago(sc.next());
                        System.out.println("--------------------------------");
                        System.out.println("---SELECCIONE EL TIPO DE ANIMAL---");
                        
                            System.out.println("1. AVES");
                            System.out.println("2. GATOS");
                            System.out.println("3. PERROS");
                            System.out.println("4. REPTILES");
                            System.out.println("5. ROEDORES");
                          menuAnimal=sc.nextInt();
                        switch (menuAnimal){
                            case 1:
                                System.out.println(animal.getAve());
                                System.out.println("INGRESE LA CANTIDAD");
                                animal.cantidad=sc.nextInt();
                            break;
                            case 2:
                                System.out.println(animal.getGato());
                                System.out.println("INGRESE LA CANTIDAD");
                                animal.cantidad=sc.nextInt();                                
                            break;
                            case 3:
                                System.out.println(animal.getPerro()); 
                                System.out.println("INGRESE LA CANTIDAD");
                                animal.cantidad=sc.nextInt();
                            break;
                            case 4:
                                System.out.println(animal.getReptil());
                                System.out.println("INGRESE LA CANTIDAD");
                                animal.cantidad=sc.nextInt();   
                                break;
                            case 5:
                                System.out.println(animal.getRoedor());
                                System.out.println("INGRESE LA CANTIDAD");
                                animal.cantidad=sc.nextInt(); 
                                break;
                        }                     
                            
                        System.out.println("------------------------------------------");
                        System.out.println("-DETALLE DE FACTURACIÓN CONSULTA GENERAL-");
                        float total=animal.cantidad*servicio.getConsulta();                        
                            try{
    fw = new FileWriter ("C:\\Users\\Kevin Barrientos\\Desktop\\UMG\\2022\\PROGRAMACIÓN I\\LABORATORIO IX\\facturaConsultaGeneral.txt");
    pw = new PrintWriter(fw);
    
    pw.println("--DETALLE DE FACTURACIÓN POR CONSULTA GENERAL--"+"\nFACTURA No. "+factura.contador()+"\nFECHA: "+factura.fecha
    +"\n-------------------------------------------------"+"\nNIT: "+cliente.getNit()+"\nNOMBRE: "+cliente.getNombre()
    +"\nDIRECCIÓN: "+cliente.getDireccion()+"\nTELEFONO: "+cliente.getTelefono()+ "\nCANTIDAD DE CONSULTAS: "
    +animal.getCantidad()+"\nCOSTO POR CONSULTA: Q."+servicio.getConsulta()+"\nTOTAL A CANCELAR: Q."+total
    +"\nTIPO DE PAGO: "+cliente.getPago());
    
    fw.close();
    
    }catch(Exception e){
            System.err.println("ERROR EN EL ARCHIVO"+e);                        
    }                                                 
 }
                                
                }while (submenu!=0);
                break;    
    
    
  }while(menu!=0);        

            
        
        
        
        
    }while (menu!=0);
    
}
}