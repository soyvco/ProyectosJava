package EjemploEvento;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;
import componentes.CompHoraFecha;
import componentes.CompVentana;
import javax.swing.JButton;

public class GUIEvento extends CompVentana implements KeyListener
{
   private JTextArea   aMensajes;
   private JScrollPane spMensajes;
   private JTextField  txtMensaje;
   private JPanel      pCentro;
   private JButton     btnEnviar;
   private JButton     btnVaciar;
   private JButton     btnSalir;
   
   public GUIEvento()
   {
      super("Chat",true,480,180,400,500);
   }
   
   protected void crearContenido()
   {
      // Se agregó un panel
      pCentro=new JPanel(new MigLayout("", "[10,center][center][center][center][][grow][center][center][10,center]", "[10][][grow][][][]"));
      pCentro.setBackground(Color.DARK_GRAY);
      getContentPane().add(pCentro,BorderLayout.CENTER);
      // Area donde aparecerán los mensajes
      aMensajes=new JTextArea();
      aMensajes.setEditable(false);
      aMensajes.setBackground(Color.GRAY);
      // Panel del area de mensajes
      spMensajes=new JScrollPane(aMensajes);
      pCentro.add(spMensajes,"cell 1 1 7 2,grow");
      // textfield para los mensajes
      txtMensaje=new JTextField();
      txtMensaje.addKeyListener(this);
      pCentro.add(txtMensaje,"cell 1 3 7 1,grow");
      txtMensaje.setColumns(10);
      // Botón enviar
      btnEnviar=new JButton("Enviar");
      btnEnviar.addActionListener(this);
      pCentro.add(btnEnviar,"cell 1 4 2 1");
      // Botón salir
      btnSalir=new JButton("Salir");
      btnSalir.addActionListener(this);
      // Botón vaciar
      btnVaciar=new JButton("Vaciar");
      btnVaciar.addActionListener(this);
      pCentro.add(btnVaciar,"cell 4 4");
      pCentro.add(btnSalir,"cell 6 4 2 1");
   }
   
   public void actionPerformed(ActionEvent pE)
   {
      if(pE.getSource().equals(btnEnviar))
      {
         CompHoraFecha horaFecha=new CompHoraFecha();
         aMensajes.append("["+horaFecha.getHora()+"] >> "+txtMensaje.getText()+"\n");
         txtMensaje.setText("");
      }
      else if(pE.getSource().equals(btnVaciar))
      {
         aMensajes.setText("*------------------CHAT LIMPIO-----------------*\n");
         txtMensaje.setText("");
      }
      else if(pE.getSource().equals(btnSalir))
      {
         JOptionPane.showMessageDialog(null,"Usted ha salido");
         dispose();
      }
   }
   
   // Acción del botón enter
   public void keyTyped(KeyEvent pE)
   {
   }
   
   public void keyPressed(KeyEvent pE)
   {
      if(pE.getKeyCode()==KeyEvent.VK_ENTER)
      {
         CompHoraFecha horaFecha=new CompHoraFecha();
         aMensajes.append("["+horaFecha.getHora()+"] >> "+txtMensaje.getText()+"\n");
         aMensajes.append(">> DE SEGURO NO TIENES CON QUIÉN HABLAR ¿CIERTO?\n");
         txtMensaje.setText("");
      }
      else if(pE.getKeyCode()==KeyEvent.VK_CONTROL&&pE.getKeyCode()==KeyEvent.VK_S)
      {
         dispose();
      }
   }
   
   public void keyReleased(KeyEvent pE)
   {
   }
}
