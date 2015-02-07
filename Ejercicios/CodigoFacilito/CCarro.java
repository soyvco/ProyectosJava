package CodigoFacilito;
public class CCarro
{// Variables nativas de la clase
   double  peso;
   double  altura;
   double  ancho;
   double  largo;
   boolean encendido;
   int     numeroPuertas;
   String  modelo;
   String  estado;
   
   // Constructores
   public CCarro()
   {
      peso=1000;
      altura=500;
      ancho=300;
      largo=800;
      numeroPuertas=4;
   }
   
   public CCarro(double peso,double altura,double ancho,double largo,int numeroPuertas)
   {
      this.peso=peso; // This hace referencia a la variable nativa; "peso",
                      // "altura", "ancho", etc.
      this.altura=altura;
      this.ancho=ancho;
      this.largo=largo;
      this.numeroPuertas=numeroPuertas;
   }
   
   // Metodos
   public double obtenerPeso()
   {
      return this.peso;
   }
   
   public double obtenerAltura()
   {
      return this.altura;
   }
   
   public String obtenerModelo()
   {
      return this.modelo;
   }
   
   public void encenderCarro()
   {
      this.encendido=true;
      System.out.println("Acabas de encender el carro");
   }
   
   public void apagarCarro()
   {
      this.encendido=false;
      System.out.println("Acabas de encender el carro");
   }
   
   public void estado()
   {
      if(this.encendido==true) System.out.println("El carro está encendido");
      else System.out.println("El carro está apagado");
   }
}

// Creando una nueva clase que hereda variables, constructures y metodos de
// "Carro".
class CarroBMW extends CCarro
{
   public CarroBMW()
   {
      this.modelo="BMW";
   }
   
   public void turbo()
   {
      System.out.println("¡Acabas de viajar a mil millas por hora!");
   }
}

class CarroToyota extends CCarro
{
   public CarroToyota()
   {
      this.modelo="Toyota";
   }
   
   public String modelo()
   {
      return this.modelo;
   }
}

// Se puede otra clase hija de otra clase con herencia
class Carrito extends CarroToyota
{
   public Carrito()
   {
      this.modelo="Vocho";
   }
   
   public String modelo()
   {
      return this.modelo;
   }
}