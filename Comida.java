import java.util.ArrayList;

public class Comida {
    private String nombre;
    private String tipo;
    private int disponibilidad;

    public Comida(String nombre, String tipo, int disponibilidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.disponibilidad = disponibilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getDisponibilidad() {
        return disponibilidad;
    }

    public void servir() {
        if (disponibilidad > 0) {
            disponibilidad--;
        } else {
            System.out.println("No hay disponibilidad para " + nombre);
        }
    }

    public void reponer(int cantidad) {
        disponibilidad += cantidad;
    }

    @Override
    public String toString() {
        return "Comida: " + nombre + " | Tipo: " + tipo + " | Disponibilidad: " + disponibilidad;
    }
}

public class Estudiante {
    private String nombre;
    private String id;

    public Estudiante(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public void seleccionarComida(Comida comida) {
        if (comida.getDisponibilidad() > 0) {
            comida.servir();
            System.out.println(nombre + " seleccionó " + comida.getNombre());
        } else {
            System.out.println("Lo sentimos, " + comida.getNombre() + " no está disponible.");
        }
    }
}

public class GestionComedor {
    private ArrayList<Comida> comidas;

    public GestionComedor() {
        this.comidas = new ArrayList<>();
    }

    public void registrarComida(Comida comida) {
        comidas.add(comida);
        System.out.println("Se ha registrado la comida: " + comida.getNombre());
    }

    public void mostrarDisponibilidad() {
        System.out.println("Disponibilidad de comidas:");
        for (Comida comida : comidas) {
            System.out.println(comida);
        }
    }

    public void registrarConsumo(Estudiante estudiante, String nombreComida) {
        for (Comida comida : comidas) {
            if (comida.getNombre().equalsIgnoreCase(nombreComida)) {
                estudiante.seleccionarComida(comida);
                return;
            }
        }
        System.out.println("Comida no encontrada: " + nombreComida);
    }
}

public class Comida {
    public static void main(String[] args) {
        // Crear comidas
        Comida comida1 = new Comida("Ensalada", "Vegetariana", 10);
        Comida comida2 = new Comida("Hamburguesa", "Estándar", 5);
        Comida comida3 = new Comida("Tacos Veganos", "Vegana", 8);

        // Crear sistema de gestión
        GestionComedor comedor = new GestionComedor();

        // Registrar comidas
        comedor.registrarComida(comida1);
        comedor.registrarComida(comida2);
        comedor.registrarComida(comida3);

        // Mostrar disponibilidad inicial
        comedor.mostrarDisponibilidad();

        // Crear estudiantes
        Estudiante estudiante1 = new Estudiante("Ana", "001");
        Estudiante estudiante2 = new Estudiante("Luis", "002");

        // Registrar consumo
        comedor.registrarConsumo(estudiante1, "Ensalada");
        comedor.registrarConsumo(estudiante2, "Hamburguesa");
        comedor.registrarConsumo(estudiante1, "Tacos Veganos");

        // Mostrar disponibilidad final
        comedor.mostrarDisponibilidad();
    }
}

