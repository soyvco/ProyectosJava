package AltaBaja;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import componentes.CompBoton;
import componentes.CompLabel;
import componentes.CompRadioButton;
import componentes.CompTextField;

public class pAProfesor extends JPanel
{
   private CompLabel       lblClave;
   private CompLabel       lblNombre;
   private CompLabel       lblDepartamento;
   private CompTextField   tClave;
   private CompTextField   tNombre;
   private CompRadioButton rbSistemasC;
   private CompRadioButton rbIndustrial;
   private CompRadioButton rbTics;
   private ButtonGroup     bgDepartamento;
   private CompBoton       bGuardar;
   private CompBoton       bLimpiar;
   private JPanel          pAbajo;
   private JPanel          pCentro;
   
   public pAProfesor()
   {
      setLayout(new BorderLayout());
      setSize(500,500);
      pCentro=new JPanel(new MigLayout("","[][grow][][grow][][grow][]","[][][grow][][grow][][grow][][grow][][grow][][grow][][]"));
      add(BorderLayout.CENTER,pCentro);
      pAbajo=new JPanel(new MigLayout("","[grow][grow][grow][grow][grow][grow][grow]","[grow][][grow]"));
      add(BorderLayout.SOUTH,pAbajo);
      /* Labels y sus textfields */
      lblClave=new CompLabel(pCentro,"cell 1 1","Clave:");
      lblClave.setIcon(new ImageIcon(pAProfesor.class.getResource("/PNG/Get Info Blue Button.png")));
      lblNombre=new CompLabel(pCentro,"cell 1 3","Nombre:");
      lblNombre.setIcon(new ImageIcon(pAProfesor.class.getResource("/PNG/Get Info Blue Button.png")));
      tClave=new CompTextField(pCentro,"cell 3 1 3 1,growx");
      tClave.addKeyListener(new KeyListener()
      {
         public void keyTyped(KeyEvent pE)
         {
            char c=pE.getKeyChar();
            if((c<'A'||c>'Z')&&(c<'a'||c>'z')&&(c<'0'||c>'9'))
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
         
         public void keyReleased(KeyEvent pE)
         {
         }
         
         public void keyPressed(KeyEvent pE)
         {
         }
      });
      lblDepartamento=new CompLabel(pCentro,"cell 1 5","Departamento:");
      lblDepartamento.setIcon(new ImageIcon(pAProfesor.class.getResource("/PNG/Write Document.png")));
      /* RadioButtons */
      rbSistemasC=new CompRadioButton(pCentro,"cell 3 7 4 1, grow","Sistemas Computacionales");
      rbIndustrial=new CompRadioButton(pCentro,"cell 3 9 4 1, grow","Industrial");
      rbTics=new CompRadioButton(pCentro,"cell 3 11 4 1, grow","Tecnologias de la inf. y com.");
      /* Grupos de botones */
      bgDepartamento=new ButtonGroup();
      bgDepartamento.add(rbSistemasC);
      bgDepartamento.add(rbIndustrial);
      bgDepartamento.add(rbTics);
      /* Botones */
      bGuardar=new CompBoton(pAbajo,"cell 2 1, growx","Guardar",new ActionListener()
      {
         public void actionPerformed(ActionEvent pE)
         {
            JOptionPane.showMessageDialog(null,"Se guardará la información en la base de datos");
         }
      });
      bGuardar.setIcon(new ImageIcon(pAProfesor.class.getResource("/PNG/New Document.png")));
      bLimpiar=new CompBoton(pAbajo,"cell 4 1, growx","Limpiar",new ActionListener()
      {
         public void actionPerformed(ActionEvent pE)
         {
            tClave.setText("");
            tNombre.setText("");
            bgDepartamento.clearSelection();
         }
      });
      bLimpiar.setIcon(new ImageIcon(pAProfesor.class.getResource("/PNG/Remove Document.png")));
      doLayout();
      repaint();
      pCentro.doLayout();
      pCentro.repaint();
      pAbajo.doLayout();
      pAbajo.repaint();
   }
}