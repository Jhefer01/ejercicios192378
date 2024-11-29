public class ejercicio38 {
  // Clase Libro
  static class Libro {
      private String ISBN;
      private String titulo;
      private String autor;
      private String genero;
      private boolean disponible;

      public Libro(String ISBN, String titulo, String autor, String genero) {
          this.ISBN = ISBN;
          this.titulo = titulo;
          this.autor = autor;
          this.genero = genero;
          this.disponible = true;
      }

      public void prestar() {
          if (disponible) {
              disponible = false;
              System.out.println(titulo + " ha sido prestado.");
          } else {
              System.out.println(titulo + " no está disponible.");
          }
      }

      public void devolver() {
          disponible = true;
          System.out.println(titulo + " ha sido devuelto.");
      }
  }

  // Clase Usuario
  static class Usuario {
      private String id;
      private String nombre;

      public Usuario(String id, String nombre) {
          this.id = id;
          this.nombre = nombre;
      }

      public void reservarLibro(Libro libro) {
          System.out.println(nombre + " intenta reservar el libro: " + libro.titulo);
          libro.prestar();
      }
  }

  // Programa principal
  public static void main(String[] args) {
      Libro libro1 = new Libro("12345", "Java Avanzado", "Juan Pérez", "Programación");
      Usuario usuario1 = new Usuario("U001", "Carlos López");

      usuario1.reservarLibro(libro1);
      libro1.devolver();
  }
}
