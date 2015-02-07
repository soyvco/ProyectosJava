package Basic2;

import java.util.Scanner;

/*
 * Programa que lea la longitud de los catetos de un triángulo rectángulo.
 * Calcule la longitud de la hipotenusa segun el teorema de Pitágoras.
 */
public class MPra7 
{

   @SuppressWarnings("resource")
   public static void main(String[] args) 
   {
      double cat1, cat2, hip;
      Scanner sc=new Scanner(System.in);
      System.out.println("Intrduzca el valor del cateto 1");
      cat1=sc.nextDouble();
      System.out.println("Introduzca el valor de catero 2");
      cat2=sc.nextDouble();
      hip= Math.sqrt(Math.pow(cat1, 2)+Math.pow(cat2, 2));
      System.out.println("La hipotenusa es "+hip);

   }

}
