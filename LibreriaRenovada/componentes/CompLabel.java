package componentes;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class CompLabel extends JLabel
{
   public CompLabel(JPanel pPanel,String pEtiqueta,int pX,int pY,int pAncho,int pLargo)
   {
      this.setText(pEtiqueta);
      this.setBounds(pX,pY,pAncho,pLargo);
      pPanel.add(this);
   }
}