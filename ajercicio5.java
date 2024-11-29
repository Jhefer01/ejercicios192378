import java.util.Scanner;

public class ajercicio5 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner input = new Scanner(System.in);

        // Solicitar el nombre del usuario
        System.out.print("Introduce tu nombre: ");
        String nombre = input.nextLine();

        // Solicitar la edad del usuario
        System.out.print("Introduce tu edad: ");
        int edad = input.nextInt();

        // Solicitar la altura del usuario
        System.out.print("Introduce tu altura en metros (por ejemplo, 1.75): ");
        double altura = input.nextDouble();

        // Mostrar un mensaje personalizado con los datos del usuario
        System.out.println("¡Hola, " + nombre + "! Tienes " + edad + " años y mides " + altura + " metros.");

        // Cerrar el objeto Scanner
        input.close();
    }
}

