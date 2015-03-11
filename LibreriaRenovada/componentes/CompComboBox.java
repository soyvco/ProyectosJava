package componentes;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JPanel;

@SuppressWarnings({"unchecked","rawtypes"})
public class CompComboBox extends JComboBox
{
   public CompComboBox(JPanel pPanel,String pUbicacion)
   {
      pPanel.add(this,pUbicacion);
   }
   
   public CompComboBox(JPanel pPanel,String pUbicacion,String[] pContenido)
   {
      pPanel.add(this,pUbicacion);
      for(int i=0; i<pContenido.length; i++)
      {
         this.addItem(pContenido[i]);
      }
   }
   public CompComboBox(JPanel pPanel,String pUbicacion,Vector<String> pContenido)
   {
      pPanel.add(this,pUbicacion);
      for(int i=0; i<pContenido.size(); i++)
      {
         this.addItem(pContenido.elementAt(i));
      }
   }
   
   public CompComboBox(JPanel pPanel,String pUbicacion,String pBD,String pTabla,String pCampos)
   {
      pPanel.add(this,pUbicacion);
   }
}
