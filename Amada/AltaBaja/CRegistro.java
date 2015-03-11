package AltaBaja;
import java.util.Vector;

public class CRegistro
{
   public Vector<String> listaAlumnos    =new Vector<String>(1,1);
   public Vector<String> listaProfesores =new Vector<String>(1,1);
   
   public void addAlum(String pAlum)
   {
      listaAlumnos.addElement(pAlum);
   }
}
