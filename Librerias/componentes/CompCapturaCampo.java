package componentes;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CompCapturaCampo extends JPanel implements KeyListener,FocusListener
{
   private JLabel       lEtiqueta;
   private JTextField   tCampo;
   private double       tamEtiqueta;
   private double       tamCampo;
   private boolean      marcaDeAgua;
   public static double TAM_ETIQUETA =0.2;
   public static double TAM_CAMPO    =0.7;
   
   // NUEVO 1er Constructor
   public CompCapturaCampo(JPanel pPanel,String pEtiqueta)
   {
      this(pPanel,pEtiqueta,null,"cell 0 0");
   }
   
   public CompCapturaCampo(JPanel pPanel,String pEtiqueta,String pPosición)
   {
      this(pPanel,pEtiqueta,null,pPosición);
   }
   
   // FIN
   public CompCapturaCampo(JPanel pPanel,String pEtiqueta,String pCampo,String pPosición)
   {
      this(pPanel,pEtiqueta,pCampo,TAM_ETIQUETA,TAM_CAMPO,pPosición);
   }
   
   public CompCapturaCampo(JPanel pPanel,String pEtiqueta,String pCampo,double pTamEtiqueta,double pTamCampo,String pPosición)
   {
      if(pEtiqueta==null) pEtiqueta="Campo nuevo";
      if(pCampo==null) pCampo="Ingrese "+pEtiqueta;
      lEtiqueta=new JLabel(pEtiqueta);
      tCampo=new JTextField(pCampo);
      tCampo.setSelectionStart(0);
      tCampo.setSelectionEnd(pCampo.length());
      tCampo.setForeground(Color.DARK_GRAY);
      tCampo.addKeyListener(this);
      tCampo.addFocusListener(this);
      tamEtiqueta=pTamEtiqueta;
      tamCampo=pTamCampo;
      this.setLayout(null);
      this.setBackground(Color.GRAY);
      marcaDeAgua=true;
      this.add(lEtiqueta);
      this.add(tCampo);
      if(pPanel!=null) pPanel.add(this,pPosición);
   }
   
   public void doLayout()
   // Aquí modificamos los TextField y lEtiqueta
   {
      super.doLayout();
      int ancho=(int)(this.getWidth()*tamEtiqueta);
      lEtiqueta.setBounds(10,-10,ancho-3,this.getHeight()-1);
      tCampo.setBounds(ancho+5,1,(int)(this.getWidth()*tamCampo-10),this.getHeight()-1);
   }
   
   public String getText()
   {
      return tCampo.getText();
   }
   
   public void setText(String pText)
   {
      tCampo.setText(pText);
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
   
   public void keyTyped(KeyEvent pE)
   {
   }
   
   public void focusGained(FocusEvent pE)
   {
      if(marcaDeAgua) tCampo.setText("");
   }
   
   public void focusLost(FocusEvent pE)
   {
      if(marcaDeAgua) tCampo.setText("Ingrese"+lEtiqueta.getText());
   }
}