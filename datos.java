import java.util.Scanner;

public class datos {
    public static void main (String[ ] args) {
        Scanner dato = new Scanner (System.in);
        System.out.print("Insert your name");
        String name = dato.nextLine();
        System.out.print("Insert your age");
        int age = dato.nextInt();
        System.out.print("Insert your height");
        double height = dato.nextDouble();

        System.out.println("Your name " + name + "your age " + age + "your height " + height);
    }
}