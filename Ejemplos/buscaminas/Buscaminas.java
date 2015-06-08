package buscaminas;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

public class Buscaminas extends JFrame implements ActionListener
{
   private JButton    botones[][];
   private int        matrizMinas[][];
   private JTextField txtMinas        = new JTextField(3);
   private JTextField txtTiempo       = new JTextField(3);
   private JLabel     lMinas          = new JLabel("Minas restantes:");
   private JLabel     lTiempo         = new JLabel("Tiempo transcurrido:");
   private ImageIcon  imagenesMinas[] = new ImageIcon[12];
   private int dim;
   private int totalMinas;
   private int casillas;
   private Tiempo tp;
   
   Buscaminas(int pDim, int ptotalMinas)
   {
      dim = pDim;
      totalMinas = ptotalMinas;
      botones = new JButton[dim][dim];
      matrizMinas = new int[dim][dim];
      for(int i = 0; i < 12; i++)
         imagenesMinas[i] = new ImageIcon("imagenes/"+ i +".jpg");
      // Panel Superior
      JPanel panelSup = new JPanel();
      panelSup.add(lMinas);
      panelSup.add(txtMinas);
      panelSup.add(lTiempo);
      panelSup.add(txtTiempo);
      add(panelSup,"North");
      txtMinas.setEditable(false);
      txtTiempo.setEditable(false);
      txtMinas.setText(Integer.toString(casillas));
      // Panel de los botones
      JPanel panelMedio=new JPanel(new GridLayout(dim,dim));
      // Crear y colocar botones
      for(int i = 0; i < dim; i++)
         for(int j = 0; j<dim; j++)
         {
            // Crear boton
            botones[i][j] = new JButton();
            // Colocar en el panel
            panelMedio.add(botones[i][j]);
            // Action Listener
            botones[i][j].addActionListener(this);
         }
      this.add(panelMedio, "Center");
      colocarMinas(totalMinas);
      // Propiedades de la ventana
      // Comenzar Tiempo
      tp = new Tiempo(this);
      tp.start();
      setTitle("Buscaminas");
      setResizable(false);
      setSize(600,600);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
   
   private void colocarMinas(int minas)
   {
      for(int i=0; i < minas; i++)
      {
         // Coordenadas
         int x = 0;
         int y = 0;
         double x1 = 0;
         double y1 = 0;
         /**
          * Leyenda de matrizMinas 1 Existe Mina 0 No existe Mina
          */
         // Colocar mina aleatoria
         do
         {
            // Generar posiciones aleatorias
            x1 = Math.random()*dim;
            y1 = Math.random()*dim;
            x = (int)x1;
            y = (int)y1;
         }
         while(matrizMinas[x][y] !=0 );
         matrizMinas[x][y]=1; // poner mina
      }
      // Visualizar tablero de minas.
      for(int i = 0; i < dim; i++)
      {
         System.out.println("");
         for(int j = 0; j < dim; j++)
            System.out.print(" "+matrizMinas[i][j]);
      }
   }
   
   private void pulsarVacio(int i,int j)
   {
      // Al pulsar en una zona vacia
      casillas--;
      txtMinas.setText(Integer.toString(casillas));
      botones[i][j].setText(Integer.toString(minasCerca(i, j))); // Cuantas minas cerca
      if(casillas == 0)
         ganar();
   }
   
   private void volverEmpezar()
   {
      // Volver al estado inicial
      for(int i = 0; i < dim; i++)
         for(int j = 0; j < dim; j++)
         {
            matrizMinas[i][j]=0;
            botones[i][j].setText("");
            botones[i][j].setBackground(null);
            botones[i][j].setIcon(null);
         }
      colocarMinas(totalMinas);
      casillas = dim*dim - totalMinas;
      txtMinas.setText(Integer.toString(casillas));
      tp = new Tiempo(this);
      tp.start();
   }
   
   @SuppressWarnings("deprecation")
   private void ganar()
   {
      tp.stop(); // parar el tiempo
      JOptionPane.showMessageDialog(this,"Has ganado. Tu tiempo es de: " + txtTiempo.getText());
      volverEmpezar();
   }
   
   @SuppressWarnings("deprecation")
   private void boom()
   {
      // Al perder la partida
      tp.stop(); // parar el tiempo
      for(int i = 0; i<dim; i++)
         for(int j = 0; j<dim; j++)
         {
            if(matrizMinas[i][j] == 1)
            {
               Random rnd = new Random();
               int y = rnd.nextInt(12);
               botones[i][j].setIcon(imagenesMinas[y]);
            }
         }
      JOptionPane.showMessageDialog(this, "Boom!!! Has perdido.", "Mensaje", 
                                    JOptionPane.PLAIN_MESSAGE, new ImageIcon("imagenes/persona.png"));
      volverEmpezar();
   }
   
   /**
    * @param x : Coordenada filas y Coordenada columnas numeroMinas:<br>
    * devuelve el n�mero de minas de la posici�n
    */
   private int minasCerca(int x,int y)
   {
      int numeroMinas = 0;
      for(int i = y-1; i <= y+1; i++)
      {
         // En horizontal
         if(i> - 1 && i < dim)
            if(matrizMinas[x][i] == 1)
               numeroMinas++;
      }
      // En vertical
      for(int j = x-1; j <= x + 1; j++)
      {
         if(j > -1 && j < dim)
            if(matrizMinas[j][y] == 1)
               numeroMinas++;
      }
      // En diagonal
      // Posici�n de la esquina superior izquierda
      int x1 = x;
      int y1 = y;
      x1--;
      y1--;
      for(int i=x1; i<x1+3; i++)
      {
         if(i > -1 && i <dim && y1> -1 && y1 < dim)
            if(matrizMinas[i][y1] == 1)
               numeroMinas++;
         y1++;
      }
      // Posici�n de la esquina superior derecha
      x1 = x;
      y1 = y;
      x1--;
      y1++;
      for(int i = x1; i < x1+3; i++)
      {
         if(i > -1 && i < dim && y1 > -1 && y1 < dim)
            if(matrizMinas[i][y1] == 1)
               numeroMinas++;
         y1--;
      }
      return numeroMinas;
   }
   
   public void setTiempo(String pTiempo)
   {
      txtTiempo.setText(pTiempo);
   }

   public void actionPerformed(ActionEvent pE)
   {
      for(int i = 0; i < dim; i++)
         for(int j = 0;  j< dim; j++)
         {
            if(pE.getSource() == botones[i][j] && botones[i][j].getIcon() == null&&botones[i][j].getBackground() != Color.WHITE)
            {
               botones[i][j].setBackground(Color.WHITE);
               if(matrizMinas[i][j] == 1)
                  boom();
               else
                  pulsarVacio(i,j);
            }
         }
   }
}
