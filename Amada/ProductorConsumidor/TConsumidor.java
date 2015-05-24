package ProductorConsumidor;
public class TConsumidor extends Thread
{
   private CBuffer buffer;
   
   public TConsumidor(CBuffer b)
   {
      buffer=b;
   }
   
   public void run()
   {
      String mensaje;
      for(int i=0; i<10; i++)
      {
         mensaje=buffer.recoger();
         System.out.println("Se recogió el mensaje: "+mensaje);
         try
         {
            sleep((int)(Math.random()*100));
         }
         catch(InterruptedException e)
         {
            System.out.println("Ocurrió un error");
         }
      }
   }
}
