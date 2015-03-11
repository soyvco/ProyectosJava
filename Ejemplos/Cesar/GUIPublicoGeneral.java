package Cesar;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import componentes.CompBoton;
import componentes.CompLabel;
import componentes.CompTextField;
import componentes.CompVentana;

public class GUIPublicoGeneral extends CompVentana implements ActionListener
{
   private CompBoton     bAceptar;
   private CompBoton     bGuardar;
   private CompBoton     bCancelar;
   private CompLabel     lblNombre;
   private CompLabel     lblFolio;
   private CompLabel     lblKilosRopa;
   private CompLabel     lblFechaEntrega;
   private CompTextField txtNombre;
   private CompTextField txtFolio;
   private CompTextField txtKilosRopa;
   private CompTextField txtFechaEntrega;
   private JPanel        pCentro;
   
   public GUIPublicoGeneral()
   {
      super("Cliente",false,440,100,520,460);
      this.setResizable(false);
   }
   
   protected void crearContenido()
   {
      /* Creando paneles */
      pCentro=new JPanel(null);
      pCentro.setBackground(new Color(255,204,153));
      getContentPane().add(BorderLayout.CENTER,pCentro);
      /* Labels */
      lblNombre=new CompLabel(pCentro,"Nombre:",40,25,200,40);
      lblFolio=new CompLabel(pCentro,"Folio:",40,105,200,40);
      lblKilosRopa=new CompLabel(pCentro,"Kilos de ropa:",40,185,200,40);
      lblFechaEntrega=new CompLabel(pCentro,"Fecha de entrega:",40,265,200,40);
      /* Textfields */
      txtNombre=new CompTextField(pCentro,280,25,200,40);
      txtFolio=new CompTextField(pCentro,280,105,200,40);
      txtKilosRopa=new CompTextField(pCentro,280,185,200,40);
      txtFechaEntrega=new CompTextField(pCentro,280,265,200,40);
      /* Botones */
      bAceptar=new CompBoton(pCentro,"Aceptar",this,40,355,120,40);
      bAceptar.setBackground(new Color(51,153,255));
      bGuardar=new CompBoton(pCentro,"Guardar",this,200,355,120,40);
      bGuardar.setBackground(new Color(51,153,255));
      bCancelar=new CompBoton(pCentro,"Cancelar",this,360,355,120,40);
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