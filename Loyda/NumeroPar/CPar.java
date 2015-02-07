package NumeroPar;
import javax.swing.JOptionPane;

public class CPar
{
   int num;
   
   public void calculo()
   {
      this.num=num%2;
   }
   
   public void resultado()
   {
      if(num%2==0)
      {
         JOptionPane.showMessageDialog(null,"El número es par.");
      }
      else
      {
         JOptionPane.showMessageDialog(null,"El número es impar.");
      }
   }
}