package Automotor4;
public class CAutomotor
{
   int pasajeros;
   int tanqueGasolina;
   int KpL;
   int rango;
   int litros;
   
   public int obtenerRango()
   {
      return this.rango=tanqueGasolina*KpL;
   }
   
   public double gasolinaNecesaria(int kilometro)
   {
      return (double)kilometro/KpL;
   }
}