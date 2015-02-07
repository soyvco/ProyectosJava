package Cuadrado;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class CCuadrado
{
   private static final int LADOS =4;
   private double           lado;
   
   public CCuadrado()
   {
      this(0.0);
   }
   
   public CCuadrado(double pLado) // La p en min�scula indica parametro
   {
      lado=pLado;
      leerDatos();
      imprimir();
   }
   
   public void leerDatos()
   {
      if(lado==0.0) lado=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor"
            +"del lado del cuadrado ",lado));
   }
   
   public double calcularárea()
   {
      return lado*lado;
   }
   
   public double calcularPerámetro()
   {
      return LADOS*lado;
   }
   
   public double calcularDiagonal()
   {
      return Math.sqrt(2*calcularárea());
   }
   
   public String toString()
   {
      String texto=String.format("=========================\n"+
                                 "  DATOS DEL CUADRADO     \n"+
                                 "Un Cuadrado tiene %d Lados\n"+
                                 "Lado         :%,12.2f  m  \n"+
                                 "área         :%,12.2f  m² \n"+
                                 "Perámetro    :%,12.2f  m  \n"+
                                 "Diagonal     :%,12.2f  m  \n"+
                                 "==========================",
                                 LADOS,
                                 lado,
                                 calcularárea(),
                                 calcularPerámetro(),
                                 calcularDiagonal()
                                 );
      return texto;
   }
   
   public void imprimir()
   {
      System.out.println(toString());
      JTextArea tArea=new JTextArea(toString());
      tArea.setFont(new Font("Century Gothic",Font.BOLD,14));
      tArea.setEditable(false);
      tArea.setForeground(Color.GREEN);
      tArea.setBackground(Color.BLACK);
      JOptionPane.showMessageDialog(null,tArea);
   }
}
