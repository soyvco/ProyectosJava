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

public class GUINuevoCliente extends CompVentana implements ActionListener
{
   private CompBoton     bAceptar;
   private CompBoton     bCancelar;
   private JPanel        pCentro;
   private CompLabel     lblMembresia;
   private CompLabel     lblNombre;
   private CompLabel     lblTelefono;
   private CompTextfield txtMembresia;
   private CompTextfield txtNombre;
   private CompTextfield txtTelefono;
   
   public GUINuevoCliente()
   {
      super("Registro de usuario",false,440,180,360,340);
      this.setResizable(false);
   }
   
   protected void crearContenido()
   {
      /* Creando paneles */
      pCentro=new JPanel(null);
      pCentro.setBackground(new Color(255,204,153));
      getContentPane().add(BorderLayout.CENTER,pCentro);
      /*Labels*/
      lblMembresia=new CompLabel(pCentro,"Membresia:",40,40,160,40);
      lblNombre=new CompLabel(pCentro,"Nombre:",40,100,160,40);
      lblTelefono=new CompLabel(pCentro,"Telefono:",40,160,160,40);
      /*Botones*/
      txtMembresia=new CompTextfield(pCentro,160,40,160,40);
      txtNombre=new CompTextfield(pCentro,160,100,160,40);
      txtTelefono=new CompTextfield(pCentro,160,160,160,40);
      /* Botones */
      bAceptar=new CompBoton(pCentro,"Registrar",this,40,240,120,40);
      bAceptar.setBackground(new Color(51,153,255));
      bCancelar=new CompBoton(pCentro,"Cancelar",this,200,240,120,40);
      bCancelar.setBackground(new Color(51,153,255));
   }
   
   public void actionPerformed(ActionEvent pE)
   {
      if(pE.getSource().equals(bAceptar))
      {
      }
      else if(pE.getSource().equals(bCancelar))
      {
      }
   }
}