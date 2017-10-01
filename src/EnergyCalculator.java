import java.util.Scanner;

public class EnergyCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        double m = scanner.nextDouble();
        System.out.print("Enter the initial temperature: " );
        double initialTemp = scanner.nextDouble();
        System.out.print("Enter the final temperature: ");
        double finalTemp = scanner.nextDouble();

        double q = m * (finalTemp - initialTemp) * 4184;

        System.out.println("The energy needed is: " + q);
    }
}
