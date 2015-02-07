package BalanzaComprobacion;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Balanza extends JFrame
{
   private JPanel contentPane;
   
   public static void main(String[] args)
   {
      EventQueue.invokeLater(new Runnable()
      {
         public void run()
         {
            try
            {
               Balanza frame=new Balanza();
               frame.setVisible(true);
            }
            catch(Exception e)
            {
               e.printStackTrace();
            }
         }
      });
   }
   
   public Balanza()
   {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100,100,675,471);
      contentPane=new JPanel();
      contentPane.setBorder(new EmptyBorder(5,5,5,5));
      contentPane.setLayout(new BorderLayout(0,0));
      setContentPane(contentPane);
      JPanel panel=new JPanel();
      contentPane.add(panel,BorderLayout.SOUTH);
      JButton btnRegresar=new JButton("Regresar");
      btnRegresar.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            dispose();
         }
      });
      panel.add(btnRegresar);
   }
}
