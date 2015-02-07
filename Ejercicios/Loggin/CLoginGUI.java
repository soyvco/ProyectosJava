package Loggin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import componentes.CompBoton;
import componentes.CompLabel;
import componentes.CompVentana;

public class CLoginGUI extends CompVentana implements ActionListener
{
   private CompBoton         bEntrar;
   private CompBoton         bSalir;
   public CompLabel          lblUser;
   public CompLabel          lblContr;
   private JComboBox<String> cbUsuario;
   private JPasswordField    pfContrasena;
   
   public CLoginGUI()
   {
      super("Loggin",true,480,250,300,200);
   }
   
   protected void crearContenido()
   {
      lblUser=new CompLabel(pContenido,"Usuario: ",20,20,100,30);
      cbUsuario=new JComboBox<String>();
      cbUsuario.addItem("Prueba");
      cbUsuario.setBounds(180,20,100,30);
      pContenido.add(cbUsuario);
      lblContr=new CompLabel(pContenido,"Contraseña: ",20,60,100,30);
      pfContrasena=new JPasswordField();
      pfContrasena.setBounds(180,60,100,30);
      pContenido.add(pfContrasena);
      bEntrar=new CompBoton(pContenido,"Entrar",this,20,130,100,30);
      bSalir=new CompBoton(pContenido,"Salir",this,180,130,100,30);
   }
   
   public void actionPerformed(ActionEvent pE)
   {
      if(pE.getSource().equals(bEntrar))
      {
         if(String.copyValueOf(pfContrasena.getPassword()).equals("1234"))
         {
            new CVentana();
         }
      }
      else if(pE.getSource().equals(bSalir))
      {
         dispose();
      }
   }
}
