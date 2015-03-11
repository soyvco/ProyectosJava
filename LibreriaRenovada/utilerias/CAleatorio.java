package utilerias;

public class CAleatorio
{
   public static final String ÁGUILA="Águila";
   public static final String SOL   ="sol";
   public static int número(int b)
   {
      return número(0,b);
   }
   
   public static int número(int a, int b)
   {
      double r = Math.random();
      // System.out.println(r);
      return (int) (r*(b-a+1)+a);
   }
   
   public static String moneda()
   {
      return CAleatorio.número(0,1)==0?ÁGUILA:SOL;
   }
   public static double número(double b)
   {
      return número(0.0,b);
   }
   
   public static double número(double a, double b)
   {
      return Math.random()*(b-a+1)+a;
   }
   public static int dado()
   {
      return CAleatorio.número(1,6);
   }
   public static int edad()
   {
      return CAleatorio.número(0,125);
   }
   public static int dígito()
   {
      return número(9);
   }
   public static double calif()
   {
      return número(55,100);
   }

   public static String grado()
   {  
      String[] gradoAcademico = {"Primero", "Segundo", "Tercero", "Cuarto","Quinto", "Sexto", "Sï¿œptimo", "Octavo", "Noveno", "Dï¿œcimo", "Dï¿œcimoPrimero", "Dï¿œcimoSegundo", "Dï¿œcimoTercero", "Dï¿œcimoCuarto", "Dï¿œcimoQuinto", "Dï¿œcimoSexto", "Dï¿œcimoSepto", "Dï¿œcimoOctavo", "Dï¿œcimoNoveno", "Vigï¿œsimo"  }; 
      return gradoAcademico[número(gradoAcademico.length-1)];
   }
   public static String nombre()
   {
      String[] nombre= {"Pedro", "Juan", "Pablo", "Diego", "Enrique", "Ernesto", "Francisco", "Ignacio", "Socrates", "Platon", "Kim", "Jennifer", "Julie", "Jones", "Michael", "Geena", "Sally" };
      return nombre[número(nombre.length-1)];
   }
 
      public static String apellido()
      {
         String[] apellido = {"Hernández", "Méndez", "Jiménez", "Gómez", "Cerino", "Montalvo", "Pérez", "López", "Aguilar", "Navarro", "Gutierrez", "Videla", "Vargas", "Santos"};
         return apellido[número(apellido.length-1)];
      }
      public static String apellido2()
      {
         String[] apellido2 = {"alvarado", "Esteva", "Villagomez", "Zapata", "Montero", "Aragón", "Izquierdo", "De la cruz", "Moreno", "Jackson", "Pedraza", "Castillo"};
         return apellido2[número(apellido2.length-1)];
      }
      public static String carrera()
      {
        String[] carrera = {"Sistemas computacionales", "TIC's", "Administración", "Bioquimica", "Química", "Civil"};
        return carrera[número(carrera.length-1)];
      }
      
      public static int numbers(String pGrado)
      {
         String grado=pGrado.toLowerCase();
         int número=0;
         String[] posiblesGrados= {"cero", "primero", "segundo", "tercero", "cuarto", "quinto", "sexto", "septo", "octavo", "noveno", "dï¿œcimo", "dï¿œcimoPrimero", "dï¿œcimoSegundo", "dï¿œcimoTercero", "dï¿œcimoCuarto", "dï¿œcimoQuinto", "dï¿œcimoSexto", "dï¿œcimoSepto", "dï¿œcimoOctavo", "dï¿œcimoNoveno", "vigï¿œsimo" };
         for(int i=0; i<posiblesGrados.length; i++)
         {
            if(grado.equals(posiblesGrados[i])) número = i;
         }
         return número;
      }
      
      public static boolean númeroPrimo() {
         int númeroReal; 
         boolean isPrimo;
         númeroReal = CAleatorio.número(20);
         System.out.print("Nï¿œmero: " + númeroReal);
         isPrimo=(númeroReal>=2);
         for(int divisor=2; isPrimo && divisor<númeroReal/2+1; divisor++)
         {
            if(númeroReal % divisor == 0) isPrimo=false;
         }
         return isPrimo;
         
      }
      public static String nombreCompleto()
      {
         return   apellido()+" " + apellido2()+" "+nombre();
      }

      public static String díaSemana()
      { 
         String[] dÃ­as = {"Lunes", "Martes", "Miï¿œrcoles", "Jueves", "Viernes", "Sï¿œbado", "Domingo"};
         return dÃ­as[número(dÃ­as.length-1)];
      }
      
      public static int díaMes()
      {
      int número=CAleatorio.número(1,30);
      return número;
      }

      public static String mes()
      {
         String[] mes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
         return mes[número(mes.length-1)];
      }
      public static String colonia()
      {
        String [] colonia = {"Villa las flores", "Indeco", "Lagunas", "San angel", "Lomitas", "Casa Blanca", "Pomoca", "Parrilla", "villa floresta"};
        return colonia[número(colonia.length-1)];
      }
      public static int año()
      {
         int nÃºmero=CAleatorio.número(1990,2050);
         return nÃºmero;
      }
      public static String correo()
      {
        String [] correo = {"alejandro-lpz@hotmail.com", "dumsur@hotmail.com", "prentice_24@yahoo.com","rivera1987@hotmail.com", "contab_lab@gmail.com", "ken_thomson@hotmail.com", "ritchie-1977@hotmail.com", "isaac_1642@hotmail.com","ferinsite@yahoo.com", "conde-ck@gmail.com", "george_ohm@hotmail.com"};
        return correo[número(correo.length -1)];
      }
      public static String materia()
      {
        String [] correo = {"POO", "Ingles", "Matemáticas 1","Matemáticas 2", "Contabilidad", "Química", "Español", "Estadística","Álgebra lineal", "Métodos Númericos", "Sistemas Operativos"};
        return correo[número(correo.length -1)];
      }
      public static long numeroCel(long pA, long pB)
      {
          double r = Math.random();
          return (long) (r*(pB-pA+1)+pA);
      }
   }