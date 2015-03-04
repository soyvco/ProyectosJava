package AltaBaja;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

public class GUIAltaBaja extends JFrame implements ActionListener
{
   private JPanel    contentPane;
   private JPanel    pArriba;
   private JPanel    pCentro;
   private JPanel    pAbajo;
   private JMenuBar  mbBarra;
   private JMenu     mAlumno;
   private JMenu     mProfesor;
   private JMenu     mAula;
   private JMenuItem iAltaAlumno;
   private JMenuItem iBajaAlumno;
   private JMenuItem iAltaProfesor;
   private JMenuItem iBajaProfesor;
   private JMenuItem iAltaAula;
   private JMenuItem iBajaAula;
   private JButton   btnCerrar;
   private JButton   btnSalir;
   
   public GUIAltaBaja()
   {
      this.setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      setBounds(530,200,300,300);
      setTitle("Servicio de alta y baja ITVH");
      /* Paneles */
      contentPane=new JPanel(new BorderLayout());
      setContentPane(contentPane);
      pArriba=new JPanel(new BorderLayout());
      pArriba.setBackground(Color.GRAY);
      contentPane.add(BorderLayout.NORTH,pArriba);
      pCentro=new JPanel(new BorderLayout());
      pCentro.setBackground(new Color(2,73,89));
      contentPane.add(BorderLayout.CENTER,pCentro);
      pAbajo=new JPanel(new MigLayout("","[][grow][][][][grow][]","[]"));
      pAbajo.setBackground(new Color(2,73,89));
      contentPane.add(BorderLayout.SOUTH,pAbajo);
      /* Barra de menus */
      mbBarra=new JMenuBar();
      pArriba.add(mbBarra,BorderLayout.NORTH);
      /* Menus */
      mAlumno=new JMenu("Alumno");
      mbBarra.add(mAlumno);
      mProfesor=new JMenu("Profesor");
      mbBarra.add(mProfesor);
      mAula=new JMenu("Aula");
      mbBarra.add(mAula);
      /* Items en los menus */
      iAltaAlumno=new JMenuItem("Alta");
      iAltaAlumno.addActionListener(this);
      mAlumno.add(iAltaAlumno);
      iBajaAlumno=new JMenuItem("Baja");
      iBajaAlumno.addActionListener(this);
      mAlumno.add(iBajaAlumno);
      iAltaProfesor=new JMenuItem("Alta");
      iAltaProfesor.addActionListener(this);
      mProfesor.add(iAltaProfesor);
      iBajaProfesor=new JMenuItem("Baja");
      iBajaProfesor.addActionListener(this);
      mProfesor.add(iBajaProfesor);
      iAltaAula=new JMenuItem("Alta");
      iAltaAula.addActionListener(this);
      mAula.add(iAltaAula);
      iBajaAula=new JMenuItem("Baja");
      iBajaAula.addActionListener(this);
      mAula.add(iBajaAula);
      /* Boton cerrar */
      btnSalir=new JButton("Salir");
      btnSalir.addActionListener(this);
      btnCerrar=new JButton("Cerrar");
      btnCerrar.addActionListener(this);
      pAbajo.add(btnCerrar,"cell 2 0");
      pAbajo.add(btnSalir,"cell 4 0");
   }
   
   public void actionPerformed(ActionEvent pE)
   {
      if(pE.getSource().equals(btnCerrar))
      {
         pCentro.removeAll();
         setTitle("Servicio de alta y baja ITVH");
         setBounds(530,200,300,300);
      }
      else if(pE.getSource().equals(btnSalir))
      {
         int opc=JOptionPane.showConfirmDialog(null,"¿Desea salir?");
         if(opc==JOptionPane.YES_OPTION)
         {
            dispose();
         }
      }
      else if(pE.getSource().equals(iAltaAlumno))
      {
         pCentro.removeAll();
         pCentro.add(BorderLayout.CENTER,new pAltaAlumno());
         setTitle("Alta Alumnos");
         setBounds(300,200,620,300);
      }
      else if(pE.getSource().equals(iAltaProfesor))
      {
         pCentro.removeAll();
         pCentro.add(BorderLayout.CENTER,new pAltaProfesor());
         setTitle("Alta Profesor");
         setBounds(400,200,460,300);
      }
      else if(pE.getSource().equals(iAltaAula))
      {
         pCentro.removeAll();
         pCentro.add(BorderLayout.CENTER,new pAltaAula());
         setTitle("Alta Aula");
         setBounds(500,200,400,300);
      }
   }
}