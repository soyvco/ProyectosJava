package BaseDatos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import componentes.CompBaseDatos;

public class PruebaBaseDatos
{
   public static void main(String[] args)
   {
      String matricula;
      String nomMaestro;
      String materia;
      CompBaseDatos bd=new CompBaseDatos("root","","RegistroITVH");
      ResultSet rs;
      Vector<String> alumnos=new Vector<String>(1,1);
      bd.conectarBD();
      rs=bd.getQuery("select * from AltaAlumnos");
      try
      {
         while(rs.next())
         {
            alumnos.addElement(rs.getString("matricula"));
            System.out.println(alumnos.size());
         }
      }
      catch(SQLException e)
      {
         e.printStackTrace();
      }
   }
}