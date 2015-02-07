package Uni1;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import componentes.CompBoton;

public class Fotos extends JFrame implements ActionListener
{
   private JPanel      contentPane,pPie,pFotos;
   private JScrollPane scrollPane;
   private JLabel      lblFotosSobreUml,lblLogo,lblDiag;
   private CompBoton   btnRegresar;
   
   public Fotos()
   {
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      setBounds(400,250,650,350);
      contentPane=new JPanel(new BorderLayout(0,0));
      contentPane.setBorder(new LineBorder(Color.BLACK,1));
      setContentPane(contentPane);
      pPie=new JPanel();
      contentPane.add(pPie,BorderLayout.SOUTH);
      btnRegresar=new CompBoton(pPie,"Regresar",this);
      lblFotosSobreUml=new JLabel("Fotos sobre UML:",SwingConstants.CENTER);
      lblFotosSobreUml.setBackground(Color.CYAN);
      lblFotosSobreUml.setOpaque(true);
      lblFotosSobreUml.setFont(new Font("Century Gothic",Font.BOLD,14));
      contentPane.add(lblFotosSobreUml,BorderLayout.NORTH);
      pFotos=new JPanel(new GridLayout(0,1,0,0));
      scrollPane=new JScrollPane(pFotos);
      contentPane.add(scrollPane,BorderLayout.CENTER);
      lblLogo=new JLabel(new ImageIcon("/home/errrre/Documentos/Primera unidad/diagramas_uml.png"),SwingConstants.CENTER);
      pFotos.add(lblLogo);
      lblDiag=new JLabel(new ImageIcon("/home/errrre/Documentos/Primera unidad/UML_logo.gif"),SwingConstants.CENTER);
      pFotos.add(lblDiag);
   }
   
   public void actionPerformed(ActionEvent pEvent)
   {
      if(pEvent.getSource()==btnRegresar)
      {
         dispose();
      }
   }
}