package Datos;

import utilerias.CArchivosEscritor;
import utilerias.CArchivosLector;
import utilerias.ETipo;

public class MArchivos
{
   public static void main(String[] args)
   {
      CArchivosLector a=new CArchivosLector("Doc.txt");
      if(a.abrir())
      {
         int n=a.lectorNumero();
         System.out.println(n);
         for(int i=0; i<n; i++)
         {
            String nombre=a.lectorLinea();
            System.out.println(nombre);
         }
         a.cerrar();
         if(a.abrir())
         {
            System.out.println(a.lectorTodo());
            a.cerrar();
         }
      }
      CArchivosEscritor b=new CArchivosEscritor("Dos.txt",ETipo.AGREGAR);
      if(b.crear())
      {
         b.escritorLinea("HOLA GENTE2");
         b.escritorDoble(5.42);
         b.escritorEntero(52);
         b.cerrar();
      }
   }
}
