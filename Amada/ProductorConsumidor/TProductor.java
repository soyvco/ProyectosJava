package ProductorConsumidor;
public class TProductor extends Thread
{
   private CBuffer  buffer;
   private String[] mensajes =new String[10];
   
   public TProductor(CBuffer b)
   {
      buffer=b;
   }
   
   public void run()
   {
      for(int i=0; i<mensajes.length; i++)
      {
         mensajes[i]="Mensaje "+i;
         buffer.lanzar(mensajes[i]);
         System.out.println(mensajes[i]+" enviado al buffer.");
         try
         {
            sleep((int)(Math.random()*100));
         }
         catch(InterruptedException e)
         {
         }
      }
   }
}
