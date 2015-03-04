package AltaBaja;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;

public class pAltaProfesor extends JPanel implements ActionListener
{
   private JRadioButton rdbSC,rdbIndustrial,rdbTICs;
   private JButton      btnGuardar,btnCancelar;
   private JTextField   txtNombre;
   private JLabel       lblNombre,lblSemestre;
   private ButtonGroup  gSemestre,gCarrera;
   
   public pAltaProfesor()
   {
      setBackground(new Color(2,73,89));
      setLayout(new MigLayout("","[][][][][][][][]","[][][][][][][][][]"));
      /* Campo del nombre */
      txtNombre=new JTextField();
      add(txtNombre,"cell 2 1 3 1,growx");
      txtNombre.setColumns(10);
      /* Labels */
      lblNombre=new JLabel("Nombre:");
      lblNombre.setForeground(new Color(242,76,39));
      add(lblNombre,"cell 1 1,alignx trailing");
      lblSemestre=new JLabel("Departamento:");
      lblSemestre.setForeground(new Color(242,76,39));
      add(lblSemestre,"cell 1 3");
      /* Radiobutton */
      rdbIndustrial=new JRadioButton("Industrial");
      rdbIndustrial.setForeground(new Color(242,76,39));
      rdbIndustrial.setBackground(new Color(2,73,89));
      rdbIndustrial.addActionListener(this);
      add(rdbIndustrial,"cell 2 5 5 1");
      rdbSC=new JRadioButton("Sistemas computacionales");
      rdbSC.setForeground(new Color(242,76,39));
      rdbSC.setBackground(new Color(2,73,89));
      rdbSC.addActionListener(this);
      add(rdbSC,"cell 2 4 5 1");
      rdbTICs=new JRadioButton("Tecnologías de la informacion y comunicación");
      rdbTICs.setForeground(new Color(242,76,39));
      rdbTICs.setBackground(new Color(2,73,89));
      rdbTICs.addActionListener(this);
      add(rdbTICs,"cell 2 6 5 1");
      /* Grupo de botones */
      gCarrera=new ButtonGroup();
      gCarrera.add(rdbSC);
      gCarrera.add(rdbTICs);
      gCarrera.add(rdbIndustrial);
      /* Botones */
      btnGuardar=new JButton("Guardar");
      btnGuardar.addActionListener(this);
      add(btnGuardar,"cell 2 8");
      btnCancelar=new JButton("Cancelar");
      btnCancelar.addActionListener(this);
      add(btnCancelar,"cell 4 8");
   }
   
   public void actionPerformed(ActionEvent pE)
   {
      if(pE.getSource().equals(btnGuardar))
      {
         JOptionPane.showMessageDialog(null,"Se guardo correctamente la información");
      }
      else if(pE.getSource().equals(btnCancelar))
      {
         txtNombre.setText("");
         gSemestre.clearSelection();
         gCarrera.clearSelection();
      }
   }
}