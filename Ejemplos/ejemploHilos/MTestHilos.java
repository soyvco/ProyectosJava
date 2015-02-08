package ejemploHilos;

public class MTestHilos
{
   public static void main(String[] args)
   {
      CTestHilos hilo1 = new CTestHilos("Víctor");
      CTestHilos hilo2 = new CTestHilos("Caparaconcha");
      hilo1.start();
      hilo2.run();
      System.out.println("Main no hace nada");
   }
}
