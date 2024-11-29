public class ejercicio40 {
    // Clase Tarea
    static class Tarea {
        private String titulo;
        private String descripcion;
        private boolean completada;

        public Tarea(String titulo, String descripcion) {
            this.titulo = titulo;
            this.descripcion = descripcion;
            this.completada = false;
        }

        public void editar(String nuevaDescripcion) {
            this.descripcion = nuevaDescripcion;
            System.out.println("La tarea '" + titulo + "' ha sido actualizada.");
        }

        public void completar() {
            this.completada = true;
            System.out.println("La tarea '" + titulo + "' ha sido completada.");
        }

        public void mostrarEstado() {
            System.out.println("Tarea: " + titulo + " - " + (completada ? "Completada" : "Pendiente"));
        }
    }

    // Programa principal
    public static void main(String[] args) {
        Tarea tarea1 = new Tarea("Aprender Java", "Estudiar la sintaxis y clases");
        tarea1.mostrarEstado();

        tarea1.completar();
        tarea1.mostrarEstado();

        tarea1.editar("Estudiar colecciones en Java");
        tarea1.mostrarEstado();
    }
}
