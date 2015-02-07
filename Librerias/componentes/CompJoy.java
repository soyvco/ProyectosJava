package componentes;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class CompJoy extends JPanel implements KeyListener,MouseListener
{
   private JLabel  lEtiquetaArriba;
   private JLabel  lEtiquetaAbajo;
   private JLabel  lEtiquetaIzquierda;
   private JLabel  lEtiquetaDerecha;
   private JButton bBoton;
   
   public CompJoy(JPanel pPanel,KeyListener pDireccion,MouseListener pMouse)
   {
      if(pPanel!=null) pPanel.add(this);
      if(pDireccion!=null) pPanel.add(this);
      this.setLayout(new BorderLayout());
      lEtiquetaArriba=new JLabel("Arriba");
      lEtiquetaArriba.setHorizontalAlignment(SwingConstants.CENTER);
      lEtiquetaArriba.addMouseListener(this);
      lEtiquetaAbajo=new JLabel("Abajo");
      lEtiquetaAbajo.setHorizontalAlignment(SwingConstants.CENTER);
      lEtiquetaAbajo.addMouseListener(this);
      lEtiquetaIzquierda=new JLabel("Izquierda");
      lEtiquetaIzquierda.setHorizontalAlignment(SwingConstants.CENTER);
      lEtiquetaIzquierda.addMouseListener(this);
      lEtiquetaDerecha=new JLabel("Derrecha");
      lEtiquetaDerecha.setHorizontalAlignment(SwingConstants.CENTER);
      lEtiquetaDerecha.addMouseListener(this);
      bBoton=new JButton();
      bBoton.addKeyListener(this);
      bBoton.addKeyListener(pDireccion);
      this.addKeyListener(this);
      this.addKeyListener(pDireccion);
      this.setFocusable(true);
      this.requestFocus();
      reset();
   }
   
   public CompJoy(JPanel pPPie,CompJoy pBJoy)
   {
   }

   private void reset()
   {
      this.add(lEtiquetaArriba,BorderLayout.NORTH);
      this.add(lEtiquetaAbajo,BorderLayout.SOUTH);
      this.add(lEtiquetaIzquierda,BorderLayout.WEST);
      this.add(lEtiquetaDerecha,BorderLayout.EAST);
      this.add(bBoton,BorderLayout.CENTER);
      doLayout();
   }
   
   public void keyType(KeyEvent pE)
   {
   }
   
   public void keyPressed(KeyEvent pE)
   {
      accionar(pE.getKeyCode());
   }
   
   public void accionar(int pkeycode)
   {
      reset();
      if(pkeycode==KeyEvent.VK_UP)
      {
         this.add(lEtiquetaArriba,BorderLayout.CENTER);
         this.add(bBoton,BorderLayout.NORTH);
      }
      else if(pkeycode==KeyEvent.VK_DOWN)
      {
         this.add(lEtiquetaAbajo,BorderLayout.CENTER);
         this.add(bBoton,BorderLayout.SOUTH);
      }
      else if(pkeycode==KeyEvent.VK_LEFT)
      {
         this.add(lEtiquetaIzquierda,BorderLayout.CENTER);
         this.add(bBoton,BorderLayout.WEST);
      }
      else if(pkeycode==KeyEvent.VK_RIGHT)
      {
         this.add(lEtiquetaDerecha,BorderLayout.CENTER);
         this.add(bBoton,BorderLayout.EAST);
      }
      doLayout();
      this.requestFocus();
   }
   
   public void keyReleased(KeyEvent pE)
   {
      reset();
   }
   
   public void mouseClicked(MouseEvent pArg0)
   {
   }
   
   public void mouseEntered(MouseEvent pE)
   {
      if(lEtiquetaArriba.equals(pE.getSource()))
      {
         accionar(KeyEvent.VK_UP);
      }
      else if(lEtiquetaAbajo.equals(pE.getSource()))
      {
         accionar(KeyEvent.VK_DOWN);
      }
      else if(lEtiquetaIzquierda.equals(pE.getSource()))
      {
         accionar(KeyEvent.VK_LEFT);
      }
      else if(lEtiquetaDerecha.equals(pE.getSource()))
      {
         accionar(KeyEvent.VK_RIGHT);
      }
   }
   
   public void mouseExited(MouseEvent pArg0)
   {
   }
   
   public void mouseReleased(MouseEvent pE)
   {
      reset();
   }
   
   public void mousePressed(MouseEvent pArg0)
   {
   }
   
   public void keyTyped(KeyEvent pArg0)
   {
   }
}