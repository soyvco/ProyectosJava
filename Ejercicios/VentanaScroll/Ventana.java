package VentanaScroll;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import componentes.CompVentana;

public class Ventana extends CompVentana implements ActionListener
{
   private JScrollPane scroll;
//   private JTextArea txArea;
   Ventana()
   {
      super("Prueba",true,500,250,500,350);
   }
   
   protected void crearContenido()
   {
      scroll=new JScrollPane(new JTextArea());
      scroll.setBounds(40,20,420,280);
//      scroll.add(txArea);
      pContenido.add(scroll);
   }
   
   public void actionPerformed(ActionEvent pE)
   {
   }
}
