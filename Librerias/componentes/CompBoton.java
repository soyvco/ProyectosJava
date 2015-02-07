package componentes;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CompBoton extends JButton implements MouseListener
{
   public String cadena;
   
   public CompBoton(JPanel pPanel,String pEtiqueta,ActionListener pAccion)
   {
      pPanel.add(this);
      this.setText(pEtiqueta);
      this.addActionListener(pAccion);
   }
   
   public CompBoton(JPanel pPanel,String pEtiqueta,ActionListener pAccion,int pX,int pY,int pAncho,int pLargo)
   {
      pPanel.add(this);
      this.setText(pEtiqueta);
      this.addActionListener(pAccion);
      this.setBounds(pX,pY,pAncho,pLargo);
   }
   
   public CompBoton(JPanel pPanel,String pEtiqueta,ActionListener pAccion,int pX,int pY,int pAncho,int pLargo,Color pColor)
   {
      pPanel.add(this);
      this.setText(pEtiqueta);
      this.addActionListener(pAccion);
      this.setBounds(pX,pY,pAncho,pLargo);
      this.setForeground(pColor);
   }
   
   public CompBoton(JPanel pPanel,String pEtiqueta,ActionListener pAccion,int pX,int pY,int pAncho,int pLargo,Font pFont)
   {
      pPanel.add(this);
      this.setText(pEtiqueta);
      this.addActionListener(pAccion);
      this.setBounds(pX,pY,pAncho,pLargo);
      this.setFont(pFont);
   }
   
   public CompBoton(JToolBar pToolBar,String pEtiqueta,ActionListener pAccion,Color pColor)
   {
      pToolBar.add(this);
      this.setText(pEtiqueta);
      this.addActionListener(pAccion);
      this.setForeground(pColor);
   }
   
   public CompBoton(JPanel pPanel,String pEtiqueta,int pRed,int pGreen,int pBlue,String pEstiloLetra,int pTamañoLetra,ActionListener pEvento,ImageIcon pXcon)
   {
      super(pXcon);
      // cadena = pXcon.getDescription();
      if(pEtiqueta==null) pEtiqueta="Nuevo boton ";
      this.setText(pEtiqueta);
      this.setAlignmentX(CENTER_ALIGNMENT);
      if(pRed!=0&pBlue!=0&pGreen!=0) this.setBackground(new Color(pRed,pGreen,pBlue));
      if(!pEstiloLetra.equals("")) this.setFont(new Font(pEstiloLetra,Font.CENTER_BASELINE,pTamañoLetra));
      this.addActionListener(pEvento);
      if(pPanel!=null) pPanel.add(this);
   }
   public CompBoton(JPanel pPanel,String pEtiqueta,ActionListener pAccion,String pUbicacion,Color pFondo,Color pLetra,int pTAM_FUENTE)
   {
      if(pEtiqueta==null) pEtiqueta="Nuevo Boton";
      this.setText(pEtiqueta);
      this.setBounds(31,55,41,31);
      this.setAlignmentX(CENTER_ALIGNMENT);
      this.setBackground(pFondo);
      this.setForeground(pLetra);
      this.setFont(new Font("Century Gothic",Font.PLAIN,pTAM_FUENTE));
      this.addActionListener(pAccion);
      if(pPanel!=null) pPanel.add(this,pUbicacion);
      this.addMouseListener(this);
      this.setFocusable(true);
      this.requestFocus();
      this.setVisible(true);
      if(pPanel!=null) pPanel.add(this,pUbicacion);
   }

   public void mouseClicked(MouseEvent pE)
   {
   }

   public void mousePressed(MouseEvent pE)
   {
   }

   public void mouseReleased(MouseEvent pE)
   {
   }

   public void mouseEntered(MouseEvent pE)
   {
   }

   public void mouseExited(MouseEvent pE)
   {
   }
}