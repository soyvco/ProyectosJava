package MarcadorTKD;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import componentes.CompBoton;
import componentes.CompCronometro;
import componentes.CompLabel;
import componentes.CompVentana2;

public class GUIMarcadorTKD extends CompVentana2 implements KeyListener
{
   private JPanel         pContenido;
   private JPanel         pArriba;
   private JPanel         pAbajo;
   private JPanel         pCentro;
   private JPanel         pIzquierda;
   private JPanel         pDerecha;
   private CompLabel      lblCronometro;
   private CompLabel      lblPuntoRojo;
   private CompLabel      lblPuntoAzul;
   private CompLabel      lblRound;
   private CompBoton      bIniciar;
   private CompBoton      bPausar;
   private CompBoton      bReiniciar;
   private CompBoton      bConfigurar;
   private static String  tiempoRound      ="00:00:000";
   private static Integer numeroRounds     =0;
   private static Integer contadorRounds   =1;
   private Integer        puntaje          =0;
   private Integer        amonestacionRojo =0;
   private Integer        amonestacionAzul =0;
   static boolean         activarPuntos    =false;
   static boolean         finalCombate     =false;
   static int             flag             =0;
   private CompCronometro cronometro;
   
   public GUIMarcadorTKD()
   {
      super("Marcador",true,800,500);
      setIconImage(Toolkit.getDefaultToolkit().getImage(GUIMarcadorTKD.class.getResource("/PNG/Universal Binary.png")));
      this.addKeyListener(this);
   }
   
   protected void crearContenido()
   {
      /* Paneles */
      pContenido=new JPanel(new BorderLayout());
      setContentPane(pContenido);
      pArriba=new JPanel(new MigLayout("","[grow][][grow]","[grow]"));
      pArriba.setBackground(Color.WHITE);
      pContenido.add(pArriba,BorderLayout.NORTH);
      pCentro=new JPanel(new MigLayout("","[grow][][grow][][grow][][][][grow][][grow][][grow]","[grow][][][][grow][][][][grow]"));
      pCentro.setBackground(Color.WHITE);
      pContenido.add(pCentro,BorderLayout.CENTER);
      pIzquierda=new JPanel(new MigLayout("","[grow][][grow]","[grow]"));
      pIzquierda.setBackground(Color.RED);
      pCentro.add(pIzquierda,"cell 0 0 5 9,grow");
      pDerecha=new JPanel(new MigLayout("","[grow][][grow]","[grow]"));
      pDerecha.setBackground(Color.BLUE);
      pCentro.add(pDerecha,"cell 8 0 5 9,grow");
      pAbajo=new JPanel(new MigLayout("","[grow][][grow][][grow][][grow][][grow]","[grow][][grow]"));
      pAbajo.setBackground(Color.WHITE);
      pContenido.add(pAbajo,BorderLayout.SOUTH);
      /* Labels */
      lblCronometro=new CompLabel(pArriba,"cell 1 0","00:00");
      lblCronometro.setIcon(new ImageIcon(GUIMarcadorTKD.class.getResource("/PNG/History.png")));
      lblCronometro.setFont(new Font("Dialog",Font.BOLD,50));
      lblRound=new CompLabel(pCentro,"cell 6 0","ROUND: 0");
      lblRound.setIcon(new ImageIcon(GUIMarcadorTKD.class.getResource("/PNG/Get Info Purple Button.png")));
      lblRound.setFont(new Font("Dialog",Font.BOLD,20));
      lblPuntoRojo=new CompLabel(pIzquierda,"cell 1 0","0");
      lblPuntoRojo.setFont(new Font("Dialog",Font.BOLD,99));
      lblPuntoAzul=new CompLabel(pDerecha,"cell 1 0","0");
      lblPuntoAzul.setFont(new Font("Dialog",Font.BOLD,99));
      /* Botones */
      bIniciar=new CompBoton(pAbajo,"cell 1 1, grow","Iniciar",this);
      bIniciar.setIcon(new ImageIcon(GUIMarcadorTKD.class.getResource("/PNG/Play All.png")));
      bIniciar.setEnabled(false);
      bPausar=new CompBoton(pAbajo,"cell 3 1, grow","Pausar",this);
      bPausar.setIcon(new ImageIcon(GUIMarcadorTKD.class.getResource("/PNG/Pause All.png")));
      bPausar.setEnabled(false);
      bReiniciar=new CompBoton(pAbajo,"cell 5 1, grow","Reiniciar",this);
      bReiniciar.setIcon(new ImageIcon(GUIMarcadorTKD.class.getResource("/PNG/Stop.png")));
      bReiniciar.setEnabled(false);
      bConfigurar=new CompBoton(pAbajo,"cell 7 1, grow","Configurar",this);
      bConfigurar.setIcon(new ImageIcon(GUIMarcadorTKD.class.getResource("/PNG/Run.png")));
      repaint();
      doLayout();
   }
   
   @SuppressWarnings("deprecation")
   public void actionPerformed(ActionEvent pE)
   {
      if(pE.getSource().equals(bIniciar))
      {
         if(flag==0)
         {
            flag=1;
            cronometro=new CompCronometro(lblCronometro,tiempoRound);
            cronometro.start();
            lblRound.setText("ROUND: "+contadorRounds.toString());
         }
         else if(flag==2)
         {
            flag=1;
            cronometro.resume();
         }
         bIniciar.setEnabled(false);
         bPausar.setEnabled(true);
         bReiniciar.setEnabled(true);
         activarPuntos=true;
      }
      else if(pE.getSource().equals(bPausar))
      {
         if(flag==1)
         {
            flag=2;
            cronometro.suspend();
         }
         bIniciar.setText("Reanudar");
         bIniciar.setEnabled(true);
         bPausar.setEnabled(false);
         bReiniciar.setEnabled(true);
         activarPuntos=true;
      }
      else if(pE.getSource().equals(bReiniciar))
      {
         if(flag==1||flag==2)
         {
            flag=0;
            cronometro.stop();
            lblCronometro.setText("00:00");
         }
         bIniciar.setEnabled(true);
         bPausar.setEnabled(false);
         bReiniciar.setEnabled(false);
         bConfigurar.setEnabled(true);
         activarPuntos=false;
      }
      else if(pE.getSource().equals(bConfigurar))
      {
         numeroRounds=Integer.parseInt(JOptionPane.showInputDialog("Indique el número de rounds"));
         tiempoRound=JOptionPane.showInputDialog("Indique la duración por round:");
         bIniciar.setEnabled(true);
         bConfigurar.setEnabled(false);
         activarPuntos=false;
      }
   }
   
   public void keyTyped(KeyEvent pE)
   {
   }
   
   public void keyPressed(KeyEvent pE)
   {
      /* Acciona los botones con teclas */
      if(pE.getKeyCode()==KeyEvent.VK_O)
      {
         bIniciar.doClick();
      }
      else if(pE.getKeyCode()==KeyEvent.VK_P)
      {
         bPausar.doClick();
      }
      else if(pE.getKeyCode()==KeyEvent.VK_K)
      {
         bReiniciar.doClick();
      }
      else if(pE.getKeyCode()==KeyEvent.VK_L)
      {
         bConfigurar.doClick();
      }
      /* Marcación de puntos y amonestacione */
      else if(activarPuntos==true)
      {
         if(pE.getKeyCode()==KeyEvent.VK_Q)
         {
            puntaje=1+Integer.parseInt(lblPuntoRojo.getText());
            lblPuntoRojo.setText(puntaje.toString());
         }
         else if(pE.getKeyCode()==KeyEvent.VK_W)
         {
            puntaje=2+Integer.parseInt(lblPuntoRojo.getText());
            lblPuntoRojo.setText(puntaje.toString());
         }
         else if(pE.getKeyCode()==KeyEvent.VK_E)
         {
            puntaje=3+Integer.parseInt(lblPuntoRojo.getText());
            lblPuntoRojo.setText(puntaje.toString());
         }
         else if(pE.getKeyCode()==KeyEvent.VK_R)
         {
            puntaje=4+Integer.parseInt(lblPuntoRojo.getText());
            lblPuntoRojo.setText(puntaje.toString());
         }
         else if(pE.getKeyCode()==KeyEvent.VK_A)
         {
            puntaje=1+Integer.parseInt(lblPuntoAzul.getText());
            lblPuntoAzul.setText(puntaje.toString());
         }
         else if(pE.getKeyCode()==KeyEvent.VK_S)
         {
            puntaje=2+Integer.parseInt(lblPuntoAzul.getText());
            lblPuntoAzul.setText(puntaje.toString());
         }
         else if(pE.getKeyCode()==KeyEvent.VK_D)
         {
            puntaje=3+Integer.parseInt(lblPuntoAzul.getText());
            lblPuntoAzul.setText(puntaje.toString());
         }
         else if(pE.getKeyCode()==KeyEvent.VK_F)
         {
            puntaje=4+Integer.parseInt(lblPuntoAzul.getText());
            lblPuntoAzul.setText(puntaje.toString());
         }
         /* Amonestaciones */
         else if(pE.getKeyCode()==KeyEvent.VK_Z)
         {
            if(amonestacionRojo!=1)
            {
               amonestacionRojo++;
            }
            else
            {
               if(puntaje!=0)
               {
                  puntaje=Integer.parseInt(lblPuntoRojo.getText())-1;
                  lblPuntoRojo.setText(puntaje.toString());
                  amonestacionRojo=0;
               }
               else
               {
                  lblPuntoRojo.setText("0");
                  amonestacionRojo=0;
               }
            }
         }
         else if(pE.getKeyCode()==KeyEvent.VK_X)
         {
            if(puntaje!=0)
            {
               puntaje=Integer.parseInt(lblPuntoRojo.getText())-1;
               lblPuntoRojo.setText(puntaje.toString());
               amonestacionRojo=0;
            }
            else
            {
               lblPuntoRojo.setText("0");
               amonestacionRojo=0;
            }
         }
         else if(pE.getKeyCode()==KeyEvent.VK_C)
         {
            if(amonestacionAzul!=1)
            {
               amonestacionAzul++;
            }
            else
            {
               if(puntaje!=0)
               {
                  puntaje=Integer.parseInt(lblPuntoAzul.getText())-1;
                  lblPuntoAzul.setText(puntaje.toString());
                  amonestacionAzul=0;
               }
               else
               {
                  lblPuntoAzul.setText("0");
                  amonestacionAzul=0;
               }
            }
         }
         else if(pE.getKeyCode()==KeyEvent.VK_V)
         {
            if(puntaje!=0)
            {
               puntaje=Integer.parseInt(lblPuntoAzul.getText())-1;
               lblPuntoAzul.setText(puntaje.toString());
               amonestacionRojo=0;
            }
            else
            {
               lblPuntoAzul.setText("0");
               amonestacionRojo=0;
            }
         }
      }
   }
   
   public void keyReleased(KeyEvent pE)
   {
   }
}
