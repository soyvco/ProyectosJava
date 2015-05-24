package prueba;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;

public class prueba extends JFrame implements ActionListener
{
   private JPanel contentPane;
   private JButton btnCambiar;
   private JLabel lblHola;
   public prueba()
   {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100,100,450,300);
      contentPane=new JPanel();
      contentPane.setBorder(new EmptyBorder(5,5,5,5));
      setContentPane(contentPane);
      contentPane.setLayout(new MigLayout("","[][][][][]","[][][][][][][]"));
      lblHola=new JLabel("Hola");
      lblHola.setIcon(new ImageIcon(prueba.class.getResource("/PNG/Get Info Blue Button.png")));
      contentPane.add(lblHola,"cell 4 3");
      
      btnCambiar=new JButton("Cambiar");
      btnCambiar.addActionListener(this);
      contentPane.add(btnCambiar,"cell 4 6");
   }
   
   public void actionPerformed(ActionEvent pE)
   {
      if(pE.getSource().equals(btnCambiar))
      {
         lblHola.setIcon(new ImageIcon(prueba.class.getResource("/PNG/Favorite.png")));
      }
   }
}
