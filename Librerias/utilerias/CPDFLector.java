package utilerias;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

public class CPDFLector 
{  
   public static void mostrar(String ruta)
   {
      try
      {
         Desktop.getDesktop().open(new File(ruta));
      }
      catch(IOException e)
      {
         JOptionPane.showMessageDialog(null,"No se puede mostrar el archivo");
      }
   }
}