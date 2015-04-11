public class compararCadenas
{
   public static void main(String[] args)
   {
      String limite="01:30:000";
      String tiempo="01:30:000";
      if(limite.equals(tiempo))
      {
         System.out.println("Son iguales");
      }
      else
      {
         System.out.println("No son iguales");
      }
   }
}
