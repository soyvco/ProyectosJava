package CapturaDeUnAlumno;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import componentes.CompBoton;
import componentes.CompCapturaArea;
import componentes.CompCapturaCampo;
import componentes.CompJoy;
import componentes.CompSwitch;
import componentes.CompVentana;



public class CMateriasGUI extends CompVentana
{
   private CompCapturaCampo  tCreditos;
   private CompCapturaCampo  tHorasPracticas;
   private CompCapturaCampo  tHorasTeoricas;
   private CompCapturaArea   tCarrera;
   private CompBoton         bImprimir,bSalir, bLimpiar, bBoton;
   private CompSwitch        bEncendido;
   private CompJoy           bJoy;
   
   public CMateriasGUI()
   {
      super("Materias",false,50,60,900,500);
   }
   
   protected void crearContenido()
   {
      //SE AGREGó
      CompCapturaCampo.TAM_ETIQUETA=.2;
      CompCapturaCampo.TAM_CAMPO=.6;
      //FIN
      pContenido.setLayout(new BoxLayout(pContenido,BoxLayout.Y_AXIS));
      tCreditos       =new CompCapturaCampo(pContenido,"Créditos:");
      tHorasTeoricas  =new CompCapturaCampo(pContenido,"Horas Teóricas:");
      tHorasPracticas =new CompCapturaCampo(pContenido,"Horas Prácticas:");
      tCarrera        =new CompCapturaArea(pContenido,"Carrera:");
      pPie.setLayout(new GridLayout(1,5));
                              //Se modificó de "PContenido" a ----> "Pie"
      bImprimir    =new CompBoton(pPie, "Imprimir",this); 
      bImprimir.setBackground(Color.CYAN);
      bSalir       =new CompBoton(pPie, "Salir",this) ;
      bSalir.setBackground(Color.GREEN);
      bLimpiar = new CompBoton(pPie, "Limpiar",this);
      bLimpiar.setBackground(Color.PINK);
      bEncendido=new CompSwitch(pPie,true,this);
      bJoy=new CompJoy(pPie,bJoy);
                                      
   }
                 
     
   public String toString()
   {
      String texto="Nombre: "          + tCreditos      .getText()+"\n"+
                   "Apellido Paterno: "+ tHorasTeoricas  .getText()+"\n"+
                   "Apellido Materno: "+ tHorasPracticas  .getText()+"\n"+
                   "Domicilio: "       + tCarrera   .getText();
     return texto;
   }
   
   public void imprimir()
   {
      JOptionPane.showMessageDialog(null,toString());
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
         tCreditos.setText("");
         tHorasTeoricas.setText("");
         tHorasPracticas.setText("");
         tCarrera.setText("");
      }
      else if(pE.getSource().equals(bEncendido))
      {
         dispose();
      }
      else if(pE.getSource().equals(bJoy))
      {
         dispose();
      }
      else if(pE.getSource().equals(bBoton))
      {
         dispose();  
      }
   }
}