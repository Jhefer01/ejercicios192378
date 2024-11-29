import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Libro {
    String titulo;
    String autor;

    Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor;
    }
}

public class Main37 {
    private static final String RUTA_ARCHIVO = "libros.txt";

    public static void main(String[] args) {
        List<Libro> libros = new ArrayList<>();
        libros.add(new Libro("El Quijote", "Miguel de Cervantes"));
        libros.add(new Libro("Cien Años de Soledad", "Gabriel García Márquez"));

        // Guardar libros en un archivo de texto
        guardarLibros(libros);

        // Leer libros del archivo y mostrarlos
        List<Libro> librosLeidos = leerLibros();
        for (Libro libro : librosLeidos) {
            System.out.println(libro);
        }
    }

    public static void guardarLibros(List<Libro> libros) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(RUTA_ARCHIVO))) {
            for (Libro libro : libros) {
                escritor.write(libro.titulo + "," + libro.autor);
                escritor.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Libro> leerLibros() {
        List<Libro> libros = new ArrayList<>();
        try (BufferedReader lector = new BufferedReader(new FileReader(RUTA_ARCHIVO))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] datos = linea.split(",");
                libros.add(new Libro(datos[0], datos[1]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return libros;
    }
}
