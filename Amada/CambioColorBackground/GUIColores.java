package CambioColorBackground;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/*
 * Práctica 1 - Creación de una GUI.
 * 16/Feb/2015
 * 
 * Creado por: Víctor Jesús Romero Pérez
 */
public class GUIColores extends JFrame implements ActionListener
{
   /* Instanciado las clases de los botones */
   private JButton bYellow;
   private JButton bBlue;
   private JButton bGreen;
   private JPanel  contentPane;
   
   /* Constructor del panel todos sus componentes dentro */
   public GUIColores()
   {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setTitle("Cambio de background");
      setBounds(320,200,460,140);
      contentPane=new JPanel(null);
      contentPane.setBorder(new EmptyBorder(5,5,5,5));
      setContentPane(contentPane);
      /* Creando los botones dentro de panel y asignandole tamaño y acciones... */
      bYellow=new JButton("Y");
      bYellow.setBounds(40,40,100,30);
      bYellow.addActionListener(this);
      contentPane.add(bYellow);
      bBlue=new JButton("B");
      bBlue.setBounds(180,40,100,30);
      bBlue.addActionListener(this);
      contentPane.add(bBlue);
      bGreen=new JButton("G");
      bGreen.setBounds(320,40,100,30);
      bGreen.addActionListener(this);
      contentPane.add(bGreen);
   }
   
   /* Método abstracto que crea los métodos */
   public void actionPerformed(ActionEvent pE)
   {
      if(pE.getSource().equals(bYellow))
      {
         contentPane.setBackground(Color.YELLOW);
      }
      else if(pE.getSource().equals(bBlue))
      {
         contentPane.setBackground(Color.BLUE);
      }
      else if(pE.getSource().equals(bGreen))
      {
         contentPane.setBackground(Color.GREEN);
      }
   }
   
   public static void main(String[] args)
   {
      new GUIColores().setVisible(true);
   }
}
