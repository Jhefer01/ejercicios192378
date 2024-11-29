public class Main16 {
    public static void main(String[] args) {
        int numero = 10;
        cambiarValor(numero);
        System.out.println("Valor de 'numero' después de llamar a cambiarValor: " + numero);
    }

    public static void cambiarValor(int num) {
        num = 20;
        System.out.println("Valor de 'num' dentro del método cambiarValor: " + num);
    }
}
