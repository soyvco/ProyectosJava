package buscaminas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.LayoutStyle;

public class Splash extends JPanel
{
   private ImageIcon    imagen;  
   private JLabel       estados;
   private JProgressBar progreso;
   
   public Splash()
   {
      crearContenido();
      estados.setForeground(Color.RED);
      imagen = new ImageIcon("multimedia/splash.png"); 
      setSize(imagen.getIconWidth(), imagen.getIconHeight());
   }
   
   @Override
   public void paintComponent(Graphics g)
   { 
      super.paintComponent(g); 
      g.drawImage(imagen.getImage(), 0, 0, imagen.getIconWidth(), imagen.getIconHeight(),this);
   }
   
   public void velocidadDeCarga() throws InterruptedException
   { 
      for(int i=0; i<= 100; i++)
      { 
         Thread.sleep(40); 
         progreso.setForeground(Color.GREEN); 
         progreso.setValue(i); 
         if(i == 40)
            estados.setText("Cargando elementos");
         if(i == 70)
            estados.setText("Estableciendo parametros");
      }
   }
   
   private void crearContenido()
   {
      progreso = new JProgressBar();
      estados = new JLabel();
      estados.setText("Cargando modulos");
      GroupLayout layout= new GroupLayout(this);
      setLayout(layout);
      layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                  .addComponent(progreso, GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                  .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(estados)
                        .addContainerGap())
            );
      layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,layout.createSequentialGroup()
                        .addGap(0,294,Short.MAX_VALUE)
                        .addComponent(estados)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(progreso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
            );
   }
}
