package ArchivoCirculante;

import utilerias.CArchivosEscritor;
import utilerias.CArchivosLector;
import utilerias.ETipo;


public class MCirculante
{
   public static void main(String[] args)
   {
      CArchivosLector     lector=new CArchivosLector("a.txt");
      CArchivosEscritor escritor=new CArchivosEscritor("b.txt",ETipo.SOBREESCRIBIR);
      if(lector.abrir())
      {
         if(escritor.crear())
         {
            String linea="";
            while((linea=lector.lectorLinea())!=null)
            {
               String circulante="";
                    if(linea.equals("2"))circulante="Bicicleta\n";
               else if(linea.equals("3"))circulante="Pochi\n";
               else if(linea.equals("4"))circulante="Auto\n";
               else if(linea.equals("6"))circulante="Trailer\n";
               else if(linea.equals("0"))circulante="Persona\n";
               else if(linea.equals("1"))circulante="Caretilla\n";
               escritor.escritorLinea(circulante);
            }
            escritor.cerrar();
         }
         lector.cerrar();
      }
   }
}
