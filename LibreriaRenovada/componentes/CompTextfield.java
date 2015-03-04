package componentes;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CompTextfield extends JTextField
{
   public CompTextfield(JPanel pPanel,int pX,int pY,int pAncho,int pLargo)
   {
      this.setBounds(pX,pY,pAncho,pLargo);
      pPanel.add(this);
   }
}
