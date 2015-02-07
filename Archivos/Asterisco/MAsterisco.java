package Asterisco;

import utilerias.CArchivosEscritor;
import utilerias.CArchivosLector;
import utilerias.ETipo;

public class MAsterisco
{
   public static void main(String[] args)
   {
      String aste="";
      CArchivosLector lector=new CArchivosLector("Prueba.txt");
      CArchivosEscritor escritor=new CArchivosEscritor("Prueba2.txt",ETipo.SOBREESCRIBIR);
      if(lector.abrir())
      {
         if(escritor.crear())
         {
            String linea="";
            while((linea=lector.lectorLinea())!=null)
            {
               int num;
               num=Integer.parseInt(linea);
               for(int i=0; i<num; i++)
               {
                  aste+="*";
               }
               escritor.escritorLinea(aste);
               aste="\n";
            }
         }
      }
      lector.mostrar();
      escritor.mostrar();
      escritor.cerrar();
      lector.cerrar();
      lector.abrir();
      System.out.println("Los numeros de * a crear son: "+lector.lectorTodo());
      lector.cerrar();
   }
}
