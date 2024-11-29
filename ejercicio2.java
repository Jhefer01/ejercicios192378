import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner input = new Scanner(System.in);

        // Pedir al usuario que introduzca los dos números
        System.out.print("Introduce el primer número: ");
        double num1 = input.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = input.nextDouble();

        // Realizar las operaciones aritméticas
        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num1 / num2;
        double modulo = num1 % num2;

        // Mostrar los resultados
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La división es: " + division);
        System.out.println("El módulo es: " + modulo);

        // Cerrar el objeto Scanner
        input.close();
    }
}


