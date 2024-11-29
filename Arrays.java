import java.util.Scanner;

public class Arrays
{
    public static void main(String[] args) {
        int[] numbers = new int[4];
        Scanner scanner = new Scanner(System.in);

        for (int index = 0; index < numbers.length ; index++) {

            numbers[index] = scanner.nextInt();
            System.out.println(index);

        }
    }
}
