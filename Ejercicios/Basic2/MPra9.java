package Basic2;
import java.util.Scanner;

/*
 * Programa que calcule el área de un triángulo a partir de la longitud de sus lados.
 * Area= RaizCuadrada(p*(p-a)*(p-b)*(p-c))
 * P=(a+b+c)/2
 */
public class MPra9
{
   @SuppressWarnings("resource")
   public static void main(String[] args)
   {
      double a,b,c,p,area;
      Scanner sc=new Scanner(System.in);
      System.out.println("Introduzca la longitud del primer lado");
      a=sc.nextDouble();
      System.out.println("Introduzca la longitud del segundo lado");
      b=sc.nextDouble();
      System.out.println("Introduzca la longitud del tercer lado");
      c=sc.nextDouble();
      p=(a+b+c)/2;
      area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
      System.out.println("El �rea del tri�ngulo es "+area);
   }
}
