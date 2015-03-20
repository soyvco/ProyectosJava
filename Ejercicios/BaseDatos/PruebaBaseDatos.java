package BaseDatos;
import java.sql.ResultSet;
import java.sql.SQLException;
import componentes.CompBaseDatos;

public class PruebaBaseDatos
{
   public static void main(String[] args)
   {
      /*Creamos una instancia de la clase componente: usuario, contraseña y nombre de la base de datos*/
      CompBaseDatos bd=new CompBaseDatos("root","","prueba");
      /*Creamoos un variable de tipo resulset que nos devolverá los valores de las consultas*/
      ResultSet rs;
      /*Conectamos la base de datos*/
      bd.conectarBD();
      /*Creamos una tabla en la BD*/
      bd.setQuery("create table tablaPrueba(matricula varchar(8) not null, nombre varchar(20) not null, primary key(matricula))");
      /*Agregamos valores a la tabla*/
      bd.setQuery("insert into tablaPrueba(matricula,nombre) values('13301056','Victor')");
      bd.setQuery("insert into tablaPrueba(matricula,nombre) values('13301057','Joksan')");
      /*Hacemos una consulta*/
      rs=bd.getQuery("select * from tablaPrueba");
      try
      {
         System.out.println("Matricula\tNombre\n");
         while(rs.next())
         {
            /*Mostramos los valores de la consulta*/
            System.out.println(rs.getString("matricula")+"\t"+rs.getString("nombre"));
         }
      }
      catch(SQLException e)
      {
         e.printStackTrace();
      }
   }
}