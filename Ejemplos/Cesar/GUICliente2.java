package Cesar;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import componentes.CompBoton;
import componentes.CompLabel;
import componentes.CompTextfield;
import componentes.CompVentana;

public class GUICliente2 extends CompVentana implements ActionListener
{
   private CompBoton bAceptar;
   private CompBoton bGuardar;
   private CompBoton bCancelar;
   private CompLabel lblNombre;
   private CompLabel lblTiempoCliente;
   private CompLabel lblFolio;
   private CompLabel lblDescuento;
   private CompLabel lblKilosRopa;
   private CompLabel lblFechaEntrega;
   private CompTextfield txtNombre;
   private CompTextfield txtTiempoCliente;
   private CompTextfield txtFolio;
   private CompTextfield txtDescuento;
   private CompTextfield txtKilosRopa;
   private CompTextfield txtFechaEntrega;
   private JPanel    pCentro;
   
   public GUICliente2()
   {
      super("Cliente",false,440,100,520,600);
      this.setResizable(false);
   }
   
   protected void crearContenido()
   {
      /* Creando paneles */
      pCentro=new JPanel(null);
      pCentro.setBackground(new Color(255,204,153));
      getContentPane().add(BorderLayout.CENTER,pCentro);
      /* Labels */
      lblNombre =new CompLabel(pCentro,"Nombre:",40,25,200,40);
      lblTiempoCliente =new CompLabel(pCentro,"Tiempo como cliente:",40,105,200,40);
      lblFolio =new CompLabel(pCentro,"Folio:",40,185,200,40);
      lblDescuento =new CompLabel(pCentro,"Descuento:",40,265,200,40);
      lblKilosRopa =new CompLabel(pCentro,"Kilos de ropa:",40,345,200,40);
      lblFechaEntrega =new CompLabel(pCentro,"Fecha de entrega:",40,425,200,40);
      /*Textfields*/
      txtNombre =new CompTextfield(pCentro,280,25,200,40);
      txtTiempoCliente =new CompTextfield(pCentro,280,105,200,40);
      txtFolio =new CompTextfield(pCentro,280,185,200,40);
      txtDescuento =new CompTextfield(pCentro,280,265,200,40);
      txtKilosRopa =new CompTextfield(pCentro,280,345,200,40);
      txtFechaEntrega =new CompTextfield(pCentro,280,425,200,40);
      /* Botones */
      bAceptar=new CompBoton(pCentro,"Aceptar",this,40,505,120,40);
      bAceptar.setBackground(new Color(51,153,255));
      bGuardar=new CompBoton(pCentro,"Guardar",this,200,505,120,40);
      bGuardar.setBackground(new Color(51,153,255));
      bCancelar=new CompBoton(pCentro,"Cancelar",this,360,505,120,40);
      bCancelar.setBackground(new Color(51,153,255));
   }
   
   public void actionPerformed(ActionEvent pE)
   {
      if(pE.getSource().equals(bAceptar))
      {
      }
      else if(pE.getSource().equals(bGuardar))
      {
      }
      else if(pE.getSource().equals(bCancelar))
      {
      }
   }
}