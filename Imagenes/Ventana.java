import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame
{
   private JPanel      panelImagen;
   private Icon        img;
   private JLabel      lblImagen;
   
   public Ventana()
   {
      this.setTitle("Imagenes en Java");
      this.setBounds(420,150,554,496);
      this.setVisible(true);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      imagen();
   }
   
   public void imagen()
   {
      getContentPane().setLayout(null);
      img=new ImageIcon(getClass().getResource("/Imagenes/ubuntu.png"));
      getContentPane().add(panelImagen=new JPanel());
      panelImagen.setBounds(0,0,552,467);
      getContentPane().add(lblImagen=new JLabel(img));
      panelImagen.add(lblImagen);
   }
}