package CodigoFacilito;
public class MCarro
{
   public static void main(String[] args)
   {
      CCarro Carro1=new CCarro();
      CCarro Carro2=new CCarro();
      Carro1.estado();
      Carro1.encenderCarro();
      Carro1.estado();
      Carro1.modelo="Challenger";
      Carro2.modelo="Cadilac";
      System.out.println("El carro es un "+Carro1.modelo+"\n\nEl modelo del carro 2 es "+Carro2.modelo);
      CarroBMW Carro3=new CarroBMW();
      System.out.println("El modelo del carro es un "+Carro3.modelo);
      Carro3.turbo();
      Carrito Carro4=new Carrito();
      Carro4.estado();
      System.out.println("El modelo del carro es un "+Carro4.modelo);
   }
}