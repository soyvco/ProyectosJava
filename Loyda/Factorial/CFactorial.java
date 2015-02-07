package Factorial;
import javax.swing.JOptionPane;

public class CFactorial
{
   int  num;
   int  i;
   long r =1;
   
   public void factorial()
   {
      for(i=1; i<=num; i++)
      {
         r=r*i;
      }
   }
   
   public void resultado()
   {
      JOptionPane.showMessageDialog(null,"El factorial del número "+num+" es "+r);
   }
}