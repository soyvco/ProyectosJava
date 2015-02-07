package componentes;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class compHoraFecha
{
   Date d =new Date();
   
   
   public String getHora()
   {
      // Caso 1: obtener la hora y salida por pantalla con formato:
      DateFormat hourFormat=new SimpleDateFormat("HH:mm:ss");
      return hourFormat.format(d);
   }
   
   public String getFecha()
   {
      // Caso 2: obtener la fecha y salida por pantalla con formato:
      DateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
      return dateFormat.format(d);
   }
   public String getFechaHora()
   {
      // Caso 3: obtenerhora y fecha y salida por pantalla con formato:
      DateFormat hourdateFormat=new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
      return "Hora y fecha: "+hourdateFormat.format(d);
   }
}
