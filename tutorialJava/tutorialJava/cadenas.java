package tutorialJava;
public class cadenas
{
   public static void main(String[] args)
   {
      String cadena="Esto es una cadena larga que quiero que tenga salto de línea";
      System.out.println(cadena);
      System.out.println("\n");
      String cadena2="Esto es una cadena larga que \nquiero que tenga salto de línea";
      System.out.println(cadena2);
      String cadena3="Esto es una cadena larga que \n\n\nquiero que tenga salto de línea";
      System.out.println(cadena3);
   }
}