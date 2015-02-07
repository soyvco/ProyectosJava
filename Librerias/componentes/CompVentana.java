package componentes;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public abstract class CompVentana extends JFrame implements ActionListener
{
   private JLabel lEncabezado;
   protected JPanel      pContenido;
   protected JPanel      pPie;
   protected JPanel      pDerecha;
   protected JScrollPane sScroll;
   
   public CompVentana(String pEncabezado)
   {
      this(pEncabezado,false);
   }
   
   public CompVentana(String pEncabezado,boolean pPrincipal)
   {
      this(pEncabezado,pPrincipal,0,0);
   }
   
   public CompVentana(String pEncabezado,boolean pPrincipal,int pX,int pY)
   {
      this(pEncabezado,pPrincipal,pX,pY,Toolkit.getDefaultToolkit().getScreenSize().width,Toolkit.getDefaultToolkit().getScreenSize().height);
   }
   
   public CompVentana(String pEncabezado,boolean pPrincipal,int pX,int pY,int pAncho,int pLargo)
   {
      this.setTitle(pEncabezado);
      this.setDefaultCloseOperation(pPrincipal?EXIT_ON_CLOSE: DISPOSE_ON_CLOSE);
      this.setBounds(pX+(pPrincipal?0: 0),pY+(pPrincipal?0: 0),pAncho,pLargo);
      this.setLayout(new BorderLayout());
      lEncabezado=new JLabel(pEncabezado);
      lEncabezado.setHorizontalAlignment(JLabel.CENTER);
      lEncabezado.setBackground(Color.DARK_GRAY);
      lEncabezado.setForeground(new Color(6,102,143));
      lEncabezado.setOpaque(true);
      lEncabezado.setBorder(BorderFactory.createLineBorder(Color.BLACK));
      lEncabezado.setFont(new Font("Century Gothic",Font.BOLD,13));
      pContenido=new JPanel(null);
      pContenido.setBackground(pPrincipal?Color.DARK_GRAY: Color.DARK_GRAY);
      this.add(lEncabezado,BorderLayout.NORTH);
      this.add(pContenido,BorderLayout.CENTER);
      crearContenido();
      this.setVisible(true);
   }
   
   protected abstract void crearContenido();
}