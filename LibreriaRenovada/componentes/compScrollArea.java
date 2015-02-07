package componentes;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class compScrollArea extends JScrollPane
{
   private JTextArea aArea;
   
   // Constructores
   public compScrollArea(JPanel pPanel,boolean pEditable,int pX,int pY,int pAncho,int pLargo)
   {
      aArea.setEditable(pEditable);
      this.setViewportView(aArea);
      this.setBounds(pX,pY,pAncho,pLargo);
      pPanel.add(this);
   }
   
   public compScrollArea(JPanel pPanel,boolean pEditable)
   {
      aArea.setEditable(pEditable);
      this.setViewportView(aArea);
   }
   
   // Método para obtener el textArea y usar sus métodos.
   public JTextArea getArea()
   {
      return aArea;
   }
}
