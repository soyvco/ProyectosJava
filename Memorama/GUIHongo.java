import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;

public class GUIHongo extends JFrame implements ActionListener
{
   private JPanel  contentPane;
   private JLabel  lblCronometro;
   private JButton b1;
   private JButton b2;
   private JButton b3;
   private JButton b4;
   private JButton b5;
   private JButton b6;
   private JButton b7;
   private JButton b8;
   private JButton b9;
   private JButton b10;
   private JButton b11;
   private JButton b12;
   private JButton bReiniciar;
   
   public GUIHongo()
   {
      setTitle("Hongos");
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      setSize(800,600);
      setLocationRelativeTo(null);
      contentPane=new JPanel(new MigLayout("", "[][grow][][grow][][grow][][grow][]", "[][][][grow][][grow][][grow][][grow][]"));
      contentPane.setBorder(new EmptyBorder(5,5,5,5));
      setContentPane(contentPane);
      /* Cronometro */
      lblCronometro=new JLabel("00:00");
      lblCronometro.setHorizontalAlignment(SwingConstants.CENTER);
      lblCronometro.setFont(new Font("Dialog",Font.BOLD,46));
      lblCronometro.setToolTipText("");
      contentPane.add(lblCronometro,"cell 1 1 7 1,grow");
      /* Botones */
      bReiniciar=new JButton("Reiniciar");
      bReiniciar.addActionListener(this);
      bReiniciar.setFocusable(false);
      contentPane.add(bReiniciar,"cell 1 9, grow");
      b1=new JButton("");
      b1.setIcon(new ImageIcon(GUIHongo.class.getResource("/img/hongo-asperillus.jpg")));
      b1.addActionListener(this);
      b1.setFocusable(false);
      contentPane.add(b1,"cell 1 3, grow");
      b2=new JButton("");
      b2.setIcon(new ImageIcon(GUIHongo.class.getResource("/img/hongo-candida albicans.jpg")));
      b2.addActionListener(this);
      b2.setFocusable(false);
      contentPane.add(b2,"cell 3 3, grow");
      b3=new JButton("");
      b3.setIcon(new ImageIcon("/home/vco/Documentos/lng/Java/ProyectosJavaGit/Amada/PNG/Add To Favorite.png"));
      b3.addActionListener(this);
      b3.setFocusable(false);
      contentPane.add(b3,"cell 5 3, grow");
      b4=new JButton("");
      b4.setIcon(new ImageIcon("/home/vco/Documentos/lng/Java/ProyectosJavaGit/Amada/PNG/Add To Favorite.png"));
      b4.addActionListener(this);
      b4.setFocusable(false);
      contentPane.add(b4,"cell 7 3, grow");
      b5=new JButton("");
      b5.setIcon(new ImageIcon("/home/vco/Documentos/lng/Java/ProyectosJavaGit/Amada/PNG/Add To Favorite.png"));
      b5.addActionListener(this);
      b5.setFocusable(false);
      contentPane.add(b5,"cell 1 5, grow");
      b6=new JButton("");
      b6.setIcon(new ImageIcon("/home/vco/Documentos/lng/Java/ProyectosJavaGit/Amada/PNG/Add To Favorite.png"));
      b6.addActionListener(this);
      b6.setFocusable(false);
      contentPane.add(b6,"cell 3 5, grow");
      b7=new JButton("");
      b7.setIcon(new ImageIcon("/home/vco/Documentos/lng/Java/ProyectosJavaGit/Amada/PNG/Add To Favorite.png"));
      b7.addActionListener(this);
      b7.setFocusable(false);
      contentPane.add(b7,"cell 5 5, grow");
      b8=new JButton("");
      b8.setIcon(new ImageIcon("/home/vco/Documentos/lng/Java/ProyectosJavaGit/Amada/PNG/Add To Favorite.png"));
      b8.addActionListener(this);
      b8.setFocusable(false);
      contentPane.add(b8,"cell 7 5, grow");
      b9=new JButton("");
      b9.setIcon(new ImageIcon("/home/vco/Documentos/lng/Java/ProyectosJavaGit/Amada/PNG/Add To Favorite.png"));
      b9.addActionListener(this);
      b9.setFocusable(false);
      contentPane.add(b9,"cell 1 7, grow");
      b10=new JButton("");
      b10.setIcon(new ImageIcon("/home/vco/Documentos/lng/Java/ProyectosJavaGit/Amada/PNG/Add To Favorite.png"));
      b10.addActionListener(this);
      b10.setFocusable(false);
      contentPane.add(b10,"cell 3 7, grow");
      b11=new JButton("");
      b11.setIcon(new ImageIcon("/home/vco/Documentos/lng/Java/ProyectosJavaGit/Amada/PNG/Add To Favorite.png"));
      b11.addActionListener(this);
      b11.setFocusable(false);
      contentPane.add(b11,"cell 5 7, grow");
      b12=new JButton("");
      b12.setIcon(new ImageIcon("/home/vco/Documentos/lng/Java/ProyectosJavaGit/Amada/PNG/Add To Favorite.png"));
      b12.addActionListener(this);
      b12.setFocusable(false);
      contentPane.add(b12,"cell 7 7, grow");
   }
   
   public void actionPerformed(ActionEvent pE)
   {
      if(pE.getSource().equals(b1))
      {
         b1.setIcon(new ImageIcon("/home/vco/Descargas/juego memorama/hongos/Aspergillus.jpg"));
      }
      else if(pE.getSource().equals(b7))
      {
         b7.setIcon(new ImageIcon("/home/vco/Descargas/juego memorama/hongos/Aspergillus.jpg"));
      }
   }
}
