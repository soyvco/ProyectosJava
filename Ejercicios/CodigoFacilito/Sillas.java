package CodigoFacilito;
public class Sillas
{
   public static int a;
   public static char b;
   public static void asignaCosto(int a)
   {
         int costo=(int)Math.pow(a,2);
         System.out.println("El costo es "+costo);
   }
   public static void asignaCosto(char b)
   {
      char costo=b;
      System.out.println("Esta es la letra principal del abecedario "+costo);
   }
   public static void main(String[] args)
   {
      a=10;
      asignaCosto(a);
      System.out.println();
      b='a';
      asignaCosto(b);
   }
}
