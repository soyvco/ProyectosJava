package componentes;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class CompPasswordField extends JPasswordField
{
   public CompPasswordField(JPanel pPanel,String pUbicacion,char pCaracter)
   {
      this.setEchoChar(pCaracter);
      pPanel.add(this,pUbicacion);
   }
}
