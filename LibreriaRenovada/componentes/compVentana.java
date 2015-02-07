package componentes;
/*
 * Autor: Víctor Romero.
 * 31/Enero/2015
 */
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public abstract class compVentana extends JFrame implements ActionListener
{
   
   public compVentana(String pEncabezado,boolean pPrincipal,int pX,int pY,int pAncho,int pLargo)
   {
      this.setTitle(pEncabezado);
      this.setDefaultCloseOperation(pPrincipal?EXIT_ON_CLOSE: DISPOSE_ON_CLOSE);
      this.setBounds(pX+(pPrincipal?0: 0),pY+(pPrincipal?0: 0),pAncho,pLargo);
      this.setLayout(new BorderLayout());
      crearContenido();
      this.setVisible(true);
   }
   protected abstract void crearContenido();
}
