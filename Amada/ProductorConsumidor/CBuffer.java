package ProductorConsumidor;
public class CBuffer
{
   private String  buffer[]  =new String[10];
   private int     siguiente =0;
   private boolean lleno     =false;
   private boolean vacio     =true;
   
   public synchronized String recoger()
   {
      while(vacio==true)
      {
         try
         {
            wait();
         }
         catch(InterruptedException e)
         {
            ;
         }
      }
      siguiente--;
      if(siguiente==0)
      {
         vacio=true;
      }
      lleno=false;
      notify();
      return buffer[siguiente];
   }
   
   public synchronized void lanzar(String mensajes)
   {
      while(lleno==true)
      {
         try
         {
            wait();
         }
         catch(InterruptedException e)
         {
            ;
         }
      }
      buffer[siguiente]=mensajes;
      siguiente++;
      if(siguiente==10)
      {
         lleno=true;
      }
      vacio=false;
      notify();
   }
}
