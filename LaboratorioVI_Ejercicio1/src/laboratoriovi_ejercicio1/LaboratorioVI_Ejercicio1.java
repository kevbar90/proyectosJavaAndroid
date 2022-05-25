
package laboratoriovi_ejercicio1;

// * @author Kevin Barrientos

import java.util.Scanner;

public class LaboratorioVI_Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int menu,submenu;
do{

Scanner sc=new Scanner(System.in);
    System.out.println("<<MENU>>");
    System.out.println("1. FACTORIAL DE N (UTILIZANDO CICLOS)");
    System.out.println("2. ECUACION DE LA RECTA");
    System.out.println("3. DISTANCIA ENTRE 2 PUNTOS");
    System.out.println("4. FORMULA CUADRATICA");
    System.out.println("0. SALIR");
menu=sc.nextInt();
    System.out.println("OPCION: "+menu);

switch(menu)
{
case 1: do{
      System.out.println("1. CALCULE EL FACTORIAL DE UN NUMERO");
      System.out.println("0.regresar al menu principal");
      submenu=sc.nextInt();
         switch(submenu){
         case 1:
        int factorial=1;
        int numero;
                System.out.println("Ingrese un numero: ");
                numero = sc.nextInt();
                for (int i = numero; i>0; i--){
                factorial = factorial *i;
                }
             System.out.println("el factorial de "+numero+" es: "+factorial);
                        }
        }while(submenu!=0);
break;

         case 2:do{
      System.out.println("1.CALCULE LA PENDIENTE Y LA ORDENADA\n  UTILIZANDO LA ECUACION GENERAL DE LA RECTA << Ax+By+C=0 >>");
      System.out.println("0.regresar al menu principal");
      submenu=sc.nextInt();
         switch(submenu){
         case 1:
        double a,b,c,pen,ord,redpen,redord;
             System.out.println("INGRESE EL BALOR DE A");
        a=sc.nextDouble();
             System.out.println("INGRESE EL BALOR DE B");
        b=sc.nextDouble();
             System.out.println("INGRESE EL BALOR DE C");
        c=sc.nextDouble();
             System.out.println("----------------------------------------------");
pen=(-1*(a/b));
ord=(-1*(c/b));
redpen=Math.round(pen);
redord=Math.round(ord);
             System.out.println("LA PENDIENTE => ( m = -A/B) ES: "+redpen);
             System.out.println("LA ORDENADA => ( b = -C/B) ES: "+redord);
             System.out.println("----------------------------------------------");
                        }           

        }while(submenu!=0);
break;
 case 3:do{
      System.out.println("1.CALCULE LA DISTANCIA ENTRE DOS PUNTOS");
      System.out.println("0.regresar al menu principal");
      submenu=sc.nextInt();
         switch(submenu){
         case 1:
         double x1,x2,y1,y2,respuesta2,raiz,redondear;
         System.out.println("DESPUES SE RESUELVE d = √(X2-X1)∧2 + (Y2-Y1)∧2) ");
         System.out.println("ingrese el valor de X1");
         x1=sc.nextDouble();
         System.out.println("ingrese el valor de X2");
         x2=sc.nextDouble();
         System.out.println("ingrese el valor de Y1");
         y1=sc.nextDouble();
         System.out.println("ingrese el valor de Y2");
         y2=sc.nextDouble();
         respuesta2=(Math.pow(x1,2)-(2*x1*x2)+Math.pow(x2, 2))+(Math.pow(y1,2)-(2*y1*y2)+Math.pow(y2, 2));
         raiz = Math.sqrt(respuesta2);
         redondear=Math.round(raiz);
         System.out.println("-------------------------------");
         System.out.println("LA SOLCION DEL PROBLEMA ES: "+redondear);   
         System.out.println("-------------------------------");
        }

        }while(submenu!=0);
break;

case 4:do{
      System.out.println("1.APLICAR FORMULA CUADRATICA");
      System.out.println("0.regresar al menu principal");
      submenu=sc.nextInt();
         switch(submenu){
         case 1:
        double a,b,c,determinante,x1,x2,redx1,redx2;         
             System.out.println("ingrese el valor de a: ");
             a=sc.nextDouble();
             System.out.println("ingrese el valor de b: ");
             b=sc.nextDouble();
             System.out.println("ingrese el valor de c: ");
             c=sc.nextDouble();
             determinante=Math.pow(b, 2)-(4*a*c);
             if (determinante >0){
                 System.out.println("dado que el determinante es negativo, no se puede completar la operacion");
                                }
             x1=((b*(-1))+Math.sqrt(determinante))/(2*a);
             x2=((b*(-1))-Math.sqrt(determinante))/(2*a);
             redx1=Math.round(x1);
             redx2=Math.round(x2);

         System.out.println("-------------------------------");
         System.out.println("EL VALOR DE X1 ES =: "+redx1);   
         System.out.println("-------------------------------");
         System.out.println("EL VALOR DE X2 ES =: "+redx2);   
         System.out.println("-------------------------------");
        }

        }while(submenu!=0);
break;

    }
    
}while(menu!=0);  

}
}
