public class Main23 {
    public static void main(String[] args) {
        String texto = "Hola";
        
        System.out.println("Antes de modificar: " + texto);
        modificarCadena(texto);
        System.out.println("Después de modificar: " + texto);
    }

    public static void modificarCadena(String texto) {
        texto = "Adiós";
        System.out.println("Dentro del método modificarCadena: " + texto);
    }
}

