
package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Kevin Barrientos
 */

public class Modelo {

private String texto;
private String ruta;
    public Modelo() {
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

public void guardar () throws IOException{
    FileWriter fw;
    PrintWriter pw;
    Try{
fw=new FileWriter(ruta+".txt");
pw=new PrintWriter(fw);
pw.println(this.texto);
}catch (Exception ex){
        System.err.println(ex.getMessage());
        }
    
    
}
  public void abrir() throws FileNotFoundException{
  File f;
  FileReader fr;
  BufferedReader br;
  try{
  f=new File(this.ruta);
  fr = new FileReader(f);
  br= BufferedReader(fr);
  
  String lineas;
  while((lineas=br.readLine())!=null){
  this.texto+=lineas;
  }
  }
  
  }  
}
