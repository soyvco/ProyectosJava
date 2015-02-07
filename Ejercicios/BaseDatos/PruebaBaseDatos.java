package BaseDatos;




import java.sql.ResultSet;
import java.sql.SQLException;
import componentes.CompBaseDatos;

public class PruebaBaseDatos
{
   public static void main(String[] args)
   {
      CompBaseDatos conexion=new CompBaseDatos(); //Instancio mi clase que me permite conectar a la base de dato
      ResultSet rs;
      String matricula,nombres,aP,aM,edad,carrera,domicilio; //Aquí almacenaré la información de las columnas de mi BD
      
      conexion.conexion(); //Me conecté a mi base de datos
      rs=conexion.getQuery("select * from alumnos"); //Uso el metodo para traer datos... de mi tabla "alumnos"...
      try
      {
         while(rs.next()) //Este while les dará los datos siempre y cuando no quede un reglon en blanco(ultimo reglon)
         {
            matricula=rs.getString("matricula");//Instancio mis variables con un getString para tener los datos de mi columna "matricula" 
            nombres=rs.getString("nombre");//Esta será de mi columna "nombre"... sólo cambien sus columnas
            aP=rs.getString("apePaterno");
            aM=rs.getString("apeMaterno");
            edad=rs.getString("edad");
            carrera=rs.getString("carrera");
            domicilio=rs.getString("domicilio");
            
            //Las devuelvo en sysos para ver los resultados...
            System.out.print("Matricula: "+matricula+" "); 
            System.out.print("Nombre: "+nombres+" ");
            System.out.print("Apellido Paterno: "+aP+" ");
            System.out.print("Apellido Materno: "+aM+" ");
            System.out.print("Edad: "+edad+" ");
            System.out.print("Carrera: "+carrera+" ");
            System.out.print("Domicilio: "+domicilio+" \n");
         }
      }
      catch(SQLException e) //Si algo sale mal aquí el error...
      {
         e.printStackTrace();
      }      
   }
}