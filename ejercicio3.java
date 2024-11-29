public class ejercicio3 {
    public static void main(String[] args) {
        // Precios originales
        final double PRECIO_CAMISETA = 25.0;
        final double PRECIO_PANTALON = 30.0;

        // Descuentos
        final double DESCUENTO = 0.15;
        final double DESCUENTO_ADICIONAL = 0.05;

        // Calculo del precio con descuento para una camiseta
        double precioCamisetaConDescuento = PRECIO_CAMISETA - (PRECIO_CAMISETA * DESCUENTO);

        // Calculo del precio con descuento para el pantalón
        double precioPantalonConDescuento = PRECIO_PANTALON - (PRECIO_PANTALON * DESCUENTO);

        // Calculo del precio con descuento adicional para la segunda camiseta
        double precioSegundaCamisetaConDescuento = precioCamisetaConDescuento - (precioCamisetaConDescuento * DESCUENTO_ADICIONAL);

        // Calculo del precio total
        double precioTotal = precioCamisetaConDescuento + precioPantalonConDescuento + precioSegundaCamisetaConDescuento;

        // Muestra de resultados
        System.out.println("El precio de la primera camiseta con descuento es: $" + redondear(precioCamisetaConDescuento));
        System.out.println("El precio del pantalón con descuento es: $" + redondear(precioPantalonConDescuento));
        System.out.println("El precio de la segunda camiseta con descuento adicional es: $" + redondear(precioSegundaCamisetaConDescuento));
        System.out.println("El precio total de ambas prendas es: $" + redondear(precioTotal));
    }

    // Método para redondear a dos decimales
    public static String redondear(double valor) {
        return String.format("%.2f", valor);
    }
}
