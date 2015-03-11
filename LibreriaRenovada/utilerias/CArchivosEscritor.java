package utilerias;
import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class CArchivosEscritor
{
   private String         nombre;
   private ETipo          tipo;
   private BufferedWriter bw;
   
   public CArchivosEscritor(String pNombre,ETipo pTipo)
   {
      nombre=pNombre;
      tipo=pTipo;
      try
      {
         if(nombre==null) throw new Exception("ESCRITOR: El archivo no puede ser nulo");
         if(nombre.isEmpty()) throw new Exception("ESCRITOR: No es necesario poner nombre de archivo");
      }
      catch(Exception e)
      {
         JOptionPane.showMessageDialog(null,e.getMessage());
      }
   }
   
   public boolean crear()
   {
      boolean creado=false;
      try
      {
         bw=new BufferedWriter(new FileWriter(nombre,tipo==ETipo.AGREGAR));
         creado=true;
      }
      catch(IOException e)
      {
         JOptionPane.showMessageDialog(null,"ESCRITOR: No se pudo crear el archivo: "+nombre);
      }
      return creado;
   }
   
   public void cerrar()
   {
      try
      {
         bw.close();
      }
      catch(IOException e)
      {
         JOptionPane.showMessageDialog(null,"ESCRITOR: No se pudo cerrar el archivo");
      }
   }
   
   public void saltoLinea()
   {
      try
      {
         bw.newLine();
      }
      catch(IOException e)
      {
         e.printStackTrace();
      }
   }
   
   public void escritorLinea(String linea)
   {
      escritorLinea(linea,false);
   }
   
   public void escritorLinea(String linea,boolean nuevaLinea)
   {
      try
      {
         if(tipo==ETipo.SOBREESCRIBIR) bw.write(linea);
         else bw.append(linea);
         if(nuevaLinea) bw.newLine();
      }
      catch(IOException e)
      {
         JOptionPane.showMessageDialog(null,"ESCRITOR: No se pudo escribir en el archivo");
      }
   }
   
   public void escritorEntero(int entero)
   {
      escritorLinea(""+entero);
   }
   
   public void escritorDoble(double doble)
   {
      escritorLinea(""+doble);
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
}