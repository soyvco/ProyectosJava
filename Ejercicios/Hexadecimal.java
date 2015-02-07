public class Hexadecimal
{
   public static void main(String[] args)
   {
      int hex=76;
      char v=(char)(hex+24);
      int decimal=hex+24;
      // String hex=Integer.toHexString(v+14);
      System.out.println("El valor decimal es: "+decimal+"\nEl valor hexadecimal es "+hex+"\nRepresentacion: "+v);
   }
}
