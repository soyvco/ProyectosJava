package componentes;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

public class CompMenuItem extends JMenuItem
{
   public CompMenuItem(CompMenu pMenu,String pEtiqueta,ActionListener pAccion)
   {
      this.setText(pEtiqueta);
      this.addActionListener(pAccion);
      pMenu.add(this);
   }
}
