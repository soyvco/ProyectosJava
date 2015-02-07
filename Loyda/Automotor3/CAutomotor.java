package Automotor3;
public class CAutomotor
{
   int pasajeros;
   int tanqueGasolina;
   int KpL;
   int rango;
   
   public int obtenerRango()
   {
      return this.rango=tanqueGasolina*KpL;
   }
}