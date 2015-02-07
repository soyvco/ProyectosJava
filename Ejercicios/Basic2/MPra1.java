package Basic2;
import java.util.Scanner;

/*
 * Programa que lea dos número enteros por teclado y los muestre en pantalla.
 */
public class MPra1
{
   @SuppressWarnings("resource")
   public static void main(String[] args)
   {
      int a,b;
      Scanner sc=new Scanner(System.in);
      System.out.println("Introduzca un número");
      a=sc.nextInt();
      System.out.println("Introduzca un número");
      b=sc.nextInt();
      System.out.println("El primero número es "+a+", el segundo número es "+b+".");
   }
}