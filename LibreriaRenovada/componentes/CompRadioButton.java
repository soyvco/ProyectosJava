package componentes;
import java.awt.event.ItemListener;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class CompRadioButton extends JRadioButton
{
   public CompRadioButton(JPanel pPanel,String pUbicacion,String pEtiqueta,ItemListener pAccion)
   {
      this.setText(pEtiqueta);
      this.addItemListener(pAccion);
      pPanel.add(this,pUbicacion);
   }
}
