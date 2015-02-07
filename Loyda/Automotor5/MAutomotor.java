package Automotor5;
import javax.swing.JOptionPane;
import Automotor5.CAutomotor;

public class MAutomotor
{
   public void main()
   {
      CAutomotor minivan=new CAutomotor(20,20,20);
      CAutomotor transbus=new CAutomotor();
      String txt,txt2;
      txt="Números de pasajeros: "+minivan.pasajeros+".\nCantidad de gasolina en el tanque: "+minivan.tanqueGasolina+"litros.\nDistancia recorrida: "+minivan.KpL+"Km.\nEl rango de la minvian es "+minivan.obtenerRango();
      txt2="Números de pasajeros: "+transbus.pasajeros+".\nCantidad de gasolina en el tanque: "+transbus.tanqueGasolina+"litros.\nDistancia recorrida: "+transbus.KpL+"Km.\nEl rango de la minvian es "+transbus.obtenerRango();
      JOptionPane.showMessageDialog(null,txt,"DATOS DE LA MINIVAN",JOptionPane.WARNING_MESSAGE);
      JOptionPane.showMessageDialog(null,txt2,"DATOS DEL TRANSBUS",JOptionPane.WARNING_MESSAGE);
   }
}