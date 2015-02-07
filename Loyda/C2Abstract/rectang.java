package C2Abstract;

class rectang extends CFormasDosd
{
   // Un constructor predeterminado.
   rectang()
   {
      super(null);
   }
   
   // Constructor para rect�ngulo.
   rectang(double w,double h,double r)
   {
      super(w,h,r,"un rectángulo "); // llama a un constructor de superclase
   }
   
   // Construye un cuadro.
   rectang(double x)
   {
      super(x,x,x,"un rectángulo"); // llama a un con constructor de
                                    // superclase
   }
   
   // Construye un objeto a partir de un objeto
   rectang(rectang ob)
   {
      super(ob); // pasa un objeto a un constructor de formaDosD
   }
   
   boolean escuadrado()
   {
      if(obtenerancho()==obteneralto()) return true;
      return false;
   }
   
   double area()
   {
      return obtenerancho()*obteneralto();
   }
}