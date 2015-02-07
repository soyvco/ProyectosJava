package Uni2;
import javax.swing.JOptionPane;
import Automotor1.MAutomotor;
import Factorial.MFactorial;
import NumeroPar.MPar;
import utilerias.CArchivosEscritor;
import utilerias.ETipo;

public class SubUni2
{
   private int opcion;
   
   public void opcAut1()
   {
      do
      {
         opcion=Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción:\n"+
                                                             "1) Ver códigos.\n"+
                                                             "2) Ejecutar.\n"+
                                                             "3) Regresar."));
         switch(opcion)
         {
            case 1:
               CArchivosEscritor escritor=new CArchivosEscritor("aut1.doc",ETipo.SOBREESCRIBIR);
               escritor.mostrar();
               break;
            case 2:
               MAutomotor a=new MAutomotor();
               a.main();
               break;
            case 3:
               break;
            default:
               JOptionPane.showMessageDialog(null,"No se selecciono una opción");
         }
      }
      while(opcion!=3);
   }
   
   public void opcAut2()
   {
      do
      {
         opcion=Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción:\n"+
                                                             "1) Ver códigos.\n"+
                                                             "2) Ejecutar.\n"+
                                                             "3) Regresar."));
         switch(opcion)
         {
            case 1:
               CArchivosEscritor escritor=new CArchivosEscritor("aut2.doc",ETipo.SOBREESCRIBIR);
               escritor.mostrar();
               break;
            case 2:
               Automotor2.MAutomotor a=new Automotor2.MAutomotor();
               a.main();
               break;
            case 3:
               break;
            default:
               JOptionPane.showMessageDialog(null,"No se selecciono una opción");
         }
      }
      while(opcion!=3);
   }
   
   public void opcAut3()
   {
      do
      {
         opcion=Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción:\n"+
                                                             "1) Ver códigos.\n"+
                                                             "2) Ejecutar.\n"+
                                                             "3) Regresar."));
         switch(opcion)
         {
            case 1:
               CArchivosEscritor escritor=new CArchivosEscritor("aut3.doc",ETipo.SOBREESCRIBIR);
               escritor.mostrar();
               break;
            case 2:
               Automotor3.MAutomotor a=new Automotor3.MAutomotor();
               a.main();
               break;
            case 3:
               break;
            default:
               JOptionPane.showMessageDialog(null,"No se selecciono una opción");
         }
      }
      while(opcion!=3);
   }
   
   public void opcAut4()
   {
      do
      {
         opcion=Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción:\n"+
                                                             "1) Ver códigos.\n"+
                                                             "2) Ejecutar.\n"+
                                                             "3) Regresar."));
         switch(opcion)
         {
            case 1:
               CArchivosEscritor escritor=new CArchivosEscritor("aut4.doc",ETipo.SOBREESCRIBIR);
               escritor.mostrar();
               break;
            case 2:
               Automotor4.MAutomotor a=new Automotor4.MAutomotor();
               a.main();
               break;
            case 3:
               break;
            default:
               JOptionPane.showMessageDialog(null,"No se selecciono una opción");
         }
      }
      while(opcion!=3);
   }
   
   public void opcAut5()
   {
      do
      {
         opcion=Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción:\n"+
                                                             "1) Ver códigos.\n"+
                                                             "2) Ejecutar.\n"+
                                                             "3) Regresar."));
         switch(opcion)
         {
            case 1:
               CArchivosEscritor escritor=new CArchivosEscritor("aut5.doc",ETipo.SOBREESCRIBIR);
               escritor.mostrar();
               break;
            case 2:
               Automotor5.MAutomotor a=new Automotor5.MAutomotor();
               a.main();
               break;
            case 3:
               break;
            default:
               JOptionPane.showMessageDialog(null,"No se selecciono una opción");
         }
      }
      while(opcion!=3);
   }
   
   public void opcParImpar()
   {
      do
      {
         opcion=Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción:\n"+
                                                             "1) Ver códigos.\n"+
                                                             "2) Ejecutar.\n"+
                                                             "3) Regresar."));
         switch(opcion)
         {
            case 1:
               CArchivosEscritor escritor=new CArchivosEscritor("par.doc",ETipo.SOBREESCRIBIR);
               escritor.mostrar();
               break;
            case 2:
               MPar a=new MPar();
               a.main();
               break;
            case 3:
               break;
            default:
               JOptionPane.showMessageDialog(null,"No se selecciono una opción");
         }
      }
      while(opcion!=3);
   }
   
   public void opcFact()
   {
      do
      {
         opcion=Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción:\n"+
                                                             "1) Ver códigos.\n"+
                                                             "2) Ejecutar.\n"+
                                                             "3) Regresar."));
         switch(opcion)
         {
            case 1:
               CArchivosEscritor escritor=new CArchivosEscritor("factorial.doc",ETipo.SOBREESCRIBIR);
               escritor.mostrar();
               break;
            case 2:
               MFactorial a=new MFactorial();
               a.main();
               break;
            case 3:
               break;
            default:
               JOptionPane.showMessageDialog(null,"No se selecciono una opción");
         }
      }
      while(opcion!=3);
   }
}