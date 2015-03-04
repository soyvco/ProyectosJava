package Cesar;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import componentes.CompBoton;
import componentes.CompVentana;

public class GUIPowerWash extends CompVentana implements ActionListener
{
   private CompBoton bCliente;
   private CompBoton bPublicoGeneral;
   private CompBoton bEmpresa;
   private CompBoton bNuevoUsuario;
   private JPanel    pCentro;
   private JPanel    pArriba;
   private JLabel    lblTitulo;
   
   public GUIPowerWash()
   {
      super("Lavandería: POWER WASH",true,440,180,600,400);
      this.setResizable(false);
   }
   
   protected void crearContenido()
   {
      /* Creando paneles */
      pArriba=new JPanel(new BorderLayout());
      pArriba.setBackground(new Color(0,204,0));
      getContentPane().add(BorderLayout.NORTH,pArriba);
      pCentro=new JPanel(null);
      pCentro.setBackground(new Color(255,204,153));
      getContentPane().add(BorderLayout.CENTER,pCentro);
      /* Labels */
      lblTitulo=new JLabel("Lavandería POWER WASH");
      lblTitulo.setFont(new Font("Dialog",Font.BOLD,15));
      lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
      pArriba.add(BorderLayout.CENTER,lblTitulo);
      /* Botones */
      bCliente=new CompBoton(pCentro,"Clientes",this,40,25,200,60);
      bCliente.setBackground(new Color(51,153,255));
      bPublicoGeneral=new CompBoton(pCentro,"Publico general",this,40,105,200,60);
      bPublicoGeneral.setBackground(new Color(51,153,255));
      bEmpresa=new CompBoton(pCentro,"Empresa",this,40,185,200,60);
      bEmpresa.setBackground(new Color(51,153,255));
      bNuevoUsuario=new CompBoton(pCentro,"Nuevo usuario",this,40,265,200,60);
      bNuevoUsuario.setBackground(new Color(51,153,255));
   }
   
   public void actionPerformed(ActionEvent pE)
   {
      if(pE.getSource().equals(bCliente))
      {
         new GUICliente();
      }
      else if(pE.getSource().equals(bPublicoGeneral))
      {
         new GUIPublicoGeneral();
      }
      else if(pE.getSource().equals(bEmpresa))
      {
         new GUIEmpresa();
      }
      else if(pE.getSource().equals(bNuevoUsuario))
      {
         new GUINuevoCliente();
      }
   }
}