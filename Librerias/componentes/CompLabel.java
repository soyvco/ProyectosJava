package componentes;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CompLabel extends JLabel
{
   public CompLabel(JPanel pPanel,String pEtiqueta,int pX,int pY,int pLargo,int pAncho)
   {
      pPanel.add(this);
      this.setText(pEtiqueta);
      this.setBounds(pX,pY,pLargo,pAncho);
   }
   public CompLabel(JPanel pPanel,String pEtiqueta,int pX,int pY,int pLargo,int pAncho,Font pFont)
   {
      pPanel.add(this);
      this.setText(pEtiqueta);
      this.setBounds(pX,pY,pLargo,pAncho);
      this.setFont(pFont);
   }
}
