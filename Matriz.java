public class Matriz {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        int valor = matriz[1][2];
        System.out.println("Valor en la fila 1, columna 2: " + valor);

        for (int i = 0; i < matriz.length; i++) { // Recorre las filas
            for (int j = 0; j < matriz[i].length; j++) { // Recorre las columnas
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Salto de línea después de cada fila
        }
    }
}
