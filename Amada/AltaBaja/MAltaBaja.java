package AltaBaja;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class MAltaBaja
{
   public static void main(String[] args)
   {
      try
      {
         UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
      }
      catch(ClassNotFoundException|InstantiationException
            |IllegalAccessException|UnsupportedLookAndFeelException e)
      {
         e.printStackTrace();
      }
      new GUIAltaBaja().setVisible(true);
   }
}