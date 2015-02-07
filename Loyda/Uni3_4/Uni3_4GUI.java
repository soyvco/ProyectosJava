package Uni3_4;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import componentes.CompBoton;

public class Uni3_4GUI extends JFrame implements ActionListener
{
   private JPanel contentPane,pCuerpo,pPie;
   private JLabel lblUnidad;
   private CompBoton bHerencia,bAbstract,bRegresar;
   
   public Uni3_4GUI()
   {
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      setBounds(620,250,175,177);
      contentPane=new JPanel(new BorderLayout(0,0));
      contentPane.setBorder(new LineBorder(Color.BLACK,1));
      setContentPane(contentPane);
      lblUnidad=new JLabel("Unidad 3 y 4:",SwingConstants.CENTER);
      lblUnidad.setBackground(Color.ORANGE);
      lblUnidad.setOpaque(true);
      contentPane.add(lblUnidad,BorderLayout.NORTH);
      pCuerpo=new JPanel(new GridLayout(2,1,0,0));
      contentPane.add(pCuerpo,BorderLayout.CENTER);
      pPie=new JPanel();
      contentPane.add(pPie,BorderLayout.SOUTH);
      bHerencia=new CompBoton(pCuerpo,"Herencia",this);
      bAbstract=new CompBoton(pCuerpo,"Absract",this);
      bRegresar=new CompBoton(pPie,"Regresar",this);
   }
      
      public void actionPerformed(ActionEvent pEvent)
      {
         if(pEvent.getSource()==bRegresar)
         {
            dispose();
         }
         else if(pEvent.getSource()==bHerencia)
         {
            SubUni3_4 a=new SubUni3_4();
            a.opcHerencia();
         }
         else if(pEvent.getSource()==bAbstract)
         {
            SubUni3_4 a=new SubUni3_4();
            a.opcAbstract();
         }
      }
}