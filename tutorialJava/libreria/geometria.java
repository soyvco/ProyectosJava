package libreria;
import componentes.compAreasGeometricas;

public class geometria
{
   public static void main(String[] args)
   {
      compAreasGeometricas a=new compAreasGeometricas();
      a.calcularAreaCuadrado(2.5);
      System.out.println(a.getAreaCuadrado());
      a.calcularAreaTriangulo(4,8);
      System.out.println(a.getAreaTriangulo());
   }
}
