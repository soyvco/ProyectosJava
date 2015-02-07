package Uni6;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import componentes.CompBoton;

public class Uni6GUI extends JFrame implements ActionListener
{
   private JPanel    contentPane,pPie,pCuerpo;
   private JLabel    lblUnidad;
   private CompBoton bRegresar;
   
   public Uni6GUI()
   {
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      setBounds(500,250,450,300);
      contentPane=new JPanel(new BorderLayout(0,0));
      contentPane.setBorder(new LineBorder(Color.BLACK,1));
      setContentPane(contentPane);
      lblUnidad=new JLabel("Unidad 6:",SwingConstants.CENTER);
      lblUnidad.setFont(new Font("Century Gothic",Font.BOLD,14));
      lblUnidad.setBackground(new Color(255,99,71));
      lblUnidad.setOpaque(true);
      contentPane.add(lblUnidad,BorderLayout.NORTH);
      pCuerpo=new JPanel(new GridLayout(1,0,0,0));
      contentPane.add(pCuerpo,BorderLayout.CENTER);
      pPie=new JPanel();
      contentPane.add(pPie,BorderLayout.SOUTH);
      bRegresar=new CompBoton(pPie,"Regresar",this);
   }
   
   public void actionPerformed(ActionEvent pEvent)
   {
      if(pEvent.getSource()==bRegresar)
      {
         dispose();
      }
   }
}