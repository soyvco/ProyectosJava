package Basic2;
import java.util.Scanner;

/*
 * Programa que pase una velocidad en Km/h a m/s.
 * La velodicad se lee por teclado.
 */
class MPra6
{
   @SuppressWarnings("resource")
   public static void main(String[] args)
   {
      double vel1,vel2;
      Scanner sc=new Scanner(System.in);
      System.out.println("Ingrese la velocidad que desea convertir de Km/h a m/s");
      vel1=sc.nextDouble();
      vel2=(vel1*1000)/3600;
      System.out.println("La velocidad "+vel1+"Km/s es igual a "+vel2+"m/s");
   }
}
