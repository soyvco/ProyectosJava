package Basic2;
import java.util.Scanner;

/*
 * Programa que lea por teclado el valor del radio de una circunferencia.
 * Calcula y muestra por pantalla la longitud y el area de la circunferencia.
 * Longitud = 2*PI*Radio, Area = PI*Radio^2.
 */
public class MPra5
{
   @SuppressWarnings("resource")
   public static void main(String[] args)
   {
      double radio,longitud,area;
      Scanner sc=new Scanner(System.in);
      System.out.println("Ingrese el valor del radio de la circunferencia");
      radio=sc.nextDouble();
      longitud=2*Math.PI*radio;
      area=Math.PI*Math.pow(radio,2);
      System.out.println("Radio de la circunferencia = "+radio+
            "\nLongitud de la circunferencia = "+longitud+
            "\nArea de la cirfunferencia = "+area);
   }
   
}

