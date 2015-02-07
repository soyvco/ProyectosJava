package C1Herencia;
import javax.swing.JOptionPane;

//Una clase para objetos bidimencionales
public class CFormasDosd
{
   double alto;
   double ancho;
   
   public void mostrarDim()
   {
      JOptionPane.showMessageDialog(null,"El ancho y el alto son "+ancho+" y "+alto);
   }
}

// Una subclase de CFormasDosd triángulos
class triangulo extends CFormasDosd
{
   String estilo;
   
   public double area()
   {
      return (this.ancho*this.alto)/2;
   }
   
   public void mostrarEstilo()
   {
      JOptionPane.showMessageDialog(null, "El triángulo es "+estilo);
   }
}