
import java.util.Scanner;

public class MatrixCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el tamaño de las matrices al usuario
        System.out.println("Ingrese el número de filas de las matrices: ");
        int rows = scanner.nextInt();
        System.out.println("Ingrese el número de columnas de las matrices: ");
        int cols = scanner.nextInt();

        // Crear matrices A, B y C dinámicamente
        int[][] A = new int[rows][cols];
        int[][] B = new int[rows][cols];
        int[][] C = new int[rows][cols];

        // Solicitar los valores de las matrices A y B al usuario
        System.out.println("Ingresa los valores de la matriz A (" + rows + "x" + cols + "):");
        fillMatrix(scanner, A, rows, cols);
        System.out.println("Ingresa los valores de la matriz B (" + rows + "x" + cols + "):");
        fillMatrix(scanner, B, rows, cols);

        // Menú para seleccionar la operación
        boolean salir = false;
        while (!salir) {
            System.out.println("\nSeleccione la operación que desea realizar:");
            System.out.println("1. Sumar matrices");
            System.out.println("2. Restar matrices");
            System.out.println("3. Multiplicar matrices");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    sumMatrices(A, B, C, rows, cols);
                    printMatrix(C, rows, cols, "Suma de las matrices");
                    break;
                case 2:
                    subtractMatrices(A, B, C, rows, cols);
                    printMatrix(C, rows, cols, "Resta de las matrices");
                    break;
                case 3:
                    if (rows == cols) {
                        C = new int[rows][cols];  // Reiniciar la matriz C
                        multiplyMatrices(A, B, C, rows);
                        printMatrix(C, rows, cols, "Multiplicación de las matrices");
                    } else {
                        System.out.println("La multiplicación requiere que el número de columnas de A coincida con el número de filas de B.");
                    }
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }

        scanner.close();
    }

    // Función para llenar la matriz con valores del usuario
    public static void fillMatrix(Scanner scanner, int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Función para sumar matrices
    public static void sumMatrices(int[][] A, int[][] B, int[][] C, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
    }

    // Función para restar matrices
    public static void subtractMatrices(int[][] A, int[][] B, int[][] C, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                C[i][j] = A[i][j] - B[i][j];
            }
        }
    }

    // Función para multiplicar matrices (solo para matrices cuadradas)
    public static void multiplyMatrices(int[][] A, int[][] B, int[][] C, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                C[i][j] = 0;  // Reiniciar el valor de C[i][j]
                for (int k = 0; k < size; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
    }

    // Función para imprimir matrices
    public static void printMatrix(int[][] matrix, int rows, int cols, String message) {
        System.out.println(message + ": ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
