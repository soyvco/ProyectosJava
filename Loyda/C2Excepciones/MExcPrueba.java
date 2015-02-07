package C2Excepciones;

import javax.swing.JOptionPane;

public class MExcPrueba
{
   public static void main(String[] args)
   {
      try
      {
         CExcPrueba excepcion=new CExcPrueba();
         excepcion.genExc();
      }
      catch(ArrayIndexOutOfBoundsException exc)
      {
         JOptionPane.showMessageDialog(null,"Indice fuera de rango");
      }
   }
}
