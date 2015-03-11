package componentes;
import java.awt.event.FocusListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CompLabel extends JLabel
{
   public CompLabel(JPanel pPanel,String pEtiqueta,int pX,int pY,int pAncho,int pLargo)
   {
      this.setText(pEtiqueta);
      this.setBounds(pX,pY,pAncho,pLargo);
      this.setFocusable(false);
      pPanel.add(this);
   }
   
   public CompLabel(JPanel pPanel,String pUbicacion,String pEtiqueta)
   {
      this.setText(pEtiqueta);
      this.setFocusable(false);
      pPanel.add(this,pUbicacion);
   }
   
   public CompLabel(JPanel pPanel,String pEtiqueta,FocusListener pFocus,int pX,int pY,int pAncho,int pLargo)
   {
      this.setText(pEtiqueta);
      this.setBounds(pX,pY,pAncho,pLargo);
      this.addFocusListener(pFocus);
      this.setFocusable(false);
      pPanel.add(this);
   }
}