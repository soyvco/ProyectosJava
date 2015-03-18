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

public class pAAlumno extends JPanel
{
   private CompLabel       lblEtiqueta;
   private CompTextField   tMatricula;
   private CompTextField   tNombre;
   private CompTextField   tApellidoP;
   private CompTextField   tApellidoM;
   private CompRadioButton rbPrimero;
   private CompRadioButton rbSegundo;
   private CompRadioButton rbTercero;
   private CompRadioButton rbCuarto;
   private CompRadioButton rbQuinto;
   private CompRadioButton rbSexto;
   private CompRadioButton rbSeptimo;
   private CompRadioButton rbOctavo;
   private CompRadioButton rbNoveno;
   private CompRadioButton rbSistemasC;
   private CompRadioButton rbIndustrial;
   private CompRadioButton rbTics;
   private ButtonGroup     bgSemestres;
   private ButtonGroup     bgCarreras;
   private CompBoton       Botones;
   private JPanel          pAbajo;
   private JPanel          pCentro;
   CompBaseDatos           bd;
   private String          semestre;
   private String          carrera;
   
   public pAAlumno()
   {
      setLayout(new BorderLayout());
      setSize(500,620);
      pCentro=new JPanel(new MigLayout("","[][grow][][grow][grow][grow][]","[][grow][grow][][grow][][grow][][grow][][grow][][grow][][grow][][grow][][grow][grow][]"));
      add(BorderLayout.CENTER,pCentro);
      pAbajo=new JPanel(new MigLayout("","[grow][grow][grow][grow][grow][grow][grow]","[grow][][grow]"));
      add(BorderLayout.SOUTH,pAbajo);
      bd=new CompBaseDatos("root","","RegistroITVH");
      bd.conectarBD();
      /* Labels */
      lblEtiqueta=new CompLabel(pCentro,"cell 1 1","Matricula:");
      lblEtiqueta.setIcon(new ImageIcon(pAAlumno.class.getResource("/PNG/Get Info Blue Button.png")));
      lblEtiqueta=new CompLabel(pCentro,"cell 1 3","Nombre:");
      lblEtiqueta.setIcon(new ImageIcon(pAAlumno.class.getResource("/PNG/Get Info Blue Button.png")));
      lblEtiqueta=new CompLabel(pCentro,"cell 1 5","Apellido Paterno:");
      lblEtiqueta.setIcon(new ImageIcon(pAAlumno.class.getResource("/PNG/Get Info Blue Button.png")));
      lblEtiqueta=new CompLabel(pCentro,"cell 1 7","Apellido Materno:");
      lblEtiqueta.setIcon(new ImageIcon(pAAlumno.class.getResource("/PNG/Get Info Blue Button.png")));
      lblEtiqueta=new CompLabel(pCentro,"cell 1 9","Semestre:");
      lblEtiqueta.setIcon(new ImageIcon(pAAlumno.class.getResource("/PNG/Write Document.png")));
      lblEtiqueta=new CompLabel(pCentro,"cell 1 15","Carrera:");
      lblEtiqueta.setIcon(new ImageIcon(pAAlumno.class.getResource("/PNG/Write Document.png")));
      lblEtiqueta=new CompLabel(pCentro,"cell 1 17 1 3","");
      /* TextFields */
      tMatricula=new CompTextField(pCentro,"cell 3 1 3 1,growx");
      tMatricula.addKeyListener(new KeyListener()
      {
         public void keyTyped(KeyEvent pE)
         {
            char c=pE.getKeyChar();
            if(c<'0'||c>'9')
            {
               pE.consume();
            }
            int limite=8;
            if(tMatricula.getText().length()==limite)
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
         
         public void keyPressed(KeyEvent pE)
         {
         }
         
         public void keyReleased(KeyEvent pE)
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
      rbPrimero=new CompRadioButton(pCentro,"cell 3 11","1ro",new ItemListener()
      {
         public void itemStateChanged(ItemEvent pE)
         {
            if(pE.getStateChange()==ItemEvent.SELECTED)
            {
               semestre=rbPrimero.getText();
            }
         }
      });
      rbSegundo=new CompRadioButton(pCentro,"cell 4 11","2do",new ItemListener()
      {
         public void itemStateChanged(ItemEvent pE)
         {
            if(pE.getStateChange()==ItemEvent.SELECTED)
            {
               semestre=rbSegundo.getText();
            }
         }
      });
      rbTercero=new CompRadioButton(pCentro,"cell 5 11","3ro",new ItemListener()
      {
         public void itemStateChanged(ItemEvent pE)
         {
            if(pE.getStateChange()==ItemEvent.SELECTED)
            {
               semestre=rbTercero.getText();
            }
         }
      });
      rbCuarto=new CompRadioButton(pCentro,"cell 3 12","4to",new ItemListener()
      {
         public void itemStateChanged(ItemEvent pE)
         {
            if(pE.getStateChange()==ItemEvent.SELECTED)
            {
               semestre=rbCuarto.getText();
            }
         }
      });
      rbQuinto=new CompRadioButton(pCentro,"cell 4 12","5to",new ItemListener()
      {
         public void itemStateChanged(ItemEvent pE)
         {
            if(pE.getStateChange()==ItemEvent.SELECTED)
            {
               semestre=rbQuinto.getText();
            }
         }
      });
      rbSexto=new CompRadioButton(pCentro,"cell 5 12","6to",new ItemListener()
      {
         public void itemStateChanged(ItemEvent pE)
         {
            if(pE.getStateChange()==ItemEvent.SELECTED)
            {
               semestre=rbSexto.getText();
            }
         }
      });
      rbSeptimo=new CompRadioButton(pCentro,"cell 3 13","7mo",new ItemListener()
      {
         public void itemStateChanged(ItemEvent pE)
         {
            if(pE.getStateChange()==ItemEvent.SELECTED)
            {
               semestre=rbSeptimo.getText();
            }
         }
      });
      rbOctavo=new CompRadioButton(pCentro,"cell 4 13","8vo",new ItemListener()
      {
         public void itemStateChanged(ItemEvent pE)
         {
            if(pE.getStateChange()==ItemEvent.SELECTED)
            {
               semestre=rbOctavo.getText();
            }
         }
      });
      rbNoveno=new CompRadioButton(pCentro,"cell 5 13","9no",new ItemListener()
      {
         public void itemStateChanged(ItemEvent pE)
         {
            if(pE.getStateChange()==ItemEvent.SELECTED)
            {
               semestre=rbNoveno.getText();
            }
         }
      });
      rbSistemasC=new CompRadioButton(pCentro,"cell 3 17 5 1, grow","Sistemas Computacionales",new ItemListener()
      {
         public void itemStateChanged(ItemEvent pE)
         {
            if(pE.getStateChange()==ItemEvent.SELECTED)
            {
               carrera=rbSistemasC.getText();
               lblEtiqueta.setIcon(new ImageIcon(pAAlumno.class.getResource("/PNG/my_computer.png")));
            }
         }
      });
      rbIndustrial=new CompRadioButton(pCentro,"cell 3 18 5 1, grow","Industrial",new ItemListener()
      {
         public void itemStateChanged(ItemEvent pE)
         {
            if(pE.getStateChange()==ItemEvent.SELECTED)
            {
               carrera=rbIndustrial.getText();
               lblEtiqueta.setIcon(new ImageIcon(pAAlumno.class.getResource("/PNG/basin_icon.png")));
            }
         }
      });
      rbTics=new CompRadioButton(pCentro,"cell 3 19 5 1, grow","Tecnologias de la inf. y com.",new ItemListener()
      {
         public void itemStateChanged(ItemEvent pE)
         {
            if(pE.getStateChange()==ItemEvent.SELECTED)
            {
               carrera=rbTics.getText();
               lblEtiqueta.setIcon(new ImageIcon(pAAlumno.class.getResource("/PNG/network_server.png")));
            }
         }
      });
      /* Grupos de botones */
      bgSemestres=new ButtonGroup();
      bgSemestres.add(rbPrimero);
      bgSemestres.add(rbSegundo);
      bgSemestres.add(rbTercero);
      bgSemestres.add(rbCuarto);
      bgSemestres.add(rbQuinto);
      bgSemestres.add(rbSexto);
      bgSemestres.add(rbSeptimo);
      bgSemestres.add(rbOctavo);
      bgSemestres.add(rbNoveno);
      bgCarreras=new ButtonGroup();
      bgCarreras.add(rbSistemasC);
      bgCarreras.add(rbIndustrial);
      bgCarreras.add(rbTics);
      /* Botones */
      Botones=new CompBoton(pAbajo,"cell 2 1, growx","Guardar",new ActionListener()
      {
         public void actionPerformed(ActionEvent pE)
         {
            bd.setQuery("insert into AltaAlumnos(matricula,nombre,apaterno,amaterno,semestre,carrera) value('"+tMatricula.getText()
                  +"','"+tNombre.getText()+"','"+tApellidoP.getText()+"','"+tApellidoM.getText()+"','"+semestre+"','"
                  +carrera+"');");
         }
      });
      Botones.setIcon(new ImageIcon(pAAlumno.class.getResource("/PNG/New Document.png")));
      Botones=new CompBoton(pAbajo,"cell 4 1, growx","Limpiar",new ActionListener()
      {
         public void actionPerformed(ActionEvent pE)
         {
            tMatricula.setText("");
            tNombre.setText("");
            tApellidoP.setText("");
            tApellidoM.setText("");
            bgCarreras.clearSelection();
            bgSemestres.clearSelection();
         }
      });
      Botones.setIcon(new ImageIcon(pAAlumno.class.getResource("/PNG/Remove Document.png")));
      this.doLayout();
      this.repaint();
      pCentro.doLayout();
      pCentro.repaint();
      pAbajo.doLayout();
      pAbajo.repaint();
   }
}