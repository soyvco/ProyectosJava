package BalanzaComprobacion;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

public class CompBalanza extends JPanel
{
   private JLabel[] No,Cuenta,Debe,Haber,Deudor,Acreedor;
   private JLabel   lblGnom,lblGped,lblTDe,lblTHa,lblTDeud,lblTAcre;
   private JPanel   Encabezado,pCuerpo,pPie;
   
   public CompBalanza()
   {
      this("Chedraui","19 de febrero del 2014",1);
   }
   
   public CompBalanza(String pNombre,String pPeriodo,int pNo)
   {
      setLayout(new BorderLayout(0,0));
      Encabezado=new JPanel();
      add(Encabezado,BorderLayout.NORTH);
      GridBagLayout gbl_Encabezado=new GridBagLayout();
      gbl_Encabezado.rowHeights=new int[]{0};
      gbl_Encabezado.columnWidths=new int[]{30,30,30,30,30,30,30,30,30,30,30,30,30,30,0,30,30,0,0,30,30,30,30,30,30,30,30,30,30,30,0,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,0};
      gbl_Encabezado.columnWeights=new double[]{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};
      gbl_Encabezado.rowWeights=new double[]{0.0,0.0,0.0,0.0,0.0};
      Encabezado.setLayout(gbl_Encabezado);
      JLabel lblBalanzaDeComprobacin=new JLabel("Balanza de comprobación");
      GridBagConstraints gbc_lblBalanzaDeComprobacin=new GridBagConstraints();
      gbc_lblBalanzaDeComprobacin.gridwidth=14;
      gbc_lblBalanzaDeComprobacin.insets=new Insets(0,0,5,5);
      gbc_lblBalanzaDeComprobacin.gridx=16;
      gbc_lblBalanzaDeComprobacin.gridy=0;
      Encabezado.add(lblBalanzaDeComprobacin,gbc_lblBalanzaDeComprobacin);
      JLabel lblNombre=new JLabel("Nombre:");
      GridBagConstraints gbc_lblNombre=new GridBagConstraints();
      gbc_lblNombre.insets=new Insets(0,0,5,5);
      gbc_lblNombre.gridx=18;
      gbc_lblNombre.gridy=1;
      Encabezado.add(lblNombre,gbc_lblNombre);
      lblGnom=new JLabel(pNombre);
      lblGnom.setFont(new Font("Dialog",Font.PLAIN,12));
      GridBagConstraints gbc_lblGnom=new GridBagConstraints();
      gbc_lblGnom.gridwidth=12;
      gbc_lblGnom.insets=new Insets(0,0,5,5);
      gbc_lblGnom.gridx=20;
      gbc_lblGnom.gridy=1;
      Encabezado.add(lblGnom,gbc_lblGnom);
      JLabel lblPeriodo=new JLabel("Periodo:");
      GridBagConstraints gbc_lblPeriodo=new GridBagConstraints();
      gbc_lblPeriodo.insets=new Insets(0,0,5,5);
      gbc_lblPeriodo.gridx=18;
      gbc_lblPeriodo.gridy=2;
      Encabezado.add(lblPeriodo,gbc_lblPeriodo);
      lblGped=new JLabel(pPeriodo);
      lblGped.setFont(new Font("Dialog",Font.PLAIN,12));
      GridBagConstraints gbc_lblGped=new GridBagConstraints();
      gbc_lblGped.gridwidth=13;
      gbc_lblGped.insets=new Insets(0,0,5,5);
      gbc_lblGped.gridx=19;
      gbc_lblGped.gridy=2;
      Encabezado.add(lblGped,gbc_lblGped);
      JLabel lblMovimientos=new JLabel("Movimientos");
      GridBagConstraints gbc_lblMovimientos=new GridBagConstraints();
      gbc_lblMovimientos.gridwidth=6;
      gbc_lblMovimientos.insets=new Insets(0,0,5,5);
      gbc_lblMovimientos.gridx=21;
      gbc_lblMovimientos.gridy=3;
      Encabezado.add(lblMovimientos,gbc_lblMovimientos);
      JLabel lblSaldos=new JLabel("Saldos");
      GridBagConstraints gbc_lblSaldos=new GridBagConstraints();
      gbc_lblSaldos.gridwidth=4;
      gbc_lblSaldos.insets=new Insets(0,0,5,5);
      gbc_lblSaldos.gridx=29;
      gbc_lblSaldos.gridy=3;
      Encabezado.add(lblSaldos,gbc_lblSaldos);
      JLabel lblNo=new JLabel("No.");
      GridBagConstraints gbc_lblNo=new GridBagConstraints();
      gbc_lblNo.gridwidth=3;
      gbc_lblNo.insets=new Insets(0,0,0,5);
      gbc_lblNo.gridx=14;
      gbc_lblNo.gridy=4;
      Encabezado.add(lblNo,gbc_lblNo);
      JLabel lblCuentas=new JLabel("Cuentas");
      GridBagConstraints gbc_lblCuentas=new GridBagConstraints();
      gbc_lblCuentas.insets=new Insets(0,0,0,5);
      gbc_lblCuentas.gridx=18;
      gbc_lblCuentas.gridy=4;
      Encabezado.add(lblCuentas,gbc_lblCuentas);
      JLabel lblDebe=new JLabel("Debe");
      GridBagConstraints gbc_lblDebe=new GridBagConstraints();
      gbc_lblDebe.gridwidth=2;
      gbc_lblDebe.insets=new Insets(0,0,0,5);
      gbc_lblDebe.gridx=21;
      gbc_lblDebe.gridy=4;
      Encabezado.add(lblDebe,gbc_lblDebe);
      JLabel lblHaber=new JLabel("Haber");
      GridBagConstraints gbc_lblHaber=new GridBagConstraints();
      gbc_lblHaber.gridwidth=4;
      gbc_lblHaber.insets=new Insets(0,0,0,5);
      gbc_lblHaber.gridx=24;
      gbc_lblHaber.gridy=4;
      Encabezado.add(lblHaber,gbc_lblHaber);
      JLabel lblDeudor=new JLabel("Deudor");
      GridBagConstraints gbc_lblDeudor=new GridBagConstraints();
      gbc_lblDeudor.insets=new Insets(0,0,0,5);
      gbc_lblDeudor.gridx=29;
      gbc_lblDeudor.gridy=4;
      Encabezado.add(lblDeudor,gbc_lblDeudor);
      JLabel lblAcreedor=new JLabel("Acreedor");
      GridBagConstraints gbc_lblAcreedor=new GridBagConstraints();
      gbc_lblAcreedor.insets=new Insets(0,0,0,5);
      gbc_lblAcreedor.anchor=GridBagConstraints.NORTH;
      gbc_lblAcreedor.gridx=32;
      gbc_lblAcreedor.gridy=4;
      Encabezado.add(lblAcreedor,gbc_lblAcreedor);
      pCuerpo=new JPanel();
      add(pCuerpo,BorderLayout.CENTER);
      JPanel pCuerpo=new JPanel(new GridLayout(0,6,0,0));
      this.add(pCuerpo,BorderLayout.CENTER);
      JPanel paNo=new JPanel(new GridLayout(0,1,0,0));
      pCuerpo.add(paNo);
      JPanel paCuenta=new JPanel(new GridLayout(0,1,0,0));
      pCuerpo.add(paCuenta);
      JPanel paDebe=new JPanel(new GridLayout(0,1,0,0));
      pCuerpo.add(paDebe);
      JPanel paHaber=new JPanel(new GridLayout(0,1,0,0));
      pCuerpo.add(paHaber);
      JPanel paDeudor=new JPanel(new GridLayout(0,1,0,0));
      pCuerpo.add(paDeudor);
      JPanel paAcreedor=new JPanel(new GridLayout(0,1,0,0));
      pCuerpo.add(paAcreedor);
      No=new JLabel[pNo];
      for(int i=0; i<pNo; i++)
      {
         No[i]=new JLabel("");
         paNo.add(No[i]);
      }
      Cuenta=new JLabel[CompCuenta.getNombre()];
      for(int i=0; i<CompCuenta.getNombre(); i++)
      {
         Cuenta[i]=new JLabel("");
         paCuenta.add(Cuenta[i]);
      }
      Debe=new JLabel[(int)CompCuenta.getDebe()];
      for(int i=0; i<CompCuenta.getDebe(); i++)
      {
         Debe[i]=new JLabel("");
         paNo.add(Debe[i]);
      }
      Haber=new JLabel[(int)CompCuenta.getHaber()];
      for(int i=0; i<CompCuenta.getDebe(); i++)
      {
         Haber[i]=new JLabel("");
         paNo.add(Haber[i]);
      }
      Deudor=new JLabel[(int)CompCuenta.getDeudor()];
      for(int i=0; i<CompCuenta.getDeudor(); i++)
      {
         Deudor[i]=new JLabel("");
         paDeudor.add(Deudor[i]);
      }
      Acreedor=new JLabel[(int)CompCuenta.getAcreedor()];
      for(int i=0; i<CompCuenta.getAcreedor(); i++)
      {
         Acreedor[i]=new JLabel("");
         paDeudor.add(Acreedor[i]);
      }
      pPie=new JPanel(new GridLayout(0,6,0,0));
      add(pPie,BorderLayout.SOUTH);
      JLabel lblV1=new JLabel("");
      pPie.add(lblV1);
      JLabel lblV2=new JLabel("");
      pPie.add(lblV2);
      lblTDe=new JLabel("0");
      lblTDe.setHorizontalAlignment(SwingConstants.CENTER);
      pPie.add(lblTDe);
      lblTHa=new JLabel("0");
      pPie.add(lblTHa);
      lblTHa.setHorizontalAlignment(SwingConstants.CENTER);
      lblTDeud=new JLabel("0");
      pPie.add(lblTDeud);
      lblTDeud.setHorizontalAlignment(SwingConstants.CENTER);
      lblTAcre=new JLabel("0");
      pPie.add(lblTAcre);
      lblTAcre.setHorizontalAlignment(SwingConstants.CENTER);
   }
}
