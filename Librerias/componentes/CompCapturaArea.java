package componentes;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class CompCapturaArea extends JPanel implements KeyListener, FocusListener
{
   private JLabel    lEtiqueta;
   private JTextArea tCampo;
   private JScrollPane scroll;
   private double    tamEtiqueta;
   private double    tamCampo;
   private boolean marcaDeAgua;
   //NUEVO 1er Constructor
   public CompCapturaArea(JPanel pPanel,String pEtiqueta)
   { 
      this (pPanel, pEtiqueta, null, CompCapturaCampo.TAM_ETIQUETA,CompCapturaCampo.TAM_CAMPO);
   }
   //FIN
   public CompCapturaArea(JPanel pPanel,String pEtiqueta,String pCampo)
   { 
      this (pPanel, pEtiqueta, pCampo, CompCapturaCampo.TAM_ETIQUETA,CompCapturaCampo.TAM_CAMPO);
   }
   
   public CompCapturaArea(JPanel pPanel,String pEtiqueta,String pCampo,double ptamEtiqueta,double ptamCampo)
   { 
      //SE agrego
      if(pEtiqueta==null)pEtiqueta="Area nueva";
      //FIN
      if(pCampo==null)pCampo="Ingrese " + pEtiqueta;
      lEtiqueta=new JLabel(pEtiqueta);
      tCampo=new JTextArea(pCampo);
      tCampo.setSelectionStart(0);
      tCampo.setSelectionEnd(pCampo.length());
      tCampo.setForeground(Color.DARK_GRAY);
      tCampo.addKeyListener(this);
      tCampo.addFocusListener(this);
      scroll= new JScrollPane(tCampo);
      tamEtiqueta =ptamEtiqueta;
      tamCampo    =ptamCampo;
      this.setLayout(null);
      this.setBackground(Color.GRAY);
      marcaDeAgua=true;
      this.add(lEtiqueta);
      this.add(scroll);
      if (pPanel !=null)pPanel.add(this);
   }
   
   public void doLayout()
   // Aquí modificamos los TextArea y Etiqueta2
   {
      super.doLayout();
      int ancho=(int)(this.getWidth()*tamEtiqueta);
      lEtiqueta.setBounds(10,-1,ancho-3,this.getHeight()-1);
      scroll.setBounds(ancho+5,1,(int)(this.getWidth()*tamCampo-10),this.getHeight()-1);
   }
   public String getText()
   {
      return tCampo.getText();
   }
   public void setText(String pString)
   {
   }
   public void focusGained(FocusEvent pE)
   {
      if(marcaDeAgua) tCampo.setText("");
   }
   public void focusLost(FocusEvent pE)
   {
      if(marcaDeAgua)tCampo.setText("Ingrese" + lEtiqueta.getText());
   }
   public void keyTyped(KeyEvent pE)
   {
      
   }
   public void keyPressed(KeyEvent pE)
   {
      if(marcaDeAgua)
      {
         tCampo.setForeground(Color.BLACK);
         tCampo.setText("");
         marcaDeAgua=false;
      }   
   }
   public void keyReleased(KeyEvent pE)
   {
   }
}