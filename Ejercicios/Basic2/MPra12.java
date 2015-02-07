package Basic2;
import java.util.Scanner;

/*
 * Programa Java que lea un número entero N de 5 cifras y muestre sus cifras igual que en el ejemplo.
 * Por ejemplo para un número N = 12345    La salida debe ser:
 * 5
 * 45
 * 345
 * 2345
 * 12345
 */
public class MPra12
{
   @SuppressWarnings("resource")
   public static void main(String[] args)
   {
      int num;
      Scanner sc=new Scanner(System.in);
      System.out.println("Introduzca una cantidad de 5 cifras");
      num=sc.nextInt();
      System.out.println(num%10);
      System.out.printf("%02d %n",num%100);
      System.out.printf("%03d %n",num%1000);
      System.out.printf("%04d %n",num%10000);
      System.out.printf("%05d %n",num);
   }
}
