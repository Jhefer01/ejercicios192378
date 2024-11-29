import java.util.Scanner;

public class funcion {
    public static void intercambiar(int num1,int num2){
        num1 = num1 + num2;
        num2= num1 - num2;
        num1= num1 - num2;

        System.out.println("num1 = " + num1 + " y num2 = " + num2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println("num1 = " + num1 + " y num2 = " + num2);

        intercambiar(num1, num2);

        System.out.println("num1 = " + num1 + " y num2 = " + num2);

        input.close();
    }
}
