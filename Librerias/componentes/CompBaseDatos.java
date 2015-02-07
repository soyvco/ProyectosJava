package componentes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CompBaseDatos
{
   private String        user     ="root";
   private String        password ="";
   private static String baseDato ="RegAlumno";
   static String         url      ="jdbc:mysql://localhost/"+baseDato;
   private Connection    conn     =null;
   
   /*
    *Este metodo conecta a su base de datos, sólo la tienen que mandar a llamar
    *con.conexion(); Ejemplo... 
    */
   public Connection conexion()
   {
      try
      {
         try
         {
            Class.forName("com.mysql.jdbc.Driver");
         }
         catch(ClassNotFoundException e)
         {
            e.printStackTrace();
         }
         conn=DriverManager.getConnection(url,user,password);
         System.out.println("Conexión satisfactoria con "+url);
      }
      catch(SQLException e)
      {
         System.out.println("No se conectó correctamente a "+url+"...");
      }
      return conn;
   }
   /*
    * Este metodo getQuery les permite traer los datos a su base de dato...
    * Les dejare la clase "main" para que vean las pruebas que hice...
    */
   public ResultSet getQuery(String _query)
   {
      Statement state=null;
      ResultSet rs=null;
      try
      {
         state=(Statement)conn.createStatement();
         rs=state.executeQuery(_query);
      }
      catch(SQLException e)
      {
         e.printStackTrace();
      }
      return rs;
   }
   /*
    * Este metodo es para ingresar datos a la BD, ya sean nuevos, o modificaciones...
    */
   public void setQuery(String _query)
   {
      Statement state=null;
      try
      {
         state=(Statement)conn.createStatement();
         state.execute(_query);
      }
      catch(SQLException e)
      {
         e.printStackTrace();
      }
   }
}