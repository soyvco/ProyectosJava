package componentes;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public abstract class CompVentana2 extends JFrame implements ActionListener
{
   public CompVentana2(String pEncabezado,boolean pPrincipal,int pAncho,int pLargo)
   {
      this.setTitle(pEncabezado);
      this.setDefaultCloseOperation(pPrincipal?EXIT_ON_CLOSE: DISPOSE_ON_CLOSE);
      this.setSize(pAncho,pLargo);
      this.setLocationRelativeTo(null);
      crearContenido();
   }
   
   protected abstract void crearContenido();
}
