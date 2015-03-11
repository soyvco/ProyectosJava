package componentes;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CompTextField extends JTextField
{
   public CompTextField(JPanel pPanel,String pUbicacion)
   {
      pPanel.add(this,pUbicacion);
   }
   public CompTextField(JPanel pPanel,int pX,int pY,int pAncho,int pLargo)
   {
      this.setBounds(pX,pY,pAncho,pLargo);
      pPanel.add(this);
   }
}
