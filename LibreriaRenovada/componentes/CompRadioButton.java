package componentes;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class CompRadioButton extends JRadioButton
{
   public CompRadioButton(JPanel pPanel,String pUbicacion,String pEtiqueta)
   {
      this.setText(pEtiqueta);
      pPanel.add(this,pUbicacion);
   }
}
