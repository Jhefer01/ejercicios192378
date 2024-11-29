public class CuentaBancaria {

    public static void main(String[] args) {
        double saldoInicial = 1000.0;
        double retiroSemanal = 200.0;
        
        final int semanasEnMes = 4;
        
        // Cálculo del saldo después de los retiros semanales
        double saldoFinal = saldoInicial - (retiroSemanal * semanasEnMes);
        
        System.out.println("Saldo final en la cuenta al final del mes: " + saldoFinal);
    }
}