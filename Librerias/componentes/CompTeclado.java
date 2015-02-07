package componentes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

public class CompTeclado extends JPanel implements ActionListener
{
   private String[]     etiquetas ={"7","8","9","4","5","6","1","2","3","0",".","A  C"};
   private String[]     posicion  ={"cell 0 0","cell 1 0","cell 2 0","cell 0 1","cell 1 1","cell 2 1","cell 0 2","cell 1 2","cell 2 2","cell 0 3","cell 1 3","cell 2 3"};
   private CompBoton2[] bNumeros  =new CompBoton2[etiquetas.length];
   
   public CompTeclado(JPanel pPanel,ActionListener pAccion)
   {
      this.setLayout(new MigLayout("","[100px,grow,fill][100px,grow,fill][100px,grow][100px,grow,fill]","[40px,grow,fill][40px,grow,fill][40px,grow,fill][40px,grow,fill]"));
      for(int i=0; i<bNumeros.length; i++)
         bNumeros[i]=new CompBoton2(this,etiquetas[i],pAccion,posicion[i]);
      pPanel.add(this);
      setLayout(new MigLayout("", "[]", "[]"));
   }
   
   public void actionPerformed(ActionEvent e)
   {
   }
}