package NumeroPar;
import javax.swing.JOptionPane;

public class MPar
{
   public void main()
   {
      CPar no=new CPar();
      no.num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
      no.calculo();
      no.resultado();
   }
}