package YOLO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame
{
   private JPanel panelImagen;
   private Icon   icono;
   private JLabel lblImagen;
   
   public Ventana()
   {
      this.setTitle("UML:");
      this.setBounds(420,200,554,400);
      this.setVisible(true);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      imagen();
   }
   
   public void imagen()
   {
      getContentPane().setLayout(null);
      icono=new ImageIcon(getClass().getResource("/Imag/diagramas_uml.png"));
      getContentPane().add(panelImagen=new JPanel());
      panelImagen.setBounds(0,0,552,467);
      getContentPane().add(lblImagen=new JLabel(icono));
      panelImagen.add(lblImagen);
   }
}