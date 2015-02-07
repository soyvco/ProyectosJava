package Datos;

import javax.swing.JOptionPane;

public class MExcepcion
{
   public static void main(String[] args)
   {

      int                edad;
      boolean isBandera=false;
      int minimo=18;
      int maximo=120;
      
      do
      {
            try {
            edad= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa tu dato"));
            if (edad <minimo)throw new IllegalArgumentException("No estas dentro del rango");
            else if(edad>maximo)throw new IllegalArgumentException("No estas dentro del rango2");
            isBandera=true;
            }
            catch (NumberFormatException e) 
            {
               JOptionPane.showMessageDialog(null,"Solo se aceptan Números");
            }
            catch (IllegalArgumentException e) 
            {
               JOptionPane.showMessageDialog(null,e.getMessage());
            }
      }
      while (!isBandera);
   }
}
