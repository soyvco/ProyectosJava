package Terminal;
import javax.swing.UIManager;

public class Main
{
   public static void main(String args[])
   {
      try
      {
         UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
         java.awt.EventQueue.invokeLater(new Runnable()
         {
            public void run()
            {
               new GUITerminal().setVisible(true);
            }
         });
      }
      catch(Exception e)
      {
      }
   }
}