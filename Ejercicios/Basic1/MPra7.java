package Basic1;
/*
 * Declara una variable C de tipo entero y asíingale un valor. A continuación muestra un mensaje indicando si el valor de C es:
 * Positivo o negativo
 * Par o impar
 * Múltipo de 5
 * Múltiplo de 10
 * Mayor o menor que 100.
 * Consideremos el 0 como positivo. Utiliza el operador condicional ( ?: ) dentro del println para resolverlo.
 */
public class MPra7
{
   public static void main(String[] args)
   {
      int c=99;
      System.out.println(c+(c>=0?" es positivo\n": " es negativo\n")
            +c+(c%2==0?" es par\n": " es impar\n")
            +c+(c%5==0?" es m�ltiplo de 5\n": " no es m�ltiplo de 5\n")
            +c+(c%10==0?" es m�ltiplo de 10\n": " no es m�ltiplo de 10\n")
            +c+(c>100?" es mayor que 100\n": " es menor que 100\n"));
   }
}