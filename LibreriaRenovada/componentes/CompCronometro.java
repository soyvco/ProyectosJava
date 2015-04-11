package componentes;
import javax.swing.JLabel;

public class CompCronometro extends Thread
{
   Integer    minutos  =0;
   Integer    segundos =0;
   String     min      ="";
   String     seg      ="";
   JLabel     label;
   String     limite   ="";
   boolean    Activo   =true;
   static int flag     =0;
   
   public CompCronometro(JLabel pLabel,String pLimite)
   {
      label=pLabel;
      limite=pLimite;
   }
   
   public void setLabel(JLabel pLabel)
   {
      this.label=pLabel;
   }
   public String getTiempo()
   {
      String tiempo=label.getText();
      return tiempo;
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
            label.setText(min+":"+seg);
            if(limite.equals(min+":"+seg))
            {
               Activo=false;
            }
         }
      }
      catch(InterruptedException e)
      {
         label.setText("00:00");
      }
   }
}