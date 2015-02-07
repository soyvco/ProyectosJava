package BalanzaComprobacion;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class CuentaT extends JFrame
{
   private static Vector<CompCuenta> cuentas =new Vector<>();
   private JPanel                    contentPane;
   private JPanel                    pCuentas;
   private CuentaT                   T;
 
   public CuentaT()
   {
      T=this;
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(520,250,600,350);
      contentPane=new JPanel();
      setContentPane(contentPane);
      contentPane.setLayout(new BorderLayout());
      pCuentas=new JPanel(new FlowLayout());
      JScrollPane scroll=new JScrollPane(pCuentas);
      contentPane.add(scroll,BorderLayout.CENTER);
      JPanel Opc=new JPanel((new GridLayout(4,1,0,0)));
      contentPane.add(Opc,BorderLayout.WEST);
      JButton btnNuevo=new JButton("Nuevo");
      btnNuevo.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            String nom=JOptionPane.showInputDialog("Nombre de la cuenta:");
            int db=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de debes en la cuenta: "+nom));
            int hb=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de haberes en la cuenta: "+nom));
            CompCuenta cc=new CompCuenta(nom,db,hb);
            cc.setSize(300,50*Math.max(db,hb));
            pCuentas.add(cc);
            cuentas.add(cc);
            T.setSize(T.getWidth(),T.getHeight()+1);
         }
      });
      btnNuevo.setBounds(0,11,89,23);
      Opc.add(btnNuevo);
      JButton btnLimpiar=new JButton("Limpiar");
      btnLimpiar.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            cuentas=new Vector<>();
            pCuentas.removeAll();
            T.setSize(Math.max(T.getWidth()-1,600),Math.max(T.getHeight()-1,350));
         }
      });
      Opc.add(btnLimpiar);
      JButton btnSalir=new JButton("Salir");
      btnSalir.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            dispose();
         }
      });
      JButton btnCapturarDatos=new JButton("Ver Balanza de comprobación");
      btnCapturarDatos.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) 
         {
          Balanza a=new Balanza(); a.setVisible(true);
         }
      });
      Opc.add(btnCapturarDatos);
      Opc.add(btnSalir);
   }
}