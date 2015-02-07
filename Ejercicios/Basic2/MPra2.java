package Basic2;
import java.util.Scanner;

/*
 * Programa que lea un nombre por teclado y muestre por pantalla "Buenos días nombre_introducido"
 */
public class MPra2
{
   @SuppressWarnings("resource")
   public static void main(String[] args)
   {
      String nom;
      Scanner sc=new Scanner(System.in);
      System.out.println("Introduzca un nombre");
      nom=sc.next();
      System.out.println("��Buenos d�as "+nom+"!!");
   }
}
