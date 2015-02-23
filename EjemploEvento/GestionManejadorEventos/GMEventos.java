package GestionManejadorEventos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GMEventos extends JFrame implements ActionListener
{
   private JPanel  contentPane;
   private JButton bMensaje;
   
   public GMEventos()
   {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(460,300,200,100);
      contentPane=new JPanel(null);
      contentPane.setBorder(new EmptyBorder(5,5,5,5));
      setContentPane(contentPane);
      /* Creación del botón */
      bMensaje=new JButton("Generador");
      bMensaje.addActionListener(this);
      bMensaje.setBounds(30,20,140,30);
      contentPane.add(bMensaje);
   }
   
   public void actionPerformed(ActionEvent pE)
   {
      if(pE.getSource().equals(bMensaje))
      {
         JOptionPane.showMessageDialog(null,"Generó un mensaje");
      }
   }
}
