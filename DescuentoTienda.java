public class DescuentoTienda {

    public static void main(String[] args) {
        double precioCamiseta = 25.0;
        double precioPantalon = 30.0;

        final double descuento = 0.15;
        
        // Precio con descuento para la camiseta y el pantalón
        double precioCamisetaConDescuento = precioCamiseta * (1 - descuento);
        double precioPantalonConDescuento = precioPantalon * (1 - descuento);

        // Precio total para una camiseta y un pantalón
        double precioTotal = precioCamisetaConDescuento + precioPantalonConDescuento;

        // Si se compra una segunda camiseta, se aplica un descuento adicional del 5% sobre la primera camiseta
        double descuentoAdicional = 0.05;
        double precioSegundaCamisetaConDescuento = precioCamisetaConDescuento * (1 - descuentoAdicional);

        // Precio total incluyendo la segunda camiseta con descuento adicional
        double precioTotalConSegundaCamiseta = precioTotal + precioSegundaCamisetaConDescuento;

        System.out.println("Precio total con una camiseta y un pantalón: " + precioTotal);
        System.out.println("Precio total con una segunda camiseta: " + precioTotalConSegundaCamiseta);
    }

}
