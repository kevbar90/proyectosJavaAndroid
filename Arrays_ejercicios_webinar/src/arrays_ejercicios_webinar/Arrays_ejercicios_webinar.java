
package arrays_ejercicios_webinar;

import java.util.Scanner;


public class Arrays_ejercicios_webinar {


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int array1 [][] = new int [3][5];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                System.out.println("INGRESE EL VALOR DE LA POSICIÓN: "+"["+i+"]"+"["+j+"]");
              array1[i][j]=sc.nextInt();  
            }
            System.out.println("--------------------------------------");    
        }
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                System.out.print("["+array1[i][j]+"] ");
                
            }
            System.out.println("\n");
        }
        
        System.out.println("--------------------------------------"); 
        
         System.out.println("array de 10 posiciones con multiplos de 5 ");
         int num,multi;
         
         System.out.println("------------------------------------");
         int array2 [] = new int[9];  
         for (int i = 1; i <= 10; i++) {
            multi=i*5;
            System.out.println(multi);    
            
        }     
    }  
}
