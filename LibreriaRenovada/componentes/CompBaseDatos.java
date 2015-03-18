package componentes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Componente que permite conectarse a una base de datos local o remota...
 * 
 * Modificado 7 de Febrero del 2015
 * 
 * Autor: soyvco
 */
public class CompBaseDatos
{
   // Variables necesarias para conectarse a cualqueier base de datos
   private String        usuario    ="";
   private String        contraseña ="";
   private static String baseDato   ="";
   static String         url        ="jdbc:mysql://localhost/"+baseDato;
   // La variable conn nos devolverla la conexion a la base de datos
   private Connection    conn;
   
   /* Contructores */
   // Para base de datos local
   @SuppressWarnings("static-access")
   public CompBaseDatos(String pUsuario,String pContraseña,String pBaseDato)
   {
      this.usuario=pUsuario;
      this.contraseña=pContraseña;
      this.baseDato=pBaseDato;
      this.url="jdbc:mysql://localhost/"+pBaseDato;
   }
   
   // Para base de datos remota
   @SuppressWarnings("static-access")
   public CompBaseDatos(String pUsuario,String pContraseña,String pBaseDato,String pUrl)
   {
      this.usuario=pUsuario;
      this.contraseña=pContraseña;
      this.baseDato=pBaseDato;
      this.url=pUrl+pBaseDato;
   }
   
   /* Métodos */
   // Conectarse a la base de datos
   public Connection conectarBD()
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
         conn=DriverManager.getConnection(url,usuario,contraseña);
         System.out.println("Conexión satisfactoria con "+url);
      }
      catch(SQLException e)
      {
         System.out.println("No se conectó correctamente a "+url+"...");
      }
      return conn;
   }
   
   // Método de consulta de información en la base de datos
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
   
   // Método para ingresar, modificar o borrar información en una base de datos
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
   
   public void run()
   {
      this.conectarBD();
   }
}
