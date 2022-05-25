/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratoriovi_ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Kevin Barrientos
 */
public class LaboratorioVI_Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
    int numero1;
    int numero2;
    int menor;
    int mayor;
   
    System.out.println("SE IMPRIMIRAN TODOS LOS NUMEROS PARES QUE SE ENCUENTREN ENTRE LOS NUMEROS INGRESADOS.");
    System.out.print("Ingrese el primer número: ");
    numero1 = scanner.nextInt();
    System.out.print("Ingrese el segundo número: ");
    numero2 = scanner.nextInt();
    
    if (numero1 < numero2) {
      menor = numero1;
      mayor = numero2;
    } else {
      menor = numero2;
      mayor = numero1;
    }
    // Realización del ciclo para hacer cálculos y mostrar en pantalla
    for (int i=menor+1; i < mayor; i++){
      if (i%2==0){
        System.out.println(i); 
      }
    }
    
}
}
