package CapturaDeUnAlumno;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import componentes.CompBoton;
import componentes.CompVentana;

public class CBotonesGUI extends CompVentana
{
   protected CompBoton btn1;
   protected CompBoton btn2;
   protected CompBoton btn3;
   protected CompBoton btn4;
   protected CompBoton btn5;
   protected CompBoton btn6;
   protected CompBoton btn7;
   protected CompBoton btn8;
   protected CompBoton btn9;
   protected CompBoton btn10;
   protected CompBoton btn11;
   protected CompBoton btn12;
   protected CompBoton btn13;
   protected CompBoton btn14;
   protected CompBoton btn15;
 
   public CBotonesGUI()
   {
      super("Botones",false,10,10,400,200);
   }
   protected void crearContenido()
   {
      pContenido.setLayout(new GridLayout(3,5));
      btn1  =new CompBoton(pContenido,"b1",this);
      btn2  =new CompBoton(pContenido,"b2",this);
      btn3  =new CompBoton(pContenido,"b3",this);
      btn4  =new CompBoton(pContenido,"b4",this);
      btn5  =new CompBoton(pContenido,"b5",this);
      btn6  =new CompBoton(pContenido,"b6",this);
      btn7  =new CompBoton(pContenido,"b7",this);
      btn8  =new CompBoton(pContenido,"b8",this);
      btn9  =new CompBoton(pContenido,"b9",this);
      btn10 =new CompBoton(pContenido,"b10",this);
      btn11 =new CompBoton(pContenido,"b11",this);
      btn10 =new CompBoton(pContenido,"b12",this);
      btn10 =new CompBoton(pContenido,"b13",this);
      btn10 =new CompBoton(pContenido,"b14",this);
      btn10 =new CompBoton(pContenido,"b15",this);
      
   }
   @Override
   public void actionPerformed(ActionEvent pArg0)
   {
      
   }
}