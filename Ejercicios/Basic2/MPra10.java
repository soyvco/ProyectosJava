package Basic2;
import java.util.Scanner;

/*
 * Programa que lea un número de 3 cifras y muestre por pantalla las cifras del número.
 */
public class MPra10
{
   @SuppressWarnings("resource")
   public static void main(String[] args)
   {
      int num;
      Scanner sc=new Scanner(System.in);
      System.out.println("Introduzca una cantidad de 3 cifras");
      num=sc.nextInt();
      System.out.println("Primera cifra de "+num+" -> "+(num/100));
      System.out.println("Cifra central de "+num+" -> "+(num/10)%10);
      System.out.println("�ltima cifra  de "+num+" -> "+(num%10));
   }
}
