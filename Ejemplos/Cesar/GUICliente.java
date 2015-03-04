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

public class GUICliente extends CompVentana implements ActionListener
{
   private CompBoton     bAceptar;
   private CompBoton     bCancelar;
   private JPanel        pCentro;
   private CompLabel     lblMembresia;
   private CompTextfield txtNumTarjeta;
   
   public GUICliente()
   {
      super("Registro de usuario",false,440,180,360,240);
      this.setResizable(false);
   }
   
   protected void crearContenido()
   {
      /* Creando paneles */
      pCentro=new JPanel(null);
      pCentro.setBackground(new Color(255,204,153));
      getContentPane().add(BorderLayout.CENTER,pCentro);
      /*Label y textfield*/
      lblMembresia=new CompLabel(pCentro,"Membresía",40,40,160,30);
      txtNumTarjeta=new CompTextfield(pCentro,160,40,160,30);
      /* Botones */
      bAceptar=new CompBoton(pCentro,"Registrar",this,40,120,120,40);
      bAceptar.setBackground(new Color(51,153,255));
      bCancelar=new CompBoton(pCentro,"Cancelar",this,200,120,120,40);
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