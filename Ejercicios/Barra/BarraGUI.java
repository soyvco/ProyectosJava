package Barra;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.JProgressBar;
import javax.swing.border.Border;
import componentes.CompVentana;

public class BarraGUI extends CompVentana
{
   private int          num;
   private JProgressBar progressBar;
   
   BarraGUI()
   {
      super("Barra",true,450,200,400,150);
      pContenido.setBackground(Color.DARK_GRAY);
      pContenido.setForeground(Color.WHITE);
   }
   
   public void iterate()
   {
      while(num<2000)
      {
         progressBar.setValue(num); // Asignar un valor a la barra de progreso.
         try
         {
            Thread.sleep(1000);
         }
         catch(InterruptedException e)
         {
         }
         num+=95;
      }
   }
   protected void crearContenido()
   {
      progressBar=new JProgressBar(0,2000);
      progressBar.setBounds(40,40,320,40);
      progressBar.setValue(0);
      progressBar.setStringPainted(true);
      pContenido.add(progressBar);
      Border border=BorderFactory.createTitledBorder("Reading...");
      progressBar.setBorder(border);
   }
   
   
   public void actionPerformed(ActionEvent pE)
   {
   }
}
