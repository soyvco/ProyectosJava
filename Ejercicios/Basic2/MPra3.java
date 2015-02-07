package Basic2;
import java.util.Scanner;

/*
 * Programa que lea un numero entero por teclado. Obten y muestra por teclado el doble y el triple del número.
 */
public class MPra3
{
   @SuppressWarnings("resource")
   public static void main(String[] args)
   {
      int num;
      Scanner sc=new Scanner(System.in);
      System.out.println("Introduzca un n�mero");
      num=sc.nextInt();
      System.out.println("El doble de "+num+" es "+(num*2)+", el triple es "+(num*3));
   }
}
