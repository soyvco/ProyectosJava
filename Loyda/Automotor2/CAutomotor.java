package Automotor2;
import javax.swing.JOptionPane;

public class CAutomotor
{
   int pasajeros;
   int tanqueGasolina =0;
   int KpL            =0;
   int rango;
   
   public void obtenerRango()
   {
      this.rango=tanqueGasolina*KpL;
      JOptionPane.showMessageDialog(null,"El rango es "+rango+"L/Km");
   }
}