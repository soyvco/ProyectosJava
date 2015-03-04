package componentes;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class CompBoton extends JButton
{
   public CompBoton(JPanel pPanel,String pEtiqueta,ActionListener pAccion)
   {
      pPanel.add(this);
      this.setText(pEtiqueta);
      this.addActionListener(pAccion);
      this.setFocusable(false);
   }
   
   public CompBoton(JPanel pPanel,String pUbicacion,String pEtiqueta,ActionListener pAccion)
   {
      pPanel.add(this,pUbicacion);
      this.setText(pEtiqueta);
      this.addActionListener(pAccion);
      this.setFocusable(false);
   }
   
   public CompBoton(JPanel pPanel,String pEtiqueta,ActionListener pAccion,int pX,int pY,int pAncho,int pLargo)
   {
      pPanel.add(this);
      this.setText(pEtiqueta);
      this.addActionListener(pAccion);
      this.setBounds(pX,pY,pAncho,pLargo);
      this.setFocusable(false);
   }
}