package Final;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
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
import Uni1.Uni1GUI;
import Uni2.Uni2GUI;
import Uni3_4.Uni3_4GUI;
import Uni5.Uni5GUI;
import Uni6.Uni6GUI;

public class CMenuGUI extends JFrame implements ActionListener
{
   private JPanel contentPane,pCuerpo,pPie;
   private JLabel lblUnidades;
   private CompBoton btnUn1,btnUn2,btnUn3_4,btnUn5,btnUn6,btnSalir;
   
   public CMenuGUI()
   {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(550,250,309,300);
      contentPane=new JPanel(new BorderLayout(0,0));
      contentPane.setBorder(new LineBorder(Color.BLACK,1));
      setContentPane(contentPane);
      lblUnidades=new JLabel("Seleccione la unidad deseada:",SwingConstants.CENTER);
      lblUnidades.setFont(new Font("Century Gothic",Font.BOLD,14));
      lblUnidades.setBackground(new Color(255,255,0));
      lblUnidades.setOpaque(true);
      contentPane.add(lblUnidades,BorderLayout.NORTH);
      pCuerpo=new JPanel(new GridLayout(5,0,0,0));
      btnUn1=new CompBoton(pCuerpo,"Unidad 1",this);
      btnUn2=new CompBoton(pCuerpo,"Unidad 2",this);
      btnUn3_4=new CompBoton(pCuerpo,"Unidad 3-4",this);
      btnUn5=new CompBoton(pCuerpo,"Unidad 5",this);
      btnUn6=new CompBoton(pCuerpo,"Unidad 6",this);
      contentPane.add(pCuerpo,BorderLayout.CENTER);
      pPie=new JPanel(new FlowLayout(FlowLayout.CENTER,5,5));
      btnSalir=new CompBoton(pPie,"Salir",this);
      contentPane.add(pPie,BorderLayout.SOUTH);
   }
   
   public void actionPerformed(ActionEvent pEvent)
   {
      if(pEvent.getSource()==btnUn1)
      {
         Uni1GUI a=new Uni1GUI();
         a.setVisible(true);
      }
      else if(pEvent.getSource()==btnUn2)
      {
         Uni2GUI a=new Uni2GUI();
         a.setVisible(true);
      }
      else if(pEvent.getSource()==btnUn3_4)
      {
         Uni3_4GUI a=new Uni3_4GUI();
         a.setVisible(true);
      }
      else if(pEvent.getSource()==btnUn5)
      {
         Uni5GUI a=new Uni5GUI();
         a.setVisible(true);
      }
      else if(pEvent.getSource()==btnUn6)
      {
         Uni6GUI a=new Uni6GUI();
         a.setVisible(true);
      }
      else if(pEvent.getSource()==btnSalir)
      {
         dispose();
      }
   }
}