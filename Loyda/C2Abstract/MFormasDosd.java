package C2Abstract;

import javax.swing.JOptionPane;

public class MFormasDosd
{
   public void main()
   {
      CFormasDosd[] formas=new CFormasDosd[5];
      formas[0]=new triang("recto",8.0,12.0,0);
      formas[1]=new rectang(10);
      formas[2]=new rectang(10,4,0);
      formas[3]=new triang(7.0);
      formas[4]=new circ(8);
      for(int i=00; i<formas.length; i++)
      {
         JOptionPane.showMessageDialog(null,"El objeto es "+formas[i].obtenerNombre()+"\n");
         JOptionPane.showMessageDialog(null,"El área es   "+formas[i].area()+"\n");
      }
   }
}
