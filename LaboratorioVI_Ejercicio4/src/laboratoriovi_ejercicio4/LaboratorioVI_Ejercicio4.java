/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratoriovi_ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Kevin Barrientos
 */
public class LaboratorioVI_Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
double horas,contador=0,sueldo,numhoras=0,rednumhoras;
        System.out.println("CALCULO DE SUELDO SEMANAL SEGUN HORAS TRABAJADAS\nCADA HORA SE PAGA A Q.17.50");
for (int i=1; i<=6; i++){
    System.out.println("INGRESA LAS HORAS TRABAJADAS EN EL DÍA "+i);
horas=sc.nextFloat();
contador=contador+(horas*17.50);
numhoras=numhoras+horas;
}       
sueldo=Math.round(contador);
rednumhoras=Math.round(numhoras);
        System.out.println("-------------------------");
        System.out.println("EL TOTAL DE HORAS TRABAJADAS EN LA SEMANA ES: "+rednumhoras+"\nEL SUELDO A DEVENGAR ES: Q."+sueldo);
        System.out.println("-------------------------");

}
    
}
