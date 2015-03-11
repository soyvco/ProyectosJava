package AltaBaja;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import componentes.CompBoton;
import componentes.CompComboBox;
import componentes.CompLabel;
import componentes.CompRadioButton;
import componentes.CompTextField;

public class pAAula extends JPanel
{
   private CompLabel       lblProfesor;
   private CompLabel       lblAlumno;
   private CompLabel       lblAula;
   private CompTextField   tProfesor;
   private CompTextField   tAlumno;
   private CompRadioButton rbM;
   private CompRadioButton rbN;
   private CompRadioButton rbCCS;
   private ButtonGroup     bgAula;
   private CompComboBox    cbProfesor;
   private CompComboBox    cbAlumno;
   private CompBoton       bGuardar;
   private CompBoton       bLimpiar;
   private JPanel          pAbajo;
   private JPanel          pCentro;
   public CRegistro        registro =new CRegistro();
   
   public pAAula()
   {
      setLayout(new BorderLayout());
      setSize(500,500);
      pCentro=new JPanel(new MigLayout("","[][][grow][grow][grow][grow][grow][grow][grow][][grow]","[][][grow][][grow][][][grow][][grow][][]"));
      add(BorderLayout.CENTER,pCentro);
      pAbajo=new JPanel(new MigLayout("","[grow][grow][grow][grow][grow][grow][grow]","[grow][][grow]"));
      add(BorderLayout.SOUTH,pAbajo);
      /* Labels */
      lblProfesor=new CompLabel(pCentro,"cell 1 1","Profesor:");
      lblProfesor.setIcon(new ImageIcon(pAAula.class.getResource("/PNG/Get Info Blue Button.png")));
      lblAlumno=new CompLabel(pCentro,"cell 1 3","Alumno:");
      lblAlumno.setIcon(new ImageIcon(pAAula.class.getResource("/PNG/Get Info Blue Button.png")));
      lblAula=new CompLabel(pCentro,"cell 1 5","Aula:");
      lblAula.setIcon(new ImageIcon(pAAula.class.getResource("/PNG/Write Document.png")));
      /* Comboboxs */
      cbProfesor=new CompComboBox(pCentro,"cell 3 1 2 1, grow");
      cbAlumno=new CompComboBox(pCentro,"cell 3 3 2 1, grow", registro.listaAlumnos);
      /* Textfields */
      tProfesor=new CompTextField(pCentro,"cell 6 1 4 1,grow");
      tProfesor.setEditable(false);
      tAlumno=new CompTextField(pCentro,"cell 6 3 4 1, grow");
      tAlumno.setEditable(false);
      /* RadioButtons */
      rbM=new CompRadioButton(pCentro,"cell 3 6","M");
      rbN=new CompRadioButton(pCentro,"cell 3 8","N");
      rbCCS=new CompRadioButton(pCentro,"cell 3 10","CCS");
      /* Grupos de botones */
      bgAula=new ButtonGroup();
      bgAula.add(rbM);
      bgAula.add(rbN);
      bgAula.add(rbCCS);
      /* Botones */
      bGuardar=new CompBoton(pAbajo,"cell 2 1, growx","Guardar",new ActionListener()
      {
         public void actionPerformed(ActionEvent pE)
         {
            JOptionPane.showMessageDialog(null,"Se guardará la información en la base de datos");
         }
      });
      bGuardar.setIcon(new ImageIcon(pAAula.class.getResource("/PNG/New Document.png")));
      bLimpiar=new CompBoton(pAbajo,"cell 4 1, growx","Limpiar",new ActionListener()
      {
         public void actionPerformed(ActionEvent pE)
         {
            bgAula.clearSelection();
         }
      });
      bLimpiar.setIcon(new ImageIcon(pAAula.class.getResource("/PNG/Remove Document.png")));
      doLayout();
      repaint();
      pCentro.doLayout();
      pCentro.repaint();
      pAbajo.doLayout();
      pAbajo.repaint();
   }
}