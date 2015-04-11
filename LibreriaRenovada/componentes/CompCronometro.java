package componentes;
import javax.swing.JLabel;

public class CompCronometro extends Thread
{
   Integer    minutos   =0;
   Integer    segundos  =0;
   Integer    milesimas =0;
   String     min       ="";
   String     seg       ="";
   String     mil       ="";
   JLabel     label;
   boolean    Activo;
   static int flag      =0;
   
   public void setLabel(JLabel pLabel)
   {
      this.label=pLabel;
   }
   
   @SuppressWarnings("deprecation")
   public void activarCronometro()
   {
      if(flag==0)
      {
         flag=1;
         this.Activo=true;
         this.start();
      }
      else if(flag==2)
      {
         flag=1;
         this.Activo=true;
         this.resume();
      }
   }
   
   @SuppressWarnings("deprecation")
   public void pararCronometro()
   {
      if(flag==1)
      {
         flag=2;
         this.Activo=false;
         this.suspend();
      }
   }
   
   @SuppressWarnings("deprecation")
   public void reiniciarCronometro()
   {
      if(flag==1||flag==2)
      {
         flag=0;
         this.Activo=false;
         this.stop();
         label.setText("00:00:000");
      }
   }
   
   public void run()
   {
      try
      {
         while(Activo==true)
         {
            Thread.sleep(4);
            milesimas+=4;
            if(milesimas==1000)
            {
               milesimas=0;
               segundos++;
               if(segundos==60)
               {
                  segundos=0;
                  minutos++;
               }
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
            if(milesimas<10)
            {
               mil="00"+milesimas;
            }
            else if(milesimas<100)
            {
               mil="0"+milesimas;
            }
            else
            {
               mil=milesimas.toString();
            }
            label.setText(min+":"+seg+":"+mil);
         }
      }
      catch(InterruptedException e)
      {
         label.setText("00:00:000");
      }
   }
}