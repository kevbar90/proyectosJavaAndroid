import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Proyecto {

    
   public static void main(String[] args) {
     
      
        Scanner entrada = new Scanner(System.in);
        
        
          String patron = ("(int|Escribir|while|for|else|if|else|do|while+)|([a-zA-Z]+)|([>|<|=|>=|<=|!=|==]+)|([+|/|*|-]+)|"
                +"([0-9]+)|([(|)]+)|([{|}]+)|(;|,|\"|)");
          
       System.out.println("Ingrese una linea de codigo:");
          String texto ;
          int linea=0;
          
           texto=entrada.nextLine();
           
           
           if(texto.equals("")){
         System.out.println(" compilacion terminada ");
        }else {
              
        Pattern p = Pattern.compile(patron);//metodo guarda
        Matcher matcher=p.matcher(texto);//metodo buscador
       
       
        
        while(matcher.find()){ //buscador de considencias
            String tokent1 = matcher.group(1);  // grupo numero 1
            String tokent2 = matcher.group(2);  // grupo numero 2
            String tokent3 = matcher.group(3);  // grupo numero 3
            String tokent4 = matcher.group(4);  // grupo numero 4
            String tokent5 = matcher.group(5);  // grupo numero 5
            String tokent6 = matcher.group(6);  // grupo numero 6
            String tokent7 = matcher.group(7);  // grupo numero 7
            String tokent8 = matcher.group(8);  // grupo numero 7
           
           
          
            if (tokent1 != null){ //nientras que sea diferente mostrara la palabra reservada y asi por cada tipo de token
                System.out.println("palabra reservada  "+ tokent1);
            }
              if (tokent2 != null){ // tipo 2
                System.out.println("variables  "+ tokent2);
            }
              if (tokent3 != null){ // tipo 3
                System.out.println("operadores relacionales  "+ tokent3);
            }
               if (tokent4 != null){ // tipo 4
                System.out.println("operadores  "+ tokent4);
            }
              if (tokent5 != null){ // tipo 5
                System.out.println("numeros  "+ tokent5);
            }
              if (tokent6 != null){ // tipo 6
                System.out.println("parentesis  "+ tokent6);
            }
              if (tokent7 != null){ // tipo 7
                System.out.println("llaves  "+ tokent7);
            }
              if (tokent8 != null){ // tipo 8    
                System.out.println("signos  "+ tokent8);
                
                if(tokent8.contains(";")){  
                    System.out.println("linea "+ linea);
                    linea++;
                }
                      if(tokent8.contains("\"")){  
                    System.out.println("Mensaje de pantalla " );
                  
                      }
                
                }
              
             
            }
         
        }
        }
    
}