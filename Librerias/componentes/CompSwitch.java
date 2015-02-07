package componentes;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CompSwitch extends JPanel implements ActionListener
{
   private JLabel  lEtiqueta;
   private JButton bBoton;
   private boolean isEncendido;
   
   public CompSwitch(JPanel pPanel,boolean pIsEncendido,ActionListener pAccion)
   {
      isEncendido=pIsEncendido;
      lEtiqueta=new JLabel(isEncendido?"ON": "OFF");
      bBoton=new JButton();
      bBoton.setBackground(isEncendido?Color.GREEN: Color.RED);
      bBoton.addActionListener(this);
      bBoton.addActionListener(pAccion);
      this.setLayout(new BorderLayout());
      this.add(bBoton,BorderLayout.CENTER);
      this.add(lEtiqueta,isEncendido?BorderLayout.WEST: BorderLayout.EAST);
      if(pPanel!=null) pPanel.add(this); // !=diferente de
   }
   
   @Override
   public void actionPerformed(ActionEvent pArg0)
   {
      isEncendido=!isEncendido; // =!negacion de
      lEtiqueta.setText(isEncendido?"On": "Off");
      this.add(lEtiqueta,isEncendido?BorderLayout.WEST: BorderLayout.EAST);
      bBoton.setBackground(isEncendido?Color.GREEN: Color.RED);
   }
}