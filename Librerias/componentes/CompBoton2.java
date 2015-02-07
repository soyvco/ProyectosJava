package componentes;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class CompBoton2 extends JButton
{
   public CompBoton2(JPanel pPanel,String pEtiqueta,ActionListener pAccion,String pUbicacion) // color
   {
      this(pPanel,pEtiqueta,pAccion,pUbicacion,Color.WHITE,null,12); // new
                                                                     // Color(51,209,51)
   }
   
   public CompBoton2(JPanel pPanel,String pEtiqueta,ActionListener pAccion,String pUbicacion,Color pFondo,Color pLetra,int pTAM_FUENTE)
   {
      if(pEtiqueta==null) pEtiqueta="Nuevo bóton";
      this.setText(pEtiqueta);
      this.setAlignmentX(CENTER_ALIGNMENT);
      this.setBackground(pFondo);
      this.setForeground(pLetra);
      this.setFont(new Font("Maiandra GD",Font.PLAIN,pTAM_FUENTE));
      this.addActionListener(pAccion);
      if(pPanel!=null) pPanel.add(this,pUbicacion);
   }
}
