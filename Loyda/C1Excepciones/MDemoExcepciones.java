package C1Excepciones;
public class MDemoExcepciones
{
   public static void main(String[] args)
   {
      int num[]=new int[4];
      try
      {
         System.out.println("Antes que se genere la exceptión");
         // genera una excepción
         num[7]=10; // Como no existe manda el mensaje del Catch...
         System.out.println("Esto no se muestra");
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
         // Captura excepción
         System.out.println("Índice fuera del límite");
      }
      System.out.println("Después de la instrucción catch");
   }
}
