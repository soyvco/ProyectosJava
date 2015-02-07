package Basic3;
import java.util.Scanner;

/*
 * Programa que lea un numero entero y calcule si es par o impar.
 */
public class MPra1
{
   @SuppressWarnings("resource")
   public static void main(String[] args)
   {
      int num;
      Scanner sc=new Scanner(System.in);
      System.out.println("Ingrese una cantidad");
      num=sc.nextInt();
      if(num%2==0)
      {
         System.out.println("Es par");
      }
      else
      {
         System.out.println("Es impar");
      }
   }
}
