package Uni3_4;
import javax.swing.JOptionPane;
import utilerias.CArchivosEscritor;
import utilerias.ETipo;
import C1Herencia.MFormasDosd;

public class SubUni3_4
{
   static int opcion;
   CArchivosEscritor escritor;
   public void opcHerencia()
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
               escritor=new CArchivosEscritor("herencia.doc",ETipo.SOBREESCRIBIR);
               escritor.mostrar();
               break;
            case 2:
               MFormasDosd a=new MFormasDosd();
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
   
   public void opcAbstract()
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
               escritor=new CArchivosEscritor("abstract.doc",ETipo.SOBREESCRIBIR);
               escritor.mostrar();
               break;
            case 2:
               C2Abstract.MFormasDosd a=new C2Abstract.MFormasDosd();
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