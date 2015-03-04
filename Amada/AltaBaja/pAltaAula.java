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

public class pAltaAula extends JPanel implements ActionListener
{
   private JRadioButton rdbM,rdbN,rdbCCS;
   private JButton      btnGuardar,btnCancelar;
   private JTextField   txtProfesor;
   private JLabel       lblProfesor,lblAlumno,lblAula;
   private ButtonGroup  gAula;
   private JTextField   txtAlumno;
   
   public pAltaAula()
   {
      setBackground(new Color(2,73,89));
      setLayout(new MigLayout("", "[][][][][][][][]", "[][][][][][][][][]"));
      /* Campo del nombre */
      txtProfesor=new JTextField();
      add(txtProfesor,"cell 2 1 5 1,growx");
      /* Labels */
      lblProfesor=new JLabel("Profesor:");
      lblProfesor.setForeground(new Color(242,76,39));
      add(lblProfesor,"cell 1 1,alignx trailing");
      lblAlumno=new JLabel("Alumno:");
      lblAlumno.setForeground(new Color(242,76,39));
      add(lblAlumno,"cell 1 3,alignx trailing");
      txtAlumno=new JTextField();
      add(txtAlumno,"cell 2 3 5 1,growx");
      lblAula=new JLabel("Aula:");
      lblAula.setForeground(new Color(242,76,39));
      add(lblAula,"cell 1 5,alignx center");
      /* Radiobutton */
      rdbM=new JRadioButton("M");
      rdbM.setForeground(new Color(242,76,39));
      rdbM.setBackground(new Color(2,73,89));
      rdbM.addActionListener(this);
      add(rdbM,"cell 2 6");
      rdbN=new JRadioButton("N");
      rdbN.setForeground(new Color(242,76,39));
      rdbN.setBackground(new Color(2,73,89));
      rdbN.addActionListener(this);
      add(rdbN,"cell 4 6");
      rdbCCS=new JRadioButton("CSS");
      rdbCCS.setForeground(new Color(242,76,39));
      rdbCCS.setBackground(new Color(2,73,89));
      rdbCCS.addActionListener(this);
      add(rdbCCS,"cell 6 6");
      /* Grupo de botones */
      gAula=new ButtonGroup();
      gAula.add(rdbM);
      gAula.add(rdbN);
      gAula.add(rdbCCS);
      /* Botones */
      btnGuardar=new JButton("Guardar");
      btnGuardar.addActionListener(this);
      add(btnGuardar,"cell 3 8");
      btnCancelar=new JButton("Cancelar");
      btnCancelar.addActionListener(this);
      add(btnCancelar,"cell 5 8");
   }
   
   public void actionPerformed(ActionEvent pE)
   {
      if(pE.getSource().equals(btnGuardar))
      {
         JOptionPane.showMessageDialog(null,"Se guardo correctamente la información");
      }
      else if(pE.getSource().equals(btnCancelar))
      {
         txtProfesor.setText("");
         gAula.clearSelection();
      }
   }
}