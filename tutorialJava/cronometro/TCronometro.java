package cronometro;
import javax.swing.JLabel;

public class TCronometro extends Thread
{
   private Integer   horas    =0;
   private Integer   minutos  =0;
   private Integer   segundos =0;
   private String    hr       ="";
   private String    min      ="";
   private String    seg      ="";
   private JLabel    label;
   public String     limite   ="";
   private boolean   activo   =true;
   public static int flag     =0;
   
   public TCronometro(JLabel pLabel)
   {
      label=pLabel;
   }
   
   public void run()
   {
      String formatoTiempo;
      try
      {
         while(activo)
         {
            sleep(1000);
            segundos++;
            if(segundos==60)
            {
               segundos=0;
               minutos++;
            }
            if(minutos==60)
            {
               minutos=0;
               horas++;
            }
            hr=horas<10?"0"+horas: hr.toString();
            min=minutos<10?"0"+minutos: minutos.toString();
            seg=segundos<10?"0"+segundos: segundos.toString();
            formatoTiempo=String.format("%s:%s:%s",hr,min,seg);
            label.setText(formatoTiempo);
         }
      }
      catch(InterruptedException e)
      {
         label.setText("00:00:00");
      }
   }
}
