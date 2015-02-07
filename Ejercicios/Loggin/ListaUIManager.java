package Loggin;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class ListaUIManager
{
   public static void main(String[] args)
   {
      LookAndFeelInfo[] lista=UIManager.getInstalledLookAndFeels();
      for(int i=0; i<lista.length; i++)
      {
         System.out.println(lista[i].getClassName());
      }
   }
}
