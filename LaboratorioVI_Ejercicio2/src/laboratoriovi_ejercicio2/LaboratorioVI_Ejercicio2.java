/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratoriovi_ejercicio2;

import javax.swing.JOptionPane;
/**
 *
 * @author Kevin Barrientos
 */
public class LaboratorioVI_Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

int numero,aleatorio,contador=0;

aleatorio=(int) (Math.random() * 100);
do{
numero=Integer.parseInt(JOptionPane.showInputDialog("ADIVINA EL NUMERO ENTRE 1 Y 100"));
if (aleatorio>numero){
    System.out.println("PRUEBA CON UN NUMERO MAYOR");}
else {System.out.println("PRUEBA CON UN NUMERO MENOR");}
contador++;
}while(numero!=aleatorio && contador!=10 );
        if(contador==10){
            System.out.println("HAS AGOTADO TUS 10 INTENTOS");}
else{
        System.out.println("\nFELICIDADES!, ADIVINASTE EL NUMERO "+aleatorio+" EN "+contador+" INTENTOS");
}

}
}

















