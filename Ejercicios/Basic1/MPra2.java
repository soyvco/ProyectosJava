package Basic1;
/*
 * Declarar dos variables X e Y de tipo int, dos variables N y M de tipo double y asigna a cada una un valor. 
 * A continuación muestra por pantalla:
 * El valor de cada variable.
 * La suma  X + Y
 * La diferencia  X - Y
 * El producto  X * Y
 * El cociente  X / Y
 * El resto  X % Y
 * La suma  N + M
 * La diferencia  N � M
 * El producto  N * M
 * El cociente  N / M
 * El resto  N % M
 * La suma X + N
 * El cociente Y / M
 * El resto Y % M
 * El doble de cada variable
 * La suma de todas las variables
 * El producto de todas las variables
 */
public class MPra2
{
   public static void main(String[] args)
   {
      int X=6,Y=7;
      double N=4.5,M=5.5;
      System.out.println("Los valores son: X="+X+", Y="+Y+", N="+N+" y M="+M);
      System.out.println("Suma de X+Y= "+(X+Y));
      System.out.println("Resta de X-Y= "+(X-Y));
      System.out.println("La multiplicaci�n de X*Y= "+(X*Y));
      System.out.println("La divisi�n de X/Y= "+(X/Y));
      System.out.println("El resto de X%Y= "+(X%Y));
      System.out.println("Suma de N+M= "+(N+M));
      System.out.println("Resta de N-M= "+(N-M));
      System.out.println("La multiplicaci�n de N*M= "+(N*M));
      System.out.println("La divisi�n de N/M= "+(N/M));
      System.out.println("El resto de N%M= "+(N%M));
      System.out.println("Suma de X+N= "+(X+N));
      System.out.println("La divisi�n de Y/M= "+(Y/M));
      System.out.println("El resto de Y%M= "+(Y%M));
      System.out.println("El doble de X= "+(X*2));
      System.out.println("El doble de Y= "+(Y*2));
      System.out.println("El doble de N= "+(N*2));
      System.out.println("El doble de M= "+(M*2));
      System.out.println("La suma de todos los valores es= "+(X+Y+N+M));
      System.out.println("La multiplicaci�n de todos los valores es= "+(X*Y*N*M));
   }
}