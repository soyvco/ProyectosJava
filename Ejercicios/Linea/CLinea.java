package Linea;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class CLinea
{
   private float y2;
   private float y1;
   private float x2;
   private float x1;
   private float X;
   private float B;
   
   public CLinea()
   {
      this(0.0f,0.0f,0.0f,0.0f,0.0f,0.0f);
   }
   
   // La p en minúsculas indica parámetro
   public CLinea(float pY2,float pY1,float pX2,float pX1,float pX,float pB)
   {
      y2=pY2;
      y1=pY1;
      x2=pX2;
      x1=pX1;
      X=pX;
      B=pB;
      leerDatos();
      imprimir();
   }
   
   public void leerDatos()
   {
      if(y2==0f) y2=(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de y2:",y2)));
      if(y1==0f) y1=(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de y1:",y1)));
      if(x2==0f) x2=(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de x2:",x2)));
      if(x1==0f) x1=(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de x1:",x1)));
      if(X==0f) X=(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de X:",X)));
      if(B==0f) B=(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de B:",B)));
   }
   
   public float getM()
   {
      return (y2)/(x2-x1);
   }
   
   public float getb()
   {
      return getM()*X+B;
   }
   
   public String toString()
   {
      String texto=String.format("=============================\n"+
            "      DATOS DE LALINEA   \n"+
            "Valor de y2       : %,12.2f   \n"+
            "Valor de y1       : %,12.2f   \n"+
            "Valor de x2       : %,12.2f   \n"+
            "Valor de x1       : %,12.2f   \n"+
            "Valor de X        : %,12.2f   \n"+
            "Valor de B        : %,12.2f   \n"+
            "Obtener M         : %,12.2f   \n"+
            "Obter b           : %,12.2f   \n"+
            "=============================",
            y2,
            y1,
            x2,
            x1,
            X,
            B,
            getM(),
            getb()
            );
      return texto;
   }
   
   public void imprimir()
   {
      System.out.println(toString());
      JTextArea tArea=new JTextArea(toString());
      tArea.setFont(new Font("Copperplate Gothic Bold",Font.ITALIC,30));
      tArea.setEditable(false);
      tArea.setForeground(Color.RED);
      tArea.setBackground(Color.WHITE);
      JOptionPane.showConfirmDialog(null,tArea);
   }
}
