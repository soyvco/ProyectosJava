package AltaBaja;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import componentes.CompMenu;
import componentes.CompMenuBar;
import componentes.CompMenuItem;
import componentes.CompVentana;
import de.javasoft.plaf.synthetica.SyntheticaOrangeMetallicLookAndFeel;

public class GUIPrincipal extends CompVentana
{
   private CompMenuBar  MenuBar;
   private CompMenu     mAlumnos;
   private CompMenuItem iAltaAlum;
   private CompMenu     mProfesor;
   private CompMenuItem iAltaProf;
   private CompMenu     mAulas;
   private CompMenuItem iAltaAul;
   private CompMenu     mVentana;
   private CompMenuItem iCerrar;
   private CompMenuItem iSalir;
   
   public GUIPrincipal()
   {
      super("Centro de altas y bajas ITVH",true,400,20,520,700);
      setIconImage(Toolkit.getDefaultToolkit().getImage(GUIPrincipal.class.getResource("/PNG/Users.png")));
      try
      {
         UIManager.setLookAndFeel(new SyntheticaOrangeMetallicLookAndFeel());
      }
      catch(Exception e)
      {
         e.printStackTrace();
      }
   }
   
   protected void crearContenido()
   {
      /* Paneles */
      pArriba.setLayout(new BorderLayout());
      pCentro.setLayout(new BorderLayout());
      /* Barra de menu, menus, items */
      MenuBar=new CompMenuBar(pArriba);
      mAlumnos=new CompMenu(MenuBar,"Alumno");
      mAlumnos.setIcon(new ImageIcon(GUIPrincipal.class.getResource("/PNG/User.png")));
      iAltaAlum=new CompMenuItem(mAlumnos,"Alta",this);
      iAltaAlum.setIcon(new ImageIcon(GUIPrincipal.class.getResource("/PNG/Add Green Button.png")));
      mProfesor=new CompMenu(MenuBar,"Profesor");
      mProfesor.setIcon(new ImageIcon(GUIPrincipal.class.getResource("/PNG/User.png")));
      iAltaProf=new CompMenuItem(mProfesor,"Alta",this);
      iAltaProf.setIcon(new ImageIcon(GUIPrincipal.class.getResource("/PNG/Add Green Button.png")));
      mAulas=new CompMenu(MenuBar,"Aula");
      mAulas.setIcon(new ImageIcon(GUIPrincipal.class.getResource("/PNG/User.png")));
      iAltaAul=new CompMenuItem(mAulas,"Alta",this);
      iAltaAul.setIcon(new ImageIcon(GUIPrincipal.class.getResource("/PNG/Add Green Button.png")));
      mVentana=new CompMenu(MenuBar,"Ventana");
      mVentana.setIcon(new ImageIcon(GUIPrincipal.class.getResource("/PNG/Desktop.png")));
      iCerrar=new CompMenuItem(mVentana,"Limpiar panel",this);
      iCerrar.setIcon(new ImageIcon(GUIPrincipal.class.getResource("/PNG/Remove Document.png")));
      iSalir=new CompMenuItem(mVentana,"Salir",this);
      iSalir.setIcon(new ImageIcon(GUIPrincipal.class.getResource("/PNG/Eject Blue Button.png")));
   }
   
   public void actionPerformed(ActionEvent pE)
   {
      if(pE.getSource().equals(iCerrar))
      {
         setTitle("Centro de altas y bajas ITVH");
         pCentro.removeAll();
         pCentro.doLayout();
         pCentro.repaint();
      }
      else if(pE.getSource().equals(iSalir))
      {
         if(JOptionPane.showConfirmDialog(null,"¿Desea salir?")==JOptionPane.YES_OPTION)
         {
            dispose();
         }
      }
      else if(pE.getSource().equals(iAltaAlum))
      {
         pAAlumno al=new pAAlumno();
         setTitle("Alta alumno");
         pCentro.removeAll();
         pCentro.add(BorderLayout.CENTER,al);
         al.doLayout();
         al.repaint();
      }
      else if(pE.getSource().equals(iAltaProf))
      {
         pAProfesor pr=new pAProfesor();
         setTitle("Alta profesor");
         pCentro.removeAll();
         pCentro.add(BorderLayout.CENTER,pr);
         pr.doLayout();
         pr.repaint();
      }
      else if(pE.getSource().equals(iAltaAul))
      {
         pAAula au=new pAAula();
         setTitle("Alta aula");
         pCentro.removeAll();
         pCentro.add(BorderLayout.CENTER,au);
         au.doLayout();
         au.repaint();
      }
      pCentro.doLayout();
      pCentro.repaint();
   }
}