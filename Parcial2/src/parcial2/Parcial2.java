
package parcial2;

import java.util.Scanner;

/**
 *
 * @author Kevin Barrientos
 */
public class Parcial2 {

    public static void main(String[] args) {
        // TODO code application logic here
         float montoan,iva,subtotal,montomes,mesmenosIva,incremento,ivasub,valor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el total anual de la venta del producto: ");
        montoan=sc.nextFloat();
    
        System.out.println("------------------------------------------------------------");
        String[]mes={"ENERO","FEBRERO","MARZO","ABRIL","MAYO","JUNI","JULIO","AGOSTO","SEPTIEMBRE","OCTUBRE","NOVIEMRBE","DICIEMBRE"};
        iva=(float) ((montoan*0.12)/12);
        montomes=montoan/12;
       
        
        incremento=(float) (montomes*0.30);
        valor=montomes-incremento;
        ivasub=(float) ((valor)*0.12);
        subtotal = valor+ivasub;
        
        System.out.println("MES  "+"       VALOR  "+"  IVA  "+"  SUBTOTAL  ");
        System.out.println(mes[0]+"       "+valor+"  "+ivasub+"    "+subtotal);
        System.out.println(mes[1]+"     "+valor+"  "+ivasub+"    "+subtotal);
        System.out.println(mes[2]+"       "+valor+"  "+ivasub+"    "+subtotal);
        System.out.println(mes[3]+"       "+valor+"  "+ivasub+"    "+subtotal);
        System.out.println(mes[4]+"        "+valor+"  "+ivasub+"    "+subtotal);
        System.out.println(mes[5]+"        "+valor+"  "+ivasub+"    "+subtotal);
        System.out.println(mes[6]+"       "+valor+"  "+ivasub+"    "+subtotal);
        System.out.println(mes[7]+"      "+valor+"  "+ivasub+"    "+subtotal);
        System.out.println(mes[8]+"  "+valor+"  "+ivasub+"    "+subtotal);
        System.out.println(mes[9]+"     "+valor+"  "+ivasub+"    "+subtotal);
        System.out.println(mes[10]+"   "+valor+"  "+ivasub+"    "+subtotal);
        System.out.println(mes[11]+"   "+montomes+incremento*11+"  "+"  0  "+"    "+montomes+incremento*11);
        System.out.println("TOTAL        --------------          "+montoan);
        
    }
    
}
