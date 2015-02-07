package Factorial;
import javax.swing.JOptionPane;

public class MFactorial
{
   public void main()
   {
      CFactorial Fact=new CFactorial();
      Fact.num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
      Fact.factorial();
      Fact.resultado();
   }
}