package MickeyMouse;
import java.awt.Graphics;

import java.awt.Color;
public class CCirculo
{
   private int x;
   private int y;
   private int ancho;
   private int largo;
   private Color contorno;
   private Color relleno;
  
   public CCirculo(int pX,int pY,int pAncho,int pLargo,Color pContorno,Color pRelleno)
   {
      x=pX;
      y=pY;
      ancho=pAncho;
      largo=pLargo;
      contorno=pContorno;
      relleno=pRelleno;
      
   }
   public void dibujar(Graphics g)
   {
      g.setColor(relleno); g.fillOval(x-ancho/2,y-largo/2,ancho,largo);
      g.setColor(contorno); g.drawOval(x-ancho/2,y-largo/2,ancho,largo);
      
   }
   
}