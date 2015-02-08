package ejemploHilos;
/*
 * Probando el uso de los hilos
 * 
 * Creado el 7 de Enero del 2015
 * 
 * Autor: soyvco
 */
public class CTestHilos extends Thread
{
   public CTestHilos(String pNombre)
   {
      super(pNombre);
   }
   
   public void run()
   {
      for(int i=0; i<10; i++)
      {
         System.out.println(i+" "+getName());
      }
      try
      {
         sleep((long)Math.random()*1000);
      }
      catch(InterruptedException e)
      {
         // TODO: handle exception
      }
      System.out.println("¡Fin! "+getName());
   }
}
