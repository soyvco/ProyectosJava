package C2Excepciones;

import javax.swing.JOptionPane;

public class CExcPrueba
{
   public void genExc()
   {
      int num[]=new int [4];
      System.out.println("Antes de que de genere la excepción");
      //se genera la excepción
      num[4]=10; //Si fuera un número entre 0 y 3 se muestra el siguiente mensaje...
      JOptionPane.showMessageDialog(null,"Esto no se muestra");
   }
}
