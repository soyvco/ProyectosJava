package Loggin;
import javax.swing.UIManager;

public class MLogin
{
   public static void main(String[] args)
   {
      try
      {
         UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
      }
      catch(Exception e)
      {
         e.getMessage();
      }
      new CLoginGUI();
   }
}