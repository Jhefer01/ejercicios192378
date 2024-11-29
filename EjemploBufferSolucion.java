import java.util.Scanner;

public class EjemploBufferSolucion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Escribe un número: ");
        int numero = input.nextInt();
        
        input.nextLine();  // Limpiamos el buffer, consumimos el salto de línea
        
        System.out.print("Escribe tu nombre: ");
        String nombre = input.nextLine();  // Ahora funcionará bien
        
        System.out.println("Número: " + numero);
        System.out.println("Nombre: " + nombre);
    }
}

