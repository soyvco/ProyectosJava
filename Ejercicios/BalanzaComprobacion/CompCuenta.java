package BalanzaComprobacion;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class CompCuenta extends JPanel implements FocusListener
{
   private JPanel        pEncabezado,pCuerpo,pDebe,pHaber,pPie;
   private JTextField[] debe,haber;
   private static JLabel lblNom,lbldTotal,lblhTotal,lblTitulo;
   
   public CompCuenta()
   {
      this("Cuenta",3,5);
   }
   
   public CompCuenta(String pCuenta,int pNumDebe,int pNumHaber)
   {
      this.setSize(300,250);
      this.setBorder(new LineBorder(Color.BLACK,1));
      this.setLayout(new BorderLayout(0,0));
      pEncabezado=new JPanel(new GridLayout(2,1));
      this.add(pEncabezado,BorderLayout.NORTH);
      lblTitulo=new JLabel("Datos de cuenta T");
      lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
      pEncabezado.add(lblTitulo);
      lblNom=new JLabel(pCuenta);
      lblNom.setBackground(Color.YELLOW);
      lblNom.setOpaque(true);
      lblNom.setHorizontalAlignment(SwingConstants.CENTER);
      pEncabezado.add(lblNom);
      pCuerpo=new JPanel(new GridLayout(1,2));
      this.add(pCuerpo,BorderLayout.CENTER);
      pDebe=new JPanel(new GridLayout(Math.max(pNumDebe,pNumHaber),1));
      pCuerpo.add(pDebe);
      pHaber=new JPanel(new GridLayout(Math.max(pNumDebe,pNumHaber),1));
      pCuerpo.add(pHaber);
      debe=new JTextField[pNumDebe];
      for(int i=0; i<pNumDebe; i++)
      {
         debe[i]=new JTextField("");
         debe[i].setHorizontalAlignment(SwingConstants.RIGHT);
         debe[i].addFocusListener(this);
         pDebe.add(debe[i]);
      }
      haber=new JTextField[pNumHaber];
      for(int i=0; i<pNumHaber; i++)
      {
         haber[i]=new JTextField("");
         haber[i].setHorizontalAlignment(SwingConstants.LEFT);
         haber[i].addFocusListener(this);
         pHaber.add(haber[i]);
      }
      pPie=new JPanel(new GridLayout(1,2));
      lbldTotal=new JLabel("0");
      lbldTotal.setBackground(new Color(255,127,80));
      lbldTotal.setOpaque(true);
      lbldTotal.setHorizontalAlignment(SwingConstants.CENTER);
      lblhTotal=new JLabel("0");
      lblhTotal.setBackground(Color.GREEN);
      lblhTotal.setOpaque(true);
      lblhTotal.setHorizontalAlignment(SwingConstants.CENTER);
      pPie.add(lbldTotal);
      pPie.add(lblhTotal);
      this.add(pPie,BorderLayout.SOUTH);
   }
   
   public void focusGained(FocusEvent pE)
   {
   }
   
   public void focusLost(FocusEvent pE)
   {
      double tot=0;
      for(JTextField d: debe)
      {
         try
         {
            tot+=Double.parseDouble("0"+d.getText());
         }
         catch(Exception e)
         {
         }
      }
      lbldTotal.setText(""+tot);
      tot=0;
      for(JTextField h: haber)
      {
         try
         {
            tot+=Double.parseDouble("0"+h.getText());
         }
         catch(Exception e)
         {
         }
      }
      lblhTotal.setText(""+tot);
   }
   
   public static int getNombre()
   {
      return Integer.parseInt(lblNom.getText());
   }
   
   public static double getDeudor()
   {
      return getDebe()-getHaber();
   }
   
   public static double getDebe()
   {
      return Double.parseDouble(lbldTotal.getText());
   }
   
   public static double getHaber()
   {
      return Double.parseDouble(lblhTotal.getText());
   }
   
   public static double getAcreedor()
   {
      return Double.parseDouble(lblhTotal.getText());
   }
}