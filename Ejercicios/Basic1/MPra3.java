package Basic1;
/*
 * Declare una variable entera N y asígnale un valor. A continuación escribe las instrucciones que realicen los siguientes:
 * Incrementar N en 77.
 * Decrementarla en 3.
 * Duplicar su valor.
 */
public class MPra3
{
   public static void main(String[] args)
   {
      int N=8;
      System.out.println("El valor de N="+N);
      N+=77;
      System.out.println("N+77="+(N+77));
      N-=3;
      System.out.println("N-3="+(N-3));
      N*=2;
      System.out.println("N*2="+(N*2));
   }
}
