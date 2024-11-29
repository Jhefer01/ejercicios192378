public class ejercicio4 {
    public static void main(String[] args) {
        // Cantidad inicial en la cuenta bancaria
        double cantidadInicial = 1000.0;

        // Cantidad que se retira cada semana
        double retiroSemanal = 200.0;

        // Número de semanas en un mes
        int semanasEnUnMes = 4;

        // Calculo del monto total retirado en un mes
        double montoTotalRetirado = retiroSemanal * semanasEnUnMes;

        // Calculo del monto restante en la cuenta bancaria al final del mes
        double cantidadRestante = cantidadInicial - montoTotalRetirado;

        // Muestra del resultado
        System.out.println("Cantidad inicial: $" + cantidadInicial);
        System.out.println("Monto total retirado: $" + montoTotalRetirado);
        System.out.println("Cantidad restante al final del mes: $" + cantidadRestante);
    }
}
