package componentes;
/*
 * Autor: Víctor Romero.
 * 31/Enero/2015
 */
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class CompVentana extends JFrame implements ActionListener
{
   public JPanel pArriba,pCentro,pAbajo,pDerecha,pIzquierda;
   
   public CompVentana(String pEncabezado,boolean pPrincipal,int pX,int pY,int pAncho,int pLargo)
   {
      this.setTitle(pEncabezado);
      this.setDefaultCloseOperation(pPrincipal?EXIT_ON_CLOSE: DISPOSE_ON_CLOSE);
      this.setBounds(pX+(pPrincipal?0: 0),pY+(pPrincipal?0: 0),pAncho,pLargo);
      this.setLayout(new BorderLayout());
      pArriba=new JPanel();
      this.add(BorderLayout.NORTH,pArriba);
      pCentro=new JPanel();
      this.add(BorderLayout.CENTER,pCentro);
      pAbajo=new JPanel();
      this.add(BorderLayout.SOUTH,pAbajo);
      pDerecha=new JPanel();
      this.add(BorderLayout.EAST,pDerecha);
      pIzquierda=new JPanel();
      this.add(BorderLayout.WEST,pIzquierda);
      crearContenido();
   }
   
   protected abstract void crearContenido();
}
