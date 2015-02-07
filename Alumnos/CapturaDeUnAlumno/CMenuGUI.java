package CapturaDeUnAlumno;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import componentes.CompBoton;
import componentes.CompVentana;

public class CMenuGUI extends CompVentana
{
   private CompBoton bAlumnos;
   private CompBoton bMaterias;
   private CompBoton bSalir;
   private CompBoton bBotones;
   
   public CMenuGUI()
   {
      super("Menú",true,500,250,240,240);
   }
   protected void crearContenido()
   {
      pContenido.setLayout(new BoxLayout(pContenido,BoxLayout.Y_AXIS));
      bAlumnos  =new CompBoton(pContenido, "Alumnos", this);
      bMaterias =new CompBoton(pContenido,"Materias",this);
      bBotones  =new CompBoton(pContenido,"Botones",this);
      bSalir=    new CompBoton(pContenido,"Salir",this); 
   }
      public void actionPerformed(ActionEvent pE)
      {
         if(pE.getSource().equals(bAlumnos))
         { new CAlumnoGUI();
         }
         else if(pE.getSource().equals(bMaterias))
         { new CMateriasGUI();
         }
         else if(pE.getSource().equals(bBotones))
         {
            new CBotonesGUI();
         }
         else if(pE.getSource().equals(bSalir))
         {dispose();
         }
      }
}