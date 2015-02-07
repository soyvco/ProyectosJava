package C2Abstract;
import javax.swing.JOptionPane;

abstract class CFormasDosd
{
   // ahora FormaDosd es abstracta
   private double ancho;
   private double alto;
   private double radio;
   private String nombre;
   
   // Un constructuctor predeterminado.
   public CFormasDosd()
   {
      ancho=0.0;
      alto=0.0;
      radio=0.0;
      nombre=null;
   }
   
   // constructor con parámetro.
   public CFormasDosd(double w,double h,double r,String n)
   {
      ancho=w;
      alto=h;
      nombre=n;
      radio=r;
   }
   
   // Construye un objeto a partir de un objeto
   CFormasDosd(CFormasDosd ob)
   {
      ancho=ob.ancho;
      alto=ob.alto;
      radio=ob.radio;
      nombre=ob.nombre;
   }
   
   // Métodos de accesos para ancho y alto.
   double obtenerancho()
   {
      return ancho;
   }
   
   double obteneralto()
   {
      return alto;
   }
   
   double obtenerradio()
   {
      return radio;
   }
   
   void establecerancho(double w)
   {
      ancho=w;
   }
   
   void estableceralto(double h)
   {
      alto=h;
   }
   
   void establecerradio(double r)
   {
      radio=r;
   }
   
   String obtenerNombre()
   {
      return nombre;
   }
   
   public void mostrarDim()
   {
      JOptionPane.showMessageDialog(null,"El ancho y alto son "+ancho+" y "+alto);
   }
   
   // ahora área es abstracta
   abstract double area(); // se convierte en método abstracto.
   // una subclase de formaDosd para triang
}