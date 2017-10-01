import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 999: ");

        int num = scanner.nextInt();

        int sum = 0;

        sum += num % 10;
        num = num / 10;
        sum += num % 10;
        num = num / 10;
        sum += num;
        System.out.println(sum);

    }
}
