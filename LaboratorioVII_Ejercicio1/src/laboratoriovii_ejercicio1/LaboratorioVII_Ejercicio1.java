/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratoriovii_ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Kevin Barrientos
 */
public class LaboratorioVII_Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int menu,submenu;
do{

Scanner sc=new Scanner(System.in);
    System.out.println("<<MENU>>");
    System.out.println("1. COPIAR DATOS DE UN VECTOR A OTRO EN ORDEN INVERSO");
    System.out.println("2. SUMA RESTA Y MULTIPLICACIÓN DE VECTORES");
    System.out.println("3. INGRESAR LAS TONAS DE 5 ALUMNOS");   
    System.out.println("0. SALIR");
menu=sc.nextInt();
    System.out.println("OPCION: "+menu);

switch(menu)
{
case 1: do{
      System.out.println("1. COPIA DE DATOS EN SENTIDO INVERSO ");
      System.out.println("0.regresar al menu principal");
      submenu=sc.nextInt();
         switch(submenu){
         case 1:
        int [] arreglo1 = new int[5];
        for (int i = 0 ; i < 5; i++){
            System.out.println("ingresa el dato de la posision ["+i+"]");
            arreglo1[i]= sc.nextInt();
             
        }
             System.out.println("--------------------------------------");
System.out.println("EL ORDEN INVERSO DEL ARREGLO ES: ");   
    int arreglo2[]=new int[5];
    for (int i=4 ; i >=0; i--){
    arreglo2[i]=arreglo1[i];
    System.out.print(arreglo2[i]+"\n");}
System.out.println("--------------------------------------");
                        }
        }while(submenu!=0);
break;

         case 2:do{
      System.out.println("1.OPERACION DE VECTORES: ");
      System.out.println("0.regresar al menu principal");
      submenu=sc.nextInt();
         switch(submenu){
         case 1:
             System.out.println("<<< INGRESE LOS DATOS DEL ARREGLO 1 >>> ");
int [] arreglo1 = new int[5];
        for (int i = 0 ; i < 5; i++){
        System.out.println("ingresa el dato de la posision ["+i+"]");
        arreglo1[i]= sc.nextByte();}
System.out.println("-------------------------");
System.out.println("ARREGLO 1: ");
        for (int i=0 ; i <5; i++){
        System.out.print(arreglo1[i]+"");}
             
System.out.println("\n-------------------------");
             System.out.println("<<< INGRESE LOS DATOS DEL ARREGLO 2 >>> ");
int [] arreglo2 = new int[5];
        for (int i = 0 ; i < 5; i++){
        System.out.println("ingresa el dato de la posision ["+i+"]");
        arreglo2[i]= sc.nextByte();}
System.out.println("-------------------------");
System.out.println("ARREGLO 2: ");
        for (int i=0 ; i <5; i++){
        System.out.print(arreglo2[i]+"");}
             
System.out.println("\n-------------------------");

System.out.println("-----LA SUMA DE LOS VECTORES ES: ----"); 
int suma,resta,multiplicacion;
int []arreglo3 = new int [5];
             for (int i = 0; i < 5; i++) {
suma= arreglo3[i]=arreglo1[i]+arreglo2[i]; 
                 System.out.println(suma);     
             }
System.out.println("-----LA RESTA DE LOS VECTORES ES: ----");
 for (int i = 0; i < 5; i++) {
resta= arreglo3[i]=arreglo1[i]-arreglo2[i];
     System.out.println(resta);

             }  
System.out.println("-----LA MULTIPLICACION DE LOS VECTORES ES: ----");
 for (int i = 0; i < 5; i++) {
multiplicacion= arreglo3[i]=arreglo1[i]*arreglo2[i];
     System.out.println(multiplicacion);
}  
}       

        }while(submenu!=0);
break;
 case 3:do{
      System.out.println("1.REGISTRO DE NOTAS DE ALUMNOS");
      System.out.println("0.regresar al menu principal");
      submenu=sc.nextInt();
         switch(submenu){
         case 1:
int nota []=new int[5];
             for (int i = 0; i < 5; i++) {
                 System.out.println("INGRESE LA NOTA DEL CURSO "+(i+1)+": "); 
nota[i]=sc.nextInt();   
             }
        int mayor, menor,media=0;
mayor=menor=nota[0];
             for (int i = 0; i < 5; i++) {
media+=nota[i];
                 if (nota[i]>mayor) {
                     mayor=nota[i];                     
                 }
                 if (nota[i]<menor) {
                     menor = nota[i];
                 }

                }
System.out.println("-------------------------");
System.out.println("LAS NOTAS DE LOS 5 CURSOS SON: ");
        for (int i=0 ; i <5; i++){
        System.out.println("NOTA DE CURSO "+(i+1)+": "+nota[i]+" pts.");}
System.out.println("-------------------------");
                 System.out.println("LA MEDIA ES: "+media/5+" pts.");
                 System.out.println("------------------------");
                 System.out.println("LA NOTA MAS ALTA ES: "+mayor+" pts.");
                 System.out.println("------------------------");
                 System.out.println("LA NOTA MAS BAJA ES: "+menor+" pts.");
                 System.out.println("------------------------");
        }

        }while(submenu!=0);
break;


    }
    
}while(menu!=0);  

    }
    
}
