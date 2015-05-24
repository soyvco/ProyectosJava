package cronometro;
import javax.swing.JLabel;

public class TCronometro extends Thread
{
   Integer    horas    =0;
   Integer    minutos  =0;
   Integer    segundos =0;
   String     hr       ="";
   String     min      ="";
   String     seg      ="";
   JLabel     label;
   String     limite   ="";
   boolean    Activo   =true;
   static int flag     =0;
   
   public TCronometro(JLabel pLabel)
   {
      label=pLabel;
   }
   
   public void run()
   {
      try
      {
         while(Activo)
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
            if(horas<10)
            {
               hr="0"+horas;
            }
            else
            {
               hr=hr.toString();
            }
            if(minutos<10)
            {
               min="0"+minutos;
            }
            else
            {
               min=minutos.toString();
            }
            if(segundos<10)
            {
               seg="0"+segundos;
            }
            else
            {
               seg=segundos.toString();
            }
            label.setText(hr+":"+min+":"+seg);
         }
      }
      catch(InterruptedException e)
      {
         label.setText("00:00:00");
      }
   }
}
