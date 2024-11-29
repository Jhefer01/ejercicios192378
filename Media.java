import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner number = new Scanner (System.in);
        System.out.print("Insert three numbers");
        int num1 = number.nextInt();
        int num2 = number.nextInt();
        int num3 = number.nextInt();

        double average = ( (double) num1 + num2 + num3)/3;

        System.out.println("The average of the 3 numbers is: " + average);
    }
}