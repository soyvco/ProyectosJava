package C2Abstract;
class triang extends CFormasDosd
{
   private String estilo;
   
   // Un constructor para triang
   triang(String S,double w,double h,double r)
   {
      super(w,h,r,"un triángulo");
      estilo=S;
   }
   
   // Construye un tri�ngulo is�sceles.
   triang(double x)
   {
      super(x,x,x,"Un triángulo"); // llama a un constructor de superclase
      estilo="isosceles";
   }
   
   // Construye un objeto a partir de un objeto
   triang(triang ob)
   {
      super(ob); // pasa un objeto al constructor de formaDosd
      estilo=ob.estilo;
   }
   
   double area()
   {
      return obtenerancho()*obteneralto()/2;
   }
   
   public void mostrarestilo()
   {
      System.out.println("el triángulo es "+estilo);
   }
}