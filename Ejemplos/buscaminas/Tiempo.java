package buscaminas;
import javax.swing.JFrame;

class Tiempo extends Thread
{
   private Buscaminas bms;
   private boolean    salir = false;
   private int        seg   = 0;
   
   Tiempo(JFrame j)
   {
      bms = (Buscaminas)j;
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
         salir = true;
      seg = 0;
   }
}
