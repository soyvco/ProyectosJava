package utilerias;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import javax.swing.JOptionPane;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class CPDFEscritor
{
   private String   nombre;
   private Document document;
   
   public CPDFEscritor(String pNombre)
   {
      nombre=pNombre;
      crear();
   }
   
   public void crear()
   {
      document=new Document();
      try
      {
         PdfWriter.getInstance(document,new FileOutputStream(new File(nombre)));
      }
      catch(DocumentException e)
      {
         JOptionPane.showMessageDialog(null,"Error al crear PDF: "+nombre);
      }
      catch(FileNotFoundException e)
      {
         e.printStackTrace();
      }
      document.open();
   }
   
   public void mostrar(String pNombre)
   {
      try
      {
         Desktop.getDesktop().open(new File(pNombre));
      }
      catch(Exception e)
      {
         JOptionPane.showMessageDialog(null,"No se puede mostrar el archivo: "+nombre);
      }
   }
   
   public void cerrar()
   {
      document.close();
   }
   
   public void añadir(String Parrafo,String fontname,float size,int style,BaseColor color,int formato)
   {
      try
      {
         Paragraph texto=new Paragraph(Parrafo,FontFactory.getFont(fontname,size,style,color));
         texto.setAlignment(formato);
         document.add(texto);
      }
      catch(DocumentException e)
      {
         JOptionPane.showMessageDialog(null,"Error al añadir parrafo");
      }
   }
   
   /*
    * public void añadir(String parrafo) { try { document.add(new
    * Paragraph(parrafo)); } catch(DocumentException e) {
    * JOptionPane.showMessageDialog(null,"Error al añadir parrafo"); } }
    */
   public void añadirImagen(String Imagen,int ancho,int largo) throws MalformedURLException,IOException
   {
      try
      {
         Image foto=Image.getInstance(Imagen);
         foto.scaleToFit(ancho,largo);
         foto.setAlignment(Chunk.ALIGN_MIDDLE);
         document.add(foto);
      }
      catch(DocumentException e)
      {
         JOptionPane.showMessageDialog(null,"Error al añadir imagen");
      }
      catch(MalformedURLException e)
      {
         JOptionPane.showMessageDialog(null,"ruta incorrecta");
      }
   }
   
   // INSERTAR TABLA
   public void crearTabla(int columnas,int celdas,String texto)
   {
      PdfPTable tabla=new PdfPTable(columnas);
      for(int i=0; i<celdas; i++)
      {
         tabla.addCell(texto);
      }
      try
      {
         document.add(tabla);
      }
      catch(DocumentException e)
      {
         e.printStackTrace();
      }
   }
}
