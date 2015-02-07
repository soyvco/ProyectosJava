package Automotor2;
import javax.swing.JOptionPane;

public class MAutomotor
{
   // Esta clase declara un objeto de tipo CAutomotor (minivan). Declaramos otro
   // objeto del tipo CAutomotor
   public void main()
   {
      CAutomotor minivan=new CAutomotor();
      CAutomotor transbus=new CAutomotor();
      int opcion;
      String txt;
      do
      {
         {
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccione una opciÓn: \n"+"1) Ingresar datos a la minivan\n"+"2) Ingresar datos al transbus\n"+"3) Salir del programa"));
         }
         switch(opcion)
         {
            case 1: // Asignamos valor al primer objeto
               minivan.pasajeros=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca el nÚmero de pasajeros.\n"+"CUPO LIMITE: 20 personas."));
               if(minivan.pasajeros>0&&minivan.pasajeros<=20)
               {
                  minivan.tanqueGasolina=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca la cantidad de gasolina que tiene el minivan.\n"+"CAPACIDAD LIMITE: 60 litros"));
                  if(minivan.tanqueGasolina>0&&minivan.tanqueGasolina<=60)
                  {
                     minivan.KpL=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca la distancia transcurrida.\n"+"LIMITE: 50 kilometros"));
                     if(minivan.KpL>0&&minivan.KpL<=50)
                     {
                        txt="Números de pasajeros: "+minivan.pasajeros+".\nCantidad de gasolina en el tanque: "+minivan.tanqueGasolina+"litros.\nDistancia recorrida: "+minivan.KpL+"Km.\n";
                        JOptionPane.showMessageDialog(null,txt,"DATOS MINIVAN",JOptionPane.WARNING_MESSAGE); // Motramos
                                                                                                             // resultado
                        minivan.obtenerRango();
                     }
                     else
                     {
                        txt="No ingreso una cantidad válida";
                        JOptionPane.showMessageDialog(null,txt,"ERRRRROR",JOptionPane.ERROR_MESSAGE);
                     }
                  }
                  else
                  {
                     txt="No ingreso una cantidad válida";
                     JOptionPane.showMessageDialog(null,txt,"ERRRRROR",JOptionPane.ERROR_MESSAGE);
                  }
               }
               else
               {
                  txt="No ingreso una cantidad válida";
                  JOptionPane.showMessageDialog(null,txt,"ERRRRROR",JOptionPane.ERROR_MESSAGE);
               }
               break;
            case 2: // Asiignamos valor al primer objeto
               transbus.pasajeros=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca el Número de pasajeros.\n"+"CUPO LIMITE: 44 personas."));
               if(transbus.pasajeros>0&&transbus.pasajeros<=44)
               {
                  transbus.tanqueGasolina=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca la cantidad de gasolina que tiene el minivan.\n"+"CAPACIDAD LIMITE: 100 litros"));
                  if(transbus.tanqueGasolina>0&&transbus.tanqueGasolina<=100)
                  {
                     transbus.KpL=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca la distancia transcurrida.\n"+"LIMITE: 50 kilometros"));
                     if(transbus.KpL>0&&transbus.KpL<=50)
                     {
                        txt="Números de pasajeros: "+transbus.pasajeros+".\nCantidad de gasolina en el tanque: "+transbus.tanqueGasolina+"litros.\nDistancia recorrida: "+transbus.KpL+"Km.\n";
                        JOptionPane.showMessageDialog(null,txt,"DATOS TRANSBUS",JOptionPane.WARNING_MESSAGE); // Mostramos
                                                                                                              // resultado
                        transbus.obtenerRango();
                     }
                     else
                     {
                        txt="No ingreso una cantidad válida";
                        JOptionPane.showMessageDialog(null,txt,"ERRRRROR",JOptionPane.ERROR_MESSAGE);
                     }
                  }
                  else
                  {
                     txt="No ingreso una cantidad válida";
                     JOptionPane.showMessageDialog(null,txt,"ERRRRROR",JOptionPane.ERROR_MESSAGE);
                  }
               }
               else
               {
                  txt="No ingreso una cantidad válida";
                  JOptionPane.showMessageDialog(null,txt,"ERRRRROR",JOptionPane.ERROR_MESSAGE);
               }
               break;
            case 3:
               txt="Usted ha salido del programa";
               JOptionPane.showMessageDialog(null,txt,"¡Adiós!",JOptionPane.INFORMATION_MESSAGE);
               break;
            default:
               txt="ERRRROR, LA OPCIÓN NO EXISTE";
               JOptionPane.showMessageDialog(null,txt,"ERRRRROR",JOptionPane.ERROR_MESSAGE);
         }
      }
      while(opcion!=3);
   }
}