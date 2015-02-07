package Basic3;
import java.io.IOException;

/*
 * Programa que lea dos carácteres y compruebe si son minúsculas.
 */
public class MPra5
{
   public static void main(String[] args) throws IOException
   {
      char car1,car2;
      System.out.println("Introduzca un primer carácter");
      car1=(char)System.in.read();
      System.in.read();
      System.in.read();
      System.out.println("Introduzca un segundo carácter");
      car2=(char)System.in.read();
      if(Character.isLowerCase(car1))
      {
         if(Character.isLowerCase(car2))
         {
            System.out.println("Ambos son minúsculas");
         }
         else
         {
            System.out.println("El primero es minúscula, el segundo no");
         }
      }
      else if(Character.isLowerCase(car2))
      {
         System.out.println("El segundo es minúscula pero el primero no");
      }
      else
      {
         System.out.println("Ninguno de los dos es minúscula");
      }
   }
}