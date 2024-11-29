public class ejercicio39 {
    // Clase Libro
    static class Libro {
        private String ISBN;
        private String titulo;
        private String autor;
        private boolean disponible;

        public Libro(String ISBN, String titulo, String autor) {
            this.ISBN = ISBN;
            this.titulo = titulo;
            this.autor = autor;
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
    }

    // Clase Reserva
    static class Reserva {
        private String idReserva;
        private String fecha;

        public Reserva(String idReserva, String fecha) {
            this.idReserva = idReserva;
            this.fecha = fecha;
        }

        public void confirmar() {
            System.out.println("Reserva " + idReserva + " confirmada en la fecha " + fecha);
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
        Libro libro = new Libro("54321", "Estructuras de Datos", "Ana López");
        Usuario usuario = new Usuario("U002", "Laura Martínez");
        Reserva reserva = new Reserva("R001", "2024-11-28");

        usuario.reservarLibro(libro); // Flujo de interacción
        reserva.confirmar();
    }
}
