package Basic1;
/*
 * Declara una variable B de tipo entero y asínale un valor. A continuación muestra un mensaje indicando si B es positivo o negativo.
 * Consideremos el 0 como positivo. Utiliza el operador condicional (? : ) dentro del println para resolverlo.
 */
public class MPra6
{
   public static void main(String[] args)
   {
      int b=-5;
      System.out.println(b+(b>=0?" es positivo": " es negativo"));
   }
}
