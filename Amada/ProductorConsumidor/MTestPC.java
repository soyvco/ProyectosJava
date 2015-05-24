package ProductorConsumidor;
public class MTestPC
{
   public static void main(String[] args)
   {
      CBuffer b=new CBuffer();
      TProductor p=new TProductor(b);
      TConsumidor c=new TConsumidor(b);
      p.start();
      c.start();
   }
}