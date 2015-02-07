package Basic2;
import java.util.Scanner;

/*
 * Programa que calcule el volumen de una esfera.
 * Formula es v= (4/3)*PI*r^3.
 */
public class MPra8
{
   @SuppressWarnings("resource")
   public static void main(String[] args)
   {
      double radio,vol;
      Scanner sc=new Scanner(System.in);
      System.out.println("Ingrese el radio de la esfera");
      radio=sc.nextDouble();
      vol=(4/3)*Math.PI*Math.pow(radio,3);
      System.out.println("El volumen de la esfera es de "+vol);
   }
}
