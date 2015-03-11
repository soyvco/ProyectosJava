package componentes;
import javax.swing.JMenu;

public class CompMenu extends JMenu
{
   public CompMenu(CompMenuBar pBarra,String pEtiqueta)
   {
      this.setText(pEtiqueta);
      pBarra.add(this);
   }
}
