package EjemploAbstract;

public class Musica2
{
   // No importa el tipo de Instrumento,
   // seguirá funcionando debido a Polimorfismo:
   static void afinar(Instrumento i) 
   {
      // ...
      i.tocar();
   }

   static void afinarTodo(Instrumento[] e)
   {
      for(int i = 0; i < e.length; i++)
         afinar(e[i]);
   }
   public static void main(String[] args) {
      // Declarar un Arreglo SIN INSTANCIAS es valido en Clases Abstractas
 Instrumento[] orquesta = new Instrumento[5];
      // Generar una INSTANCIA de una la Clase Abstracta no es valido 
      // Instrumento nuevo = new Instrumento();
 int i = 0;
 // Up-casting al asignarse el Arreglo
 orquesta[i++] = new Guitarra();
 orquesta[i++] = new Piano();
 orquesta[i++] = new Saxofon();
 orquesta[i++] = new Guzla();
 orquesta[i++] = new Ukelele();
 afinarTodo(orquesta);
}
}
