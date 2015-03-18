package AltaBaja;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import componentes.CompBaseDatos;
import componentes.CompBoton;
import componentes.CompLabel;
import componentes.CompRadioButton;
import componentes.CompTextField;

public class pAProfesor extends JPanel
{
   private CompLabel       lblEtiquetas;
   private CompTextField   tClave;
   private CompTextField   tNombre;
   private CompTextField   tApellidoP;
   private CompTextField   tApellidoM;
   private CompRadioButton rbSistemasC;
   private CompRadioButton rbIndustrial;
   private CompRadioButton rbTics;
   private ButtonGroup     bgDepartamento;
   private CompBoton       Botones;
   private JPanel          pAbajo;
   private JPanel          pCentro;
   CompBaseDatos           bd;
   private String          departamento;
   
   public pAProfesor()
   {
      setLayout(new BorderLayout());
      setSize(500,620);
      pCentro=new JPanel(new MigLayout("","[][grow][][grow][][grow][]","[][][grow][][grow][][grow][][grow][][grow][][grow][][]"));
      add(BorderLayout.CENTER,pCentro);
      pAbajo=new JPanel(new MigLayout("","[grow][grow][grow][grow][grow][grow][grow]","[grow][][grow]"));
      add(BorderLayout.SOUTH,pAbajo);
      bd=new CompBaseDatos("root","","RegistroITVH");
      bd.conectarBD();
      /* Labels */
      lblEtiquetas=new CompLabel(pCentro,"cell 1 1","Clave:");
      lblEtiquetas.setIcon(new ImageIcon(pAProfesor.class.getResource("/PNG/Get Info Blue Button.png")));
      lblEtiquetas=new CompLabel(pCentro,"cell 1 3","Nombre:");
      lblEtiquetas.setIcon(new ImageIcon(pAProfesor.class.getResource("/PNG/Get Info Blue Button.png")));
      lblEtiquetas=new CompLabel(pCentro,"cell 1 5","Apellido Paterno:");
      lblEtiquetas.setIcon(new ImageIcon(pAAlumno.class.getResource("/PNG/Get Info Blue Button.png")));
      lblEtiquetas=new CompLabel(pCentro,"cell 1 7","Apellido Materno:");
      lblEtiquetas.setIcon(new ImageIcon(pAAlumno.class.getResource("/PNG/Get Info Blue Button.png")));
      lblEtiquetas=new CompLabel(pCentro,"cell 1 9","Departamento:");
      lblEtiquetas.setIcon(new ImageIcon(pAProfesor.class.getResource("/PNG/Write Document.png")));
      lblEtiquetas=new CompLabel(pCentro,"cell 1 11 1 5","");
      /* Textfields */
      tClave=new CompTextField(pCentro,"cell 3 1 3 1,growx");
      tClave.addKeyListener(new KeyListener()
      {
         public void keyTyped(KeyEvent pE)
         {
            char c=pE.getKeyChar();
            if(c<'0'||c>'9')
            {
               pE.consume();
            }
            int limite=8;
            if(tClave.getText().length()==limite)
            {
               pE.consume();
            }
         }
         
         public void keyReleased(KeyEvent pE)
         {
         }
         
         public void keyPressed(KeyEvent pE)
         {
         }
      });
      tNombre=new CompTextField(pCentro,"cell 3 3 3 1,growx");
      tNombre.addKeyListener(new KeyListener()
      {
         public void keyTyped(KeyEvent pE)
         {
            char c=pE.getKeyChar();
            if((c<65||c>250)&&c>33)
            {
               pE.consume();
            }
            int limite=15;
            if(tNombre.getText().length()==limite)
            {
               pE.consume();
            }
         }
         
         public void keyReleased(KeyEvent pE)
         {
         }
         
         public void keyPressed(KeyEvent pE)
         {
         }
      });
      tApellidoP=new CompTextField(pCentro,"cell 3 5 3 1,growx");
      tApellidoP.addKeyListener(new KeyListener()
      {
         public void keyTyped(KeyEvent pE)
         {
            char c=pE.getKeyChar();
            if((c<65||c>250)&&c>33)
            {
               pE.consume();
            }
            int limite=10;
            if(tApellidoP.getText().length()==limite)
            {
               pE.consume();
            }
         }
         
         public void keyPressed(KeyEvent pE)
         {
         }
         
         public void keyReleased(KeyEvent pE)
         {
         }
      });
      tApellidoM=new CompTextField(pCentro,"cell 3 7 3 1,growx");
      tApellidoM.addKeyListener(new KeyListener()
      {
         public void keyTyped(KeyEvent pE)
         {
            char c=pE.getKeyChar();
            if((c<65||c>250)&&c>33)
            {
               pE.consume();
            }
            int limite=10;
            if(tApellidoM.getText().length()==limite)
            {
               pE.consume();
            }
         }
         
         public void keyPressed(KeyEvent pE)
         {
         }
         
         public void keyReleased(KeyEvent pE)
         {
         }
      });
      /* RadioButtons */
      rbSistemasC=new CompRadioButton(pCentro,"cell 3 11 4 1, grow","Sistemas Computacionales",new ItemListener()
      {
         public void itemStateChanged(ItemEvent pE)
         {
            if(pE.getStateChange()==ItemEvent.SELECTED)
            {
               departamento=rbSistemasC.getText();
               lblEtiquetas.setIcon(new ImageIcon(pAAlumno.class.getResource("/PNG/my_computer.png")));
            }
         }
      });
      rbIndustrial=new CompRadioButton(pCentro,"cell 3 12 4 1, grow","Industrial",new ItemListener()
      {
         public void itemStateChanged(ItemEvent pE)
         {
            if(pE.getStateChange()==ItemEvent.SELECTED)
            {
               departamento=rbIndustrial.getText();
               lblEtiquetas.setIcon(new ImageIcon(pAAlumno.class.getResource("/PNG/basin_icon.png")));
            }
         }
      });
      rbTics=new CompRadioButton(pCentro,"cell 3 13 4 1, grow","Tecnologias de la inf. y com.",new ItemListener()
      {
         public void itemStateChanged(ItemEvent pE)
         {
            if(pE.getStateChange()==ItemEvent.SELECTED)
            {
               departamento=rbTics.getText();
               lblEtiquetas.setIcon(new ImageIcon(pAAlumno.class.getResource("/PNG/network_server.png")));
            }
         }
      });
      /* Grupos de botones */
      bgDepartamento=new ButtonGroup();
      bgDepartamento.add(rbSistemasC);
      bgDepartamento.add(rbIndustrial);
      bgDepartamento.add(rbTics);
      /* Botones */
      Botones=new CompBoton(pAbajo,"cell 2 1, growx","Guardar",new ActionListener()
      {
         public void actionPerformed(ActionEvent pE)
         {
            bd.setQuery("insert into AltaProfesores(clave,nombre,apaterno,amaterno,departamento) value('"+tClave.getText()+"','"
                  +tNombre.getText()+"','"+tApellidoP.getText()+"','"+tApellidoM.getText()+"','"+departamento+"');");
         }
      });
      Botones.setIcon(new ImageIcon(pAProfesor.class.getResource("/PNG/New Document.png")));
      Botones=new CompBoton(pAbajo,"cell 4 1, growx","Limpiar",new ActionListener()
      {
         public void actionPerformed(ActionEvent pE)
         {
            tClave.setText("");
            tNombre.setText("");
            tApellidoP.setText("");
            tApellidoM.setText("");
            bgDepartamento.clearSelection();
         }
      });
      Botones.setIcon(new ImageIcon(pAProfesor.class.getResource("/PNG/Remove Document.png")));
      doLayout();
      repaint();
      pCentro.doLayout();
      pCentro.repaint();
      pAbajo.doLayout();
      pAbajo.repaint();
   }
}