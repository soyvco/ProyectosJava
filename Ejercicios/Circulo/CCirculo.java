package Circulo;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class CCirculo
{
   private static double PI =3.1416;
   private double        radio;
   
   public CCirculo()
   {
      this(0.0);
   }
   
   public CCirculo(double pRadio) // La p en minúsculas indica parámetro
   {
      radio=pRadio;
      leerDatos();
      imprimir();
   }
   
   public void leerDatos()
   {
      if(radio==0.0) radio=Double.parseDouble(JOptionPane.showInputDialog("ingreses el valor del PI:"+radio));
   }
   
   public double calcularArea()
   {
      return Math.PI*radio*radio;
   }
   
   public double calcularPerimetro()
   {
      return Math.PI*(2*radio);
   }
   
   public double calcularDiametro()
   {
      return(radio+radio);
   }
   
   public String toString()
   {
      String texto=String.format("=========================\n"+
            "     DATOS DEL CIRCULO  \n"+
            "PI        : %,12.2f m \n"+
            "radio     : %,12.2f m \n"+
            "Area      : %,12.2f m2 \n"+
            "Perimetro : %,12.2f m \n"+
            "Diametro  : %,12.2f m \n"+
            "========================",
            PI,
            radio,
            calcularArea(),
            calcularPerimetro(),
            calcularDiametro()
            );
      return texto;
   }
   
   public void imprimir()
   {
      System.out.println(toString());
      JTextArea tArea=new JTextArea(toString());
      tArea.setFont(new Font("Courier new",Font.BOLD,24));
      tArea.setEditable(false);
      tArea.setForeground(Color.GREEN);
      tArea.setBackground(Color.BLUE);
      JOptionPane.showConfirmDialog(null,tArea);
   }
}