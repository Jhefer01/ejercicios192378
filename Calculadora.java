import java.util.Scanner;

public class Calculadora
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserte 2 numeros: ");
        final float NUMBER1 = scanner.nextInt();
        final float NUMBER2 = scanner.nextInt();
        
    //suma
    float addition = NUMBER1 + NUMBER2;
    System.out.println("El resultado de la suma es: " + addition);
    //resta
    float sustraction = NUMBER1 - NUMBER2;
    System.out.println("El resultado de la resta es: " + sustraction);
    //Multiplicacion
    float multiplication = NUMBER1 * NUMBER2;
    System.out.println("El resultado de la multiplicacion es: " + multiplication);
    //division
    float division = NUMBER1 / NUMBER2;
    System.out.println("El resultado de la division es: " + division);
    //residuo
    float residue = NUMBER1 % NUMBER2;
    System.out.println("El residuo de la division es: " + residue);
    }

}