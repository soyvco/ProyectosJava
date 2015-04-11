package buscaminas;
import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 * @author Reynald0
 */
public class RunSplash extends JFrame
{
   private Splash p;
   
   public RunSplash() throws InterruptedException
   {
      setUndecorated(true);
      p = new Splash();
      add(p,BorderLayout.CENTER);
      setSize(p.getWidth(), p.getHeight());
      setLocationRelativeTo(null);
      setVisible(true);
      p.velocidadDeCarga();
      p.setOpaque(false);
      dispose();
      new Buscaminas(10, 20);
   }
   
   public static void main(String args[]) throws InterruptedException
   {
      new RunSplash();
   }
}