package utilerias;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class CArchivosLector
{
   private static String  nombre;
   private BufferedReader br;
   
   public CArchivosLector(String pNombre)
   {
      nombre=pNombre;
      try
      {
         if(nombre==null) throw new Exception("LECTOR: No puede ser nulo");
         if(nombre.isEmpty()) throw new Exception("LECTOR: Es necesario poner un nombre de archivo");
      }
      catch(Exception e)
      {
         JOptionPane.showMessageDialog(null,e.getMessage());
      }
   }
   
   public boolean abrir()
   {
      boolean abierto=false;
      try
      {
         br=new BufferedReader(new FileReader(nombre));
         abierto=true;
      }
      catch(FileNotFoundException e)
      {
         JOptionPane.showMessageDialog(null,"LECTOR: El archivo no existe: "+nombre);
      }
      return abierto;
   }
   
   public void cerrar()
   {
      try
      {
         br.close();
      }
      catch(IOException e)
      {
         JOptionPane.showMessageDialog(null,"LECTOR: No se pudo cerrar el archivo");
      }
   }
   
   public String lectorLinea()
   {
      String linea="";
      try
      {
         linea=br.readLine();
      }
      catch(IOException e)
      {
         JOptionPane.showMessageDialog(null,"LECTOR: Error al leer linea");
      }
      return linea;
   }
   
   public int lectorNumero()
   {
      int numero=Integer.parseInt(lectorLinea().trim());
      return numero;
   }
   
   public double lectorDoble()
   {
      double doble=Double.parseDouble(lectorLinea().trim());
      return doble;
   }
   
   public String lectorTodo()
   {
      String texto="",linea;
      while((linea=lectorLinea())!=null)
      {
         texto+=linea+"\n";
      }
      return texto;
   }
   
   public void mostrar()
   {
      try
      {
         Desktop.getDesktop().open(new File(nombre));
      }
      catch(Exception e)
      {
         JOptionPane.showMessageDialog(null,"No se puede mostrar el archivo: "+nombre);
      }
   }
   
   public void copiarA(String temp)
   {
      CArchivosEscritor escritor=new CArchivosEscritor(temp,ETipo.SOBREESCRIBIR);
      if(escritor.crear())
      {
         String linea;
         while((linea=lectorLinea())!=null)
         {
            escritor.escritorLinea(linea,true);
         }
         escritor.cerrar();
      }
   }
}