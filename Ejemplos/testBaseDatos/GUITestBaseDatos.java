package testBaseDatos;
/*
 * Prueba del componente de base de datos
 * 
 * Autor: soyvco
 */
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import componentes.CompBaseDatos;
import componentes.CompVentana;
import net.miginfocom.swing.MigLayout;
import javax.swing.SwingConstants;

public class GUITestBaseDatos extends CompVentana
{
   /* Panel */
   private JPanel      pCentro;
   /* Panel */
   private JLabel      lblPresentación;
   private JLabel      lblMatricula;
   private JLabel      lblNombre;
   private JLabel      lblaPaterno;
   private JLabel      lblaMaterno;
   /* Textfields */
   private JTextField  tMatricula;
   private JTextField  tNombre;
   private JTextField  taPaterno;
   private JTextField  taMaterno;
   /* Botones */
   private JButton     bAgregar;
   private JButton     bBorrar;
   private JButton     bModificar;
   private JButton     bRellenar;
   /* Panel y textArea para mostrar los cambios */
   private JScrollPane sCampo;
   private JTextArea   aCampo;
   
   /* Constructor de la ventana */
   public GUITestBaseDatos()
   {
      super("Conexión Database",true,320,120,800,400);
      /* Instanciando el componente */
      CompBaseDatos bd=new CompBaseDatos("root","","prueba");
      bd.run();
   }
   
   protected void crearContenido()
   {
      /* Panel central donde irá el scrollpane y textfields */
      pCentro=new JPanel(new MigLayout("", "[][grow][grow][grow][grow][grow][grow][grow][][grow][grow][grow][grow][grow][]", "[][grow][][grow][][grow][][grow][][grow][][grow][][grow]"));
      getContentPane().add(pCentro,BorderLayout.CENTER);
      /* Creando scrollpane y textarea */
      aCampo=new JTextArea();
      aCampo.setEditable(false);
      sCampo=new JScrollPane(aCampo);
      sCampo.setViewportView(aCampo);
      pCentro.add(sCampo,"cell 6 3 6 7,grow");
      /* Creando los textfields y labels */
      lblPresentación=new JLabel("Gestiona la información de una base de datos");
      lblPresentación.setHorizontalAlignment(SwingConstants.CENTER);
      pCentro.add(lblPresentación,"cell 2 1 10 1,growx");
      /* Matricula */
      lblMatricula=new JLabel("Matricula:");
      pCentro.add(lblMatricula,"cell 2 3,growx");
      tMatricula=new JTextField();
      tMatricula.setColumns(10);
      pCentro.add(tMatricula,"cell 4 3,growx");
      /* Nombre */
      lblNombre=new JLabel("Nombre:");
      pCentro.add(lblNombre,"cell 2 5,growx");
      /* Apellido paterno */
      tNombre=new JTextField();
      tNombre.setColumns(10);
      pCentro.add(tNombre,"cell 4 5,growx");
      lblaPaterno=new JLabel("Apellido Paterno:");
      pCentro.add(lblaPaterno,"cell 2 7,growx");
      taPaterno=new JTextField();
      taPaterno.setColumns(10);
      pCentro.add(taPaterno,"cell 4 7,growx");
      /* Apellido materno */
      lblaMaterno=new JLabel("Apellido Materno:");
      pCentro.add(lblaMaterno,"cell 2 9,growx");
      taMaterno=new JTextField();
      taMaterno.setColumns(10);
      pCentro.add(taMaterno,"cell 4 9,growx");
      /* Botones */
      /* Agregar */
      bAgregar=new JButton("Agregar");
      bAgregar.addActionListener(this);
      pCentro.add(bAgregar,"cell 2 12,growx");
      /* Borrar */
      bBorrar=new JButton("Borrar");
      bBorrar.addActionListener(this);
      pCentro.add(bBorrar,"cell 4 12,growx");
      /* Modificar */
      bModificar=new JButton("Modificar");
      bModificar.addActionListener(this);
      pCentro.add(bModificar,"cell 6 12 2 1,growx");
      /* Rellenar */
      bRellenar=new JButton("Rellenar");
      bRellenar.addActionListener(this);
      pCentro.add(bRellenar,"cell 10 12 2 1,growx");
   }
   
   public void actionPerformed(ActionEvent pE)
   {
   }
}
