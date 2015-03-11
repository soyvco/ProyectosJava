package AltaBaja;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import componentes.CompBoton;
import componentes.CompLabel;
import componentes.CompRadioButton;
import componentes.CompTextField;

public class pAAlumno extends JPanel
{
   private CompLabel       lblMatricula;
   private CompLabel       lblNombre;
   private CompLabel       lblSemestre;
   private CompLabel       lblCarrera;
   private CompTextField   tMatricula;
   private CompTextField   tNombre;
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
   private CompBoton       bGuardar;
   private CompBoton       bLimpiar;
   private JPanel          pAbajo;
   private JPanel          pCentro;
   public CRegistro        registro= new CRegistro();
   
   public pAAlumno()
   {
      setLayout(new BorderLayout());
      setSize(500,500);
      pCentro=new JPanel(new MigLayout("","[][grow][][grow][grow][grow][grow][grow][]","[][grow][grow][][grow][][grow][][grow][][grow][][grow][][grow][][grow][][grow][grow][]"));
      add(BorderLayout.CENTER,pCentro);
      pAbajo=new JPanel(new MigLayout("","[grow][grow][grow][grow][grow][grow][grow]","[grow][][grow]"));
      add(BorderLayout.SOUTH,pAbajo);
      /* Labels y sus textfields */
      lblMatricula=new CompLabel(pCentro,"cell 1 1","Matricula:");
      lblMatricula.setIcon(new ImageIcon(pAAlumno.class.getResource("/PNG/Get Info Blue Button.png")));
      lblNombre=new CompLabel(pCentro,"cell 1 3","Nombre:");
      lblNombre.setIcon(new ImageIcon(pAAlumno.class.getResource("/PNG/Get Info Blue Button.png")));
      tMatricula=new CompTextField(pCentro,"cell 3 1 5 1,growx");
      tMatricula.addKeyListener(new KeyListener()
      {
         public void keyTyped(KeyEvent pE)
         {
            char c=pE.getKeyChar();
            if((c<'A'||c>'Z')&&(c<'a'||c>'z')&&(c<'0'||c>'9'))
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
      tNombre=new CompTextField(pCentro,"cell 3 3 5 1,growx");
      tNombre.addKeyListener(new KeyListener()
      {
         public void keyTyped(KeyEvent pE)
         {
            char c=pE.getKeyChar();
            if((c<'A'||c>'Z')&&(c<'a'||c>'z'))
            {
               pE.consume();
            }
            int limite=50;
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
      lblSemestre=new CompLabel(pCentro,"cell 1 5","Semestre:");
      lblSemestre.setIcon(new ImageIcon(pAAlumno.class.getResource("/PNG/Write Document.png")));
      lblCarrera=new CompLabel(pCentro,"cell 1 12","Carrera:");
      lblCarrera.setIcon(new ImageIcon(pAAlumno.class.getResource("/PNG/Write Document.png")));
      /* RadioButtons */
      rbPrimero=new CompRadioButton(pCentro,"cell 3 6","1ro");
      rbSegundo=new CompRadioButton(pCentro,"cell 5 6","2do");
      rbTercero=new CompRadioButton(pCentro,"cell 7 6","3ro");
      rbCuarto=new CompRadioButton(pCentro,"cell 3 8","4to");
      rbQuinto=new CompRadioButton(pCentro,"cell 5 8","5to");
      rbSexto=new CompRadioButton(pCentro,"cell 7 8","6to");
      rbSeptimo=new CompRadioButton(pCentro,"cell 3 10","7mo");
      rbOctavo=new CompRadioButton(pCentro,"cell 5 10","8vo");
      rbNoveno=new CompRadioButton(pCentro,"cell 7 10","9no");
      rbSistemasC=new CompRadioButton(pCentro,"cell 3 13 5 1, grow","Sistemas Computacionales");
      rbIndustrial=new CompRadioButton(pCentro,"cell 3 15 5 1, grow","Industrial");
      rbTics=new CompRadioButton(pCentro,"cell 3 17 5 1, grow","Tecnologias de la inf. y com.");
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
      bGuardar=new CompBoton(pAbajo,"cell 2 1, growx","Guardar",new ActionListener()
      {
         public void actionPerformed(ActionEvent pE)
         {
            String nom=tNombre.getText();
            registro.addAlum(nom);
            System.out.println(registro.listaAlumnos.size());
         }
      });
      bGuardar.setIcon(new ImageIcon(pAAlumno.class.getResource("/PNG/New Document.png")));
      bLimpiar=new CompBoton(pAbajo,"cell 4 1, growx","Limpiar",new ActionListener()
      {
         public void actionPerformed(ActionEvent pE)
         {
            tMatricula.setText("");
            tNombre.setText("");
            bgCarreras.clearSelection();
            bgSemestres.clearSelection();
         }
      });
      bLimpiar.setIcon(new ImageIcon(pAAlumno.class.getResource("/PNG/Remove Document.png")));
      this.doLayout();
      this.repaint();
      pCentro.doLayout();
      pCentro.repaint();
      pAbajo.doLayout();
      pAbajo.repaint();
   }
}