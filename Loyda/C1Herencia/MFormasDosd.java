package C1Herencia;

import javax.swing.JOptionPane;

public class MFormasDosd
{
   public void main()
   {
      triangulo t1=new triangulo();
      triangulo t2=new triangulo();
      t1.ancho=4.0;
      t1.alto=4.0;
      t1.estilo="Isósceles";
      t2.ancho=8.0;
      t2.alto=12.0;
      t2.estilo="Recto";
      
      JOptionPane.showMessageDialog(null,"Información para triángulo 1: ");
      t1.mostrarEstilo();
      t1.mostrarDim();
      JOptionPane.showMessageDialog(null,"El área es "+t1.area());
      
      JOptionPane.showMessageDialog(null,"Información para triángulo 2: ");
      t2.mostrarEstilo();
      t2.mostrarDim();
      JOptionPane.showMessageDialog(null,"El área es "+t2.area());
   }
}
