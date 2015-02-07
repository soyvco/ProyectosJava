package Uni1;
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
import utilerias.CArchivosEscritor;
import utilerias.ETipo;
import componentes.CompBoton;

public class Uni1GUI extends JFrame implements ActionListener
{
   private JPanel contentPane,pPie,pCuerpo;
   private JLabel lblUnidad;
   private CompBoton bRegresar,bPOO,bUML,bDiap,bDiagramasUml,bLnTiempo,bFotos;
   
   public Uni1GUI()
   {
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      setBounds(500,250,402,300);
      contentPane=new JPanel(new BorderLayout(0,0));
      contentPane.setBorder(new LineBorder(Color.BLACK,1));
      setContentPane(contentPane);
      lblUnidad=new JLabel("Unidad 1:",SwingConstants.CENTER);
      lblUnidad.setFont(new Font("Century Gothic",Font.BOLD,14));
      lblUnidad.setBackground(Color.CYAN);
      lblUnidad.setOpaque(true);
      contentPane.add(lblUnidad,BorderLayout.NORTH);
      pPie=new JPanel();
      pPie.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
      contentPane.add(pPie,BorderLayout.SOUTH);
      pCuerpo=new JPanel(new GridLayout(6,1,0,0));
      contentPane.add(pCuerpo,BorderLayout.CENTER);
      bRegresar=new CompBoton(pPie,"Regresar",this);
      bPOO=new CompBoton(pCuerpo,"Elementos de Programación Orientada a Objetos",this);
      bUML=new CompBoton(pCuerpo,"Acerca de UML",this);
      bDiap=new CompBoton(pCuerpo,"Diapositiva UML",this);
      bDiagramasUml=new CompBoton(pCuerpo,"Diagramas UML",this);
      bLnTiempo=new CompBoton(pCuerpo,"Línea de tiempo UML",this);
      bFotos=new CompBoton(pCuerpo,"Fotos",this);
   }
   
   public void actionPerformed(ActionEvent pEvent)
   {
      if(pEvent.getSource()==bRegresar)
      {
         dispose();
      }
      else if(pEvent.getSource()==bPOO)
      {
         CArchivosEscritor escritor=new CArchivosEscritor("POO.doc",ETipo.SOBREESCRIBIR);
         escritor.mostrar();
      }
      else if(pEvent.getSource()==bUML)
      {
         CArchivosEscritor escritor=new CArchivosEscritor("Información de UML.doc",ETipo.SOBREESCRIBIR);
         escritor.mostrar();
      }
      else if(pEvent.getSource()==bDiap)
      {
         CArchivosEscritor escritor=new CArchivosEscritor("Unified Modeling Languaje.ppt",ETipo.SOBREESCRIBIR);
         escritor.mostrar();
      }
      else if(pEvent.getSource()==bDiagramasUml)
      {
         CArchivosEscritor escritor=new CArchivosEscritor("Tipo de diagramas.doc",ETipo.SOBREESCRIBIR);
         escritor.mostrar();
      }
      else if(pEvent.getSource()==bLnTiempo)
      {
         LineaTiempo a=new LineaTiempo();
         a.setVisible(true);
      }
      else if(pEvent.getSource()==bFotos)
      {
         Fotos a=new Fotos();
         a.setVisible(true);
      }
   }
}