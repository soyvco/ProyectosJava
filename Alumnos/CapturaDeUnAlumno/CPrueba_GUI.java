package CapturaDeUnAlumno;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import componentes.CompJoy;
import componentes.CompVentana;

public class CPrueba_GUI extends CompVentana implements KeyListener,MouseListener
{
   private CompJoy joy;
   
   public CPrueba_GUI()
   {
      super("Prueba_GUI",true,100,100,400,300);
   }
   
   protected void crearContenido()
   {
      joy=new CompJoy(pContenido,this,this);
      joy.setBounds(20,20,180,100);
   }
   
   public void actionPerformed(ActionEvent pE)
   {
   }
   
   public void mouseClicked(MouseEvent pE)
   {
   }
   
   public void mousePressed(MouseEvent pE)
   {
   }
   
   public void mouseReleased(MouseEvent pE)
   {
   }
   
   public void mouseEntered(MouseEvent pE)
   {
   }
   
   public void mouseExited(MouseEvent pE)
   {
   }
   
   public void KeyTyped(KeyEvent pE)
   {
   }
   
   public void KeyPressed(KeyEvent pE)
   {
      if(pE.getKeyCode()==KeyEvent.VK_UP) this.setLocation(this.getX(),this.getY()-10);
      else if(pE.getKeyCode()==KeyEvent.VK_DOWN) this.setLocation(this.getX(),this.getY()+10);
      else if(pE.getKeyCode()==KeyEvent.VK_LEFT) this.setLocation(this.getX()-10,this.getY());
      else if(pE.getKeyCode()==KeyEvent.VK_RIGHT) this.setLocation(this.getX()+10,this.getY());
   }
   
   public void keyPressed(java.awt.event.KeyEvent pE)
   {
   }
   
   public void keyReleased(java.awt.event.KeyEvent pE)
   {
   }
   
   public void keyTyped(java.awt.event.KeyEvent pE)
   {
   }
}