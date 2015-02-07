package MickeyMouse;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class MGraficos extends JFrame
{
   public MGraficos()
   {
      inicializar();
      this.setBounds(0,0,Toolkit.getDefaultToolkit().getScreenSize().width,
                         Toolkit.getDefaultToolkit().getScreenSize().height);
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      this.setVisible(true);
   }
     public void inicializar()
   {
        
   }
   
   
   // Aqui se dibuja
   public void paint(Graphics g)
   {// fill = relleno y draw = contorno
      g.setColor(Color.BLACK); g.fillOval(575+25,100-40,200,200);
      g.setColor(Color.BLACK); g.fillOval(250-15,100-40,200,200);
      
      g.setColor(Color.BLACK); g.fillOval(315,150,400,400);
                                        // x,y,Ancho,Alto
      g.setColor(Color.PINK);  g.fillOval(390,    410,    250,    150);//Boca
      g.setColor(Color.PINK);  g.fillOval(400,    175,    130,    250);//Contorno de ojos Izquierdo
      g.setColor(Color.PINK);  g.fillOval(500,    175,    130,    250);//Contorno de ojos Derecho
      g.setColor(Color.WHITE); g.fillOval(418,    195,    100,    240);//Ojo Izquierdo
      g.setColor(Color.WHITE); g.fillOval(512,    195,    100,    240);//Ojo Derecho
      g.setColor(Color.PINK);  g.fillOval(310,    375,    410,    150);//Mejillas
      g.setColor(Color.BLACK); g.fillOval(465,355,100,50);
      
      
   }
   
   public static void main(String[] args)
   {
      new MGraficos();
   }
}