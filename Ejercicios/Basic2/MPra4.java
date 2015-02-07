package Basic2;
import java.util.Scanner;

/*
 * Programa que lea una cantidad de grados centigrados y lo convierta a Fahrenheit.
 * La fórmula correspondiente es: F=32+(9*C/5)
 */
public class MPra4
{
   @SuppressWarnings("resource")
   public static void main(String[] args)
   {
      int c,f;
      Scanner sc=new Scanner(System.in);
      System.out.println("Ingrese la cantidad de grados C� que desea convertir a F�");
      c=sc.nextInt();
      f=32+(9*c/5);
      System.out.println("Los "+c+"C� son igual a "+f+"F�");
   }
}
