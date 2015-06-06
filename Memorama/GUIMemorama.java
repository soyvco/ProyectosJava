import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;

public class GUIMemorama extends JFrame implements ActionListener
{
   private JPanel  contentPane;
   private JButton bHongos;
   private JButton bBacterias;
   private JButton bVirus;
   private JButton bParasitos;
   
   public GUIMemorama()
   {
      setTitle("Memorama de microbiología");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(400,300);
      setLocationRelativeTo(null);
      contentPane=new JPanel();
      contentPane.setBorder(new EmptyBorder(5,5,5,5));
      setContentPane(contentPane);
      contentPane.setLayout(new MigLayout("","[grow][][grow][grow][grow][][grow]","[grow][grow][grow][grow][grow]"));
      /* Botones */
      bHongos=new JButton("Hongos");
      bHongos.setFocusable(false);
      bHongos.addActionListener(this);
      contentPane.add(bHongos,"cell 2 1,grow");
      bVirus=new JButton("Virus");
      bVirus.setFocusable(false);
      bVirus.addActionListener(this);
      contentPane.add(bVirus,"cell 4 1,grow");
      bBacterias=new JButton("Bacterias");
      bBacterias.setFocusable(false);
      bBacterias.addActionListener(this);
      contentPane.add(bBacterias,"cell 2 3,grow");
      bParasitos=new JButton("Parasitos");
      bParasitos.setFocusable(false);
      bParasitos.addActionListener(this);
      contentPane.add(bParasitos,"cell 4 3,grow");
   }
   
   public void actionPerformed(ActionEvent pE)
   {
      if(pE.getSource().equals(bHongos))
      {
         GUIHongo h=new GUIHongo();
         h.setVisible(true);
         h.repaint();
         h.doLayout();
      }
      else if(pE.getSource().equals(bVirus))
      {
      }
      else if(pE.getSource().equals(bBacterias))
      {
      }
      else if(pE.getSource().equals(bParasitos))
      {
      }
   }
}
