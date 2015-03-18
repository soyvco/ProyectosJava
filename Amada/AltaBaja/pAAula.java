package AltaBaja;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import componentes.CompBaseDatos;
import componentes.CompBoton;
import componentes.CompComboBox;
import componentes.CompLabel;
import componentes.CompRadioButton;
import componentes.CompTextField;

public class pAAula extends JPanel
{
   private CompLabel       lblEtiquetas;
   private CompTextField   tProfesor;
   private CompTextField   tAlumno;
   private CompTextField   tSalon;
   private CompRadioButton rbM;
   private CompRadioButton rbN;
   private CompRadioButton rbCCS;
   private ButtonGroup     bgAula;
   private CompComboBox    cbProfesor;
   private CompComboBox    cbAlumno;
   private CompBoton       bBotones;
   private JPanel          pAbajo;
   private JPanel          pCentro;
   CompBaseDatos           bd;
   ResultSet               rs;
   private String          edificio;
   private String          clave;
   private String          matricula;
   
   public pAAula()
   {
      setLayout(new BorderLayout());
      setSize(500,620);
      pCentro=new JPanel(new MigLayout("","[][][grow][grow][grow][grow][grow][grow][grow][][grow][][]","[][][grow][][grow][][][grow][][grow][][]"));
      add(BorderLayout.CENTER,pCentro);
      pAbajo=new JPanel(new MigLayout("","[grow][grow][grow][grow][grow][grow][grow]","[grow][][grow]"));
      add(BorderLayout.SOUTH,pAbajo);
      /* Labels */
      lblEtiquetas=new CompLabel(pCentro,"cell 1 1","Profesor:");
      lblEtiquetas.setIcon(new ImageIcon(pAAula.class.getResource("/PNG/Get Info Blue Button.png")));
      lblEtiquetas=new CompLabel(pCentro,"cell 1 3","Alumno:");
      lblEtiquetas.setIcon(new ImageIcon(pAAula.class.getResource("/PNG/Get Info Blue Button.png")));
      lblEtiquetas=new CompLabel(pCentro,"cell 1 5","Aula:");
      lblEtiquetas.setIcon(new ImageIcon(pAAula.class.getResource("/PNG/Write Document.png")));
      /* Comboboxs */
      Vector<String> alumnos=new Vector<String>(1,1);
      Vector<String> profesores=new Vector<String>(1,1);
      bd=new CompBaseDatos("root","","RegistroITVH");
      bd.conectarBD();
      rs=bd.getQuery("select * from AltaAlumnos");
      try
      {
         while(rs.next())
         {
            alumnos.addElement(rs.getString("matricula"));
         }
      }
      catch(SQLException e)
      {
         e.printStackTrace();
      }
      rs=bd.getQuery("select * from AltaProfesores");
      try
      {
         while(rs.next())
         {
            profesores.addElement(rs.getString("clave"));
         }
      }
      catch(SQLException e)
      {
         e.printStackTrace();
      }
      cbProfesor=new CompComboBox(pCentro,"cell 3 1, grow",profesores);
      cbProfesor.addItemListener(new ItemListener()
      {
         public void itemStateChanged(ItemEvent pE)
         {
            if(pE.getStateChange()==ItemEvent.SELECTED)
            {
               rs=bd.getQuery("select * from AltaProfesores where clave='"+pE.getItem().toString()+"'");
               try
               {
                  while(rs.next())
                  {
                     tProfesor.setText(rs.getString("nombre")+" "+rs.getString("apaterno")+" "+rs.getString("amaterno"));
                     clave=pE.getItem().toString();
                  }
               }
               catch(SQLException e)
               {
                  e.printStackTrace();
               }
            }
         }
      });
      cbAlumno=new CompComboBox(pCentro,"cell 3 3, grow",alumnos);
      cbAlumno.addItemListener(new ItemListener()
      {
         public void itemStateChanged(ItemEvent pE)
         {
            if(pE.getStateChange()==ItemEvent.SELECTED)
            {
               rs=bd.getQuery("select * from AltaAlumnos where matricula='"+pE.getItem().toString()+"'");
               try
               {
                  while(rs.next())
                  {
                     tAlumno.setText(rs.getString("nombre")+" "+rs.getString("apaterno")+" "+rs.getString("amaterno"));
                     matricula=pE.getItem().toString();
                  }
               }
               catch(SQLException e)
               {
                  e.printStackTrace();
               }
            }
         }
      });
      /* Textfields */
      tProfesor=new CompTextField(pCentro,"cell 6 1 6 1,grow");
      tProfesor.setText("Nombre del profesor");
      tProfesor.setEditable(false);
      tAlumno=new CompTextField(pCentro,"cell 6 3 6 1, grow");
      tAlumno.setText("Nombre del alumno");
      tAlumno.setEditable(false);
      tSalon=new CompTextField(pCentro,"cell 6 5 6 1, grow");
      tSalon.addKeyListener(new KeyListener()
      {
         public void keyTyped(KeyEvent pE)
         {
            char c=pE.getKeyChar();
            if(c<'0'||c>'9')
            {
               pE.consume();
            }
            int limite=5;
            if(tSalon.getText().length()==limite)
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
      /* RadioButtons */
      rbM=new CompRadioButton(pCentro,"cell 3 6","M",new ItemListener()
      {
         public void itemStateChanged(ItemEvent pE)
         {
            if(pE.getStateChange()==ItemEvent.SELECTED)
            {
               edificio=rbM.getText();
            }
         }
      });
      rbN=new CompRadioButton(pCentro,"cell 3 8","N",new ItemListener()
      {
         public void itemStateChanged(ItemEvent pE)
         {
            if(pE.getStateChange()==ItemEvent.SELECTED)
            {
               edificio=rbN.getText();
            }
         }
      });
      rbCCS=new CompRadioButton(pCentro,"cell 3 10","CCS",new ItemListener()
      {
         public void itemStateChanged(ItemEvent pE)
         {
            if(pE.getStateChange()==ItemEvent.SELECTED)
            {
               edificio=rbCCS.getText();
            }
         }
      });
      /* Grupos de botones */
      bgAula=new ButtonGroup();
      bgAula.add(rbM);
      bgAula.add(rbN);
      bgAula.add(rbCCS);
      /* Botones */
      bBotones=new CompBoton(pAbajo,"cell 2 1, growx","Guardar",new ActionListener()
      {
         public void actionPerformed(ActionEvent pE)
         {
            bd.setQuery("insert into AltaAula(edificio,salon,clave,matricula) value('"+edificio+"','"+tSalon.getText()+"','"+clave+"','"+matricula+"');");
         }
      });
      bBotones.setIcon(new ImageIcon(pAAula.class.getResource("/PNG/New Document.png")));
      bBotones=new CompBoton(pAbajo,"cell 4 1, growx","Limpiar",new ActionListener()
      {
         public void actionPerformed(ActionEvent pE)
         {
            tSalon.setText("");
            bgAula.clearSelection();
         }
      });
      bBotones.setIcon(new ImageIcon(pAAula.class.getResource("/PNG/Remove Document.png")));
      doLayout();
      repaint();
      pCentro.doLayout();
      pCentro.repaint();
      pAbajo.doLayout();
      pAbajo.repaint();
   }
}