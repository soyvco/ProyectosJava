package lectorTeclado;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;
import componentes.CompVentana;

public class GUI extends CompVentana implements KeyListener
{
   private JPanel    pCentro;
   private JTextArea aMensajes;
   
   public GUI()
   {
      super("Lector de teclas",true,480,160,400,300);
   }
   
   protected void crearContenido()
   {
      // Se agregó un panel
      pCentro=new JPanel();
      pCentro.setBackground(Color.DARK_GRAY);
      getContentPane().add(pCentro,BorderLayout.CENTER);
      pCentro.setLayout(new MigLayout("","[][][grow][][]","[][][grow][][]"));
      aMensajes=new JTextArea();
      aMensajes.setEditable(false);
      JScrollPane scrollPane=new JScrollPane(aMensajes);
      pCentro.add(scrollPane,"cell 2 1 1 2,grow");
      JTextField txt=new JTextField();
      txt.addKeyListener(this);
      pCentro.add(txt,"cell 2 3,grow");
   }
   
   public void actionPerformed(ActionEvent pE)
   {
   }
   
   // Acción del botón enter
   public void keyTyped(KeyEvent pE)
   {
      aMensajes.append("La tecla pulsada fue: "+pE.getKeyChar()+"\n Código de la tecla: "+pE.getKeyCode()+"\n");
   }
   
   public void keyPressed(KeyEvent pE)
   {
      aMensajes.append("La tecla pulsada fue: "+pE.getKeyChar()+"\n Código de la tecla: "+pE.getKeyCode()+"\n");
   }
   
   public void keyReleased(KeyEvent pE)
   {
      aMensajes.append("La tecla pulsada fue: "+pE.getKeyChar()+"\n Código de la tecla: "+pE.getKeyCode()+"\n");
   }
}
