package componentes;
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
import com.mysql.jdbc.Connection;

public class compBaseDatos
{
   // Variables necesarias para conectarse a cualqueier base de datos
   private String     usuario;
   private String     contraseña;
   private String     baseDato;
   private String     url ="jdbc:mysql://localhost/"+baseDato;
   // La variable conn nos devolverla la conexion a la base de datos
   private Connection conn;
   
   /* Contructores */
   // Para base de datos local
   public compBaseDatos(String pUsuario,String pContraseña,String pBaseDato)
   {
      this.usuario=pUsuario;
      this.contraseña=pContraseña;
      this.baseDato=pBaseDato;
      this.url+=pBaseDato;
   }
   
   // Para base de datos remota
   public compBaseDatos(String pUsuario,String pContraseña,String pBaseDato,String pUrl)
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
            Class.forName("com.mysql.jbdc.Driver");
         }
         catch(ClassNotFoundException e)
         {
            e.printStackTrace();
         }
         conn=(Connection)DriverManager.getConnection(url,usuario,contraseña);
         System.out.println("Se conecto correctamente a:\n"+url);
      }
      catch(SQLException e)
      {
         // e.printStackTrace();
         System.out.println("Ocurrió un erro al conectar en:\n"+url);
      }
      return conn;
   }
   //Método de consulta de información en la base de datos
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
   //Método para ingresar, modificar o borrar información en una base de datos
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
