package ArchivoBuscar;
import utilerias.CArchivosEscritor;
import utilerias.CArchivosLector;
import utilerias.ETipo;

public class MRfc
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
               String rfc="";
               String[] palabras=linea.split(" ");
               for(int i=0; i<palabras.length; i++)
               {
                  if(!palabras[i].toLowerCase().contains("de"))
                  {
                     rfc+=palabras[i].charAt(0);
                  }
                  if(!rfc.isEmpty())
                  {
                     escritor.escritorLinea(rfc);
                  }
               }
            }
            escritor.cerrar();
         }
         lector.cerrar();
      }
   }
}