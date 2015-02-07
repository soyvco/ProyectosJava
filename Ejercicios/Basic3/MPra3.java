package Basic3;
import java.io.IOException;
import java.util.Scanner;

/*
 * Programa que lea un carácter y verifique si es mayúscula.
 */
public class MPra3
{
   @SuppressWarnings({"unused","resource"})
   public static void main(String[] args) throws IOException
   {
      char car;
      Scanner sc=new Scanner(System.in);
      System.out.print("Ingrese un car�cter");
      car=(char)System.in.read(); // Lee un car�cter
      if(Character.isUpperCase(car))
      {
         System.out.println("Es una letra may�scula");
      }
      else
      {
         System.out.println("Es una letra min�scula");
      }
   }
}
