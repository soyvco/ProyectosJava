package Basic1;
/*
 * Declare cuatro variables enteras A, B, C y D y asígnale un valor a cada una. A continuación realiza las instrucciones necesarias para que:
 * B tome el valor de C
 * C tome el valor de A
 * A tome el valor de D
 * D tome el valor de B
 */
public class MPra4
{
   public static void main(String[] args)
   {
      int A=2,B=4,C=6,D=8,AUX;
      System.out.println("Los valores son A="+A+", B="+B+", C="+C+" y D="+D);
      AUX=D;
      D=B;
      B=C;
      C=A;
      System.out.println("Cuando A toma el valor de D vale ="+AUX);
      System.out.println("Cuando D toma el valor de B vale ="+D);
      System.out.println("Cuando B toma el valor de C vale ="+B);
      System.out.println("Cuando C toma el valor de A vale ="+C);
   }
}