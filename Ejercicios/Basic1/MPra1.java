package Basic1;
/*
 *Declarar una variable N de tipo int, una variable A de tipo double y una variable C de tipo char y asigna a cada una un valor. 
 *A continuación muestra por pantalla:
 *El valor de cada variable.
 *La suma de N + A
 *La diferencia de A - N
 *El valor numórico correspondiente al carácter que contiene la variable C.
 */
public class MPra1
{
   public static void main(String[] args)
   {
      int N=5;
      double A=8.54;
      char C='e';
      System.out.println("El valor de N es: "+N);
      System.out.println("El valor de A es: "+A);
      System.out.println("El valor de C es: "+C);
      System.out.println("La suma de "+N+"+"+A+" es: "+(N+A));
      System.out.println("La diferencia de "+A+"-"+N+" es: "+(A-N));
      System.out.println("El valor del car�cter "+C+" es: "+(int)C);
   }
}