import javax.swing.JFrame;

public class Temporizador extends Thread
{
   private GUIPreguntados bms;
   private boolean  salir =false;
   private int      seg   =0;
   
   Temporizador(JFrame j)
   {
      bms=(GUIPreguntados)j;
   }
   
   @Override
   public void run()
   {
      while(!salir)
      {
         try
         {
            sleep(1000);
            seg++;
            bms.setTiempo(Integer.toString(seg));
         }
         catch(InterruptedException e)
         {
            System.out.println(e);
         }
      }
   }
   
   public void parar(boolean b)
   {
      if(b)
         salir=true;
      seg=0;
   }
}
