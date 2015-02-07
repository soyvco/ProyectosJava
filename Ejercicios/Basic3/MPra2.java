package Basic3;
import java.util.Scanner;

/*
 * Programa que lea una cantidad y muestre si es multiplo de 10.
 */
public class MPra2
{
   @SuppressWarnings("resource")
   public static void main(String[] args)
   {
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Ingrese una cantidad");
      n=sc.nextInt();
      if(n%10==0)
      {
         System.out.println("El "+n+" es m�ltiplo de 10");
      }
      else
      {
         System.out.println("El "+n+" no es m�ltiplo de 10");
      }
   }
}
