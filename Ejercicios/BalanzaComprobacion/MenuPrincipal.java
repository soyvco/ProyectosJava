package BalanzaComprobacion;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.GridLayout;

public class MenuPrincipal extends JFrame
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
               MenuPrincipal frame=new MenuPrincipal();
               frame.setVisible(true);
            }
            catch(Exception e)
            {
               e.printStackTrace();
            }
         }
      });
   }
   
   public MenuPrincipal()
   {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(520,250,280,259);
      contentPane=new JPanel();
      contentPane.setBorder(new EmptyBorder(5,5,5,5));
      setContentPane(contentPane);
      JButton btnIngresarUnaCuenta=new JButton("Cuenta T/ Balanza de comprobación");
      btnIngresarUnaCuenta.setFont(new Font("Century Gothic",Font.PLAIN,11));
      btnIngresarUnaCuenta.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent arg0)
         {
            CuentaT a=new CuentaT();
            a.setVisible(true);
         }
      });
      contentPane.setLayout(new GridLayout(2,1,0,0));
      contentPane.add(btnIngresarUnaCuenta);
      JButton btnSalir=new JButton("Salir");
      btnSalir.setFont(new Font("Century Gothic",Font.PLAIN,11));
      btnSalir.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent arg0)
         {
            dispose();
         }
      });
      contentPane.add(btnSalir);
   }
}