
package laboratorioviii;


import java.util.InputMismatchException;
import java.util.Scanner;


public class LaboratorioVIII {


    public static void main(String[] args) {
 int menu,submenu;
do{

Scanner sc=new Scanner(System.in);
    System.out.println("<<MENU>>");
    System.out.println("1. SOLO SE ACEPTAN NUMEROS ENTEROS");
    System.out.println("2. SOLO SE ACEPTAN NUMEROS");
    System.out.println("3. SOLO SE IMPRIME EL ULTIMO CARACTER DE UNA PALABRA DE 4 LETRAS");
    System.out.println("4. DIVISION ENTRE CERO");
    System.out.println("5. IMPRIMIR UNA POSICION INEXISTENTE DE UN ARRAY");
    System.out.println("6. NullPointerException");
    System.out.println("7. POR DEFINIR");
    System.out.println("8. POR DEFINIR");
    System.out.println("9. POR DEFINIR");
    System.out.println("10. POR DEFINIR");
    System.out.println("0. SALIR");
       
    menu=sc.nextInt();
    System.out.println("OPCION: "+menu);
int n1,resultado=0;
char letra;
switch(menu)
{
        
case 1: do{
      System.out.println("1. VER EJEMPLO");
      System.out.println("0.regresar al menu principal");
      submenu=sc.nextInt();
         switch(submenu){
         case 1:
             try{
             System.out.println("INGRESE UN NUMERO ENTERO");
             
             n1=sc.nextInt();
                 System.out.println("EL NUMERO INGRESADO ES: "+n1);
             }catch(Exception e ){
                 System.out.println("---------------SOLO SE ACEPTAN NUMEROS ENTEROS---------------");
                 System.err.println("El error es: "+e);                
             }
             finally{         
                System.out.println("-----------------------proseco terminado----------------------");          
             }          
          
        }
         break;
}while(submenu!=0);
break;

case 2: do{
      System.out.println("1. VER EJEMPLO");
      System.out.println("0.regresar al menu principal");
      submenu=sc.nextInt();
         switch(submenu){
         case 1:
              try{
             System.out.println("INGRESE UN NUMERO ENTERO");
             
             n1=sc.nextInt();
                 System.out.println("EL NUMERO INGRESADO ES: "+n1);
             }catch(Exception e ){
                 System.out.println("---------------NO SE ACEPTAN LETRAS---------------");
                 System.err.println("El error es: "+e);                
             }
             finally{         
                System.out.println("-----------------------proseco terminado----------------------");          
             } 
       
        }
         break;
}while(submenu!=0);
break;

case 3: do{
      System.out.println("1. VER EJEMPLO");
      System.out.println("0.regresar al menu principal");
      submenu=sc.nextInt();
         switch(submenu){
         case 1:
                    try{
             System.out.println("IMPRIMA EL ULTIMO CARACTER DE UNA PALABRA DE 4 LETRAS");
             
             letra=sc.next().charAt(3);
                 System.out.println("LA ULTIMA LETRA ES: "+letra);
             }catch(Exception e ){
                 System.out.println("---LA PALABRA INGRESADA TIENE MENOS DE 4 LETRAS----");
                 System.err.println("El error es: "+e);                
             }
             finally{         
                System.out.println("-----------------------proseco terminado----------------------");          
             } 
       
       
        }
         break;
}while(submenu!=0);
break;

case 4: do{
      System.out.println("1. VER EJEMPLO");
      System.out.println("0.regresar al menu principal");
      submenu=sc.nextInt();
         switch(submenu){
         case 1:
            try{
             System.out.println("ELIJA UN DIVIDENDO PARA EL NUMERO 10");        
             n1=sc.nextInt();
                 System.out.println("EL RESULTADO DE LA DIVISION ES: "+(10/n1));
             }catch(Exception e ){
                 System.out.println("---NO ES POSIBLE DIVIDIR UN NUMERO ENTRE CERO----");
                 System.err.println("El error es: "+e);                
             }
             finally{         
                System.out.println("-----------------------proseco terminado----------------------");          
             } 
       
        }
         break;
}while(submenu!=0);
break;

case 5: do{
      System.out.println("1. VER EJEMPLO");
      System.out.println("0.regresar al menu principal");
      submenu=sc.nextInt();
         switch(submenu){
         case 1:
             try{
             System.out.println("IMPRIMA LA POSICION 3 DE UN ARRAY DE 2 POSICIONES");        
             String[] arreglo =new String [1];
             arreglo[0]="UNO";
             arreglo[1]="DOS";
             
                 System.out.println(arreglo[2]);
             }catch(Exception e ){
                 System.out.println("---EL ARREGLO SOLO TIENE 2 POSICIONES----");
                 System.err.println("El error es: "+e);                
             }
             finally{         
                System.out.println("-----------------------proseco terminado----------------------");          
             } 
       
        }
         break;
}while(submenu!=0);
break;

case 6: do{
      System.out.println("1. VER EJEMPLO");
      System.out.println("0.regresar al menu principal");
      submenu=sc.nextInt();
         switch(submenu){
         case 1:try{
       String[]array_string=new String[25];
             System.out.println(array_string[3].length());
             }catch(Exception e ){
                 System.out.println("----EL BALOR DE LA POSICION INDICADA ES NULO----");
                 System.err.println("El error es: "+e);                
             }
             finally{         
                System.out.println("-----------------------proseco terminado----------------------");          
             } 
        }
         break;
}while(submenu!=0);
break;

case 7: do{
      System.out.println("1. VER EJEMPLO");
      System.out.println("0.regresar al menu principal");
      submenu=sc.nextInt();
         switch(submenu){
         case 1:
       
        }
}while(submenu!=0);
break;

case 8: do{
      System.out.println("1. VER EJEMPLO");
      System.out.println("0.regresar al menu principal");
      submenu=sc.nextInt();
         switch(submenu){
         case 1:
       
        }
}while(submenu!=0);
break;

case 9: do{
      System.out.println("1. SOLO SE ACEPTAN NUMEROS ENTEROS");
      System.out.println("0.regresar al menu principal");
      submenu=sc.nextInt();
         switch(submenu){
         case 1:
       
        }
}while(submenu!=0);
break;

case 10: do{
      System.out.println("1. VER EJEMPLO");
      System.out.println("0.regresar al menu principal");
      submenu=sc.nextInt();
         switch(submenu){
         case 1:
       
        }
}while(submenu!=0);
break;
        } 

}while(menu!=0); 
    
    
}
}