package Uni1;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
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

public class LineaTiempo extends JFrame implements ActionListener
{
   private JPanel      contentPane,pLinea,pPie;
   private CompBoton   btnRegresar;
   private JLabel      lblLinea,lblTLinea;
   private JScrollPane scrollPane;
   
   public LineaTiempo()
   {
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      setBounds(400,200,600,470);
      contentPane=new JPanel(new BorderLayout(0,0));
      contentPane.setBorder(new LineBorder(Color.BLACK,1));
      setContentPane(contentPane);
      pLinea=new JPanel();
      scrollPane=new JScrollPane(pLinea);
      contentPane.add(scrollPane,BorderLayout.CENTER);
      lblTLinea=new JLabel("Línea del tiempo de UML:",SwingConstants.CENTER);
      lblTLinea.setBackground(Color.CYAN);
      lblTLinea.setOpaque(true);
      contentPane.add(lblTLinea,BorderLayout.NORTH);
      pPie=new JPanel();
      btnRegresar=new CompBoton(pPie,"Regresar",this);
      btnRegresar.setFont(new Font("Century Gothic",Font.BOLD,14));
      contentPane.add(pPie,BorderLayout.SOUTH);
      lblLinea=new JLabel(new ImageIcon("/home/errrre/Documentos/Primera unidad/Linea de tiempo.png"));
      pLinea.add(lblLinea);
   }
   
   public void actionPerformed(ActionEvent pEvent)
   {
      if(pEvent.getSource()==btnRegresar)
      {
         dispose();
      }
   }
}