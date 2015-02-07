package Final;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class MMenú
{
   public static void main(String[] args)
   {
      String texto=String.format("==========================================\n"+
                                 "¡Hola! éste es el proyecto final en el cual podrás\n"+
                                 "ver los códigos o tareas que se realizaron en las\n"+
                                 "diferentes unidades.\n"+
                                 "==========================================");
      
      JTextArea tArea=new JTextArea(texto);
                tArea.setFont(new Font("Century Gothic",Font.PLAIN,14));
                tArea.setEditable(false);
                tArea.setBackground(null);
      JOptionPane.showMessageDialog(null,tArea);
      CMenuGUI a=new CMenuGUI();
      a.setVisible(true);
   }
}