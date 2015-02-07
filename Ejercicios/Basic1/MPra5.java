package Basic1;
/*
 * Declare una variable A de tipo entero y asígnale un valor. 
 * A continuación muestra un mensaje indicando si A es par o impar. 
 * Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.
 */
public class MPra5
{
   public static void main(String[] args)
   {
      int x=5;
      System.out.println(x+(x%2==0?" es par": " es impar"));
   }
}
