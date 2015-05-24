package cronometro;
public class MCronometro
{
   public static void main(String[] args)
   {
      GUICronometro c=new GUICronometro();
      c.setVisible(true);
      c.repaint();
      c.doLayout();
   }
}
