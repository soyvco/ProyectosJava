package C2Abstract;


class circ extends CFormasDosd
{
   circ()
   {
      super(null);
   }
   
   circ(double x)
   {
      super(x,x,x,"un circulo");
   }
   
   circ(circ ob)
   {
      super(ob);
   }
   
   double area()
   {
      return Math.PI*Math.pow(obtenerradio(),2);
   }
}