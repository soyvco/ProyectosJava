package ejemploHilos;
import componentes.CompCronometro;

public class MTestHilos2
{
   public static void main(String[] args)
   {
      CompCronometro cronometro=new CompCronometro();
      cronometro.activarCronometro();
      cronometro.start();
      System.out.println(cronometro.getMin()+":"+cronometro.getSeg()+":"+cronometro.getMil());
   }
}