package BaseDatos;
import java.sql.ResultSet;
import java.sql.SQLException;
import componentes.CompBaseDatos;

public class PruebaBaseDatos
{
   public static void main(String[] args)
   {
      String matricula;
      String nomMaestro;
      String materia;
      CompBaseDatos bd=new CompBaseDatos("root","","maestros");
      ResultSet rs;
      bd.conectarBD();
      rs=bd.getQuery("select * from maestro");
      try
      {
         while(rs.next())
         {
            matricula=rs.getString("matricula");
            nomMaestro=rs.getString("nomMaestro");
            materia=rs.getString("materia");
            System.out.print("Clave: "+matricula+" ");
            System.out.print("Nombre maestro: "+nomMaestro+" ");
            System.out.print("Materia: "+materia+" ");
         }
      }
      catch(SQLException e)
      {
         e.printStackTrace();
      }
   }
}