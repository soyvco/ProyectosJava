package Uni2;
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

public class Uni2GUI extends JFrame implements ActionListener
{
   private JPanel contentPane,pCuerpo,pPie;
   private JLabel lblUnidad;
   private CompBoton bAut,bAut2,bAut3,bAut4,bAut5,bFact,bPI,bRegresar;
   
   public Uni2GUI()
   {
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      setBounds(610,250,206,300);
      contentPane=new JPanel(new BorderLayout(0,0));
      contentPane.setBorder(new LineBorder(Color.BLACK,1));
      setContentPane(contentPane);
      lblUnidad=new JLabel("Unidad 2:",SwingConstants.CENTER);
      lblUnidad.setFont(new Font("Century Gothic",Font.BOLD,14));
      lblUnidad.setBackground(Color.GREEN);
      lblUnidad.setOpaque(true);
      contentPane.add(lblUnidad,BorderLayout.NORTH);
      pCuerpo=new JPanel(new GridLayout(0,1,0,0));
      contentPane.add(pCuerpo,BorderLayout.CENTER);
      pPie=new JPanel();
      contentPane.add(pPie,BorderLayout.SOUTH);
      bAut=new CompBoton(pCuerpo,"Automotor 1",this);
      bAut2=new CompBoton(pCuerpo,"Automotor 2",this);
      bAut3=new CompBoton(pCuerpo,"Automotor 3",this);
      bAut4=new CompBoton(pCuerpo,"Automotor 4",this);
      bAut5=new CompBoton(pCuerpo,"Automotor 5",this);
      bPI=new CompBoton(pCuerpo,"Calcular factorial",this);
      bFact=new CompBoton(pCuerpo,"Número Par/Impar",this);
      bRegresar=new CompBoton(pPie,"Regresar",this);
   }
   
   public void actionPerformed(ActionEvent pEvent)
   {
      if(pEvent.getSource()==bAut)
      {
         SubUni2 a=new SubUni2();
         a.opcAut1();
      }
      else if(pEvent.getSource()==bAut2)
      {
         SubUni2 a=new SubUni2();
         a.opcAut2();
      }
      else if(pEvent.getSource()==bAut3)
      {
         SubUni2 a=new SubUni2();
         a.opcAut3();
      }
      else if(pEvent.getSource()==bAut4)
      {
         SubUni2 a=new SubUni2();
         a.opcAut4();
      }
      else if(pEvent.getSource()==bAut5)
      {
         SubUni2 a=new SubUni2();
         a.opcAut5();
      }
      else if(pEvent.getSource()==bFact)
      {
         SubUni2 a=new SubUni2();
         a.opcParImpar();
      }
      else if(pEvent.getSource()==bPI)
      {
         SubUni2 a=new SubUni2();
         a.opcFact();
      }
      else if(pEvent.getSource()==bRegresar)
      {
         dispose();
      }
   }
}