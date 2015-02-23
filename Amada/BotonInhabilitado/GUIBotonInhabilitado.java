package BotonInhabilitado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GUIBotonInhabilitado extends JFrame implements ActionListener
{
   private JPanel contentPane;
   private JButton bGuardar;
   private JButton bSalir;
   
   public GUIBotonInhabilitado()
   {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setTitle("Boton inhabilitado");
      setBounds(320,200,460,140);
      contentPane=new JPanel(null);
      contentPane.setBorder(new EmptyBorder(5,5,5,5));
      setContentPane(contentPane);
      /*Botones*/
      bGuardar = new JButton("Guardar");
      bGuardar.setBounds(100,40,100,30);
      bGuardar.addActionListener(this);
      contentPane.add(bGuardar);
      /*Botón salir inhabilitado*/
      bSalir = new JButton("Salir");
      bSalir.setBounds(280,40,100,30);
      bSalir.addActionListener(this);
      bSalir.setEnabled(false);
      contentPane.add(bSalir);
   }
   
   public void actionPerformed(ActionEvent pE)
   {
      if(pE.getSource().equals(bGuardar))
      {
         bSalir.setEnabled(true);
      }
      else if(pE.getSource().equals(bSalir))
      {
         int opcion= JOptionPane.showConfirmDialog(null,"¿Desea salir?");
         if(opcion==JOptionPane.YES_OPTION)
         {
            dispose();
         }
         else if(opcion==JOptionPane.NO_OPTION)
         {
            bSalir.setEnabled(false);
         }
      }
   }
   public static void main(String[] args)
   {
      new GUIBotonInhabilitado().setVisible(true);
   }
}
