package InicioSesion;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import net.miginfocom.swing.MigLayout;
import componentes.CompBaseDatos;
import componentes.CompBoton;
import componentes.CompComboBox;
import componentes.CompLabel;
import componentes.CompPasswordField;
import componentes.CompVentana;

public class GUIInicioSesion extends CompVentana
{
   private CompLabel         lblprueba;
   private CompLabel         lblUsuario;
   private CompLabel         lblContraseña;
   private CompComboBox      cbUsuario;
   private CompPasswordField pfContrasena;
   private CompBoton         bEntrar;
   private CompBoton         bSalir;
   static CompBaseDatos      bd =new CompBaseDatos("root","","Logeos"); ;
   static ResultSet          rs;
   
   public GUIInicioSesion()
   {
      super("Iniciar sesión",true,480,200,400,300);
   }
   
   @SuppressWarnings("unchecked")
   protected void crearContenido()
   {
      bd.conectarBD();
      /* Creando los paneles */
      pArriba.setLayout(new MigLayout("","[grow][grow][grow][][grow][grow][grow]","[grow][grow][][grow][grow]"));
      pCentro.setLayout(new MigLayout("","[grow][grow][][grow][grow][][grow][grow][][grow][grow]","[grow][][grow][][grow]"));
      pAbajo.setLayout(new MigLayout("","[grow][grow][grow][grow][grow][grow][grow][grow][grow]","[grow][grow][][grow][grow]"));
      /* Label */
      lblprueba=new CompLabel(pArriba,"cell 3 2","Inicie sesión escogiendo su nombre de usuario");
      lblprueba.setHorizontalAlignment(SwingConstants.CENTER);
      lblUsuario=new CompLabel(pCentro,"cell 2 1","Usuario:");
      lblUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
      lblContraseña=new CompLabel(pCentro,"cell 2 3","Contraseña:");
      lblContraseña.setHorizontalAlignment(SwingConstants.RIGHT);
      /* ComboBox y passwordfield */
      cbUsuario=new CompComboBox(pCentro,"cell 4 1 4 1, grow ");
      rs=bd.getQuery("select nombre from usuarios");
      try
      {
         while(rs.next())
         {
            try
            {
               cbUsuario.addItem(rs.getString("nombre"));
            }
            catch(SQLException e)
            {
               e.printStackTrace();
            }
         }
      }
      catch(SQLException e)
      {
         e.printStackTrace();
      }
      pfContrasena=new CompPasswordField(pCentro,"cell 4 3 4 1, growx",'*');
      /* Botones */
      bEntrar=new CompBoton(pAbajo,"cell 3 2, grow","Entrar",this);
      bSalir=new CompBoton(pAbajo,"cell 5 2, grow","Salir",this);
   }
   
   public void actionPerformed(ActionEvent pE)
   {
      if(pE.getSource().equals(bEntrar))
      {
         String usr=(String)cbUsuario.getSelectedItem();
         char[] caracateres=pfContrasena.getPassword();
         String pass="";
         for(int i=0; i<caracateres.length; i++)
         {
            pass+=caracateres[i];
         }
         rs=bd.getQuery("select * from usuarios where nombre=\""+usr+"\" and contrasena=\""+pass+"\"");
         try
         {
            if(rs.next()==true)
            {
               JOptionPane.showMessageDialog(null,"Iniciando sesión...");
               dispose();
            }
            else
            {
               JOptionPane.showMessageDialog(null,"Ocurrió un error, verifiqué su usario y contraseña.");
            }
         }
         catch(HeadlessException|SQLException e)
         {
            e.printStackTrace();
         }
      }
      else if(pE.getSource().equals(bSalir))
      {
         if(JOptionPane.showConfirmDialog(null,"¿Desea salir?")==JOptionPane.YES_OPTION)
         {
            dispose();
         }
      }
   }
}