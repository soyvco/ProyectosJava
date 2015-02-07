package Automotor5;
public class CAutomotor
{
   int pasajeros;
   int tanqueGasolina;
   int KpL;
   int rango;
   int litros;
   
   // Constructores
   public CAutomotor()
   {
      this.pasajeros=7;
      this.tanqueGasolina=60;
      this.KpL=6;
   }
   
   public CAutomotor(int p,int tg,int kpl)
   {
      this.pasajeros=p;
      this.tanqueGasolina=tg;
      this.KpL=kpl;
   }
   
   // Métodos
   public int obtenerRango()
   {
      return this.rango=tanqueGasolina*KpL;
   }
   
   public double gasolinaNecesaria(int kilometro)
   {
      return (double)kilometro/KpL;
   }
}