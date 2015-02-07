package Basic2;
import java.util.Scanner;

/*
 * Programa que lea un número entero N de 5 cifras y muestre sus cifras igual que en el ejemplo.
 * Por ejemplo para un número N = 12345   La salida debe ser:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 */
public class MPra11
{
   @SuppressWarnings("resource")
   public static void main(String[] args)
   {
      int num;
      Scanner sc=new Scanner(System.in);
      System.out.print("Introduzca valor de N: ");
      num=sc.nextInt();
      System.out.println(num/10000);
      System.out.println(num/1000);
      System.out.println(num/100);
      System.out.println(num/10);
      System.out.println(num);
   }
}
