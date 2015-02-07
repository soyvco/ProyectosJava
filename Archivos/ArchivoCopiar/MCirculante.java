package ArchivoCopiar;

import utilerias.CArchivosEscritor;
import utilerias.CArchivosLector;
import utilerias.ETipo;

public class MCirculante
{
   public static void main(String[] args)
   {
      CArchivosLector lector=new CArchivosLector("a.txt");
      CArchivosEscritor escritor=new CArchivosEscritor("b.txt",ETipo.SOBREESCRIBIR);
      if(lector.abrir())
      {
         if(escritor.crear())
         {
            String linea="";
            while((linea=lector.lectorLinea())!=null)
            {
               escritor.escritorLinea(linea);
            }
            escritor.cerrar();
         }
         lector.cerrar();
      }
   }
}
