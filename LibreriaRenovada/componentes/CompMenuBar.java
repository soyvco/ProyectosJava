package componentes;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class CompMenuBar extends JMenuBar
{
   public CompMenuBar(JPanel pPanel)
   {
      pPanel.add(this);
   }
   
   public CompMenuBar(JPanel pPanel,String pUbicacion)
   {
      pPanel.add(pUbicacion,this);
   }
}