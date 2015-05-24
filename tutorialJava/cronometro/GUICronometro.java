package cronometro;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.miginfocom.swing.MigLayout;

public class GUICronometro extends JFrame implements ActionListener
{
   private JPanel      contentPane;
   private JPanel      pPie;
   private JLabel      lblCronometro;
   private JButton     bIniciar;
   private JButton     bDetener;
   private JButton     bReiniciar;
   private TCronometro cronometro;
   
   public GUICronometro()
   {
      setTitle("Cronometro by soyvco");
      setIconImage(Toolkit.getDefaultToolkit().getImage(GUICronometro.class.getResource("/PNG/Mr. Bomb.png")));
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(500,300);
      setLocationRelativeTo(null);
      /* Paneles */
      contentPane=new JPanel(new BorderLayout());
      setContentPane(contentPane);
      pPie=new JPanel();
      contentPane.add(pPie,BorderLayout.SOUTH);
      pPie.setLayout(new MigLayout("","[grow][][grow][][grow][][grow]","[][][]"));
      /* Label */
      lblCronometro=new JLabel("00:00:00",SwingConstants.CENTER);
      lblCronometro.setIcon(new ImageIcon(GUICronometro.class.getResource("/PNG/History.png")));
      lblCronometro.setFont(new Font("Dialog",Font.BOLD,80));
      contentPane.add(lblCronometro,BorderLayout.CENTER);
      /* Botones */
      bIniciar=new JButton("Iniciar");
      bIniciar.setIcon(new ImageIcon(GUICronometro.class.getResource("/PNG/Play Green Button.png")));
      bIniciar.addActionListener(this);
      pPie.add("cell 1 1",bIniciar);
      bDetener=new JButton("Detener");
      bDetener.setIcon(new ImageIcon(GUICronometro.class.getResource("/PNG/Pause Green Button.png")));
      bDetener.setEnabled(false);
      bDetener.addActionListener(this);
      pPie.add("cell 3 1",bDetener);
      bReiniciar=new JButton("Reiniciar");
      bReiniciar.setIcon(new ImageIcon(GUICronometro.class.getResource("/PNG/Stop Green Button.png")));
      bReiniciar.setEnabled(false);
      bReiniciar.addActionListener(this);
      pPie.add("cell 5 1",bReiniciar);
   }
   
   @SuppressWarnings({"static-access","deprecation"})
   public void actionPerformed(ActionEvent pE)
   {
      if(pE.getSource().equals(bIniciar))
      {
         if(cronometro.flag==0)
         {
            cronometro.flag=1;
            cronometro=new TCronometro(lblCronometro);
            cronometro.start();
            lblCronometro.setIcon(new ImageIcon(GUICronometro.class.getResource("/PNG/Appointment Urgent.png")));
         }
         else if(cronometro.flag==2)
         {
            cronometro.flag=1;
            cronometro.resume();
            lblCronometro.setIcon(new ImageIcon(GUICronometro.class.getResource("/PNG/Appointment Urgent.png")));
         }
         bIniciar.setEnabled(false);
         bDetener.setEnabled(true);
         bReiniciar.setEnabled(true);
      }
      else if(pE.getSource().equals(bDetener))
      {
         if(cronometro.flag==1)
         {
            cronometro.flag=2;
            cronometro.suspend();
            lblCronometro.setIcon(new ImageIcon(GUICronometro.class.getResource("/PNG/Appointment Cool.png")));
         }
         bIniciar.setText("Reanudar");
         bIniciar.setEnabled(true);
         bDetener.setEnabled(false);
         bReiniciar.setEnabled(true);
      }
      else if(pE.getSource().equals(bReiniciar))
      {
         if(cronometro.flag==1||cronometro.flag==2)
         {
            cronometro.flag=0;
            cronometro.stop();
            lblCronometro.setText("00:00:00");
            lblCronometro.setIcon(new ImageIcon(GUICronometro.class.getResource("/PNG/History.png")));
         }
         bIniciar.setEnabled(true);
         bDetener.setEnabled(false);
         bReiniciar.setEnabled(false);
      }
   }
}
