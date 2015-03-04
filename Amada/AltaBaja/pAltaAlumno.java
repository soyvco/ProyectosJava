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

public class pAltaAlumno extends JPanel implements ActionListener
{
   private JRadioButton rdb1ro,rdb2do,rdb3ro,rdb4to,rdb5to,rdb6to,rdb7mo,
                        rdb8vo,rdb9no,rdbSC,rdbIndustrial,rdbTICs;
   private JButton      btnGuardar,btnCancelar;
   private JTextField   txtNombre;
   private JLabel       lblNombre,lblSemestre,lblCarrera;
   private ButtonGroup  gSemestre,gCarrera;
   
   public pAltaAlumno()
   {
      setBackground(new Color(2,73,89));
      setLayout(new MigLayout("", "[][][][][][][][][][]", "[][][][][][][][][][][]"));
      /* Campo del nombre */
      txtNombre=new JTextField();
      add(txtNombre,"cell 2 1 6 1,growx");
      txtNombre.setColumns(10);
      /* Labels */
      lblNombre=new JLabel("Nombre:");
      lblNombre.setForeground(new Color(242,76,39));
      add(lblNombre,"cell 1 1,alignx center");
      lblSemestre=new JLabel("Semestre:");
      lblSemestre.setForeground(new Color(242,76,39));
      add(lblSemestre,"cell 1 3");
      /* Radiobutton */
      rdb1ro=new JRadioButton("1ro");
      rdb1ro.setForeground(new Color(242,76,39));
      rdb1ro.setBackground(new Color(2,73,89));
      rdb1ro.addActionListener(this);
      lblCarrera=new JLabel("Carrera:");
      lblCarrera.setForeground(new Color(242,76,39));
      add(lblCarrera,"cell 5 3");
      add(rdb1ro,"cell 2 4");
      rdb2do=new JRadioButton("2do");
      rdb2do.setForeground(new Color(242,76,39));
      rdb2do.setBackground(new Color(2,73,89));
      rdb2do.addActionListener(this);
      add(rdb2do,"cell 3 4");
      rdb3ro=new JRadioButton("3ro");
      rdb3ro.setForeground(new Color(242,76,39));
      rdb3ro.setBackground(new Color(2,73,89));
      rdb3ro.addActionListener(this);
      add(rdb3ro,"cell 4 4");
      rdb4to=new JRadioButton("4to");
      rdb4to.setForeground(new Color(242,76,39));
      rdb4to.setBackground(new Color(2,73,89));
      rdb4to.addActionListener(this);
      add(rdb4to,"cell 2 5");
      rdb5to=new JRadioButton("5to");
      rdb5to.setForeground(new Color(242,76,39));
      rdb5to.setBackground(new Color(2,73,89));
      rdb5to.addActionListener(this);
      add(rdb5to,"cell 3 5");
      rdb6to=new JRadioButton("6to");
      rdb6to.setForeground(new Color(242,76,39));
      rdb6to.setBackground(new Color(2,73,89));
      rdb6to.addActionListener(this);
      add(rdb6to,"cell 4 5");
      rdb7mo=new JRadioButton("7mo");
      rdb7mo.setForeground(new Color(242,76,39));
      rdb7mo.setBackground(new Color(2,73,89));
      rdb7mo.addActionListener(this);
      add(rdb7mo,"cell 2 6");
      rdb8vo=new JRadioButton("8vo");
      rdb8vo.setForeground(new Color(242,76,39));
      rdb8vo.setBackground(new Color(2,73,89));
      rdb8vo.addActionListener(this);
      add(rdb8vo,"cell 3 6");
      rdb9no=new JRadioButton("9no.");
      rdb9no.setForeground(new Color(242,76,39));
      rdb9no.setBackground(new Color(2,73,89));
      rdb9no.addActionListener(this);
      add(rdb9no,"cell 4 6");
      rdbSC=new JRadioButton("Sistemas computacionales");
      rdbSC.setForeground(new Color(242,76,39));
      rdbSC.setBackground(new Color(2,73,89));
      rdbSC.addActionListener(this);
      add(rdbSC,"cell 5 4 3 1");
      rdbIndustrial=new JRadioButton("Industrial");
      rdbIndustrial.setForeground(new Color(242,76,39));
      rdbIndustrial.setBackground(new Color(2,73,89));
      rdbIndustrial.addActionListener(this);
      add(rdbIndustrial,"cell 5 5 3 1");
      rdbTICs=new JRadioButton("Tecnologías de la informacion y comunicación");
      rdbTICs.setForeground(new Color(242,76,39));
      rdbTICs.setBackground(new Color(2,73,89));
      rdbTICs.addActionListener(this);
      add(rdbTICs,"cell 5 6 4 1");
      /* Grupo de botones */
      gSemestre=new ButtonGroup();
      gSemestre.add(rdb1ro);
      gSemestre.add(rdb2do);
      gSemestre.add(rdb3ro);
      gSemestre.add(rdb4to);
      gSemestre.add(rdb5to);
      gSemestre.add(rdb6to);
      gSemestre.add(rdb7mo);
      gSemestre.add(rdb8vo);
      gSemestre.add(rdb9no);
      gCarrera=new ButtonGroup();
      gCarrera.add(rdbSC);
      gCarrera.add(rdbIndustrial);
      gCarrera.add(rdbTICs);
      /* Botones */
      btnGuardar=new JButton("Guardar");
      btnGuardar.addActionListener(this);
      add(btnGuardar,"cell 4 10");
      btnCancelar=new JButton("Cancelar");
      btnCancelar.addActionListener(this);
      add(btnCancelar,"cell 6 10");
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