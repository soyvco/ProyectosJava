package Loggin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import componentes.CompVentana;

public class CVentana extends CompVentana implements ActionListener
{
   private JLabel lblmsj;
   public CVentana()
   {
      super("Ventana",false,420,240,250,250);
   }
   
   protected void crearContenido()
   {
      lblmsj=new JLabel("olle ke zabrontozaurio");
      lblmsj.setBounds(40,80,200,30);
      pContenido.add(lblmsj);
   }
   
   public void actionPerformed(ActionEvent pE)
   {
   }
}
