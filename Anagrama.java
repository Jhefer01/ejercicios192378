import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {

    public static boolean sonAnagramas(String palabra1, String palabra2) {
        if (palabra1.equalsIgnoreCase(palabra2)) {
            return false; // No son anagramas si son iguales
        }

        char[] array1 = palabra1.toLowerCase().toCharArray();
        char[] array2 = palabra2.toLowerCase().toCharArray();
        
        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la primera palabra: ");
        String palabra1 = scanner.nextLine();

        System.out.print("Ingrese la segunda palabra: ");
        String palabra2 = scanner.nextLine();

        if (sonAnagramas(palabra1, palabra2)) {
            System.out.println("\"" + palabra1 + "\" y \"" + palabra2 + "\" son anagramas.");
        } else {
            System.out.println("\"" + palabra1 + "\" y \"" + palabra2 + "\" no son anagramas.");
        }

        scanner.close();
    }
}