import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;
import java.awt.Toolkit;

public class GUIPreguntados extends JFrame implements ActionListener
{
   public JButton              botones[][];
   public Integer              preguntas    =24;
   public JTextField           txtPreguntas =new JTextField(preguntas.toString(),2);
   private JTextField          txtTiempo    =new JTextField(2);
   private JLabel              lblIconos    =new JLabel("Preguntas restantes:");
   private JLabel              lblTiempo    =new JLabel("Tiempo transcurrido:");
   private Temporizador        t;
   private PreguntasRespuestas pr;
   
   public GUIPreguntados()
   {
      setIconImage(Toolkit.getDefaultToolkit().getImage(GUIPreguntados.class.getResource("/img/4.png")));
      pr=new PreguntasRespuestas(this);
      botones=new JButton[6][6];
      /* Panel del temporizador */
      JPanel pArriba=new JPanel();
      pArriba.add(lblIconos);
      pArriba.add(txtPreguntas);
      pArriba.add(lblTiempo);
      pArriba.add(txtTiempo);
      getContentPane().add(pArriba,"North");
      txtTiempo.setEditable(false);
      txtPreguntas.setEditable(false);
      /* Panel para los botones */
      JPanel pCentro=new JPanel(new MigLayout("","[grow][grow][grow][grow][grow][grow][grow][grow]","[grow][grow][grow][grow][grow][grow]"));
      // Crear y colocar los botones
      getContentPane().add(pCentro,"Center");
      for(int i=0; i<6; i++)
      {
         for(int j=0; j<4; j++)
         {
            botones[i][j]=new JButton("");
            pCentro.add(botones[i][j],"cell "+(i+1)+" "+(j+1)+", grow");
            botones[i][j].addActionListener(this);
         }
      }
      /* Caracteristicas de la ventana */
      t=new Temporizador(this);
      t.start();
      setTitle("Preguntados de microbiologia");
      setSize(666,666);
      repaint();
      doLayout();
      setVisible(true);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
   
   public void setTiempo(String pTiempo)
   {
      txtTiempo.setText(pTiempo);
   }
   
   @SuppressWarnings("deprecation")
   public void ganar()
   {
      t.stop();
      JOptionPane.showMessageDialog(null,"Has ganado el juego al contestar todas las preguntas con un tiempo de "+txtTiempo.getText()+" segundos.");
   }
   
   public void actionPerformed(ActionEvent pE)
   {
      pr.crearPreguntas();
      pr.crearRespuestas();
      for(int i=0; i<6; i++)
      {
         for(int j=0; j<6; j++)
         {
            if(pE.getSource()==botones[i][j]&&botones[i][j].getIcon()==null&&botones[i][j].getBackground()!=Color.WHITE)
            {
               botones[i][j].setBackground(Color.WHITE);
               pr.compararRespuestas(i,j);
            }
         }
      }
   }
}
