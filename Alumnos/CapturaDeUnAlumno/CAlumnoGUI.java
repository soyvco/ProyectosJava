package CapturaDeUnAlumno;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import utilerias.CArchivosEscritor;
import utilerias.CArchivosLector;
import utilerias.ETipo;
import componentes.CompBaseDatos;
import componentes.CompBoton;
import componentes.CompCapturaCampo;
import componentes.CompVentana;

public class CAlumnoGUI extends CompVentana
{
   private CompCapturaCampo tCarrera,tNombre,tApePaterno,tApeMaterno,tEdad,
                            tMatricula,tDomicilio;
   private CompBoton        bImprimir,bSalir,bLimpiar,bGuardar,bMostrar,
                            bBorrar,bAbrir,bTmp,bEliminarRegistro,
                            bPublicar,bRellenarDeBD,bActualizaBD;
   private CompBaseDatos       conexion;
   
   public CAlumnoGUI()
   {
      super("Alumnos",false,50,60,1000,400);
   }
   
   protected void crearContenido()
   {
      pContenido.setLayout(new BoxLayout(pContenido,BoxLayout.Y_AXIS));
      tMatricula=new CompCapturaCampo(pContenido," Matricula:");
      tNombre=new CompCapturaCampo(pContenido," Nombre:");
      tApePaterno=new CompCapturaCampo(pContenido," Apellido Paterno:");
      tApeMaterno=new CompCapturaCampo(pContenido," Apellido Materno:");
      tEdad=new CompCapturaCampo(pContenido," Edad:");
      tCarrera=new CompCapturaCampo(pContenido," Carrera:");
      tDomicilio=new CompCapturaCampo(pContenido,"Domicilio:");
      JScrollPane scroll=new JScrollPane(pDerecha);
      pContenido.add(scroll);
      pDerecha.setLayout(new GridLayout(3,5));
      bGuardar=new CompBoton(pDerecha,"Guardar",this);
      bRellenarDeBD=new CompBoton(pDerecha,"Rellener desde la base de datos",this);
      bEliminarRegistro=new CompBoton(pDerecha,"Eliminar estudiante",this);
      bAbrir=new CompBoton(pDerecha,"Abrir documento",this);
      bImprimir=new CompBoton(pDerecha,"Imprimir",this);
      bActualizaBD=new CompBoton(pDerecha,"Actualizar base de datos",this);
      bBorrar=new CompBoton(pDerecha,"Borrar archivo",this);
      bTmp=new CompBoton(pDerecha,"Crear archivo temporal",this);
      bMostrar=new CompBoton(pDerecha,"Mostrar",this);
      bPublicar=new CompBoton(pDerecha,"Publicar en la Web",this);
      bLimpiar=new CompBoton(pDerecha,"Limpiar",this);
      bSalir=new CompBoton(pDerecha,"Salir",this);
   }
   
   public String toString()
   {
      String texto="Número de control: "+tMatricula.getText()+"\n"+
            "Nombre: "+tNombre.getText()+"\n"+
            "Apellido Paterno: "+tApePaterno.getText()+"\n"+
            "Apellido Materno: "+tApeMaterno.getText()+"\n"+
            "Edad: "+tEdad.getText()+"\n"+
            "carrera: "+tCarrera.getText()+"\n"+
            "Domicilio: "+tDomicilio.getText();
      return texto;
   }
   
   public void imprimir()
   {
      JOptionPane.showMessageDialog(null,toString());
   }
   
   public String toString1()
   {
      String texto=String.format("%s|%s|%s|%s|%s|%s|%s\r\n",
            tMatricula.getText(),
            tNombre.getText(),
            tApePaterno.getText(),
            tApeMaterno.getText(),
            tCarrera.getText(),
            tEdad.getText(),
            tDomicilio.getText());
      return texto;
   }
   
   public void actionPerformed(ActionEvent pE)
   {
      if(pE.getSource().equals(bImprimir))
      {
         imprimir();
      }
      else if(pE.getSource().equals(bSalir))
      {
         dispose();
      }
      else if(pE.getSource().equals(bLimpiar))
      {
         tMatricula.setText("");
         tNombre.setText("");
         tApePaterno.setText("");
         tApeMaterno.setText("");
         tEdad.setText("");
         tCarrera.setText("");
         tDomicilio.setText("");
      }
      else if(pE.getSource().equals(bGuardar))
      {
         CArchivosEscritor escritor=new CArchivosEscritor("alumnos.txt",ETipo.AGREGAR);
         if(escritor.crear())
         {
            escritor.escritorLinea(toString1());
            escritor.cerrar();
         }
         //JOptionPane.showMessageDialog(null,"Se ha guardado exitosamente en el documento alumno.txt");
         String matricula,nombre,aP,aM,edad,carrera,domicilio;
         matricula=tMatricula.getText();
         nombre=tNombre.getText();
         aP=tApePaterno.getText();
         aM=tApeMaterno.getText();
         edad=tEdad.getText();
         carrera=tCarrera.getText();
         domicilio=tDomicilio.getText();
         conexion=new CompBaseDatos();
         java.sql.Connection reg=conexion.conexion();
         String sql="insert into alumnos(matricula,nombre,apepaterno,apematerno,edad,carrera,domicilio)"+
               "value('"+matricula+"',"+"'"+nombre+"',"+"'"+aP+"',"+"'"+aM+"',"+"'"+edad+"',"+"'"+carrera+"',"+"'"+domicilio+"');";
         try
         {
            java.sql.PreparedStatement pst=reg.prepareStatement(sql);
            int n=pst.executeUpdate();
            if(n>0)
            {
               JOptionPane.showMessageDialog(null,"Registrado en la base de datos y en un archivo .txt");
            }
            else JOptionPane.showMessageDialog(null,"No se pudo guardar correctamente");
         }
         catch(SQLException e)
         {
            Logger.getLogger(sql);
         }
      }
      else if(pE.getSource().equals(bMostrar))
      {
         CArchivosLector lector=new CArchivosLector("alumnos.txt");
         lector.mostrar();
      }
      else if(pE.getSource().equals(bBorrar))
      {
         CArchivosEscritor escritor=new CArchivosEscritor("alumnos.txt",ETipo.SOBREESCRIBIR);
         if(escritor.crear())
         {
            escritor.cerrar();
         }
      }
      else if(pE.getSource().equals(bAbrir))
      {
         String nombre;
         nombre=JOptionPane.showInputDialog(null,"Ingrese nombre del documento, extensión .txt o .tmp:");
         CArchivosLector openSource=new CArchivosLector(nombre);
         openSource.mostrar();
      }
      else if(pE.getSource().equals(bTmp))
      {
         CArchivosEscritor escritor=new CArchivosEscritor("alumnos.tmp",ETipo.AGREGAR);
         if(escritor.crear())
         {
            escritor.escritorLinea(toString1());
            escritor.cerrar();
         }
      }
      else if(pE.getSource().equals(bEliminarRegistro))
      {
         CArchivosLector lector=new CArchivosLector("alumnos.txt");
         if(lector.abrir())
         {
            lector.copiarA("alumnos.tmp");
            lector.cerrar();
         }
         lector=new CArchivosLector("alumnos.tmp");
         if(lector.abrir())
         {
            CArchivosEscritor escritor=new CArchivosEscritor("alumnos.txt",ETipo.SOBREESCRIBIR);
            if(escritor.crear())
            {
               String matricula=JOptionPane.showInputDialog(null,"Ingrese matricula");
               String linea="";
               conexion=new CompBaseDatos();
               conexion.conexion();
               conexion.setQuery("delete from alumnos where matricula='"+matricula+"';");
               while((linea=lector.lectorLinea())!=null)
               {
                  String[] cadenas=linea.replace("|","%").split("%");
                  if(!cadenas[0].toLowerCase().startsWith(matricula.toLowerCase()))
                  {
                     escritor.escritorLinea(linea,true);
                  }
               }
               escritor.cerrar();
            }
         }
         lector.cerrar();
      }
      else if(pE.getSource().equals(bPublicar))
      {
         {
            String cabeza="<!DOCTYPE html>\n"+
                  "<html lang='es'>\n"+
                  "    <head>\n"+
                  "        <meta charset='utf-8'>\n"+
                  "        <link rel='stylesheet' href='stylesheet.css'>\n"+
                  "        <title>Registro en Linea de los Alumnos</title>\n"+
                  "    </head>\n"+
                  "    <body>\n"+
                  "        <div id='contenido'>\n"+
                  "            <header>\n"+
                  "                <hgroup>\n"+
                  "                    <h1>Registro de alumnos del ITVH en línea</h1>\n"+
                  "                </hgroup>\n"+
                  "                <marquee>Bienvenido Usuario</marquee>\n"+
                  "                <nav>\n"+
                  "                    <ul>\n"+
                  "                        <li><a href='index.html'>Inicio</a></li>\n"+
                  "                        <li><a href='tutoriales.html'>Instalar XAMPP</a></li>\n"+
                  "                        <li><a href='http://itvillahermosa.edu.mx'>Página ITVH</a></li>\n"+
                  "                        <li><a href='http://cc.itvillahermosa.edu.mx/sys/sie.php'>SIE</a></li>\n"+
                  "                        <li><a href='contacto.html'>Contacto</a></li>\n"+
                  "                    </ul>\n"+
                  "                </nav>\n"+
                  "            </header>\n"+
                  "            <section>\n"+
                  "                <div id='txtPrincipal'>\n"+
                  "                    <article id='tablas'>\n"+
                  "                        <h1>Lista de alumnos del ITVH</h1>\n"+
                  "                        <table>\n";
            String pie="                        </table>\n"+
                  "                    </article>\n"+
                  "          </section>\n"+
                  "        </div>\n"+
                  "        <footer>Hecho por Víctor Jesús Romero Pérez | 2014 |</footer>\n"+
                  "    </body>\n"+
                  "</html>\n";
            String cuerpo="";
            String columnas="<tr><th>Matricula</th><th>Nombre</th><th>Apellido Paterno</th><th>Apellido Materno</th><th>Edad</th><th>Carrera</th><th>Domicilio</th></tr>\n";
            CArchivosLector lector=new CArchivosLector("alumnos.txt");
            if(lector.abrir())
            {
               CArchivosEscritor escritor=new CArchivosEscritor("index.html",ETipo.SOBREESCRIBIR);
               if(escritor.crear())
               {
                  String linea="";
                  while((linea=lector.lectorLinea())!=null)
                  {
                     cuerpo+="<tr>";
                     String[] cadenas=linea.replace("|","%").split("%");
                     for(String campo: cadenas)
                        cuerpo+="<td>"+campo+"</td>";
                     cuerpo+="</tr>\n";
                  }
                  escritor.escritorLinea(cabeza+columnas+cuerpo+pie);
                  escritor.cerrar();
                  escritor.mostrar();
               }
            }
            lector.cerrar();
         }
      }
      else if(pE.getSource().equals(bRellenarDeBD))
      {
         String nombre,aP,aM,edad,carrera,domicilio;
         ResultSet rs;
         conexion=new CompBaseDatos();
         conexion.conexion();
         String matricula=JOptionPane.showInputDialog("Matricula:");
         rs=conexion.getQuery("select*from alumnos where matricula='"+matricula+"';");
         try
         {
            while(rs.next())
            {
               matricula=rs.getString("matricula");
               nombre=rs.getString("nombre");
               aP=rs.getString("apePaterno");
               aM=rs.getString("apeMaterno");
               edad=rs.getString("edad");
               carrera=rs.getString("carrera");
               domicilio=rs.getString("domicilio");
               tMatricula.setText(matricula);
               tNombre.setText(nombre);
               tApePaterno.setText(aP);
               tApeMaterno.setText(aM);
               tEdad.setText(edad);
               tCarrera.setText(carrera);
               tDomicilio.setText(domicilio);
            }
         }
         catch(SQLException e)
         {
            e.printStackTrace();
         }
      }
      else if(pE.getSource().equals(bActualizaBD))
      {
         conexion=new CompBaseDatos();
         conexion.conexion();
         String matricula=JOptionPane.showInputDialog("Matricula:");
         String update=JOptionPane.showInputDialog(
               "Ingrese las columnas que desea modificar:\n columna1='nuevoValor', columna2='nuevoValor', columnaN='nuevoValor'");
         conexion.setQuery("update alumnos set "+update+" where matricula='"+matricula+"';");
      }
   }
}